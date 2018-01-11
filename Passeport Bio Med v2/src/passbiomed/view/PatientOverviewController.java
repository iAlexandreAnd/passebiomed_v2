package passbiomed.view;



import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import passbiomed.MainApp;
import passbiomed.model.Medicament;
import passbiomed.model.Trouble;

public class PatientOverviewController {
	@FXML
    private TableView<Trouble> troubleTable;
    @FXML
    private TableColumn<Trouble, String> nomUniverselColonne;
    @FXML
    private TableColumn<Trouble, String> nomCommunColonne;
    @FXML
    private TableColumn<Trouble, String> statusColonne;
    @FXML
    private TableColumn<Trouble, String> stadeColonne;
    @FXML
    private TableColumn<Trouble, String> dateDebutColonne;
    @FXML
    private TableColumn<Trouble, String> dateFinColonne;
    
    @FXML
    private TableView<Medicament> medicamentTable;
    @FXML
    private TableColumn<Medicament, String> nomChimiquelColonne;
    @FXML
    private TableColumn<Medicament, String> nomCommerciallColonne;
    @FXML
    private TableColumn<Medicament, String> nomMedicamentUniColonne;
    
    
    @FXML
    private Label nomLabel;
    @FXML
    private Label prenomLabel;
    @FXML
    private Label grpSanLabel;
    @FXML
    private Label adresseLabel;
    @FXML
    private Label codePosLabel;
    @FXML
    private Label villeLabel;
    @FXML
    private Label phoneLabel;
    @FXML
    private Label birthdayLabel;
    @FXML
    private Label paysLabel;
    @FXML
    private Label sexeLabel;
    @FXML
    private Label iceNomLabel;
    @FXML
    private Label iceTelephoneLabel;
    
    private MainApp mainApp;
    
    public PatientOverviewController() {
    	
    }
    
    private void initialize() {
    	// Initialize the person table with the two tables.
    	
    }
    
    
    @FXML
    private void ouvrirPatient() {
    	System.out.println("Patient Connect show");
    	boolean okClicked = mainApp.showPatientConnect();
    	if (okClicked) {
            System.out.println("Patient Connect close");
        }
    }
    
    
    
}
