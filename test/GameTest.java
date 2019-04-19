/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import bowling.BowlingGame;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lucas Wolfs <lwolfs@my.wctc.edu>
 */
public class GameTest {
    private BowlingGame game;
    public GameTest() {
        
    }
    
    @Before
    public void setUp() {
        game = new BowlingGame();
    }
    
    @Test
    public void testStrikes()
    {
        game.roll(0);
    }
    @Test
    public void testZeroGame()
    {
        for(int i = 0; i < 20; i++)
        {
            game.roll(0);
        }
        
        assertEquals("wrong", 0, game.getScore());
    }
    @Test
    public void TestOnesGame()
    {
        for(int i = 0; i < 20; i++)
        {
            game.roll(1);
        }
        
        assertEquals("wrong", 20, game.getScore());
    }
    
    @Test
    public void TestFivesGame()
    {
        for(int i = 0; i < 21; i++)
        {
            game.roll(5);
        }
        assertEquals("wrong", 150, game.getScore());
    }
    
    @Test
    public void TestStrikesGame()
    {
        for(int i = 0; i < 12; i++)
        {
            game.roll(10);
        }
        
        assertEquals("wrong", 300, game.getScore());
    }
    
    


    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
