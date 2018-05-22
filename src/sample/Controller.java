package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import javax.swing.*;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
 private final String id = "admin";
 private final String pass = "1234";

    @FXML
    private TextField Username;
    @FXML
    private PasswordField Password;
    @FXML
    private Button btnLogin;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    public void Login(ActionEvent event){
        try {
            if (id.equals(Username.getText()) && pass.equals(Password.getText())) {
                JOptionPane.showMessageDialog(null,"Welcome to MIT SAIYAI APP");
            }
            else {
                JOptionPane.showMessageDialog(null,"Your Username or Password is invalid.","Warning Message",JOptionPane.WARNING_MESSAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }



    }//Login

}//class
