package graphics;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CreateReminderWindow {


    public static void show() {
        Label lblTitle = new Label("Reminder Title");
        Label lblDesc = new Label("Description");
        Label lblFreq = new Label("Set Frequency");
        Label lblDate = new Label("Set Date");
        Label lblTime = new Label("Set Time");

        TextField txtTitle = new TextField();
        TextField txtDesc = new TextField();

        Stage primaryStage = new Stage();

        VBox rootPane = new VBox();
        rootPane.getChildren().addAll(lblTitle, txtTitle, lblDesc, txtDesc);

        Scene scene1 = new Scene(rootPane, 400, 400);
        primaryStage.setScene(scene1);
        primaryStage.setResizable(true);
        primaryStage.setMinHeight(300);
        primaryStage.setMinWidth(200);
        primaryStage.show();

    }
}
