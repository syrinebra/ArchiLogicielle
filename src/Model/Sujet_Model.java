package Model;

import javax.xml.crypto.Data;

public class Sujet_Model {

	private int idSujet;
	private String nomSujet;
	private Data date;
	private String descriptif;
	
	public Sujet_Model(	 int idSujet, String nomSujet, Data date, String descriptif) {
		
		this.idSujet = idSujet;
		this.nomSujet = nomSujet;
		this.date = date;
		this.descriptif = descriptif;
		
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
	
	public void creerSujet() {
		
		
	}
	
	public void suprimerSujet() {
		
	}
	
	/*public void modifierSujet() {
	
	}
	public void consulterSujet() {
		
	}*/
	



}
