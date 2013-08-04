package com.mulder.nahtzee;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * User: dnelson
 * Date: 8/2/13
 * Time: 5:26 PM
 * To change this template use File | Settings | File Templates.
 */
public class DiceRollerTest {

    public DiceRollerTest(){

    }

    @Test
    public void testGenerateRoll() {
        int num;
        int count = 0;

        while(count < 1000) {
            count++;
            num =  DiceRoller.generateRoll(6);

            Assert.assertTrue(num > 0 && num < 7 );

            System.out.println("Okay: " + String.valueOf(num));

        }
    }

    @Test
    public void testRoll(){
        HashMap<Integer, ArrayList<Integer>> dr = DiceRoller.create()
                .addD6()
                .addD6()
                .addD6()
                .roll();

        Assert.assertTrue(dr.size() == 1);
        Assert.assertTrue(dr.get(new Integer(6)).size() == 3);

        System.out.print(dr);

    }

}
