package com.kodilla.moves;

import static com.kodilla.gameWithComputer.WhoFirstWithComputer.whoFirstWithComputer;
import static com.kodilla.moves.names.circle;
import static com.kodilla.moves.names.cross;
import static com.kodilla.names.PlayerOneName.playerOneName;

public class PlayerOneMoveWithComputer {

    public static String playerOneMoveWithComputer;

    public String getPlayerOneMoveWithComputer() {

        if (whoFirstWithComputer.equals(playerOneName)) {
            playerOneMoveWithComputer = circle;
        } else {
            playerOneMoveWithComputer = cross;
        }
        return playerOneMoveWithComputer;
    }
}
