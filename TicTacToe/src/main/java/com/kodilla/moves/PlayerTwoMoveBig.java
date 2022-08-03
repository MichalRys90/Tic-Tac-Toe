package com.kodilla.moves;

import static com.kodilla.moves.WhoFirstBig.whoFirstBig;
import static com.kodilla.moves.names.*;
import static com.kodilla.names.PlayerTwoName.playerTwoName;

public class PlayerTwoMoveBig {
    public static String playerTwoMoveBig;

    public String getPlayerTwoMoveBig() {

        if (whoFirstBig.equals(playerTwoName)) playerTwoMoveBig = circleBig;
        else {
            playerTwoMoveBig = crossBig;
        }
        return playerTwoMoveBig;
    }
}
