/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import eddy.monopoly.Player;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author eddmond
 */
public class PlayerTest {
    
    public PlayerTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void takeTurnTest() {
        Player p = new Player();
         
        p.takeTurn();
        
     }
}
