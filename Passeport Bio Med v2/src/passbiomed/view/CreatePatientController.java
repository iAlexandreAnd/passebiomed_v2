package passbiomed.view;



import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextField;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class CreatePatientController 
{

    @FXML
    private Pane bannierePane;
    
    @FXML
    private JFXButton previousButton;

    @FXML
    private JFXButton NextButton;

    @FXML
    private JFXButton BackToMainButton;

    @FXML
    private GridPane GridPaneInfo1;

    @FXML
    private JFXTextField TextFieldNom;

    @FXML
    private GridPane GridPaneInfo2;

    @FXML
    private JFXDatePicker DatePickerBirthday;
    
    @FXML
    private JFXTextField TextFieldPrenom;

    @FXML
    private JFXTextField TextFieldTel;

    @FXML
    private JFXTextField TextFieldAdresse;

    @FXML
    private JFXComboBox<String> ComboBoxPays;

    @FXML
    private JFXTextField TextFieldLocalité;

    @FXML
    private JFXTextField TextFieldCP;

    @FXML
    private JFXTextField TextFieldICE_Nom;

    @FXML
    private JFXTextField TextFieldICE_Tel;

    @FXML
    private JFXComboBox<?> ComboBox_GS;

    @FXML
    private JFXRadioButton RadioButtonMale;

    @FXML
    private ToggleGroup GenderGroup;

    @FXML
    private JFXRadioButton RadioButtonFemale;
    
    @FXML
    private GridPane GridPaneInfo3;

    @FXML
    private ImageView PicturePatient;

    @FXML
    private JFXButton Chercher_photo;
    
    @FXML
    private JFXButton NextButtonWin3;
    
    @FXML
    private JFXButton previousButtonToWin2;
    
    ObservableList<String> listePays = FXCollections.observableArrayList("Belgique", "Angleterre", "Canada", "Japon");
    
    @FXML
    private void initialize() 
    {
    		GridPaneInfo2.setVisible(false);
    		GridPaneInfo3.setVisible(false);
    		ComboBoxPays.setItems(listePays);
    		
    		
//    		previousButton.setDisable(true);
    		previousButton.setVisible(false);
    		previousButtonToWin2.setVisible(false);
    		NextButtonWin3.setVisible(false);
    		
    }
    
    @FXML
    private void buttonActionNext() 
    {
    		String nom = TextFieldNom.getText();
    		String prénom = TextFieldPrenom.getText();
    		String tel = TextFieldTel.getText();
    		String adresse = TextFieldAdresse.getText();
    		String pays = ComboBoxPays.getValue();
    		String localité = TextFieldLocalité.getText();
    		
    		System.out.println(nom);
    		System.out.println(prénom);
    		System.out.println(tel);
    		System.out.println(adresse);
    		System.out.println(pays);
    		System.out.println(localité);
    		
    		if(nom.length()== 0||prénom.length()== 0||tel.length()== 0||adresse.length()== 0||pays==null||localité.length()== 0) 
    		{
    			// fonctionne pas???
    			
    			Alert alerto = new Alert(AlertType.ERROR);
        		alerto.setTitle("Erreur");
        		alerto.setHeaderText("Erreur");
        		alerto.setContentText("Touts les champs n'ont pas été remplis correctement.");
        		alerto.showAndWait();
    			
    		}
    		
    		else 
    		{
    			GridPaneInfo1.setVisible(false);
        		GridPaneInfo2.setVisible(true);
        		previousButton.setVisible(true);
        		NextButton.setVisible(false);
        		NextButtonWin3.setVisible(true);
    		}
    		
    	
    }
    
    @FXML
    private void buttonActionPreviousWin2() 
    {
    		GridPaneInfo2.setVisible(true);
		GridPaneInfo3.setVisible(false);
		NextButtonWin3.setDisable(false);
		previousButtonToWin2.setVisible(false);
		previousButton.setVisible(true);
    	
    	
    }
    @FXML
    private void buttonActionPrevious() 
    {
    		GridPaneInfo1.setVisible(true);
    		GridPaneInfo2.setVisible(false);
    		previousButton.setVisible(false);
    		NextButton.setVisible(true);
    		NextButtonWin3.setVisible(false);
    } 
   
    @FXML
    private void buttonActionToWin3() 
    {
    		GridPaneInfo1.setVisible(false);
    		GridPaneInfo2.setVisible(false);
    		GridPaneInfo3.setVisible(true);
    		
    		previousButton.setVisible(false);
    		previousButtonToWin2.setVisible(true);
    		NextButton.setVisible(false);
    		NextButtonWin3.setDisable(true);
    } 
    
    @FXML
    private void handleRetour() 
    {
    	Stage stage = (Stage) BackToMainButton.getScene().getWindow();
    		try 
    		{
    			FXMLLoader fxmlLoader = new FXMLLoader();
    			fxmlLoader.setLocation(getClass().getResource("MainMenu.fxml"));
		
    		
    			Scene scene = new Scene(fxmlLoader.load(),1000, 600);
    			stage.setScene(scene);
    			stage.show();
    		
    		}catch (Exception e) 
    			{
    				e.printStackTrace();
    			}
    	
    }
}
