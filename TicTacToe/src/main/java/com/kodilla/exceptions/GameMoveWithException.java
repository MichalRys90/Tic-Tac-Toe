package com.kodilla.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GameMoveWithException {

    Scanner scanner = new Scanner(System.in);
    int number;

    public int dialTheNumber() throws BadChoiceException {
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
            if ((number > 0) && (number < 10)) {
                return number;
            } else {
                throw new BadChoiceException("Choose number from 1-9");
            }
        } else {
            scanner.next();
        }
        return number;
    }

    public int turn() {
        try {
            return dialTheNumber();
        } catch (InputMismatchException d) {
            System.out.println("You have to choose integer \n" + d);
        } catch (BadChoiceException e) {
            System.out.println(e);
        }
        return 0;
    }
}
