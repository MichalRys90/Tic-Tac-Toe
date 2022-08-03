package com.kodilla.moves;

import java.util.Random;

public class ComputerTurn {

    Random random = new Random();

    public int getRandom() {

        return random.nextInt(9) + 1;
    }
}
