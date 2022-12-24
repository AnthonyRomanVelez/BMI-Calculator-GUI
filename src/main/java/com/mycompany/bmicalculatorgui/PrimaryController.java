package com.mycompany.bmicalculatorgui;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.AccessibleAction;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField tfWeightLBS;
    @FXML
    private TextField tfHeightInches;
    @FXML
    private TextField tfHeightFt;
    @FXML
    private TextField lbBMIresult;

    

    @FXML
    private void btnCalculateBMIclicked(ActionEvent event) {
        double pounds = Double.parseDouble(tfWeightLBS.getText());
        double inches = Double.parseDouble(tfHeightInches.getText());
        double feet = Double.parseDouble(tfHeightFt.getText());
        double conversion = (feet*12)+inches;
        double result = (pounds*703)/(conversion*conversion);
        String calculation = String.format("%.2f", result);
        lbBMIresult.setText(calculation);
       
    }

    @FXML
    private void btnResetClicked(ActionEvent event) {
        tfWeightLBS.setText("");
        tfHeightInches.setText("");
        tfHeightFt.setText("");
        lbBMIresult.setText("");
    }
}
