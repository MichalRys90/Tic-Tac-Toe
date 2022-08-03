package com.kodilla.exceptions;

import java.util.Scanner;

public class GameMoveWithExceptionBig {

    Scanner scanner = new Scanner(System.in);
    String num;

    public String dialTheNumberBig() throws BadChoiceException {
        if (scanner.hasNextInt()) {
            num = scanner.nextLine();
            if ((Integer.parseInt(num) > 0) && ((Integer.parseInt(num) < 101))) {
                return num;
            } else {
                throw new BadChoiceException("Choose number from 1-100");
            }
        } else {
            scanner.next();
        }
        return (num);
    }

    public String turnBig() {
        try {
            return dialTheNumberBig();
        } catch (NumberFormatException d) {
            System.out.println("You have to choose integer \n" + d);
        } catch (BadChoiceException e) {
            System.out.println("Bad choice");
        }
        return turnBig();
    }
}
