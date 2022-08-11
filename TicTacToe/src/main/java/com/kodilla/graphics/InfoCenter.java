package com.kodilla.graphics;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;

public class InfoCenter {

    private StackPane pane;
    private Label massage;
    private Button restart;

    public InfoCenter(){
        pane = new StackPane();
        pane.setMinSize(InterfejsFX.infoWidth, InterfejsFX.infoHeight);
        pane.setTranslateX(InterfejsFX.width / 2);
        pane.setTranslateY(InterfejsFX.infoHeight / 2);

        massage = new Label("Tic-Tac-Toe");
        massage.setMinSize(InterfejsFX.infoWidth, InterfejsFX.infoHeight);
        massage.setFont(Font.font(24));
        massage.setAlignment(Pos.CENTER);
        massage.setTranslateY(-20);
        pane.getChildren().add(massage);

        restart = new Button("Restart");
        restart.setMinSize(120,30);
        restart.setTranslateY(20);
        pane.getChildren().add(restart);
    }

    public StackPane getPane() {
        return pane;
    }

    public void updateMassage(String massage) {
        this.massage.setText(massage);
    }

    public void restartAction(EventHandler<ActionEvent> onAction) {
        restart.setOnAction(onAction);
    }
}
