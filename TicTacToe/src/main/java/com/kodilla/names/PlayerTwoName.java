package com.kodilla.names;

import java.util.Scanner;

public class PlayerTwoName {
    public static String playerTwoName;
    Scanner scanner = new Scanner(System.in);

    public void getPlayerTwoName() {
        playerTwoName = scanner.nextLine();
    }
}
