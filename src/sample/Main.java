package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {

            AnchorPane page = FXMLLoader.load(Main.class.getResource("Sample.fxml"));
            Scene scene = new Scene(page);
            primaryStage.setScene(scene);
            primaryStage.setTitle("FXML is Simple");
            primaryStage.show();
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) {
        launch(args);
//        int x, y;
//
//       for(y = 0; y < 80; y++)
//       {
//           String l = "<Label text=\".\" GridPane.columnIndex=";
//           l += ""
//           String s = "\"Hello\"";
//           System.out.println(s);
//       }
    }
}
