package com.mulder.nahtzee;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * User: dnelson
 * Date: 8/2/13
 * Time: 4:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class DiceRoller {

    private ArrayList<Integer> dice;

    private DiceRoller(){
        this.dice = new ArrayList<Integer>();
    }

    public static DiceRoller create(){
        return new DiceRoller();
    }

    public DiceRoller addD6(){
        this.dice.add(6);

        return this;
    }

    public DiceRoller addD12(){
        this.dice.add(12);

        return this;
    }

    public HashMap<Integer, ArrayList<Integer>> roll(){
        HashMap<Integer, ArrayList<Integer>> rolled = new HashMap<Integer, ArrayList<Integer>>();

        for(Integer die : dice){
            if(!rolled.containsKey(die))
                rolled.put(die, new ArrayList<Integer>());

            rolled.get(die).add(generateRoll(die));
        }
        return rolled;
    };

    protected static int generateRoll(int size){
        return (int) Math.floor(Math.random() * size) + 1;
    }
}
