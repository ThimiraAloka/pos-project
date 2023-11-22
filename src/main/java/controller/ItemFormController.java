package controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ItemFormController {

    @FXML
    private BorderPane pane;

    @FXML
    private JFXTextField txtCode;

    @FXML
    private JFXTextField txtDescription;

    @FXML
    private JFXTextField txtQTY;

    @FXML
    private JFXTextField txtUnitPrice;

    @FXML
    void backButtonOnAction(ActionEvent event) {
        Stage stage = (Stage) pane.getScene().getWindow();
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/DashboardFrom.fxml"))));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
