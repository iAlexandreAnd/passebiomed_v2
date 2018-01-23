package passbiomed.model;

import java.time.LocalDate;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Trouble {
	private final StringProperty nomUniversel;
	private final StringProperty nomCommun;
	private final StringProperty status;
	private final StringProperty stade;
	private final ObjectProperty<LocalDate> dateDebut;
	private final ObjectProperty<LocalDate> dateFin;
	private final StringProperty flagValidite;
	
	public Trouble() {
		this(null,null,null,null,null,null,null);
	}
	
	public Trouble(String nomUniversel, String nomCommun, String status
					, String stade, LocalDate dateDebut
					, LocalDate dateFin, String flagValidite) {
		this.nomUniversel = new SimpleStringProperty(nomUniversel);
	    this.nomCommun = new SimpleStringProperty(nomCommun);
	    this.status = new SimpleStringProperty(status);
	    this.stade = new SimpleStringProperty(stade);
	    this.dateDebut = new SimpleObjectProperty<LocalDate>(LocalDate.of(1990, 2, 21));
	    this.dateFin = new SimpleObjectProperty<LocalDate>(LocalDate.of(1999, 2, 21));
	    this.flagValidite = new SimpleStringProperty(flagValidite);
	}
	
	public String getNomUniversel() {
        return this.nomUniverselProperty().get();
    }

    public void setNomUniversel(String nomUniversel) {
        this.nomUniversel.set(nomUniversel);
    }

    public StringProperty nomUniverselProperty() {
        return nomUniversel;
    }
	
	
    public String getNomCommun() {
        return this.nomCommunProperty().get();
    }

    public void setNomCommun(String nomCommun) {
        this.nomCommun.set(nomCommun);
    }

    public StringProperty nomCommunProperty() {
        return nomCommun;
    }
    
    
    public String getStatus() {
        return this.statusProperty().get();
    }

    public void setStatus(String status) {
        this.status.set(status);
    }

    public StringProperty statusProperty() {
        return status;
    }
    
    
    public String getStade() {
        return this.stadeProperty().get();
    }

    public void setStade(String stade) {
        this.stade.set(stade);
    }

    public StringProperty stadeProperty() {
        return stade;
    }
    
    
    
    public LocalDate getdateDebut() {
        return dateDebut.get();
    }

    public void setdateDebut(LocalDate dateDebut) {
        this.dateDebut.set(dateDebut);
    }

    public ObjectProperty<LocalDate> dateDebutProperty() {
        return dateDebut;
    }
    
    
    
    public LocalDate getdateFin() {
        return dateFin.get();
    }

    public void setdateFin(LocalDate dateFin) {
        this.dateFin.set(dateFin);
    }

    public ObjectProperty<LocalDate> dateFinProperty() {
        return dateFin;
    }
    
    
    
    public String getflagValidite() {
        return this.flagValiditeProperty().get();
    }

    public void setflagValidite(String flagValidite) {
        this.flagValidite.set(flagValidite);
    }

    public StringProperty flagValiditeProperty() {
        return flagValidite;
    }
}


