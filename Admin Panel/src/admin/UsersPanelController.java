package admin;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;


public class UsersPanelController {

    @FXML
    private TableView<?> usersInfoTable;

    @FXML
    private Button insertInfoButton;

    @FXML
    private Button removeInfoButton;

    @FXML
    private void handleInsertUser() {
        System.out.println("Insert button clicked.");


    }

}



