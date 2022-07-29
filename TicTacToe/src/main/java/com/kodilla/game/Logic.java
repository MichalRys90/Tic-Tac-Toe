package com.kodilla.game;

import java.util.Arrays;

import static com.kodilla.moves.WhoFirst.whoFirst;
import static com.kodilla.moves.WhoSecond.whoSec;


public class Logic {

    public static String[] board;

    public static String getLogic() {
        for (int i = 0; i < 8; i++) {
            String s = switch (i) {
                case (0) -> board[0] + board[1] + board[2];
                case (1) -> board[3] + board[4] + board[5];
                case (2) -> board[6] + board[7] + board[8];
                case (3) -> board[0] + board[3] + board[6];
                case (4) -> board[1] + board[4] + board[7];
                case (5) -> board[2] + board[5] + board[8];
                case (6) -> board[0] + board[4] + board[8];
                case (7) -> board[2] + board[4] + board[6];
                default -> null;
            };
            if (s.equals("OOO")) {
                return whoFirst;
            } else if (s.equals("XXX")) {
                return whoSec;
            }
        }
        for (int i=0; i<9; i++) {
            if (Arrays.asList(board).contains(String.valueOf(i + 1))) {
                break;
            } else if (i == 8) {
                return "draw";
            }
        }
        return null;
    }
}
