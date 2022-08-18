package com.kodilla.game;

import com.kodilla.MainMenu;
import com.kodilla.Rankings;
import com.kodilla.exceptions.GameMoveWithExceptionBig;
import com.kodilla.moves.PlayerOneMoveBig;
import com.kodilla.moves.PlayerTwoMoveBig;
import com.kodilla.moves.WhoFirstBig;
import com.kodilla.moves.WhoSecondBig;
import com.kodilla.names.PlayerOneName;
import com.kodilla.names.PlayerTwoName;

import java.text.DecimalFormat;

import static com.kodilla.bigGame.BigInterface.bigInterface;
import static com.kodilla.bigGame.LogicForBigGame.bigBoard;
import static com.kodilla.bigGame.LogicForBigGame.getBigLogic;
import static com.kodilla.game.Score.playerOneScore;
import static com.kodilla.game.Score.playerTwoScore;
import static com.kodilla.names.PlayerOneName.playerOneName;
import static com.kodilla.names.PlayerTwoName.playerTwoName;

public class GamePlayerVsPlayerBig {

    public void gameBig() {
        DecimalFormat format = new DecimalFormat("000");
        bigBoard = new String[100];
        for (int i = 0; i < bigBoard.length; i++) {
            bigBoard[i] = (format.format(i + 1));
        }
        Rankings rankings = new Rankings();
        PlayerOneName playerOneName1 = new PlayerOneName();
        PlayerTwoName playerTwoName1 = new PlayerTwoName();
        MainMenu mainMenu = new MainMenu();
        WhoFirstBig whoFirst = new WhoFirstBig();
        WhoSecondBig whoSecond = new WhoSecondBig();
        GameMoveWithExceptionBig gameMoveWithException = new GameMoveWithExceptionBig();
        System.out.println("Enter the name of the first player");
        playerOneName1.getPlayerOneName();
        System.out.println("Enter the name of the second player");
        playerTwoName1.getPlayerTwoName();
        System.out.println("Welcome in tic-tac-toe game " + playerOneName + " and " + playerTwoName);
        rankings.loadMapBig();
        bigInterface();
        String first = whoFirst.getWhoFirstBig();
        whoSecond.whoSecondBig();
        PlayerOneMoveBig playerOneMove = new PlayerOneMoveBig();
        String playerOneM = playerOneMove.getPlayerOneMoveBig();
        PlayerTwoMoveBig playerTwoMove = new PlayerTwoMoveBig();
        String playerTwoM = playerTwoMove.getPlayerTwoMoveBig();
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
                String move = gameMoveWithException.turnBig();
                System.out.println(move);
                if (bigBoard[Integer.parseInt(move) - 1].equals(move)) {
                    bigBoard[Integer.parseInt(move) - 1] = turn;
                    if (turn.equals(playerOneM)) {
                        turn = playerTwoM;
                    } else {
                        turn = playerOneM;
                    }
                    bigInterface();
                    win = getBigLogic();
                    rankings.saveMapBig();
                } else {
                    System.out.println("Space taken, choose an empty space.");
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Bad choice");
            }
        }
        if (getBigLogic().equals("draw")) {
            System.out.println("Its a draw!");
        }
        else {
            System.out.println("\n\n\nCongratulation!! The winner is: " + getBigLogic());
        }
        if (getBigLogic().equals(playerOneName)) {
            playerOneScore++;
        } else if (getBigLogic().equals(playerTwoName)) {
            playerTwoScore++;
        }
        System.out.println("the current score of a two-player game is: " + playerOneName + " " + playerOneScore + " "
                + playerTwoName + " " + playerTwoScore);
        mainMenu.menu();
    }
}
