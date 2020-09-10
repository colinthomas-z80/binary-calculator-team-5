package calculator;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class View extends Application {

    @Override
    public void start(Stage stage)
    {
        Label l = new Label("Hello world");
        StackPane pane = new StackPane(l);
        Scene scene = new Scene(pane,640, 480);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
