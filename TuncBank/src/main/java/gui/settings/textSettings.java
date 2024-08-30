package gui.settings;

import javafx.scene.control.TextField;

import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class textSettings {


    public static void setOnlyNumber(TextField textField) {           //This is for entering number only
        textField.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue.matches("\\d*")) {
                textField.setText(newValue.replaceAll("[^\\d]", ""));
            }
        });
    }

    public static void setOnlyAlphabet(TextField textField) {        //This is for entering alphabet only
        textField.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue.matches("[a-zA-Z]*")) {
                textField.setText(newValue.replaceAll("[^a-zA-Z]", ""));
            }
        });
    }

    public static void setMaxLimit(TextField textField, int maxLength) {
        textField.textProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue.length() > maxLength) {
                textField.setText(oldValue);
            }
        });
    }

    /*
     * Withdraw Money Settings
     */
    public static int checkTheTextKeyReleased(TextField textField, int moneylimit) {
        String text = textField.getText();
        if (!text.equals("")) {
            int miktar = Integer.valueOf(text);
            if (miktar > moneylimit) {
                miktar = moneylimit;
                textField.setText(String.valueOf(miktar));
            }
            return miktar;
        }
        return 0;
    }

    /*
     * apply page text settings
     */

    public static boolean isFull(TextField nameSurnameText, TextField SecurityNoText, TextField telephoneNoText, TextField answerText){
        String nameSurname = nameSurnameText.getText();
        String securityNo = SecurityNoText.getText();
        String telNo = telephoneNoText.getText();
        String answer = answerText.getText();

        if(!nameSurname.isEmpty() && !securityNo.isEmpty() && !telNo.isEmpty() && !answer.isEmpty()){
            return true;
        } else {
            return false;
        }
    }

}
