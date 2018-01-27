package passbiomed.view;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import passbiomed.MainApp;

public class MainMenuController 
{

    @FXML
    private AnchorPane menuPrincipal;

    @FXML
    private HBox boxMenus;

    @FXML
    private JFXButton boutonCreer;

    @FXML
    private JFXButton boutonConsulter;

    @FXML
    private JFXButton butonStatistiques;

    @FXML
    private JFXButton boutonSoon;
    
    private MainApp mainApp;
    private Stage stage;
    
    public MainMenuController() 
    {
    	
    }
    
    @FXML
    private void initialize() 
    {
    	 	
    }
    
    @FXML
    private void handleBoutonConsulter() 
    {
    	
    	Stage stage = (Stage) boutonConsulter.getScene().getWindow();
    	
    	try {
    		FXMLLoader fxmlLoader = new FXMLLoader();
    		fxmlLoader.setLocation(getClass().getResource("PatientOverview.fxml"));
		
    		
    		Scene scene = new Scene(fxmlLoader.load(),800, 600);
    		stage.setScene(scene);
    		stage.show();
    		
    		}catch (Exception e) 
    		{
			e.printStackTrace();
    		}
    }
    
    @FXML
    private void handleBoutonCreer() 
    {
    	
    	Stage stage = (Stage) boutonConsulter.getScene().getWindow();
    	
    	try {
    		FXMLLoader fxmlLoader = new FXMLLoader();
    		fxmlLoader.setLocation(getClass().getResource("CreatePatient.fxml"));
		
    		
    		Scene scene = new Scene(fxmlLoader.load(),686, 600);
    		stage.setScene(scene);
    		stage.show();
    		
    		}catch (Exception e) 
    		{
			e.printStackTrace();
    		}
    }
    

}