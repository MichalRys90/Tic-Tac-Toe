package com.kodilla.moves;


import static com.kodilla.gameWithComputer.WhoFirstWithComputer.whoFirstWithComputer;
import static com.kodilla.moves.names.circle;
import static com.kodilla.moves.names.cross;
import static com.kodilla.names.ComputerName.computer;

public class ComputerMove {

    public static String computerMove;

    public String getComputerMove() {

        if (whoFirstWithComputer.equals(computer)) {
            computerMove = circle;
        } else {
            computerMove = cross;
        }
        return computerMove;
    }
}
