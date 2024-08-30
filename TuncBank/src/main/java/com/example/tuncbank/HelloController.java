package com.example.tuncbank;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import java.io.IOException;
import static gui.settings.textSettings.setOnlyNumber;

public class HelloController {

    @FXML
    public void initialize() {
        setOnlyNumber(identifyText);
    }
    @FXML
    private Button applyButton;

    @FXML
    private TextField identifyText;

    public TextField getIdentifyText() {
        return identifyText;
    }

    public void setIdentifyText(TextField identifyText) {
        this.identifyText = identifyText;
    }

    @FXML
    private Button loginButton;

    @FXML
    private PasswordField passwordText;


    @FXML
    void applyOnMouseClicked(MouseEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/tuncbank/applyScreen.fxml"));
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
    void loginOnMouseClicked(MouseEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("accountScreen.fxml"));
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
    void forgotPasswordOnMouseClicked(MouseEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/tuncbank/resetPasswordScreen.fxml"));
            Parent root = loader.load();

            Scene scene = ((Node) event.getSource()).getScene();
            scene.setRoot(root);
            Stage stage = (Stage) scene.getWindow();
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}










