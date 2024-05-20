package home.controllers;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Submit {

	@FXML
	Label label;
	
	@FXML
    private Button btnOK;
	
	
	@FXML
    void buttonOK(javafx.event.ActionEvent mouseEvent) {
		if (mouseEvent.getSource() == btnOK) {
			loadStage("/home/Home.fxml");
    }
	}
		
		 private void loadStage(String fxml) {
	            try {
	                Parent root = FXMLLoader.load(getClass().getResource(fxml));
	                
	                Stage currentStage = (Stage) btnOK.getScene().getWindow();
	                currentStage.close();
	                
	                Stage stage = new Stage();
	                stage.setScene(new Scene(root));
	                stage.initModality(Modality.APPLICATION_MODAL);
	                stage.show();
	                
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }
	
	
	public void displayName(String name) {
		label.setText("You've entered: " +name);
}

	
}