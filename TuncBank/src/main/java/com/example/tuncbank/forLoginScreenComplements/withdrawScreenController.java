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
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import java.io.IOException;

import static gui.settings.textSettings.setMaxLimit;
import static gui.settings.textSettings.setOnlyNumber;


public class withdrawScreenController {
    public void initialize() {
        setOnlyNumber(amountWithdrawField);
        setMaxLimit(amountWithdrawField, 4);
    }

    private int maxWithdrawMoney= 0;
    @FXML
    private javafx.scene.control.TextField amountWithdrawField;

    @FXML
    private Label balanceLabel;

    @FXML
    private Label nameAndSurnameLabel;

    @FXML
    private Button withdrawMoneyButton;

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
    void withdrawOnKeyReleased(KeyEvent event) {
        this.maxWithdrawMoney = textSettings.checkTheTextKeyReleased(amountWithdrawField,5000);
        System.out.println(maxWithdrawMoney);
    }

    @FXML
    void withdrawMoneyOnAction(ActionEvent event) {
        Alert approvedAlert = new Alert(Alert.AlertType.INFORMATION);
        approvedAlert.setTitle("Application Status");
        approvedAlert.setHeaderText(null);
        approvedAlert.setContentText("Your application has been approved.\n"
        + "Withdraw Money: "+this.maxWithdrawMoney+"$");
        approvedAlert.showAndWait();
    }

}
