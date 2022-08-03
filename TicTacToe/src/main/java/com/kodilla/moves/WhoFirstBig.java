package com.kodilla.moves;

import java.util.Random;

import static com.kodilla.names.PlayerOneName.playerOneName;
import static com.kodilla.names.PlayerTwoName.playerTwoName;

public class WhoFirstBig {

    public static String whoFirstBig;
    Random random = new Random();

    public String getWhoFirstBig() {
        int n = random.nextInt(2) + 1;
        if (n==1) whoFirstBig = playerOneName;
        else {
            whoFirstBig = playerTwoName;
        }
        return whoFirstBig;
    }
}
