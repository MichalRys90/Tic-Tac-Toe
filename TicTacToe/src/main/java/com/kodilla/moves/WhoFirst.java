package com.kodilla.moves;

import java.util.Random;
import static com.kodilla.names.PlayerOneName.playerOneName;
import static com.kodilla.names.PlayerTwoName.playerTwoName;

public class WhoFirst {

    public static String whoFirst;
    Random random = new Random();

    public String getWhoFirst() {
        int n = random.nextInt(2) + 1;
        if (n==1) {
            whoFirst = playerOneName;
        }
        else {
            whoFirst = playerTwoName;
        }
        return whoFirst;
    }

}
