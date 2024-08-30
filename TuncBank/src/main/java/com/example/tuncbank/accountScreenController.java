package com.example.tuncbank;

import gui.settings.IRegulator;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.io.IOException;
import java.io.InputStream;


public class accountScreenController implements IRegulator {


    @FXML
    private ImageView depositIcon;
    @FXML
    private ImageView paymentsIcon;

    @FXML
    private ImageView exchangeIcon;
    @FXML
    private ImageView withdrawIcon;

    @FXML
    private Button PaymentsButton;

    @FXML
    private Text balanceText;

    @FXML
    private Button depositMoneyButton;

    @FXML
    private Button moneyTransferButton;

    @FXML
    private Text nameSurnameText;

    @FXML
    private Button withdrawMoneyButton;


    /*
    * Actions
    */
    @FXML
    void depositOnMouseClicked(MouseEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("depositScreen.fxml"));
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
    void moneyTransferOnMouseClicked(MouseEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("moneyTransfer.fxml"));
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
    void paymentsOnMouseClicked(MouseEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("paymentsScreen.fxml"));
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
    void quitOnMouseClicked(MouseEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("loginScreen.fxml"));
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
    void settingsOnMouseClicked(MouseEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("settingsScreen.fxml"));
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
    void withdrawOnMouseClicked(MouseEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("withdrawScreen.fxml"));
            Parent root = loader.load();

            Scene scene = ((Node) event.getSource()).getScene();
            scene.setRoot(root);
            Stage stage = (Stage) scene.getWindow();
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
     }



     /*
     * Change icons
      */
    @FXML
    void withdrawMouseEntered(MouseEvent event) {
        try {
            String imagePath = "/Images/withdrawMoney2.png";
            InputStream inputStream = getClass().getResourceAsStream(imagePath);
            if (inputStream != null) {
                Image image = new Image(inputStream);
                withdrawIcon.setImage(image);
            } else {
                System.err.println("Image file not found: " + imagePath);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @FXML
    void withdrawMouseExited(MouseEvent event) {
        try {
            String imagePath = "/Images/withdrawMoney.png";
            InputStream inputStream = getClass().getResourceAsStream(imagePath);
            if (inputStream != null) {
                Image image = new Image(inputStream);
                withdrawIcon.setImage(image);
            } else {
                System.err.println("Image file not found: " + imagePath);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @FXML
    void depositOnMouseEntered(MouseEvent event) {
        try {
            String imagePath = "/Images/depositMoney2.png";
            InputStream inputStream = getClass().getResourceAsStream(imagePath);
            if (inputStream != null) {
                Image image = new Image(inputStream);
                depositIcon.setImage(image);
            } else {
                System.err.println("Image file not found: " + imagePath);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @FXML
    void depositOnMouseExited(MouseEvent event) {
        try {
            String imagePath = "/Images/depositMoney.png";
            InputStream inputStream = getClass().getResourceAsStream(imagePath);
            if (inputStream != null) {
                Image image = new Image(inputStream);
                depositIcon.setImage(image);
            } else {
                System.err.println("Image file not found: " + imagePath);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @FXML
    void moneyTransferOnMouseEntered(MouseEvent event) {
        try {
            String imagePath = "/Images/exchangeMoney2.png";
            InputStream inputStream = getClass().getResourceAsStream(imagePath);
            if (inputStream != null) {
                Image image = new Image(inputStream);
                exchangeIcon.setImage(image);
            } else {
                System.err.println("Image file not found: " + imagePath);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @FXML
    void moneyTransferOnMouseExited(MouseEvent event) {
        try {
            String imagePath = "/Images/exchangeMoney.png";
            InputStream inputStream = getClass().getResourceAsStream(imagePath);
            if (inputStream != null) {
                Image image = new Image(inputStream);
                exchangeIcon.setImage(image);
            } else {
                System.err.println("Image file not found: " + imagePath);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @FXML
    void paymentsOnMouseEntered(MouseEvent event) {
        try {
            String imagePath = "/Images/payment2.png";
            InputStream inputStream = getClass().getResourceAsStream(imagePath);
            if (inputStream != null) {
                Image image = new Image(inputStream);
                paymentsIcon.setImage(image);
            } else {
                System.err.println("Image file not found: " + imagePath);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @FXML
    void paymentsOnMouseExited(MouseEvent event) {
        try {
        String imagePath = "/Images/payment.png";
        InputStream inputStream = getClass().getResourceAsStream(imagePath);
        if (inputStream != null) {
            Image image = new Image(inputStream);
            paymentsIcon.setImage(image);
        } else {
            System.err.println("Image file not found: " + imagePath);
        }
    } catch (Exception e) {
        e.printStackTrace();
    }

    }
}


