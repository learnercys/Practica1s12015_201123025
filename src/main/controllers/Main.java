/**
 * @author learnercys learner.cys@gmail.com
 * @version 0.0.0
 */

package main.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class Main {

    /**
     * Show a new window that allows to the user to set the plants player settings.
     *
     * @param event The handle event.
     */
    @FXML
    public void handlePlantsPlayer( ActionEvent event ) {
        System.out.println("handlePlantsPlayer");
    }

    /**
     * Show a new window that allos to the user to set the zombies player settings.
     *
     * @param event The handle event.
     */
    @FXML
    public void handleZombiesPlayer( ActionEvent event ) {
        System.out.println("handleZombiesPlayer");
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

}
