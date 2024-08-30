package com.example.tuncbank.forLoginScreenComplements;

import gui.settings.textSettings;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.InputStream;

public class settingsScreenController {
    @FXML
    private ImageView changePasswordIcon;

    @FXML
    private ImageView changeTelephoneIcon;

    @FXML
    private Label nameAndSurnameLabel;

    @FXML
    private TextField passwordText;

    @FXML
    private TextField telephoneNoText;

    private int count = 2;

    private String updateImage = "/Images/updateIcon2.png";
    private String oldImage = "/Images/updateIcon.png";
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
        textSettings.setOnlyNumber(telephoneNoText);
        textSettings.setMaxLimit(telephoneNoText,12);
    }

    @FXML
    void passwordUpdateOnMouseClicked(MouseEvent event) {
        passwordText.setDisable(false);
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/tuncbank/updatePasswordScreen.fxml"));
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
    void telephoneUpdateOnMouseClicked(MouseEvent event) {
        telephoneNoText.setDisable(false);
        if(count % 2 == 0){
            InputStream inputStream2 = getClass().getResourceAsStream(updateImage);
            if (inputStream2 != null) {
                Image image = new Image(inputStream2);
                changeTelephoneIcon.setImage(image);
                count++;
            } else {
                System.err.println("Image file not found: " + updateImage);
            }
        }else {
            InputStream inputStream2 = getClass().getResourceAsStream(oldImage);
            if (inputStream2 != null) {
                Image image = new Image(inputStream2);
                changeTelephoneIcon.setImage(image);
                telephoneNoText.setDisable(true);
                Alert approvedAlert = new Alert(Alert.AlertType.INFORMATION);
                approvedAlert.setTitle("Application Status");
                approvedAlert.setHeaderText(null);
                approvedAlert.setContentText("Your Telephone Number has been changed.");
                approvedAlert.showAndWait();
                count++;
            } else {
                System.err.println("Image file not found: " + oldImage);
            }
        }
    }


}
