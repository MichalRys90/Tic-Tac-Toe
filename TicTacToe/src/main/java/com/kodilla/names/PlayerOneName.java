package com.kodilla.names;

import java.util.Scanner;

public class PlayerOneName {
    public static String playerOneName;
    Scanner scanner = new Scanner(System.in);

    public String getPlayerOneName(){
        playerOneName = scanner.nextLine();
        return playerOneName;
    }
}
