/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bowling;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lucas Wolfs <lwolfs@my.wctc.edu>
 */
public class BowlingGame {
    private int[] scores = new int[21];
    private int finalScore = 0;
    private int rollCount = 0;
    
//    public void roll(int[] rolls)
//    {
//        int frameCounter = 1;
//        for(int i = 0; i<rolls.length; i++)
//        {
//            if(rolls[i] == 10)
//            {
//                scores.add((rolls[i] + rolls[i+1] + rolls[i+2]));
//                
//            }
//            else if()
//        }
//    }
    /**
     * Enters roll scores into array
     * @param r roll score to enter
     */
    public void roll(int r)
    {
        scores[rollCount]=(r);
        
        rollCount++;
    }
    /**
     * Calculates total score based on scores array
     * @return int totalScore
     */
    public int getScore()
    {
        int firstInFrame = 0;
        for(int i = 0; i < 10; i++)
        {
           
            if(scores[firstInFrame] == 10)
            {
                finalScore += (scores[firstInFrame]+scores[firstInFrame+1]+scores[firstInFrame+2]);
                firstInFrame++;
            }
            else if(scores[firstInFrame] + scores[firstInFrame+1] == 10)
            {
                finalScore += (scores[firstInFrame] + scores[firstInFrame+1] + scores[firstInFrame+2]);
                firstInFrame +=2;
            }
            else
            {
                finalScore += scores[firstInFrame]+scores[firstInFrame];
                firstInFrame+=2;
            }

        }
        
        return finalScore;
    }
    
}
