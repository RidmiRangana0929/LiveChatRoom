package lk.ijse.inp.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginPageFormController {
    public AnchorPane loginPageContext;
    public TextField txtUsername;

    static String username;
    public void btnLoginOnAction(ActionEvent actionEvent) throws IOException {
        username=txtUsername.getText();

        Stage stage1 = (Stage) txtUsername.getScene().getWindow();
        stage1.close();
        Stage stage2=new Stage();
        stage2.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/liveChatPageForm.fxml"))));
        stage2.setResizable(false);
        stage2.setTitle("sample title");
        stage2.centerOnScreen();
        stage2.show();
    }
}
