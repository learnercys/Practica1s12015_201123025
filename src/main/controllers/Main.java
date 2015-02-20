/**
 * @author learnercys learner.cys@gmail.com
 * @version 0.0.0
 */

package main.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main {

    /**
     * Show a new window that allows to the user to set the plants player settings.
     *
     * @param event The handle event.
     */
    @FXML
    public void handlePlantsPlayer( ActionEvent event ) {
        System.out.println("handlePlantsPlayer");
        try {
            this.showPlayerConfiguration( "plant");
        } catch ( IOException ex ) {
            System.out.println("something bad happened");
        }
    }

    /**
     * Show a new window that allos to the user to set the zombies player settings.
     *
     * @param event The handle event.
     */
    @FXML
    public void handleZombiesPlayer( ActionEvent event ) {
        System.out.println("handleZombiesPlayer");
        try {
            this.showPlayerConfiguration( "zombie" );
        } catch ( IOException ex ) {
            System.out.println("something bad happened");
        }
    }

    /**
     * Allows to the user start a new game with the new configurations.
     *
     * @param event The handle event.
     */
    @FXML
    public void handleStartGame ( ActionEvent event ) {
        System.out.println("handleStartGame");
    }

    /**
     * Allows to the user delete the last configurations saved.
     *
     * @param event The handle event.
     */
    @FXML
    public void handleDeleteData ( ActionEvent event ) {
        System.out.println("handleDeleteData");
    }

    private void showPlayerConfiguration ( String type ) throws IOException{

        Parent playerConfigurationWindow = FXMLLoader.load( getClass().getResource("../fxml/playerConfigurations.fxml") );
        Stage stage = new Stage();
        stage.setTitle(main.Main.APP_TITLE);
        stage.setScene( new Scene( playerConfigurationWindow ) );
        stage.show();
    }

}
