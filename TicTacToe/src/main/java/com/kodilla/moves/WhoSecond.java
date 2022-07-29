package com.kodilla.moves;

import static com.kodilla.moves.WhoFirst.whoFirst;
import static com.kodilla.names.PlayerOneName.playerOneName;
import static com.kodilla.names.PlayerTwoName.playerTwoName;

public class WhoSecond {

    public static String whoSec;

    public String whoSecond() {
        if (whoFirst.equals(playerOneName)) {
            whoSec = playerTwoName;
        } else {
            whoSec = playerOneName;
        }
        return whoSec;
    }
}
