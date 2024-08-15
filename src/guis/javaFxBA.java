package guis;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class javaFxBA extends Application {

    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button("Click Me!");
        StackPane root = new StackPane();
        root.getChildren().add(btn);

        Scene scene = new Scene(root, 400, 300);
        scene.getStylesheets().add((getClass()).getResource("styles.css").toExternalForm());
        primaryStage.setTitle("Banking App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
