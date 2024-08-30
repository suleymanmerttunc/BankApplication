package com.example.tuncbank.forLoginScreenComplements;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;
import java.time.Month;

public class paymentsScreenController {

    @FXML
    private Label electricBillLabel;

    @FXML
    private Label gasBillLabel;

    @FXML
    private Label internetBillLabel;

    @FXML
    private Label monthsLabel;

    @FXML
    private Label nameAndSurnameLabel;

    @FXML
    private Button payElectricButton;

    @FXML
    private Button payGasButton;

    @FXML
    private Button payInternetButton;

    @FXML
    private Button payWaterButton;

    @FXML
    private Label waterBillLabel;


    @FXML
    void backAccountOnMouseClicked(MouseEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/tuncbank/accountScreen.fxml"));
            Parent root = loader.load();

            Scene scene = ((Node) event.getSource()).getScene();
            scene.setRoot(root);
            Stage stage = (Stage) scene.getWindow();
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void initialize(){
        LocalDate currentDate = LocalDate.now();
        Month currentMonth = currentDate.getMonth();
        monthsLabel.setText(String.valueOf(currentMonth));
    }



    /*
    *payments on action
     */
    @FXML
    void electricOnAction(ActionEvent event) {
        Alert approvedAlert = new Alert(Alert.AlertType.INFORMATION);
        approvedAlert.setTitle("Application Status");
        approvedAlert.setHeaderText(null);
        approvedAlert.setContentText("Your Electricity bill has been paid" );
        approvedAlert.showAndWait();
    }
    @FXML
    void internetOnAction(ActionEvent event) {
        Alert approvedAlert = new Alert(Alert.AlertType.INFORMATION);
        approvedAlert.setTitle("Application Status");
        approvedAlert.setHeaderText(null);
        approvedAlert.setContentText("Your Internet bill has been paid" );
        approvedAlert.showAndWait();

    }
    @FXML
    void waterOnAction(ActionEvent event) {
        Alert approvedAlert = new Alert(Alert.AlertType.INFORMATION);
        approvedAlert.setTitle("Application Status");
        approvedAlert.setHeaderText(null);
        approvedAlert.setContentText("Your Water bill has been paid" );
        approvedAlert.showAndWait();
    }
    @FXML
    void GasOnAction(ActionEvent event) {
        Alert approvedAlert = new Alert(Alert.AlertType.INFORMATION);
        approvedAlert.setTitle("Application Status");
        approvedAlert.setHeaderText(null);
        approvedAlert.setContentText("Your Gas bill has been paid" );
        approvedAlert.showAndWait();
    }

}
