package main.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Main {
    @FXML
    private Button showPlantsPlayerButton;

    @FXML
    private void handlePlantsPlayer( ActionEvent event ) {
        System.out.println("handlePlantsPlayer");
    }

    @FXML
    private void handleZombiesPlayer( ActionEvent event ) {
        System.out.println("handleZombiesPlayer");
    }

    @FXML
    private void handleStartGame ( ActionEvent event ) {
        System.out.println("handleStartGame");
    }

    @FXML
    private void handleDeleteData ( ActionEvent event ) {
        System.out.println("handleDeleteData");
    }

}
