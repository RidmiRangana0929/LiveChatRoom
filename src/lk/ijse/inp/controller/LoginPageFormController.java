package lk.ijse.inp.controller;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class LoginPageFormController {
    public AnchorPane loginPageContext;
    public TextField txtUsername;

    static String username;
    public void btnLoginOnAction(ActionEvent actionEvent) {
        username=txtUsername.getText();
    }
}
