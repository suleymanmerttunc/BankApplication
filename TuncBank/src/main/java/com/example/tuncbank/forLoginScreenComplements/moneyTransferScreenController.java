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

import static gui.settings.textSettings.setMaxLimit;
import static gui.settings.textSettings.setOnlyNumber;

public class moneyTransferScreenController {
    public void initialize() {
        setOnlyNumber(sentAmountField);
        setOnlyNumber(remittanceRecipientField);
        setMaxLimit(sentAmountField, 5);
        remittanceRecipientField.setText(MUSTERI_NO_TEXT_ORIGINAL);
    }
    private int sendAmountMoney = 0;
    private final static String MUSTERI_NO_TEXT_ORIGINAL = "AccountNumber";
    @FXML
    private Label balanceLabel;

    @FXML
    private Label nameAndSurnameLabel;

    @FXML
    private TextField remittanceRecipientField;

    @FXML
    private Button sendMoneyButton;

    @FXML
    private TextField sentAmountField;

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
    void sendAmountOnKeyReleased(KeyEvent event) {
        this.sendAmountMoney = textSettings.checkTheTextKeyReleased(sentAmountField,20000);
        System.out.println(sendAmountMoney);
    }

    @FXML
    void sendMoneyOnAction(ActionEvent event) {
        Alert approvedAlert = new Alert(Alert.AlertType.INFORMATION);
        approvedAlert.setTitle("Application Status");
        approvedAlert.setHeaderText(null);
        approvedAlert.setContentText("Your application has been approved.\n"
                + "You send money: "+this.sendAmountMoney+"$"+" To account holder number = "+remittanceRecipientField.getText());
        approvedAlert.showAndWait();

    }

}
