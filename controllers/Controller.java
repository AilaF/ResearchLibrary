package home.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
import javafx.stage.Stage;
import java.util.Random; 


import java.io.IOException;

public class Controller implements Initializable{
	
	@FXML
	Label label;
	
	@FXML
	    private Button btnLibrary;
	
	 @FXML
	    private Button btnAI;

	    @FXML
	    private Button btnAR;

	    @FXML
	    private Button btnAgriculture;

	    @FXML
	    private Button btnCrypto;

	    @FXML
	    private Button btnCybersecurity;

	    @FXML
	    private Button btnDataSci;

	    @FXML
	    private Button btnIoT;

	    @FXML
	    private Button btnRobotics;

	    @FXML
	    private Button btnVR;
	    
	    @FXML
	    private Label lblStatus;

	    @FXML
	    private Pane pnlStatus;
	    
	    @FXML
	    private Pane pnAI;

	    @FXML
	    private Pane pnAR;

	    @FXML
	    private Pane pnAgriculture;

	    @FXML
	    private Pane pnCrypto;
	    
	    @FXML
	    private Pane pnCybersec;

	    @FXML
	    private Pane pnDatasci;

	    @FXML
	    private Pane pnIOT;

	    @FXML
	    private Pane pnRobotics;

	    @FXML
	    private Pane pnVR;
	    
	    @FXML
	    private Label randomNumbers;
	    
	    @FXML
	    private TextField txtAuthor, txtDate, txtID, txtName, txtProgram, txtTitle, txtYear;

	    

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    
   
    @FXML
    void initialize() {
    }
    
    
    @FXML
    void handleButtonClicks(javafx.event.ActionEvent mouseEvent) {
    	if (mouseEvent.getSource() == btnAI) {
        	lblStatus.setText("Artificial Intelligence");
            pnlStatus.setBackground(new Background(new BackgroundFill(Color.rgb(128, 0, 0),CornerRadii.EMPTY, Insets.EMPTY))); 
            pnAI.toFront();
        } 
    	
        else if (mouseEvent.getSource() == btnAR) {
        	lblStatus.setText("Augmented Reality");
            pnlStatus.setBackground(new Background(new BackgroundFill(Color.rgb(128, 0, 0),CornerRadii.EMPTY, Insets.EMPTY)));
            pnAR.toFront();       
        } 
    	
        else if (mouseEvent.getSource() == btnAgriculture) {
        	lblStatus.setText("Agriculture");
            pnlStatus.setBackground(new Background(new BackgroundFill(Color.rgb(128, 0, 0),CornerRadii.EMPTY, Insets.EMPTY)));
            pnAgriculture.toFront();
        } 
    	
        else if (mouseEvent.getSource() == btnCrypto) {
        	lblStatus.setText("Cryptocurrency");
            pnlStatus.setBackground(new Background(new BackgroundFill(Color.rgb(128, 0, 0),CornerRadii.EMPTY, Insets.EMPTY)));
            pnCrypto.toFront();
        } 
    	
        else if (mouseEvent.getSource() == btnCybersecurity) {
        	lblStatus.setText("Cybersecurity");
            pnlStatus.setBackground(new Background(new BackgroundFill(Color.rgb(128, 0, 0),CornerRadii.EMPTY, Insets.EMPTY)));
            pnCybersec.toFront();
        } 
    	
        else if (mouseEvent.getSource() == btnDataSci) {
        	lblStatus.setText("Data Science");
            pnlStatus.setBackground(new Background(new BackgroundFill(Color.rgb(128, 0, 0),CornerRadii.EMPTY, Insets.EMPTY)));
            pnDatasci.toFront();
        } 
    	
        else if (mouseEvent.getSource() == btnIoT) {
        	lblStatus.setText("Internet of Things");
            pnlStatus.setBackground(new Background(new BackgroundFill(Color.rgb(128, 0, 0),CornerRadii.EMPTY, Insets.EMPTY)));
            pnIOT.toFront();
        } 
    	
        else if (mouseEvent.getSource() == btnRobotics) {
        	lblStatus.setText("Robotics");
            pnlStatus.setBackground(new Background(new BackgroundFill(Color.rgb(128, 0, 0),CornerRadii.EMPTY, Insets.EMPTY)));
            pnRobotics.toFront();
        } 
    	
        else if (mouseEvent.getSource() == btnVR) {
        	lblStatus.setText("Research Transaction");
            pnlStatus.setBackground(new Background(new BackgroundFill(Color.rgb(128, 0, 0),CornerRadii.EMPTY, Insets.EMPTY)));
            pnVR.toFront();
        }
    	
    	
    }


        @Override
        public void initialize(URL location, ResourceBundle resources) {
        	Random rand = new Random();
            int randomNumber = rand.nextInt(15) + 1; // Generates random number between 1 and 15
            randomNumbers.setText("Seat No: " + randomNumber);
        }
        
 
    	@FXML
        void buttonClicks(javafx.event.ActionEvent mouseEvent) throws IOException {
    		if (mouseEvent.getSource() == btnLibrary) {
    		String name = txtName.getText();
        	String author = txtAuthor.getText();
        	String program = txtProgram.getText();
        	String title = txtTitle.getText();
        	
        	 int date, id, year;
             try {
                 date = Integer.parseInt(txtDate.getText());
                 id = Integer.parseInt(txtID.getText());
                 year = Integer.parseInt(txtYear.getText());
                 
             } catch (NumberFormatException e) {
      
                 System.out.println("Invalid input. Please enter numeric values for date, ID, and year.");
            
                 }         
        	
        	FXMLLoader loader = new FXMLLoader(getClass().getResource("/home/Lib.fxml"));
        	Parent root = loader.load();
        	
            Stage currentStage = (Stage) btnLibrary.getScene().getWindow();
            currentStage.close();
        	
        	Submit submit = loader.getController();
        	submit.displayName(name);
        			
        	Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.initModality(Modality.APPLICATION_MODAL);
    		stage.show();
    		
    	}
    	}
    	
    	
   
   
    }

