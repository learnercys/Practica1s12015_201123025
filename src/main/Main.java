package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static final String APP_TITLE = "Plantas y Zombies";
    public static final String APP_MAIN_FILE = "fxml/main.fxml";

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource( APP_MAIN_FILE ));
        primaryStage.setTitle( APP_TITLE );
        primaryStage.setScene( new Scene(root) );
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
