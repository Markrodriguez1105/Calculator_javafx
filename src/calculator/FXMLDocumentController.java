package calculator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class FXMLDocumentController implements Initializable {
    
    private Label label;
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
