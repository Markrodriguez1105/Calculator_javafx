package calculator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private Label firstValue;
    @FXML
    private Label displayOperator;
    @FXML
    private Label secondValue;
    @FXML
    private Button allClear;
    @FXML
    private Button del;
    @FXML
    private Button percent;
    @FXML
    private Button divide;
    @FXML
    private Button btn7;
    @FXML
    private Button btn8;
    @FXML
    private Button btn9;
    @FXML
    private Button multiplication;
    @FXML
    private Button btn4;
    @FXML
    private Button btn5;
    @FXML
    private Button btn6;
    @FXML
    private Button subtract;
    @FXML
    private Button btn1;
    @FXML
    private Button btn2;
    @FXML
    private Button btn3;
    @FXML
    private Button add;
    @FXML
    private Button btn0;
    @FXML
    private Button point;
    @FXML
    private Button equal;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    


    @FXML
    private void allClear(ActionEvent event) {
    }

    @FXML
    private void del(ActionEvent event) {
    }

    @FXML
    private void equal(ActionEvent event) {
    }

    @FXML
    private void operator(ActionEvent event) {
    }

    @FXML
    private void number(ActionEvent event) {
    }
    
}
