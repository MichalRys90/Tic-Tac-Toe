package com.kodilla.names;

import java.util.Scanner;

public class PlayerTwoName {
    public static String playerTwoName;
    Scanner scanner = new Scanner(System.in);

    public String getPlayerTwoName() {
        playerTwoName = scanner.nextLine();
        return playerTwoName;
    }
}
