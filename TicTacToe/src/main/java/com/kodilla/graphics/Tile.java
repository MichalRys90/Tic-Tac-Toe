package com.kodilla.graphics;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;

import static com.kodilla.graphics.LogicFX.*;

public class Tile {

    public static boolean isEngGame = false;
    private StackPane pane;
    private Label label;

    public Tile() {
        pane = new StackPane();
        pane.setMinSize(100,100);

        Rectangle board = new Rectangle();
        board.setWidth(100);
        board.setHeight(100);
        board.setFill(Color.BLACK);
        board.setStroke(Color.RED);
        pane.getChildren().add(board);

        label = new Label("");
        label.setAlignment(Pos.CENTER);
        label.setFont(Font.font(25));
        pane.getChildren().add(label);

        pane.setOnMouseClicked(event -> {
            if(label.getText().isEmpty() && !isEngGame) {
                label.setText(getPlayerOneFxMove());
                label.setTextFill(Color.YELLOW);
                ChangePlayer();
                getLogicFX();
            }
        });
    }

    public StackPane getPane() {
        return pane;
    }

    public String getMove() {
        return label.getText();
    }

    public void setMove(String value) {
        label.setText(value);
    }
}
