package com.kodilla;

import com.kodilla.exceptions.BadChoiceException;

public class TicTacToeRunner {
    public static void main(String[] args) throws BadChoiceException {

        MainMenu mainMenu = new MainMenu();
        mainMenu.menu();
    }
}
