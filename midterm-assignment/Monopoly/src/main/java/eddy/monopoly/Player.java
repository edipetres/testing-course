/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eddy.monopoly;

import static org.mockito.Mockito.*;

/**
 *
 * @author eddmond
 */
public class Player {
    
    Dice dice = new Dice();
    
    IBoard mockedBoard = mock(IBoard.class);
    
    int location = 0;
    int oldLocation = 0;
    
    public Player(){
        
    }
    
    public static void main(String[] args) {
        Player p = new Player();
        p.takeTurn();
    }
    
//  Calculating a random number total between 2 and 12 (the range of two dice)
//  b) Calculating the new square location
//  c) Moving the player’s piece from the old location to the new square location 
    public void takeTurn() {
        int dice1 = dice.roll();
        int dice2 = dice.roll();
        int diceRoll = dice1 + dice2;
        
        when(mockedBoard.getSquareLocation(diceRoll)).thenReturn(diceRoll + 10);
        int newLoc = mockedBoard.getSquareLocation(diceRoll);
        
        oldLocation = location;
        location = newLoc;
        
    }
    
}
