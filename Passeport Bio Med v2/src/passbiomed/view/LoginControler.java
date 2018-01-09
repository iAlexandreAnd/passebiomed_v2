package passbiomed.view;

import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSetMetaData;
import com.mysql.jdbc.Statement;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class LoginControler {

	private int data;
	
	
	@FXML
	private javafx.scene.control.Button connectButton;
	@FXML
    private TextField loginField;
    @FXML
    private TextField passwordField;
    
    static PreparedStatement preparedStatement = null;
    
    
    private void LoginControler() {
    	
    }
    
    int getData() {
    	return data;
    }
    
    @FXML
    private void handleConnect()
    {
    	
    	int verificationLogin = ConnectDataBase(loginField.getText(),passwordField.getText());
    	
    	if(verificationLogin == 1)
    	{
    		Alert alert = new Alert(AlertType.WARNING);
    		alert.setTitle("Connexion OK");
    		alert.setHeaderText("Connexion OK");
    		alert.setContentText("Connexion OK");
    		
    		data = 1;
    		
    		Stage stage = (Stage) connectButton.getScene().getWindow();
    		stage.close();
    		
    		newMainWindow();
    		
    	}
    	else
    	{
    		Alert alert = new Alert(AlertType.WARNING);
    		alert.setTitle("Erreur");
    		alert.setHeaderText("Erreur");
    		alert.setContentText("Erreur");
    		
    		alert.showAndWait();
    		
    	}
    	
    }
    
    
    public static int ConnectDataBase (String loginField, String passwordField) {
    	String sql = "SELECT * FROM Login WHERE Login_nom = ? and Login_password = ?";
    	int verificationLogin =0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver OK");
			
			String url = "jdbc:mysql://localhost:3306/med_file_new_v1";
			String user = "root";
			String password = "Wxcvbn123*";
			
			Connection connect = (Connection) DriverManager.getConnection(url, user, password);
			ResultSet resultSet = null;
			
			preparedStatement = (PreparedStatement) connect.prepareStatement(sql);
			preparedStatement.setString(1, loginField);
			preparedStatement.setString(2, passwordField);
			
			resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next())
			{
				verificationLogin=1;
				System.out.println("Verification : Succes");
				
			}
			else
			{
				verificationLogin=0;
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return verificationLogin;
	}
    
    private void newMainWindow() {
    	try {
    		FXMLLoader fxmlLoader = new FXMLLoader();
    		fxmlLoader.setLocation(getClass().getResource("PatientOverview.fxml"));
    		
    		Scene scene = new Scene(fxmlLoader.load(),800, 600);
    		Stage stage = new Stage();
    		
    		stage.setTitle("Patient Overview");
    		stage.setScene(scene);
    		stage.show();
    		
    		
    	}catch (Exception e) {
			e.printStackTrace();
		}
    }
}


