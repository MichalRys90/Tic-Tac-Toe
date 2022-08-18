package com.kodilla.moves;

import java.util.Random;

import static com.kodilla.game.Logic.board;
import static com.kodilla.gameWithComputer.WhoFirstWithComputer.whoFirstWithComputer;
import static com.kodilla.names.ComputerName.computer;
import static com.kodilla.names.PlayerOneName.playerOneName;

public class HardComputerTurn {

    Random random = new Random();

    public int getHardRandom() {

        if (whoFirstWithComputer.equals(computer)) {
            Integer x1 = getInteger1();
            if (x1 != null) return x1;
            Integer x = getInteger();
            if (x != null) return x;
        }
        if (whoFirstWithComputer.equals(playerOneName)) {
            Integer x = getInteger();
            if (x != null) return x;
            Integer x1 = getInteger1();
            if (x1 != null) return x1;
        }
        return random.nextInt(9) + 1;

    }

    private Integer getInteger1() {
        if ((board[0].equals("O")) && (board[1].equals("O")) && (!board[2].equals("X"))) {
            return 3;
        } else if ((board[1].equals("O")) && (board[2].equals("O")) && (!board[0].equals("X"))) {
            return 1;
        } else if ((board[4].equals("O")) && (board[5].equals("O")) && (!board[3].equals("X"))) {
            return 4;
        } else if ((board[3].equals("O")) && (board[4].equals("O")) && (!board[5].equals("X"))) {
            return 6;
        } else if ((board[6].equals("O")) && (board[7].equals("O")) && (!board[8].equals("X"))) {
            return 9;
        } else if ((board[7].equals("O")) && (board[8].equals("O")) && (!board[6].equals("X"))) {
            return 7;
        } else if ((board[0].equals("O")) && (board[3].equals("O")) && (!board[6].equals("X"))) {
            return 7;
        } else if ((board[3].equals("O")) && (board[6].equals("O")) && (!board[0].equals("X"))) {
            return 1;
        } else if ((board[1].equals("O")) && (board[4].equals("O")) && (!board[7].equals("X"))) {
            return 8;
        } else if ((board[4].equals("O")) && (board[7].equals("O")) && (!board[1].equals("X"))) {
            return 2;
        } else if ((board[5].equals("O")) && (board[8].equals("O")) && (!board[2].equals("X"))) {
            return 3;
        } else if ((board[2].equals("O")) && (board[5].equals("O")) && (!board[8].equals("X"))) {
            return 9;
        } else if ((board[0].equals("O")) && (board[4].equals("O")) && (!board[8].equals("X"))) {
            return 9;
        } else if ((board[4].equals("O")) && (board[8].equals("O")) && (!board[0].equals("X"))) {
            return 1;
        } else if ((board[2].equals("O")) && (board[4].equals("O")) && (!board[6].equals("X"))) {
            return 7;
        } else if ((board[0].equals("O")) && (board[2].equals("O")) && (!board[1].equals("X"))) {
            return 2;
        } else if ((board[3].equals("O")) && (board[5].equals("O")) && (!board[4].equals("X"))) {
            return 5;
        } else if ((board[6].equals("O")) && (board[8].equals("O")) && (!board[7].equals("X"))) {
            return 8;
        } else if ((board[0].equals("O")) && (board[6].equals("O")) && (!board[3].equals("X"))) {
            return 4;
        } else if ((board[1].equals("O")) && (board[7].equals("O")) && (!board[4].equals("X"))) {
            return 5;
        } else if ((board[2].equals("O")) && (board[8].equals("O")) && (!board[5].equals("X"))) {
            return 6;
        } else if ((board[0].equals("O")) && (board[8].equals("O")) && (!board[4].equals("X"))) {
            return 5;
        } else if ((board[2].equals("O")) && (board[6].equals("O")) && (!board[4].equals("X"))) {
            return 5;
        } else if ((board[4].equals("O")) && (board[6].equals("O")) && (!board[2].equals("X"))) {
            return 3;
        }
        return null;
    }

    private Integer getInteger() {
        if ((board[0].equals("X")) && (board[1].equals("X")) && (!board[2].equals("O"))) {
            return 3;
        } else if ((board[1].equals("X")) && (board[2].equals("X")) && (!board[0].equals("O"))) {
            return 1;
        } else if ((board[4].equals("X")) && (board[5].equals("X")) && (!board[3].equals("O"))) {
            return 4;
        } else if ((board[3].equals("X")) && (board[4].equals("X")) && (!board[5].equals("O"))) {
            return 6;
        } else if ((board[6].equals("X")) && (board[7].equals("X")) && (!board[8].equals("O"))) {
            return 9;
        } else if ((board[7].equals("X")) && (board[8].equals("X")) && (!board[6].equals("O"))) {
            return 7;
        } else if ((board[0].equals("X")) && (board[3].equals("X")) && (!board[6].equals("O"))) {
            return 7;
        } else if ((board[3].equals("X")) && (board[6].equals("X")) && (!board[0].equals("O"))) {
            return 1;
        } else if ((board[1].equals("X")) && (board[4].equals("X")) && (!board[7].equals("O"))) {
            return 8;
        } else if ((board[4].equals("X")) && (board[7].equals("X")) && (!board[1].equals("O"))) {
            return 2;
        } else if ((board[5].equals("X")) && (board[8].equals("X")) && (!board[2].equals("O"))) {
            return 3;
        } else if ((board[2].equals("X")) && (board[5].equals("X")) && (!board[8].equals("O"))) {
            return 9;
        } else if ((board[0].equals("X")) && (board[4].equals("X")) && (!board[8].equals("O"))) {
            return 9;
        } else if ((board[4].equals("X")) && (board[8].equals("X")) && (!board[0].equals("O"))) {
            return 1;
        } else if ((board[2].equals("X")) && (board[4].equals("X")) && (!board[6].equals("O"))) {
            return 7;
        } else if ((board[0].equals("X")) && (board[2].equals("X")) && (!board[1].equals("O"))) {
            return 2;
        } else if ((board[3].equals("X")) && (board[5].equals("X")) && (!board[4].equals("O"))) {
            return 5;
        } else if ((board[6].equals("X")) && (board[8].equals("X")) && (!board[7].equals("O"))) {
            return 8;
        } else if ((board[0].equals("X")) && (board[6].equals("X")) && (!board[3].equals("O"))) {
            return 4;
        } else if ((board[1].equals("X")) && (board[7].equals("X")) && (!board[4].equals("O"))) {
            return 5;
        } else if ((board[2].equals("X")) && (board[8].equals("X")) && (!board[5].equals("O"))) {
            return 6;
        } else if ((board[0].equals("X")) && (board[8].equals("X")) && (!board[4].equals("O"))) {
            return 5;
        } else if ((board[2].equals("X")) && (board[6].equals("X")) && (!board[4].equals("O"))) {
            return 5;
        } else if ((board[4].equals("X")) && (board[6].equals("X")) && (!board[2].equals("O"))) {
            return 3;
        }
        return null;
    }
}
