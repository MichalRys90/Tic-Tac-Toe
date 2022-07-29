package com.kodilla.moves;

import static com.kodilla.moves.WhoFirst.whoFirst;
import static com.kodilla.moves.names.circle;
import static com.kodilla.moves.names.cross;
import static com.kodilla.names.PlayerTwoName.playerTwoName;

public class PlayerTwoMove {

    public static String playerTwoMove;

    public String getPlayerTwoMove() {

        if (whoFirst.equals(playerTwoName)) {
            playerTwoMove = circle;
        } else {
            playerTwoMove = cross;
        }
        return playerTwoMove;
    }
}
