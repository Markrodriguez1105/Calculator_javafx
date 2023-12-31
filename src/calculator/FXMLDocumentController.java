package calculator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.text.Font;

public class FXMLDocumentController implements Initializable {

    @FXML
    private Label firstValue;
    @FXML
    private Label displayOperator;
    @FXML
    private Label secondValue;

    private boolean clearFirst = true;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        firstValue.setText("0");
        secondValue.setText("");
        displayOperator.setText("");
    }

    @FXML
    private void allClear(ActionEvent event) {
        firstValue.setText("0");
        secondValue.setText("");
        displayOperator.setText("");
        clearFirst = true;
    }

    @FXML
    private void del(ActionEvent event) {
        if (!firstValue.getText().isEmpty()) {
            firstValue.setText(firstValue.getText().substring(0, firstValue.getText().length() - 1));
        }
        else if (firstValue.getText().isEmpty() && !displayOperator.getText().isEmpty()) {
            displayOperator.setText("");
            firstValue.setText(secondValue.getText());
            secondValue.setText("");
        }

        if (firstValue.getText().isEmpty()) {
            firstValue.setText("");
            clearFirst = true;
        }
    }

    @FXML
    private void equal(ActionEvent event) {
        if (!firstValue.getText().isBlank() && !secondValue.getText().isBlank() && !displayOperator.getText().isBlank()) {
            firstValue.setText(compute(Double.parseDouble(secondValue.getText()),
                    Double.parseDouble(firstValue.getText()), displayOperator.getText()));
            secondValue.setText("");
            displayOperator.setText("=");
            clearFirst = true;
        }

    }

    @FXML
    private void operator(ActionEvent event) {
        String op = ((Labeled) event.getSource()).getText();
        if (!secondValue.getText().isBlank() && !firstValue.getText().isBlank()) {
            secondValue.setText(compute(Double.parseDouble(secondValue.getText()),
                    Double.parseDouble(firstValue.getText()), displayOperator.getText()));
            firstValue.setText("");
            displayOperator.setText(op);
        }
        else if (!firstValue.getText().isBlank()) {
            secondValue.setText(firstValue.getText());
            firstValue.setText("");
            displayOperator.setText(op);
        }
        else {
            displayOperator.setText(op);
        }
        clearFirst = true;

    }

    @FXML
    private void number(ActionEvent event) {
        if (clearFirst) {
            firstValue.setText("");
            String clickValue = ((Labeled) event.getSource()).getText();
            firstValue.setText(firstValue.getText() + clickValue);
            clearFirst = false;
        }
        else {
            String clickValue = ((Labeled) event.getSource()).getText();
            firstValue.setText(firstValue.getText() + clickValue);
        }
    }

    @FXML
    private void percentage(ActionEvent event) {
        if (!firstValue.getText().isEmpty()) {
            displayOperator.setText(((Labeled) event.getSource()).getText());
            firstValue.setText(computePercent(Double.parseDouble(firstValue.getText())));
            displayOperator.setText("=");
        }

    }

    @FXML
    private void point(ActionEvent event) {
        if (clearFirst) {
            firstValue.setText("0" + ((Labeled) event.getSource()).getText());
            clearFirst = false;
        }
        else if (!firstValue.getText().contains(".")) {
            firstValue.setText(firstValue.getText() + ((Labeled) event.getSource()).getText());
        }

    }

    @FXML
    private void exit(ActionEvent event) {
        System.exit(0);
    }

    String compute(double num1, double num2, String op) {
        double result = 0.0;
        switch (op) {
            case "+" -> {
                result = num1 + num2;
            }
            case "-" -> {
                result = num1 - num2;
            }
            case "×" -> {
                result = num1 * num2;
            }
            case "÷" -> {
                if(num2 == 0){
                    return "Syntax Error";
                }else{
                    result = num1 / num2;
                }
                    
            }
        }
        return removePoint(String.valueOf(result));
    }

    String computePercent(double num) {
        return removePoint(String.valueOf((num * 0.01)));
    }

    String removePoint(String value) {
        if (".0".equals(value.substring(value.length() - 2))) {
            return value.substring(0, value.length() - 2);
        }
        else {
            return value;
        }
    }
}
