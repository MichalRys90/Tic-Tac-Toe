package com.kodilla.game;

import com.kodilla.graphics.InfoCenter;
import com.kodilla.graphics.InterfejsFX;
import com.kodilla.graphics.Tile;
import javafx.scene.layout.StackPane;

import static com.kodilla.graphics.Tile.isEngGame;

public class LogicFX {

    private StackPane pane;
    private static Tile[][] tiles = new Tile[3][3];
    private static InfoCenter infoCenter;
    private static char playerFxMove = 'O';


    public LogicFX(InfoCenter infoCenter) {
        this.infoCenter = infoCenter;
        pane = new StackPane();
        pane.setMinSize(InterfejsFX.width, InterfejsFX.height);
        pane.setTranslateX(InterfejsFX.width / 2);
        pane.setTranslateY((InterfejsFX.height / 2) + InterfejsFX.infoHeight);

        addAllTiles();
    }

    private void addAllTiles() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Tile tile = new Tile();
                tile.getPane().setTranslateX((j*100) - 100);
                tile.getPane().setTranslateY((i*100) - 100);
                pane.getChildren().add(tile.getPane());
                tiles[i][j] = tile;
            }
        }
    }

    public void restartGame() {
        isEngGame = false;
        playerFxMove = 'O';
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tiles[i][j].setMove("");
            }
        }
    }
    public static void ChangePlayer() {
        if (playerFxMove == 'O'){
            playerFxMove = 'X';
        } else {
            playerFxMove = 'O';
        }
        infoCenter.updateMassage("Player " + playerFxMove + " turn's");
    }

    public static String getPlayerOneFxMove(){
        return String.valueOf(playerFxMove);
    }
    public StackPane getPane() {
        return pane;
    }

        public static void getLogicFX() {
            for (int i = 0; i < 8; i++) {
                String s = switch (i) {
                    case (0) -> tiles[0][0].getMove() + tiles[0][1].getMove() + tiles[0][2].getMove();
                    case (1) -> tiles[1][0].getMove() + tiles[1][1].getMove() + tiles[1][2].getMove();
                    case (2) -> tiles[2][0].getMove() + tiles[2][1].getMove() + tiles[2][2].getMove();
                    case (3) -> tiles[0][0].getMove() + tiles[1][0].getMove() + tiles[2][0].getMove();
                    case (4) -> tiles[0][1].getMove() + tiles[1][1].getMove() + tiles[2][1].getMove();
                    case (5) -> tiles[0][2].getMove() + tiles[1][2].getMove() + tiles[2][2].getMove();
                    case (6) -> tiles[0][0].getMove() + tiles[1][1].getMove() + tiles[2][2].getMove();
                    case (7) -> tiles[2][0].getMove() + tiles[1][1].getMove() + tiles[0][2].getMove();
                    default -> null;
                };
                if (s.equals("OOO")) {
                    String winner = "The winner is O player!";
                    gameWinner(winner);
                } else if (s.equals("XXX")) {
                    String winner = "The winner is X player!";
                    gameWinner(winner);
                }
            }
            if (!isEngGame) {
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (tiles[i][j].getMove().isEmpty()) {
                            return;
                        }
                    }
                }
                String winner = "It's a Draw!";
                gameWinner(winner);
                isEngGame = true;
            }
        }

    private static void gameWinner(String winner) {
        isEngGame = true;
        infoCenter.updateMassage(winner);
        System.out.println(winner);
    }
}
