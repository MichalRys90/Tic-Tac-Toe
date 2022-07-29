package com.kodilla.gameWithComputer;

import java.util.Random;

import static com.kodilla.names.ComputerName.computer;
import static com.kodilla.names.PlayerOneName.playerOneName;

public class WhoFirstWithComputer {

    public static String whoFirstWithComputer;
    Random random = new Random();

    public String getWhoFirstWithComputer() {
        int n = random.nextInt(2) + 1;
        if (n == 1) {
            whoFirstWithComputer = playerOneName;
        } else {
            whoFirstWithComputer = computer;
        }
        return whoFirstWithComputer;
    }

}
