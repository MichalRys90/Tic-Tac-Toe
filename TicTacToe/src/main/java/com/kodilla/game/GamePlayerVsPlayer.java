package com.kodilla.game;

import com.kodilla.MainMenu;
import com.kodilla.exceptions.GameMoveWithException;
import com.kodilla.moves.PlayerOneMove;
import com.kodilla.moves.PlayerTwoMove;
import com.kodilla.moves.WhoFirst;
import com.kodilla.moves.WhoSecond;
import com.kodilla.names.PlayerOneName;
import com.kodilla.names.PlayerTwoName;

import static com.kodilla.game.Interfejs.interfejs;
import static com.kodilla.game.Logic.board;
import static com.kodilla.game.Logic.getLogic;
import static com.kodilla.game.Score.playerOneScore;
import static com.kodilla.game.Score.playerTwoScore;
import static com.kodilla.names.PlayerOneName.playerOneName;
import static com.kodilla.names.PlayerTwoName.playerTwoName;

public class GamePlayerVsPlayer {

    public void game() {
        board = new String[9];
        for (int i = 0; i < board.length; i++) {
            board[i] = String.valueOf(i + 1);
        }
        PlayerOneName playerOneName1 = new PlayerOneName();
        PlayerTwoName playerTwoName1 = new PlayerTwoName();
        MainMenu mainMenu = new MainMenu();
        WhoFirst whoFirst = new WhoFirst();
        WhoSecond whoSecond = new WhoSecond();
        GameMoveWithException gameMoveWithException = new GameMoveWithException();
        System.out.println("Enter the name of the first player");
        playerOneName1.getPlayerOneName();
        System.out.println("Enter the name of the second player");
        playerTwoName1.getPlayerTwoName();
        System.out.println("Welcome in tic-tac-toe game " + playerOneName + " and " + playerTwoName);
        interfejs();
        String first = whoFirst.getWhoFirst();
        whoSecond.whoSecond();
        PlayerOneMove playerOneMove = new PlayerOneMove();
        String playerOneM = playerOneMove.getPlayerOneMove();
        PlayerTwoMove playerTwoMove = new PlayerTwoMove();
        String playerTwoM = playerTwoMove.getPlayerTwoMove();
        String turn;

        if (first.equals(playerOneName)) {
            turn = playerOneM;
        } else {
            turn = playerTwoM;
        }
        String win = null;
        while (win == null) {
            try {
                if (turn.equals(playerOneM)) {
                    System.out.println(playerOneName + "'s turn. You use " + playerOneM);
                } else {
                    System.out.println(playerTwoName + "'s turn. You use " + playerTwoM);
                }
                int move = gameMoveWithException.turn();
                System.out.println(move);
                if (board[move - 1].equals(String.valueOf(move))) {
                    board[move - 1] = turn;
                    if (turn.equals(playerOneM)) {
                        turn = playerTwoM;
                    } else {
                        turn = playerOneM;
                    }
                    interfejs();
                    win = getLogic();
                } else {
                    System.out.println("Space taken, choose an empty space.");
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Bad choice");
            }
        }
        if (getLogic().equals("draw")) {
            System.out.println("Its a draw!");
        }
        else {
            System.out.println("\n\n\nCongratulation!! The winner is: " + getLogic());
        }
        if (getLogic().equals(playerOneName)) {
            playerOneScore++;
        } else {
            playerTwoScore++;
        }
        System.out.println("the current score of a two-player game is: " + playerOneName + " " + playerOneScore + " "
                + playerTwoName + " " + playerTwoScore);
        mainMenu.menu();
    }
}
