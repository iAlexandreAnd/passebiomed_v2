package passbiomed.view;


import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class PatientConnectController {
	
	@FXML
    private TextField nomField;
    @FXML
    private TextField prenomField;
    
    private String patientID; //va récuperer l'id du patient rechercher
    
    private Stage dialogStage;
    
    private boolean okClicked = false;
    
    static PreparedStatement preparedStatement = null;
    
    @FXML
    private void initialize() {
    }
    
    public void setDialogStage(Stage dialogStage) {
        this.dialogStage = dialogStage;
    }
    
    public String getPatientID() {
    	return patientID;
    }
    
    public boolean isOkClicked() {
        return okClicked;
    }
    
    @FXML
    private void handleCancel() {
        dialogStage.close();
    }
    
    @FXML
    private void handleOk() {
    	
        if (isInputValid()) {
        	
        	String sql = "SELECT * FROM Patient WHERE Nom = ? and Prenom = ?";
    		try {
    			Class.forName("com.mysql.jdbc.Driver");
    			System.out.println("Driver OK");
    			
    			String url = "jdbc:mysql://localhost:3306/passbiomed";
    			String user = "root";
    			String password = "Secret123";
    			
    			Connection connect = (Connection) DriverManager.getConnection(url, user, password);
    			ResultSet resultSet = null;
    			
    			preparedStatement = (PreparedStatement) connect.prepareStatement(sql);
    			preparedStatement.setString(1, this.nomField.getText());
    			preparedStatement.setString(2, this.prenomField.getText());
    			
    			resultSet = preparedStatement.executeQuery();
    			
    			if(resultSet.next())
    			{
    				System.out.println("Patient trouvé");
    				patientID=resultSet.getString(1);
    				System.out.println(patientID.toString());
    			}
    			else
    			{
    				System.out.println("Patient non-trouvé");
    			}
    		}catch (Exception e) {
    			e.printStackTrace();
    		}
            okClicked = true;
            dialogStage.close();
        }
    }
    
    
    private boolean isInputValid() {
        String errorMessage = "";

        if (nomField.getText() == null || nomField.getText().length() == 0) {
            errorMessage += "No valid first name!\n"; 
        }
        if (prenomField.getText() == null || prenomField.getText().length() == 0) {
            errorMessage += "No valid last name!\n"; 
        }

        if (errorMessage.length() == 0) {
            return true;
        } else {
            // Show the error message.
            Alert alert = new Alert(AlertType.ERROR);
            alert.initOwner(dialogStage);
            alert.setTitle("Invalid Fields");
            alert.setHeaderText("Please correct invalid fields");
            alert.setContentText(errorMessage);

            alert.showAndWait();

            return false;
        }
    }
    
    
}
