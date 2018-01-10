package passbiomed.view;


import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
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
    private TableColumn<Trouble, String> dateFInColonne;
    
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
}
