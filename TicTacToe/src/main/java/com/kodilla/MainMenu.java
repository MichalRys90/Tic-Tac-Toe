package com.kodilla;

import com.kodilla.game.GamePlayerVsComputer;
import com.kodilla.game.GamePlayerVsPlayer;
import com.kodilla.game.GamePlayerVsPlayerBig;
import com.kodilla.game.HardGamePlayerVsComputer;

import java.util.Scanner;

public class MainMenu {

    public void menu() {
        System.out.println("Welcome in tic-tac-toe game");
        GamePlayerVsPlayer gamePlayerVsPlayer = new GamePlayerVsPlayer();
        GamePlayerVsComputer gamePlayerVsComputer = new GamePlayerVsComputer();
        GamePlayerVsPlayerBig gamePlayerVsPlayerBig = new GamePlayerVsPlayerBig();
        HardGamePlayerVsComputer hardGamePlayerVsComputer = new HardGamePlayerVsComputer();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose game\n1: Play with friend\n2: Play with computer\n3: Big game with friend" +
                "\n4: Play with computer(HARD)\n5: Exit");
        int n = scanner.next().charAt(0);
        boolean isTrue = true;
        while (isTrue) {
            switch (n) {
                case '1' -> {
                    isTrue = false;
                    gamePlayerVsPlayer.game();
                }
                case '2' -> {
                    isTrue = false;
                    gamePlayerVsComputer.gameWithComputer();
                }
                case '3' -> {
                    isTrue = false;
                    gamePlayerVsPlayerBig.gameBig();
                }
                case '4' -> {
                    isTrue = false;
                    hardGamePlayerVsComputer.hardGameWithComputer();;
                }
                case '5' -> isTrue = false;
                default -> {
                    System.out.println("Not a defined operation, Exit");
                    isTrue = false;
                }
            }
        }
    }
}
