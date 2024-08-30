package com.example.tuncbank;

import com.example.tuncbank.database.IinformationController;
import com.example.tuncbank.database.transactions.accountInformation;
import com.example.tuncbank.database.transactions.userApplication;
import gui.settings.textSettings;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


import java.io.IOException;

import static gui.settings.textSettings.*;

public class applyScreenController implements IinformationController {
    @FXML
    public void initialize() {
        setOnlyAlphabet(nameSurnameText);
        setOnlyNumber(SecurityNoText);
        setOnlyNumber(telephoneNoText);
        setMaxLimit(SecurityNoText, 9);
        setMaxLimit(telephoneNoText, 12);
    }

    public userApplication getUserApplicationObject() {
        if (this.userApplicationObject==null){
            userApplicationObject = new userApplication();
        }
        return userApplicationObject;
    }

    private userApplication userApplicationObject = null;

    @FXML
    private TextField SecurityNoText;

    @FXML
    private TextField answerText;

    public TextField getSecurityNoText() {
        return SecurityNoText;
    }

    public void setSecurityNoText(TextField securityNoText) {
        SecurityNoText = securityNoText;
    }

    public TextField getAnswerText() {
        return answerText;
    }

    public void setAnswerText(TextField answerText) {
        this.answerText = answerText;
    }

    public TextField getNameSurnameText() {
        return nameSurnameText;
    }

    public void setNameSurnameText(TextField nameSurnameText) {
        this.nameSurnameText = nameSurnameText;
    }

    public TextField getTelephoneNoText() {
        return telephoneNoText;
    }

    public void setTelephoneNoText(TextField telephoneNoText) {
        this.telephoneNoText = telephoneNoText;
    }

    @FXML
    private TextField nameSurnameText;

    @FXML
    private ComboBox<?> securityComboBox;

    @FXML
    private TextField telephoneNoText;

    @FXML
    void applyButtonOnAction(ActionEvent event) {

        if (this.isInformationValid()){
            this.submitApplication();
            Alert approvedAlert = new Alert(Alert.AlertType.INFORMATION);
            approvedAlert.setTitle("Application Status");
            approvedAlert.setHeaderText(null);
            approvedAlert.setContentText("Your application has been approved.");
            approvedAlert.showAndWait();


            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("loginScreen.fxml"));
                Parent root = loader.load();
                Scene scene = new Scene(root);
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                stage.setScene(scene);
                stage.show();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else{
            Alert approvedAlert = new Alert(Alert.AlertType.INFORMATION);
            approvedAlert.setTitle("Application Status");
            approvedAlert.setHeaderText(null);
            approvedAlert.setContentText("Your application has not been approved.\n Error : there are empty fields");
            approvedAlert.showAndWait();

        }
    }

    public void submitApplication(){
        // personal information
        this.getUserApplicationObject().setNameSurname(this.nameSurnameText.getText().trim());
        this.getUserApplicationObject().setSsnNo(this.SecurityNoText.getText().trim());
        this.getUserApplicationObject().setTelNo(this.telephoneNoText.getText().trim());

        //secuirty question
        this.getUserApplicationObject().setSecurityQuestion(this.SecurityNoText.getSelectedText());
        this.getUserApplicationObject().setSecurityAnswer(this.answerText.getText().trim());

        //from system
        this.getUserApplicationObject().setUserNo(this.randomUserNo());
        this.getUserApplicationObject().setPassword(this.randomPassword());

    }
    private String randomPassword(){
        String Password;
        Password = String.valueOf(1000+(int)(Math.random()*9000));
        return Password;
    }

    private String randomUserNo(){
        String userNo;
        userNo = String.valueOf(100000 + (int) (Math.random() * 9000000));
        return userNo;
    }
    @Override
    public boolean isInformationValid() {
        return textSettings.isFull(getNameSurnameText(),getSecurityNoText(),getTelephoneNoText(),getAnswerText());

    }

    @Override
    public accountInformation getAccountInformation() {
        return null;
    }
}