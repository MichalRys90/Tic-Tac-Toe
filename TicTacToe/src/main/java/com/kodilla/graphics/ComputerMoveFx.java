package com.kodilla.graphics;

import java.util.Random;

import static com.kodilla.gameWithComputer.WhoFirstWithComputer.whoFirstWithComputer;
import static com.kodilla.graphics.LogicFX.tiles;
import static com.kodilla.moves.ComputerMove.computerMove;
import static com.kodilla.names.ComputerName.computer;
import static com.kodilla.names.PlayerOneName.playerOneName;

public class ComputerMoveFx {

    Random random = new Random();

    public static void moveFx() {
        ComputerMoveFx computerMoveFx = new ComputerMoveFx();
        switch (computerMoveFx.getFxRandom()){
            case (1) -> tiles[0][0].setMove(computerMove);
            case (2) -> tiles[0][1].setMove(computerMove);
            case (3) -> tiles[0][2].setMove(computerMove);
            case (4) -> tiles[1][0].setMove(computerMove);
            case (5) -> tiles[1][1].setMove(computerMove);
            case (6) -> tiles[1][2].setMove(computerMove);
            case (7) -> tiles[2][0].setMove(computerMove);
            case (8) -> tiles[2][1].setMove(computerMove);
            case (9) -> tiles[2][2].setMove(computerMove);
        }
    }

    public int getFxRandom() {

        if (whoFirstWithComputer.equals(computer)) {
            Integer x1 = getFxInteger1();
            if (x1 != null) return x1;
            Integer x = getFxInteger();
            if (x != null) return x;
        }
        if (whoFirstWithComputer.equals(playerOneName)) {
            Integer x = getFxInteger();
            if (x != null) return x;
            Integer x1 = getFxInteger1();
            if (x1 != null) return x1;
        }
        return random.nextInt(9) + 1;

    }

    private Integer getFxInteger1() {
        if ((String.valueOf(tiles[0][0]).equals("O")) && (String.valueOf(tiles[0][1]).equals("O")) && (!String.valueOf(tiles[0][2]).equals("X"))) {
            return 3;
        } else if ((String.valueOf(tiles[0][1]).equals("O")) && (String.valueOf(tiles[0][2]).equals("O")) && (!String.valueOf(tiles[0][0]).equals("X"))) {
            return 1;
        } else if ((String.valueOf(tiles[1][1]).equals("O")) && (String.valueOf(tiles[1][2]).equals("O")) && (!String.valueOf(tiles[1][0]).equals("X"))) {
            return 4;
        } else if ((String.valueOf(tiles[1][0]).equals("O")) && (String.valueOf(tiles[1][1]).equals("O")) && (!String.valueOf(tiles[1][2]).equals("X"))) {
            return 6;
        } else if ((String.valueOf(tiles[2][0]).equals("O")) && (String.valueOf(tiles[2][1]).equals("O")) && (!String.valueOf(tiles[2][2]).equals("X"))) {
            return 9;
        } else if ((String.valueOf(tiles[2][1]).equals("O")) && (String.valueOf(tiles[2][2]).equals("O")) && (!String.valueOf(tiles[2][0]).equals("X"))) {
            return 7;
        } else if ((String.valueOf(tiles[0][0]).equals("O")) && (String.valueOf(tiles[1][0]).equals("O")) && (!String.valueOf(tiles[2][0]).equals("X"))) {
            return 7;
        } else if ((String.valueOf(tiles[1][0]).equals("O")) && (String.valueOf(tiles[2][0]).equals("O")) && (!String.valueOf(tiles[0][0]).equals("X"))) {
            return 1;
        } else if ((String.valueOf(tiles[0][1]).equals("O")) && (String.valueOf(tiles[1][1]).equals("O")) && (!String.valueOf(tiles[2][1]).equals("X"))) {
            return 8;
        } else if ((String.valueOf(tiles[1][1]).equals("O")) && (String.valueOf(tiles[2][1]).equals("O")) && (!String.valueOf(tiles[0][1]).equals("X"))) {
            return 2;
        } else if ((String.valueOf(tiles[1][2]).equals("O")) && (String.valueOf(tiles[2][2]).equals("O")) && (!String.valueOf(tiles[0][2]).equals("X"))) {
            return 3;
        } else if ((String.valueOf(tiles[0][2]).equals("O")) && (String.valueOf(tiles[1][2]).equals("O")) && (!String.valueOf(tiles[2][2]).equals("X"))) {
            return 9;
        } else if ((String.valueOf(tiles[0][0]).equals("O")) && (String.valueOf(tiles[1][1]).equals("O")) && (!String.valueOf(tiles[2][2]).equals("X"))) {
            return 9;
        } else if ((String.valueOf(tiles[1][1]).equals("O")) && (String.valueOf(tiles[2][2]).equals("O")) && (!String.valueOf(tiles[0][0]).equals("X"))) {
            return 1;
        } else if ((String.valueOf(tiles[0][2]).equals("O")) && (String.valueOf(tiles[1][1]).equals("O")) && (!String.valueOf(tiles[2][0]).equals("X"))) {
            return 7;
        } else if ((String.valueOf(tiles[0][0]).equals("O")) && (String.valueOf(tiles[0][2]).equals("O")) && (!String.valueOf(tiles[0][1]).equals("X"))) {
            return 2;
        } else if ((String.valueOf(tiles[1][0]).equals("O")) && (String.valueOf(tiles[1][2]).equals("O")) && (!String.valueOf(tiles[1][1]).equals("X"))) {
            return 5;
        } else if ((String.valueOf(tiles[2][0]).equals("O")) && (String.valueOf(tiles[2][2]).equals("O")) && (!String.valueOf(tiles[2][1]).equals("X"))) {
            return 8;
        } else if ((String.valueOf(tiles[0][0]).equals("O")) && (String.valueOf(tiles[2][0]).equals("O")) && (!String.valueOf(tiles[1][0]).equals("X"))) {
            return 4;
        } else if ((String.valueOf(tiles[0][1]).equals("O")) && (String.valueOf(tiles[2][1]).equals("O")) && (!String.valueOf(tiles[1][1]).equals("X"))) {
            return 5;
        } else if ((String.valueOf(tiles[0][2]).equals("O")) && (String.valueOf(tiles[2][2]).equals("O")) && (!String.valueOf(tiles[1][2]).equals("X"))) {
            return 6;
        } else if ((String.valueOf(tiles[0][0]).equals("O")) && (String.valueOf(tiles[2][2]).equals("O")) && (!String.valueOf(tiles[1][1]).equals("X"))) {
            return 5;
        } else if ((String.valueOf(tiles[0][2]).equals("O")) && (String.valueOf(tiles[2][0]).equals("O")) && (!String.valueOf(tiles[1][1]).equals("X"))) {
            return 5;
        } else if ((String.valueOf(tiles[1][1]).equals("O")) && (String.valueOf(tiles[2][0]).equals("O")) && (!String.valueOf(tiles[0][2]).equals("X"))) {
            return 3;
        }
        return null;
    }

    private Integer getFxInteger() {
        if ((String.valueOf(tiles[0][0]).equals("X")) && (String.valueOf(tiles[0][1]).equals("X")) && (!String.valueOf(tiles[0][2]).equals("O"))) {
            return 3;
        } else if ((String.valueOf(tiles[0][1]).equals("X")) && (String.valueOf(tiles[0][2]).equals("X")) && (!String.valueOf(tiles[0][0]).equals("O"))) {
            return 1;
        } else if ((String.valueOf(tiles[1][1]).equals("X")) && (String.valueOf(tiles[1][2]).equals("X")) && (!String.valueOf(tiles[1][0]).equals("O"))) {
            return 4;
        } else if ((String.valueOf(tiles[1][0]).equals("X")) && (String.valueOf(tiles[1][1]).equals("X")) && (!String.valueOf(tiles[1][2]).equals("O"))) {
            return 6;
        } else if ((String.valueOf(tiles[2][0]).equals("X")) && (String.valueOf(tiles[2][1]).equals("X")) && (!String.valueOf(tiles[2][2]).equals("O"))) {
            return 9;
        } else if ((String.valueOf(tiles[2][1]).equals("X")) && (String.valueOf(tiles[2][2]).equals("X")) && (!String.valueOf(tiles[2][0]).equals("O"))) {
            return 7;
        } else if ((String.valueOf(tiles[0][0]).equals("X")) && (String.valueOf(tiles[1][0]).equals("X")) && (!String.valueOf(tiles[2][0]).equals("O"))) {
            return 7;
        } else if ((String.valueOf(tiles[1][0]).equals("X")) && (String.valueOf(tiles[2][0]).equals("X")) && (!String.valueOf(tiles[0][0]).equals("O"))) {
            return 1;
        } else if ((String.valueOf(tiles[0][1]).equals("X")) && (String.valueOf(tiles[1][1]).equals("X")) && (!String.valueOf(tiles[2][1]).equals("O"))) {
            return 8;
        } else if ((String.valueOf(tiles[1][1]).equals("X")) && (String.valueOf(tiles[2][1]).equals("X")) && (!String.valueOf(tiles[0][1]).equals("O"))) {
            return 2;
        } else if ((String.valueOf(tiles[1][2]).equals("X")) && (String.valueOf(tiles[2][2]).equals("X")) && (!String.valueOf(tiles[0][2]).equals("O"))) {
            return 3;
        } else if ((String.valueOf(tiles[0][2]).equals("X")) && (String.valueOf(tiles[1][2]).equals("X")) && (!String.valueOf(tiles[2][2]).equals("O"))) {
            return 9;
        } else if ((String.valueOf(tiles[0][0]).equals("X")) && (String.valueOf(tiles[1][1]).equals("X")) && (!String.valueOf(tiles[2][2]).equals("O"))) {
            return 9;
        } else if ((String.valueOf(tiles[1][1]).equals("X")) && (String.valueOf(tiles[2][2]).equals("X")) && (!String.valueOf(tiles[0][0]).equals("O"))) {
            return 1;
        } else if ((String.valueOf(tiles[0][2]).equals("X")) && (String.valueOf(tiles[1][1]).equals("X")) && (!String.valueOf(tiles[2][0]).equals("O"))) {
            return 7;
        } else if ((String.valueOf(tiles[0][0]).equals("X")) && (String.valueOf(tiles[0][2]).equals("X")) && (!String.valueOf(tiles[0][1]).equals("O"))) {
            return 2;
        } else if ((String.valueOf(tiles[1][0]).equals("X")) && (String.valueOf(tiles[1][2]).equals("X")) && (!String.valueOf(tiles[1][1]).equals("O"))) {
            return 5;
        } else if ((String.valueOf(tiles[2][0]).equals("X")) && (String.valueOf(tiles[2][2]).equals("X")) && (!String.valueOf(tiles[2][1]).equals("O"))) {
            return 8;
        } else if ((String.valueOf(tiles[0][0]).equals("X")) && (String.valueOf(tiles[2][0]).equals("X")) && (!String.valueOf(tiles[1][0]).equals("O"))) {
            return 4;
        } else if ((String.valueOf(tiles[0][1]).equals("X")) && (String.valueOf(tiles[2][1]).equals("X")) && (!String.valueOf(tiles[1][1]).equals("O"))) {
            return 5;
        } else if ((String.valueOf(tiles[0][2]).equals("X")) && (String.valueOf(tiles[2][2]).equals("X")) && (!String.valueOf(tiles[1][2]).equals("O"))) {
            return 6;
        } else if ((String.valueOf(tiles[0][0]).equals("X")) && (String.valueOf(tiles[2][2]).equals("X")) && (!String.valueOf(tiles[1][1]).equals("O"))) {
            return 5;
        } else if ((String.valueOf(tiles[0][2]).equals("X")) && (String.valueOf(tiles[2][0]).equals("X")) && (!String.valueOf(tiles[1][1]).equals("O"))) {
            return 5;
        } else if ((String.valueOf(tiles[1][1]).equals("X")) && (String.valueOf(tiles[2][0]).equals("X")) && (!String.valueOf(tiles[0][2]).equals("O"))) {
            return 3;
        }
        return null;
    }
}
