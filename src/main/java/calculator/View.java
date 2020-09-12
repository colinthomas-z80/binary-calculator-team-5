package calculator;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class View extends Application {

    String operator = "", firstNumber;

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
    Button buttonClear = new Button("CL");

    Boolean isBinary = true;

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
        pane.add(buttonClear,0,6);
        field.setEditable(false);
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
        buttonDivide.setOnAction(e -> {
            if (!field.getText().equals("")) {
                operator = "/";
                firstNumber = field.getText();
                field.setText("");
            }
        });
        buttonMultiply.setOnAction(e -> {
            if (!field.getText().equals("")) {
                operator = "*";
                firstNumber = field.getText();
                field.setText("");
            }
        });
        buttonAdd.setOnAction(e -> {
            if (!field.getText().equals("")) {
                operator = "+";
                firstNumber = field.getText();
                field.setText("");
            }
        });
        buttonSubtract.setOnAction(e -> {
            if (!field.getText().equals("")) {
                operator = "-";
                firstNumber = field.getText();
                field.setText("");
            }
        });
        buttonRoot.setOnAction(e -> {
            if (!field.getText().equals("")) {
                operator = "sqrt";
                firstNumber = field.getText();
                field.setText(Operations.Broot(firstNumber));
            }
        });
        buttonSquare.setOnAction(e -> {
            if (!field.getText().equals("")) {
                operator = "^2";
                firstNumber = field.getText();
                field.setText(Operations.Bsquare(firstNumber));
            }
        });
        buttonToggle.setOnAction(e -> {
            if (!field.getText().equals("")) {
                operator = "convert";
                firstNumber = field.getText();
                field.setText(Operations.Convert(firstNumber,isBinary));
                isBinary = !isBinary;
            }
        });
        buttonClear.setOnAction(e -> {
            field.setText("");
            firstNumber = "";
        });
        buttonEquals.setOnAction(e -> {
            if (!field.getText().equals("")) {
                switch (operator) {
                    case "/":
                        field.setText(Operations.Bdivide(firstNumber, field.getText()));
                        break;
                    case ("*"):
                        field.setText(Operations.Bmultiply(firstNumber, field.getText()));
                        break;
                    case "+":
                        field.setText(Operations.Badd(firstNumber, field.getText()));
                        break;
                    case "-":
                        field.setText(Operations.Bsubtract(firstNumber,field.getText()));
                        break;
                }
            }
        });
    }

    public static void main(String[] args) {
        launch();
    }
}
