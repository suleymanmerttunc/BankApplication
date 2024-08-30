package com.example.tuncbank.forLoginScreenComplements;

import gui.settings.textSettings;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class resetPasswordController {
    @FXML
    private Label nameAndSurnameLabel;

    @FXML
    private Label nameAndSurnameLabel1;

    @FXML
    private TextField newPasswordAgainText;

    @FXML
    private TextField newPasswordText;

    @FXML
    private TextField oldPasswordText;

    @FXML
    private TextField securityQuestionText;

    @FXML
    private TextField ssnText;

    @FXML
    private TextField telephoneNoText;

    @FXML
    private Button updatePasswordButton;

    public void initialize(){
        textSettings.setOnlyNumber(telephoneNoText);
        textSettings.setMaxLimit(telephoneNoText,12);
        textSettings.setOnlyNumber(ssnText);
        textSettings.setMaxLimit(ssnText,11);
    }

    @FXML
    void backAccountOnMouseClicked(MouseEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/tuncbank/loginScreen.fxml"));
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
    void changePasswordOnMouseClicked(MouseEvent event) {
        Alert approvedAlert = new Alert(Alert.AlertType.INFORMATION);
        approvedAlert.setTitle("Application Status");
        approvedAlert.setHeaderText(null);
        approvedAlert.setContentText("Your Password has been changed.");
        approvedAlert.showAndWait();
    }

}
