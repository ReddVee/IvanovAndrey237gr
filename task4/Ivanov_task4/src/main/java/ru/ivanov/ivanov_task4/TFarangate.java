package ru.ivanov.ivanov_task4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TFarangate {

    @FXML
    private Button BTN;

    @FXML
    private Label Label;

    @FXML
    private TextField TCTextField;

    @FXML
    void BTNOnAction(ActionEvent event) {
        double TC = Double.parseDouble(TCTextField.getText().toString());
        double TF;
        double TFara = TC*(9/5)+32;
        Label.setText("TF = " + TFara);
    }

}
