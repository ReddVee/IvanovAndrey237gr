package ru.ivanov.ivanov_task5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import static java.lang.Math.*;

public class SLOZHNAController {

    @FXML
    private TextField ATextField;

    @FXML
    private Button BTNVivod;

    @FXML
    private TextField CTextField;

    @FXML
    private TextField TTextField;

    @FXML
    private TextField WTextField;

    @FXML
    private TextField XTextField;

    @FXML
    private Label YTextField;

    @FXML
    void BTNVivodOnAction(ActionEvent event) {
        double A = Double.parseDouble(ATextField.getText().toString());
        double X = Double.parseDouble(XTextField.getText().toString());
        double W = Double.parseDouble(WTextField.getText().toString());
        double T = Double.parseDouble(TTextField.getText().toString());
        double C = Double.parseDouble(CTextField.getText().toString());
        double g = C + 24.8;
        double Y = (pow(X,pow(5,3))*sqrt((A*X)+sqrt(abs(A+X))))/(4*pow(cos(A*X),2))+pow(g,X)+W * T;
        YTextField.setText("Y = " + Y);
    }

}
