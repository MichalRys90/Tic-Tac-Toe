package com.kodilla.moves;

import java.util.Random;

public class ComputerTurn {

    Random random = new Random();

    public int getRandom() {

        int n = random.nextInt(9) + 1;

        return n;
    }
}
