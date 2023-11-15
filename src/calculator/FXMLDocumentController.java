package calculator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class FXMLDocumentController implements Initializable {
   
    @FXML
    private Label firstValue;
    @FXML
    private Label displayOperator;
    @FXML
    private Label secondValue;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    


    @FXML
    private void allClear(ActionEvent event) {
        firstValue.setText(null);
        secondValue.setText(null);
        displayOperator.setText(null);
    }

    @FXML
    private void del(ActionEvent event) {
        if(firstValue.getText().length() > 0){
            firstValue.setText(firstValue.getText().substring(0, firstValue.getText().length()-1));
        }else if(firstValue.getText().length() < 0 && displayOperator != null){
            displayOperator.setText(null);
        }
        
    }

    @FXML
    private void equal(ActionEvent event) {
    }

    @FXML
    private void operator(ActionEvent event) {
        displayOperator.setText(((Button)event.getSource()).getText());
    }

    @FXML
    private void number(ActionEvent event) {
        String clickValue = ((Button)event.getSource()).getText();
        firstValue.setText(firstValue.getText() + clickValue);
    }

    @FXML
    private void exit(ActionEvent event) {
        System.exit(0);
    }
    
}
