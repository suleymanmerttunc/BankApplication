package com.example.tuncbank.forLoginScreenComplements;

import gui.settings.textSettings;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import java.io.IOException;

import static gui.settings.textSettings.*;
import static gui.settings.textSettings.setMaxLimit;

public class depositScreenController {
    @FXML
    public void initialize() {
        setOnlyNumber(depositedAmountField);
        setMaxLimit(depositedAmountField, 5);
    }
    private int maxDepositMoney = 0;
    @FXML
    private Label balanceLabel;

    @FXML
    private Button depositMoneyButton;

    @FXML
    private javafx.scene.control.TextField depositedAmountField;
    @FXML
    private Label nameAndSurnameLabel;



    @FXML
    void depositOnKeyReleased(KeyEvent event) {
        this.maxDepositMoney = textSettings.checkTheTextKeyReleased(depositedAmountField,50000);
        System.out.println(maxDepositMoney);

    }
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

    @FXML
    void depositMoneyOnAction(ActionEvent event) {
        Alert approvedAlert = new Alert(Alert.AlertType.INFORMATION);
        approvedAlert.setTitle("Application Status");
        approvedAlert.setHeaderText(null);
        approvedAlert.setContentText("Your application has been approved.\n"
                + "Deposit Money: "+this.maxDepositMoney+"$");
        approvedAlert.showAndWait();
    }
}

