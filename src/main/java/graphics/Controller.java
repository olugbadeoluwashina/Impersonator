package graphics;

import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;

public class Controller {
    @FXML private Button btnCreate;

    public void createReminder(ActionEvent event) {
        CreateReminderWindow.show();
    }
}
