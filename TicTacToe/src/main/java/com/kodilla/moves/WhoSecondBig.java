package com.kodilla.moves;

import static com.kodilla.moves.WhoFirstBig.whoFirstBig;
import static com.kodilla.names.PlayerOneName.playerOneName;
import static com.kodilla.names.PlayerTwoName.playerTwoName;

public class WhoSecondBig {

    public static String whoSecBig;

    public void whoSecondBig() {
        if (whoFirstBig.equals(playerOneName)) {
            whoSecBig = playerTwoName;
        } else {
            whoSecBig = playerOneName;
        }
    }
}
