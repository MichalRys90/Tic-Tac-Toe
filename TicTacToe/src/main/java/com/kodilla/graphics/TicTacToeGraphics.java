package com.kodilla.graphics;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class TicTacToeGraphics extends Application {
    private InfoCenter infoCenter = new InfoCenter();
    private LogicFX logicFX;

    public static void main(String[] args) {
        launch(args);

    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        BorderPane root = new BorderPane();
        Scene scene = new Scene(root, InterfejsFX.width, InterfejsFX.height + InterfejsFX.infoHeight);
        initLayout(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void initLayout(BorderPane root) {
        initInfoCenter(root);
        initTileBoard(root);
    }

    private void initTileBoard(BorderPane root) {
        logicFX = new LogicFX(infoCenter);
        root.getChildren().add(logicFX.getPane());
    }

    private void initInfoCenter(BorderPane root) {
       infoCenter.restartAction(restart());
       root.getChildren().add(infoCenter.getPane());
    }

    private EventHandler<ActionEvent> restart() {
        return new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                infoCenter.updateMassage("Player O's Turn");
                logicFX.restartGame();
            }
        };
    }
}
