package com.kodilla.game;

import java.util.Arrays;

import static com.kodilla.moves.WhoFirst.whoFirst;
import static com.kodilla.moves.WhoSecond.whoSec;

public class LogicForBigGame {

    public static String[] bigBoard;

    public static String getBigLogic() {
        int b;
        for (int i = 0; i < 42; i++) {
            StringBuffer s = new StringBuffer();
            if (i == 0) {
                b = 0;
                while (b < 10) {
                    s.append(bigBoard[b]);
                    b++;
                }
            }
            if (i == 1) {
                b = 10;
                while (b < 20) {
                    s.append(bigBoard[b]);
                    b++;
                }
            }
            if (i == 2) {
                b = 20;
                while (b < 30) {
                    s.append(bigBoard[b]);
                    b++;
                }
            }
            if (i == 3) {
                b = 30;
                while (b < 40) {
                    s.append(bigBoard[b]);
                    b++;
                }
            }
            if (i == 4) {
                b = 40;
                while (b < 50) {
                    s.append(bigBoard[b]);
                    b++;
                }
            }
            if (i == 5) {
                b = 50;
                while (b < 60) {
                    s.append(bigBoard[b]);
                    b++;
                }
            }
            if (i == 6) {
                b = 60;
                while (b < 70) {
                    s.append(bigBoard[b]);
                    b++;
                }
            }
            if (i == 7) {
                b = 70;
                while (b < 80) {
                    s.append(bigBoard[b]);
                    b++;
                }
            }
            if (i == 8) {
                b = 80;
                while (b < 90) {
                    s.append(bigBoard[b]);
                    b++;
                }
            }
            if (i == 9) {
                b = 90;
                while (b < 100) {
                    s.append(bigBoard[b]);
                    b++;
                }
            }
            if (i == 10) {
                b = 0;
                while (b < 100) {
                    s.append(bigBoard[b]);
                    b += 10;
                }
            }
            if (i == 11) {
                b = 1;
                while (b < 100) {
                    s.append(bigBoard[b]);
                    b += 10;
                }
            }
            if (i == 12) {
                b = 2;
                while (b < 100) {
                    s.append(bigBoard[b]);
                    b += 10;
                }
            }
            if (i == 13) {
                b = 3;
                while (b < 100) {
                    s.append(bigBoard[b]);
                    b += 10;
                }
            }
            if (i == 14) {
                b = 4;
                while (b < 100) {
                    s.append(bigBoard[b]);
                    b += 10;
                }
            }
            if (i == 15) {
                b = 5;
                while (b < 100) {
                    s.append(bigBoard[b]);
                    b += 10;
                }
            }
            if (i == 16) {
                b = 6;
                while (b < 100) {
                    s.append(bigBoard[b]);
                    b += 10;
                }
            }
            if (i == 17) {
                b = 7;
                while (b < 100) {
                    s.append(bigBoard[b]);
                    b += 10;
                }
            }
            if (i == 18) {
                b = 8;
                while (b < 100) {
                    s.append(bigBoard[b]);
                    b += 10;
                }
            }
            if (i == 19) {
                b = 9;
                while (b < 100) {
                    s.append(bigBoard[b]);
                    b += 10;
                }
            }
            if (i == 20) {
                b = 0;
                while (b < 100) {
                    s.append(bigBoard[b]);
                    b += 11;
                }
            }
            if (i == 21) {
                b = 1;
                while (b < 90) {
                    s.append(bigBoard[b]);
                    b += 11;
                }
            }
            if (i == 22) {
                b = 2;
                while (b < 80) {
                    s.append(bigBoard[b]);
                    b += 11;
                }
            }
            if (i == 23) {
                b = 3;
                while (b < 70) {
                    s.append(bigBoard[b]);
                    b += 11;
                }
            }
            if (i == 24) {
                b = 4;
                while (b < 60) {
                    s.append(bigBoard[b]);
                    b += 11;
                }
            }
            if (i == 25) {
                b = 5;
                while (b < 50) {
                    s.append(bigBoard[b]);
                    b += 11;
                }
            }
            if (i == 26) {
                b = 10;
                while (b < 99) {
                    s.append(bigBoard[b]);
                    b += 11;
                }
            }
            if (i == 27) {
                b = 20;
                while (b < 98) {
                    s.append(bigBoard[b]);
                    b += 11;
                }
            }
            if (i == 28) {
                b = 30;
                while (b < 97) {
                    s.append(bigBoard[b]);
                    b += 11;
                }
            }
            if (i == 29) {
                b = 40;
                while (b < 96) {
                    s.append(bigBoard[b]);
                    b += 11;
                }
            }
            if (i == 30) {
                b = 50;
                while (b < 95) {
                    s.append(bigBoard[b]);
                    b += 11;
                }
            }
            if (i == 31) {
                b = 90;
                while (b >= 9) {
                    s.append(bigBoard[b]);
                    b -= 9;
                }
            }
            if (i == 32) {
                b = 91;
                while (b >= 19) {
                    s.append(bigBoard[b]);
                    b -= 9;
                }
            }
            if (i == 33) {
                b = 92;
                while (b >= 29) {
                    s.append(bigBoard[b]);
                    b -= 9;
                }
            }
            if (i == 34) {
                b = 93;
                while (b >= 39) {
                    s.append(bigBoard[b]);
                    b -= 9;
                }
            }
            if (i == 35) {
                b = 94;
                while (b >= 49) {
                    s.append(bigBoard[b]);
                    b -= 9;
                }
            }
            if (i == 36) {
                b = 95;
                while (b >= 59) {
                    s.append(bigBoard[b]);
                    b -= 9;
                }
            }
            if (i == 37) {
                b = 80;
                while (b >= 8) {
                    s.append(bigBoard[b]);
                    b -= 9;
                }
            }
            if (i == 38) {
                b = 70;
                while (b >= 7) {
                    s.append(bigBoard[b]);
                    b -= 9;
                }
            }
            if (i == 39) {
                b = 60;
                while (b >= 6) {
                    s.append(bigBoard[b]);
                    b -= 9;
                }
            }
            if (i == 40) {
                b = 50;
                while (b >= 5) {
                    s.append(bigBoard[b]);
                    b -= 9;
                }
            }
            if (i == 41) {
                b = 40;
                while (b >= 4) {
                    s.append(bigBoard[b]);
                    b -= 9;
                }
            }
            if (s.toString().contains("OOOOO")) {
                return whoFirst;
            } else if (s.toString().contains("XXXXX")) {
                return whoSec;
            }
        }
        for (int i = 0; i < 100; i++) {
            if (Arrays.asList(bigBoard).contains(String.valueOf(i + 1))) {
                break;
            } else if (i == 99) {
                return "draw";
            }
        }
        return null;
    }
}
