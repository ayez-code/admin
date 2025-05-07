package admin;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;


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
