package admin;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.security.cert.PolicyNode;

public class AdminPanelController {

    private Stage primaryStage;
    private Scene scene;
    private Parent root;


    @FXML
    private void handleRoomClick(MouseEvent event) {
        System.out.println("Rooms button clicked");
    }

    @FXML
    private void handleSettingsClick(MouseEvent event) {
        System.out.println("Settings button clicked");
    }

    @FXML
    private AnchorPane
            dashboardContent;

    @FXML
    private AnchorPane usersContent;

    @FXML
    private BorderPane dashboardRoot;

    @FXML
    private AnchorPane adminContent;


    @FXML
    private void handleDashboardClick (MouseEvent event){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/DashboardPanel.fxml"));
            Parent dashboardContent = loader.load();


            adminContent.getChildren().setAll(dashboardContent);
            AnchorPane.setTopAnchor(dashboardContent, 0.0);
            AnchorPane.setBottomAnchor(dashboardContent, 0.0);
            AnchorPane.setLeftAnchor(dashboardContent, 0.0);
            AnchorPane.setRightAnchor(dashboardContent, 0.0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

        @FXML
        private void handleUsersClick (MouseEvent event){
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/UsersPanel.fxml"));
                Parent usersContent = loader.load();

                adminContent.getChildren().setAll(usersContent);
                AnchorPane.setTopAnchor(usersContent, 0.0);
                AnchorPane.setBottomAnchor(usersContent, 0.0);
                AnchorPane.setLeftAnchor(usersContent, 0.0);
                AnchorPane.setRightAnchor(usersContent, 0.0);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }


