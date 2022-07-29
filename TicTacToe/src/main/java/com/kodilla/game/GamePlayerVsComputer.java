package com.kodilla.game;

import com.kodilla.MainMenu;
import com.kodilla.exceptions.GameMoveWithException;
import com.kodilla.gameWithComputer.WhoFirstWithComputer;
import com.kodilla.gameWithComputer.WhoSecondWithComputer;
import com.kodilla.moves.ComputerMove;
import com.kodilla.moves.ComputerTurn;
import com.kodilla.moves.PlayerOneMoveWithComputer;
import com.kodilla.names.PlayerOneName;

import static com.kodilla.game.Interfejs.interfejs;
import static com.kodilla.game.Logic.board;
import static com.kodilla.game.Score.computerScore;
import static com.kodilla.game.Score.playerOneVsComputerScore;
import static com.kodilla.gameWithComputer.LogicWithComputer.getLogicWithComputer;
import static com.kodilla.names.ComputerName.computer;
import static com.kodilla.names.PlayerOneName.playerOneName;

public class GamePlayerVsComputer {

    public void gameWithComputer() {
        board = new String[9];
        for (int i = 0; i < board.length; i++) {
            board[i] = String.valueOf(i + 1);
        }
        PlayerOneName playerOneName1 = new PlayerOneName();
        WhoFirstWithComputer whoFirstWithComputer = new WhoFirstWithComputer();
        WhoSecondWithComputer whoSecondWithComputer = new WhoSecondWithComputer();
        GameMoveWithException gameMoveWithException = new GameMoveWithException();
        MainMenu mainMenu = new MainMenu();
        ComputerTurn computerTurn = new ComputerTurn();
        System.out.println("Enter the name of the first player");
        playerOneName1.getPlayerOneName();
        System.out.println("Welcome in tic-tac-toe game " + playerOneName + " and " + computer);
        String first = whoFirstWithComputer.getWhoFirstWithComputer();
        whoSecondWithComputer.whoSecondWithComputer();
        PlayerOneMoveWithComputer playerOneMoveWithComputer = new PlayerOneMoveWithComputer();
        String playerOneM = playerOneMoveWithComputer.getPlayerOneMoveWithComputer();
        ComputerMove computerMove = new ComputerMove();
        String computerM = computerMove.getComputerMove();
        String turn;
        interfejs();

        if (first.equals(playerOneName)) {
            turn = playerOneM;
        } else {
            turn = computerM;
        }
        String win = null;
        while (win == null) {

            if (turn.equals(playerOneM)) {
                System.out.println(playerOneName + "'s turn. You use " + playerOneM);
            } else {
                System.out.println(computer + "'s turn. He use " + computerM);
            }
            if (turn.equals(playerOneM)) {
                try {
                    int move = gameMoveWithException.turn();
                    System.out.println(move);
                    if (board[move - 1].equals(String.valueOf(move))) {
                        board[move - 1] = turn;
                        turn = computerM;
                    } else {
                        System.out.println("Space taken, choose an empty space.");
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println(e);
                }
            } else {
                int a = computerTurn.getRandom();
                if (board[a - 1].equals(String.valueOf(a))) {
                    board[a - 1] = turn;
                    turn = playerOneM;
                }
            }
            interfejs();
            win = getLogicWithComputer();
        }
        if (getLogicWithComputer().equals("draw")) {
            System.out.println("Its a draw!");
        } else {
            System.out.println("\n\n\nCongratulation!! The winner is: " + getLogicWithComputer());
        }
        if (getLogicWithComputer().equals(playerOneName)) {
            playerOneVsComputerScore++;
        } else {
            computerScore++;
        }
        System.out.println("the current score of the computer game is: " + playerOneName + " " +
                playerOneVsComputerScore + " " + computer + " " + computerScore);
        mainMenu.menu();
    }
}
