package com.kodilla.moves;

import static com.kodilla.moves.WhoFirst.whoFirst;
import static com.kodilla.moves.names.circle;
import static com.kodilla.moves.names.cross;
import static com.kodilla.names.PlayerOneName.playerOneName;

public class PlayerOneMove {

    public static String playerOneMove;

    public String getPlayerOneMove() {

        if (whoFirst.equals(playerOneName)) {
            playerOneMove = circle;
        } else {
            playerOneMove = cross;
        }
        return playerOneMove;
    }
}
