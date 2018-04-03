/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eddy.monopoly;

import java.util.Random;

/**
 *
 * @author eddmond
 */
public class Dice {
    
    private Random rand = new Random();
    
    public int roll(){
        return rand.nextInt(7);
    }
}
