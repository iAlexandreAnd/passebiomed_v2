package passbiomed.view;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
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
    private JFXButton BoutonConsulter;

    @FXML
    private JFXButton BoutonStatistiques;

    @FXML
    private JFXButton BoutonSoon;
    
    private MainApp mainAppli;
    
    public MainMenuController() 
    {
    	
    }
    
    private void initialize() 
    {
    	// Initialize fonction
    	 	
    }
    
    

}