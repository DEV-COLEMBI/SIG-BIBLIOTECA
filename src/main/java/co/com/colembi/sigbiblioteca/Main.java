package co.com.colembi.sigbiblioteca;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {
             Parent root = FXMLLoader.load(getClass().getResource("view/MainView.fxml"));

        if (root == null) {
            throw new RuntimeException("MainView.fxml NÃO encontrado!");
        }

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("BIBLIOTECA-ISPM");
        stage.show();
    }
}


