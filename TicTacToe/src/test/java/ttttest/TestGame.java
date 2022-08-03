package ttttest;

import com.kodilla.exceptions.BadChoiceException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.InputMismatchException;

import static com.kodilla.game.Logic.board;
import static com.kodilla.game.Logic.getLogic;
import static com.kodilla.bigGame.LogicForBigGame.bigBoard;
import static com.kodilla.bigGame.LogicForBigGame.getBigLogic;
import static com.kodilla.moves.WhoFirst.whoFirst;
import static com.kodilla.moves.WhoSecond.whoSec;
import static com.kodilla.names.ComputerName.computer;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static com.kodilla.moves.WhoFirstBig.whoFirstBig;
import static com.kodilla.moves.WhoSecondBig.whoSecBig;

public class TestGame {

    @BeforeEach
    public void BeforeEach() {
        board = new String[9];
        for (int i = 0; i < board.length; i++) {
            board[i] = String.valueOf(i + 1);
        }
    }

    @Test
    public void TestName() {
        //Given


        //When

        //Then
        assertEquals("Computer", computer);
    }

    @Nested
    @DisplayName("Tests for O - row win")
    class TestRowO {
        @Test
        public void CheckWinnerForO012() {
            //Given
            whoFirst = "playerOne";
            whoSec = "playerTwo";

            //When
            board[0] = "O";
            board[1] = "O";
            board[2] = "O";
            String result = getLogic();

            //Then
            assertEquals("playerOne", result);
        }

        @Test
        public void CheckWinnerForO345() {
            //Given
            whoFirst = "playerOne";
            whoSec = "playerTwo";

            //When
            board[3] = "O";
            board[4] = "O";
            board[5] = "O";
            String result = getLogic();

            //Then
            assertEquals("playerOne", result);
        }

        @Test
        public void CheckWinnerForO678() {
            //Given
            whoFirst = "playerOne";
            whoSec = "playerTwo";

            //When
            board[6] = "O";
            board[7] = "O";
            board[8] = "O";
            String result = getLogic();

            //Then
            assertEquals("playerOne", result);
        }
    }

    @Nested
    @DisplayName("Tests for O - columns win")
    class TestColumnsO {
        @Test
        public void CheckWinnerForO036() {
            //Given
            whoFirst = "playerOne";
            whoSec = "playerTwo";

            //When
            board[0] = "O";
            board[3] = "O";
            board[6] = "O";
            String result = getLogic();

            //Then
            assertEquals("playerOne", result);
        }


        @Test
        public void CheckWinnerForO147() {
            //Given
            whoFirst = "playerOne";
            whoSec = "playerTwo";

            //When
            board[1] = "O";
            board[4] = "O";
            board[7] = "O";
            String result = getLogic();

            //Then
            assertEquals("playerOne", result);
        }


        @Test
        public void CheckWinnerForO258() {
            //Given
            whoFirst = "playerOne";
            whoSec = "playerTwo";

            //When
            board[2] = "O";
            board[5] = "O";
            board[8] = "O";
            String result = getLogic();

            //Then
            assertEquals("playerOne", result);
        }
    }

    @Nested
    @DisplayName("Tests for O - diagonal win")
    class TestDiagonalO {
        @Test
        public void CheckWinnerForO048() {
            //Given
            whoFirst = "playerOne";
            whoSec = "playerTwo";

            //When
            board[0] = "O";
            board[4] = "O";
            board[8] = "O";
            String result = getLogic();

            //Then
            assertEquals("playerOne", result);
        }


        @Test
        public void CheckWinnerForO246() {
            //Given
            whoFirst = "playerOne";
            whoSec = "playerTwo";

            //When
            board[2] = "O";
            board[4] = "O";
            board[6] = "O";
            String result = getLogic();

            //Then
            assertEquals("playerOne", result);
        }
    }

    @Nested
    @DisplayName("Tests for X - row win")
    class TestRowX {
        @Test
        public void CheckWinnerForX012() {
            //Given
            whoFirst = "playerOne";
            whoSec = "playerTwo";

            //When
            board[0] = "X";
            board[1] = "X";
            board[2] = "X";
            String result = getLogic();

            //Then
            assertEquals("playerTwo", result);
        }

        @Test
        public void CheckWinnerForX345() {
            //Given
            whoFirst = "playerOne";
            whoSec = "playerTwo";

            //When
            board[3] = "X";
            board[4] = "X";
            board[5] = "X";
            String result = getLogic();

            //Then
            assertEquals("playerTwo", result);
        }

        @Test
        public void CheckWinnerForX678() {
            //Given
            whoFirst = "playerOne";
            whoSec = "playerTwo";

            //When
            board[6] = "X";
            board[7] = "X";
            board[8] = "X";
            String result = getLogic();

            //Then
            assertEquals("playerTwo", result);
        }
    }

    @Nested
    @DisplayName("Tests for X - columns win")
    class TestColumnsX {
        @Test
        public void CheckWinnerForX036() {
            //Given
            whoFirst = "playerOne";
            whoSec = "playerTwo";

            //When

            board[0] = "X";
            board[3] = "X";
            board[6] = "X";
            String result = getLogic();

            //Then
            assertEquals("playerTwo", result);
        }

        @Test
        public void CheckWinnerForX147() {
            //Given
            whoFirst = "playerOne";
            whoSec = "playerTwo";

            //When
            board[1] = "X";
            board[4] = "X";
            board[7] = "X";
            String result = getLogic();

            //Then
            assertEquals("playerTwo", result);
        }

        @Test
        public void CheckWinnerForX246() {
            //Given
            whoFirst = "playerOne";
            whoSec = "playerTwo";

            //When
            board[2] = "X";
            board[4] = "X";
            board[6] = "X";
            String result = getLogic();

            //Then
            assertEquals("playerTwo", result);
        }
    }

    @Nested
    @DisplayName("Tests for X - diagonal win")
    class TestDiagonalX {
        @Test
        public void CheckWinnerForX258() {
            //Given
            whoFirst = "playerOne";
            whoSec = "playerTwo";

            //When
            board[2] = "X";
            board[5] = "X";
            board[8] = "X";
            String result = getLogic();

            //Then
            assertEquals("playerTwo", result);
        }

        @Test
        public void CheckWinnerForX048() {
            //Given
            whoFirst = "playerOne";
            whoSec = "playerTwo";

            //When
            board[0] = "X";
            board[4] = "X";
            board[8] = "X";
            String result = getLogic();

            //Then
            assertEquals("playerTwo", result);
        }
    }

    @Nested
    @DisplayName("Tests for Draw")
    class TestForDraw {
        @Test
        public void CheckIfDrawOne() {
            //Given
            whoFirst = "playerOne";
            whoSec = "playerTwo";

            //When
            board[0] = "X";
            board[1] = "O";
            board[2] = "X";
            board[3] = "O";
            board[4] = "X";
            board[5] = "O";
            board[6] = "O";
            board[7] = "X";
            board[8] = "O";
            String result = getLogic();

            //Then
            assertEquals("draw", result);
        }

        @Test
        public void CheckIfDrawTwo() {
            //Given
            whoFirst = "playerOne";
            whoSec = "playerTwo";

            //When
            board[0] = "O";
            board[1] = "X";
            board[2] = "O";
            board[3] = "X";
            board[4] = "O";
            board[5] = "X";
            board[6] = "X";
            board[7] = "O";
            board[8] = "X";
            String result = getLogic();

            //Then
            assertEquals("draw", result);
        }
    }

    @Test
    public void ExceptionTest() {
        //Given
        num = 10;

        //When
        Throwable exception = assertThrows(BadChoiceException.class, this::dialTheNumberTest);

        //Then
        assertEquals("Choose number from 1-9", exception.getMessage());

    }

    @Test
    public void ExceptionTest2() {
        //Given
        num = 0;

        //When
        Throwable exception = assertThrows(BadChoiceException.class, this::dialTheNumberTest);

        //Then
        assertEquals("Choose number from 1-9", exception.getMessage());

    }
    @Test
    public void ExceptionTest3() {
        //Given
        num = 5;

        //When
        int result = turnTest();

        //Then
        assertEquals(5, result);

    }

    @Nested
    @DisplayName("Tests for 10*10 game")
    class TestBigGame {
        @Test
        public void CheckWinnerForBigRow() {
            //Given

            DecimalFormat format = new DecimalFormat("000");
            bigBoard = new String[100];
            for (int i = 0; i < bigBoard.length; i++) {
                bigBoard[i] = format.format(i + 1);
            }
            whoFirstBig = "playerOne";
            whoSecBig = "playerTwo";

            //When
            bigBoard[2] = " X ";
            bigBoard[3] = " X ";
            bigBoard[4] = " X ";
            bigBoard[5] = " X ";
            bigBoard[6] = " X ";

            String result = getBigLogic();
            getBigLogic();

            //Then
            assertEquals("playerTwo", result);
        }

        @Test
        public void CheckWinnerForBigDiagonal() {
            //Given
            DecimalFormat format = new DecimalFormat("000");
            bigBoard = new String[100];
            for (int i = 0; i < bigBoard.length; i++) {
                bigBoard[i] = format.format(i + 1);
            }
            whoFirstBig = "playerOne";
            whoSecBig = "playerTwo";

            //When
            bigBoard[0] = " O ";
            bigBoard[11] = " O ";
            bigBoard[22] = " O ";
            bigBoard[33] = " O ";
            bigBoard[44] = " O ";

            String result = getBigLogic();

            //Then
            assertEquals("playerOne", result);
        }

        @Test
        public void CheckWinnerForBigColumn() {
            //Given
            DecimalFormat format = new DecimalFormat("000");
            bigBoard = new String[100];
            for (int i = 0; i < bigBoard.length; i++) {
                bigBoard[i] = format.format(i + 1);
            }
            whoFirstBig = "playerOne";
            whoSecBig = "playerTwo";

            //When
            bigBoard[9] = " O ";
            bigBoard[19] = " O ";
            bigBoard[29] = " O ";
            bigBoard[39] = " O ";
            bigBoard[49] = " O ";

            String result = getBigLogic();

            //Then
            assertEquals("playerOne", result);
        }

        @Test
        public void CheckWinnerForBigDraw() {
            //Given
            bigBoard = new String[100];
            Arrays.fill(bigBoard, "K");
            whoFirstBig = "playerOne";
            whoSecBig = "playerTwo";

            //When
            String result = getBigLogic();

            //Then
            assertEquals("draw", result);
        }
    }




















    static int num;

    public int dialTheNumberTest() throws BadChoiceException {

        if ((num > 0) && (num < 10)) {
            return num;
        } else {
            throw new BadChoiceException("Choose number from 1-9");
        }
    }

    public int turnTest() {
        try {
            return dialTheNumberTest();
        } catch (InputMismatchException d) {
            System.out.println("You have to choose integer \n" + d);
        } catch (BadChoiceException e) {
            System.out.println("Bad choice");
        }
        return 0;
    }
}
