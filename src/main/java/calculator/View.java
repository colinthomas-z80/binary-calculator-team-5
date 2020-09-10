package calculator;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.swing.*;


public class View extends Application {

    TextField field = new TextField();

    Button button0 = new Button("0");
    Button button1 = new Button("1");
    Button buttonDivide = new Button("/");
    Button buttonMultiply = new Button("x");
    Button buttonAdd = new Button("+");
    Button buttonSubtract = new Button("-");
    Button buttonRoot = new Button("sqrt");
    Button buttonSquare = new Button("^2");
    Button buttonEquals = new Button("=");
    Button buttonToggle = new Button("bin/dec");

    @Override
    public void start(Stage stage)
    {
        GridPane pane = new GridPane();
        VBox box = new VBox(pane);
        pane.setAlignment(Pos.BOTTOM_CENTER);
        box.setAlignment(Pos.TOP_CENTER);
        pane.setHgap(10);
        pane.setVgap(10);

        box.getChildren().add(field);
        pane.add(button0,0,1);
        pane.add(button1,1,1);
        pane.add(buttonDivide,0,2);
        pane.add(buttonMultiply,1,2);
        pane.add(buttonAdd,0,3);
        pane.add(buttonSubtract,1,3);
        pane.add(buttonRoot,0,4);
        pane.add(buttonSquare,1,4);
        pane.add(buttonEquals,1,5);
        pane.add(buttonToggle,0,5);
        field.toBack();

        attachCode();
        Scene scene = new Scene(box,160, 240);
        stage.setScene(scene);
        stage.show();
    }

    private void attachCode()
    {
        button0.setOnAction(e -> field.appendText("0"));
        button1.setOnAction(e -> field.appendText("1"));
    }

    public static void main(String[] args) {
        launch();
    }
}
