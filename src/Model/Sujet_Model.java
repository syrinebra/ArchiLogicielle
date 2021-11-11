package Model;

import javax.xml.crypto.Data;

public class Sujet_Model {

	private int idSujet;
	private String nomSujet;
	private Data date;
	private String descriptif;
	private UE_Model ue;
	
	public Sujet_Model(	 int idSujet, String nomSujet, Data date, String descriptif, UE_Model ue) {
		
		this.idSujet = idSujet;
		this.nomSujet = nomSujet;
		this.date = date;
		this.descriptif = descriptif;
		this.ue=ue;
		
	}


	public int getIdSujet() {
		return idSujet;
	}

	public void setIdSujet(int idSujet) {
		this.idSujet = idSujet;
	}

	public String getNomSujet() {
		return nomSujet;
	}

	public void setNomSujet(String nomSujet) {
		this.nomSujet = nomSujet;
	}

	public Data getDate() {
		return date;
	}

	public void setDate(Data date) {
		this.date = date;
	}

	public String getDescriptif() {
		return descriptif;
	}

	public void setDescriptif(String descriptif) {
		this.descriptif = descriptif;
	}
	
	public UE_Model getUe() {
		return ue;
	}

	public void setUe(UE_Model ue) {
		this.ue = ue;
	}
	
	public void creerSujet() {
			
	}
	
	public void suprimerSujet() {
		
	}
	
	/*public void modifierSujet() {
	
	}
	public void consulterSujet() {
		
	}*/
	



}
