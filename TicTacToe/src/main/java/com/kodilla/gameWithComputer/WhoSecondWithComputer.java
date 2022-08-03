package com.kodilla.gameWithComputer;

import static com.kodilla.gameWithComputer.WhoFirstWithComputer.whoFirstWithComputer;
import static com.kodilla.names.ComputerName.computer;
import static com.kodilla.names.PlayerOneName.playerOneName;

public class WhoSecondWithComputer {

    public static String whoSecWithComputer;

    public void whoSecondWithComputer() {
        if (whoFirstWithComputer.equals(playerOneName)) {
            whoSecWithComputer = computer;
        } else {
            whoSecWithComputer = playerOneName;
        }
    }
}
