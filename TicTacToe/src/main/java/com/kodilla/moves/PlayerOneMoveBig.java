package com.kodilla.moves;

import static com.kodilla.moves.WhoFirstBig.whoFirstBig;
import static com.kodilla.moves.names.circleBig;
import static com.kodilla.moves.names.crossBig;
import static com.kodilla.names.PlayerOneName.playerOneName;

public class PlayerOneMoveBig {

    public static String playerOneMoveBig;

    public String getPlayerOneMoveBig() {

        if (whoFirstBig.equals(playerOneName)) {
            playerOneMoveBig = circleBig;
        } else {
            playerOneMoveBig = crossBig;
        }
        return playerOneMoveBig;
    }
}
