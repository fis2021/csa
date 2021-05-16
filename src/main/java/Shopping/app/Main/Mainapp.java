package Shopping.app.Main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Mainapp extends Application {


    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("mainapp.fxml"));
        primaryStage.setTitle("Test Aplicatie shopp");
        primaryStage.setScene(new Scene(root,300,300));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
