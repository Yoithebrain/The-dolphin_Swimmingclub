package com.company;

import java.util.Random;

/**
 * Created by Thomas on 07-11-2016.
 */
public class Dice {

    private Random r = new Random();
    private int numberOfSides;

    public Dice(int numberOfSides){
        this.numberOfSides = numberOfSides;
    }

    public int rollDice(){

        return r.nextInt(numberOfSides) + 1;
    }
}
