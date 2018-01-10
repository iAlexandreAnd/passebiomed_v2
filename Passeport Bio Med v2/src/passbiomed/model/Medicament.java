package passbiomed.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Medicament {
	private final StringProperty nomUniversel;
	private final StringProperty nomCommercial;
	private final StringProperty nomChimique;
	
	
	
	public Medicament() {
		this.nomUniversel = null;
		this.nomCommercial = null;
		this.nomChimique = null;
	}
	
	public String getNomUniversel() {
        return nomUniversel.get();
    }

    public void setNomUniversel(String nomUniversel) {
        this.nomUniversel.set(nomUniversel);
    }

    public StringProperty nomUniverselProperty() {
        return nomUniversel;
    }
    
    public String getNomCommercial() {
        return nomCommercial.get();
    }

    public void setNomCommercial(String nomCommercial) {
        this.nomCommercial.set(nomCommercial);
    }

    public StringProperty nomCommercialProperty() {
        return nomCommercial;
    }
    
    public String getNomChimique() {
        return nomChimique.get();
    }

    public void setNomChimique(String nomChimique) {
        this.nomChimique.set(nomChimique);
    }

    public StringProperty nomChimiqueProperty() {
        return nomChimique;
    }
}
