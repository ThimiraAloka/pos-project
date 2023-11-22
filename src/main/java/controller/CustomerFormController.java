package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.io.IOException;

public class CustomerFormController {

    public TableView customerTable;

    @FXML
    void backButtonOnAction(ActionEvent event) {
        Stage stage = (Stage) customerTable.getScene().getWindow();
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/DashboardFrom.fxml"))));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
