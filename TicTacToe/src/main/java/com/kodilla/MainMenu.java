package com.kodilla;

import com.kodilla.game.GamePlayerVsComputer;
import com.kodilla.game.GamePlayerVsPlayer;

import java.util.Scanner;

public class MainMenu {

    public void menu() {
        System.out.println("Welcome in tic-tac-toe game");
        GamePlayerVsPlayer gamePlayerVsPlayer = new GamePlayerVsPlayer();
        GamePlayerVsComputer gamePlayerVsComputer = new GamePlayerVsComputer();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose game\n1: Play with friend\n2: Play with computer\n3: Exit");
        int n = scanner.next().charAt(0);
        boolean isTrue = true;
        while (isTrue) {
            switch (n) {
                case '1':
                    isTrue = false;
                    gamePlayerVsPlayer.game();
                    break;

                case '2':
                    isTrue = false;
                    gamePlayerVsComputer.gameWithComputer();
                    break;

                case '3':
                    isTrue = false;
                    break;

                default:
                    System.out.println("Not a defined operation, Exit");
                    isTrue = false;
            }
        }
    }
}
