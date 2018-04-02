/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.sf.javaanpr.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Properties;
import javax.xml.parsers.ParserConfigurationException;
import net.sf.javaanpr.imageanalysis.CarSnapshot;
import net.sf.javaanpr.intelligence.Intelligence;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.SAXException;

/**
 *
 * @author eddmond
 */
@RunWith(Parameterized.class)
public class RecognitionAllIT {

    private Intelligence intel;
    private String expectedNumber;
    private File file;

    public RecognitionAllIT(File file, String expectedResult) {
        this.file = file;
        this.expectedNumber = expectedResult;
    }

    @Before
    public void setUp() throws Exception {
        intel = new Intelligence();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> intelligenceDataDrivenTest() throws IOException {
        String snapshotDirPath = "src/test/resources/snapshots";
        String resultsPath = "src/test/resources/results.properties";
        InputStream resultsStream = new FileInputStream(new File(resultsPath));

        Properties properties = new Properties();
        properties.load(resultsStream);
        resultsStream.close();
        assertTrue(properties.size() > 0);

        File snapshotDir = new File(snapshotDirPath);
        File[] snapshots = snapshotDir.listFiles();
        assertNotNull(snapshots);
        assertTrue(snapshots.length > 0);

        Collection<Object[]> resultsArray = new ArrayList<>();
        
        for (File snap : snapshots) {
            String snapName = snap.getName();
            String plateCorrect = properties.getProperty(snapName);
            assertNotNull(plateCorrect);

            resultsArray.add(new Object[]{snap, plateCorrect});
        }
        
        return resultsArray;
    }

    @Test
    public void singlePlateTest() throws IOException {
        CarSnapshot carSnap = new CarSnapshot(new FileInputStream(file));
        String recognizedNumber = intel.recognize(carSnap);
        assertThat(carSnap, notNullValue());
        assertThat(recognizedNumber, notNullValue());
        assertThat(expectedNumber, is(recognizedNumber));
    }
}

