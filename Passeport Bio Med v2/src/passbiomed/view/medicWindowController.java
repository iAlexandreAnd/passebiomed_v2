package passbiomed.view;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;

import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;


public class medicWindowController 
{
	  
	@FXML
    private GridPane borderGrid;
	
    @FXML
    private AnchorPane AnchorWindow;

    @FXML
    private TextField rechercheMaladie;

    @FXML
    private JFXComboBox<?> comboBoxTypeMaladie;

    @FXML
    private JFXButton boutonRechercheMaladie;
    
    @FXML
    private Pane paneHeaderPatho;

    @FXML
    private TableView<?> tableauMaladie;
	  
	final String cssGrid = "-fx-border-color: #A0A0A0;" 
			   +"-fx-border-width: 0px 4px 4px 4px";
	   
	  @FXML
	  private void initialize() 
	  {
		  borderGrid.setStyle(cssGrid);
	  }

}
