package passbiomed.view;



import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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
    private JFXComboBox<String> ComboBox_GS;

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
    
    @FXML
    private GridPane GridPaneInfo4;

    @FXML
    private JFXTextField mailAddress;

    @FXML
    private JFXTextField logginName;

    @FXML
    private JFXTextField PasswordName;

    @FXML
    private JFXButton CréerUtilisateur;
    

    @FXML
    private JFXButton previousButtonToWin3;

    @FXML
    private JFXButton NextButtonWin4;
    
    ObservableList<String> listePays = FXCollections.observableArrayList("Belgique", "Angleterre", "Canada", "Japon");
    ObservableList<String> groupeSanguin = FXCollections.observableArrayList("A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-");
    
    @FXML
    private void initialize() 
    {
    		GridPaneInfo2.setVisible(false);
    		GridPaneInfo3.setVisible(false);
    		GridPaneInfo4.setVisible(false);
    		ComboBoxPays.setItems(listePays);
    		ComboBox_GS.setItems(groupeSanguin);
    		
    		LocalDate localDate = LocalDate.now();
    		
    		DatePickerBirthday.setValue(localDate);
    	    		
//    		previousButton.setDisable(true);
    		previousButton.setVisible(false);
    		previousButtonToWin2.setVisible(false);
    		previousButtonToWin3.setVisible(false);
    		NextButtonWin3.setVisible(false);
    		NextButtonWin4.setVisible(false);
    		
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
    		
    		
    		if(nom.length()== 0||prénom.length()== 0||tel.length()== 0||adresse.length()== 0||pays==null||localité.length()== 0) 
    		{
    			Alert alerto = new Alert(AlertType.ERROR);
        		alerto.setTitle("Erreur");
        		alerto.setHeaderText("Erreur");
        		alerto.setContentText("Tous les champs n'ont pas été remplis correctement.");
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
    		
    		System.out.println("Nom: "+nom);
    		System.out.println("Prénom: "+prénom);
    		System.out.println("Tel: "+tel);
    		System.out.println("Adresse: "+adresse);
    		System.out.println("Pays: "+pays);
    		System.out.println("Localité: "+localité);
    		
    	
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
    private void buttonActionPreviousWin2() 
    {
    		GridPaneInfo2.setVisible(true);
		GridPaneInfo3.setVisible(false);
		NextButtonWin3.setVisible(true);
		NextButtonWin4.setVisible(false);
		previousButtonToWin2.setVisible(false);
		previousButton.setVisible(true);
    	
    }
    
    @FXML
    private void buttonActionPreviousWin3() 
    {
    		GridPaneInfo3.setVisible(true);
		GridPaneInfo4.setVisible(false);
		NextButtonWin4.setDisable(false);
		previousButtonToWin3.setVisible(false);
		previousButtonToWin2.setVisible(true);
 	
    }

    @FXML
    private void buttonActionToWin3() 
    {
    		
    		String CodePostal = TextFieldCP.getText();
    		String ICE_Nom = TextFieldICE_Nom.getText();
    		String ICE_Tel = TextFieldICE_Tel.getText();
    		String groupe_sanguin = ComboBox_GS.getValue();
    		String gender = null;
    		
    		if(RadioButtonFemale.isSelected()) 
    		{
    			gender = "Féminin";
    		}
    		else if(RadioButtonMale.isSelected())
    		{
    			 gender = "Masculin";
    		}
    		
    		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY");
    		String dateVari = (DatePickerBirthday.getValue().format(formatter));
    		
    		LocalDate localDat = LocalDate.now();
    		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/YYYY");
    		String formattedDate = localDat.format(dtf);
    		
    		if(CodePostal.length()==0||ICE_Nom.length()==0||ICE_Tel.length()==0||groupe_sanguin.length()==0||gender.length()==0||dateVari.equals(formattedDate)) 
    		{
    			Alert alertus = new Alert(AlertType.ERROR);
        		alertus.setTitle("Erreur");
        		alertus.setHeaderText("Erreur");
        		alertus.setContentText("Touts les champs n'ont pas été remplis correctement.");
        		alertus.showAndWait(); 
        		
    		}
    		else 
    		{
    			GridPaneInfo1.setVisible(false);
        		GridPaneInfo2.setVisible(false);
        		GridPaneInfo3.setVisible(true);
        		previousButton.setVisible(false);
        		previousButtonToWin2.setVisible(true);
        		NextButton.setVisible(false);
        		NextButtonWin3.setVisible(false);
        		NextButtonWin4.setVisible(true);
        		
    		}
    		
    		
    		System.out.println("Code postal: "+CodePostal);
    		System.out.println("ICE nom: "+ICE_Nom);
    		System.out.println("ICE tel: "+ICE_Tel);
    		System.out.println("Groupe sanguin: "+groupe_sanguin);
    		System.out.println("Genre: "+gender);
    		System.out.println("Date de naissance: "+dateVari);
    
    		
    } 
    
    @FXML 
    private void buttonActionToWin4()
    {
    		GridPaneInfo3.setVisible(false);
    		GridPaneInfo4.setVisible(true);
    		previousButtonToWin2.setVisible(false);
    		previousButtonToWin3.setVisible(true);
    		NextButtonWin4.setDisable(true);  		 		
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
    			stage.centerOnScreen();
    			stage.show();
    		
    		}catch (Exception e) 
    			{
    				e.printStackTrace();
    			}
    	
    }
}