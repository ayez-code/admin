package admin;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

public class AdminPanelController {

    @FXML
    private void handleDashboardClick(MouseEvent event) {
        System.out.println("Dashboard button clicked");
    }

    @FXML
    private void handleUsersClick(MouseEvent event) {
        System.out.println("Users button clicked");
    }

    @FXML
    private void handleRoomClick(MouseEvent event) {
        System.out.println("Rooms button clicked");
    }

    @FXML
    private void handleSettingsClick(MouseEvent event) {
        System.out.println("Settings button clicked");
    }



}
