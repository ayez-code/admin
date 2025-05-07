package admin;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;

public class AdminPanelController {

    @FXML
    private void handleDashboardClick(MouseEvent event) {
        System.out.println("Dashboard button clicked");
    }


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
    private void handleUsersClick(MouseEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/UsersPanel.fxml")); // use '/' if it's at the root of resources
            Parent usersContent = loader.load(); // no need to cast, just use Parent

            dashboardContent.getChildren().setAll(usersContent); // replace inner content
            AnchorPane.setTopAnchor(usersContent, 0.0);
            AnchorPane.setBottomAnchor(usersContent, 0.0);
            AnchorPane.setLeftAnchor(usersContent, 0.0);
            AnchorPane.setRightAnchor(usersContent, 0.0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

