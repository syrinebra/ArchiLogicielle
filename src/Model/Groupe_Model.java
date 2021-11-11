package Model;

public class Groupe_Model {

	private int idGroupe;
	private String nomGroupe;
	private Student_Model student;
	private UE_Model ue;
	private Sujet_Model sujet;

	
	public Groupe_Model (int idGroupe,String nomGroupe, Student_Model student, UE_Model ue, Sujet_Model sujet) {

		this.idGroupe= idGroupe;
		this.nomGroupe= nomGroupe;
		this.student=student;
		this.ue=ue;
		this.sujet=sujet;

}
	public int getIdGroupe() {
		return idGroupe;
	}
	public void setIdGroupe(int idGroupe) {
		this.idGroupe = idGroupe;
	}
	public String getNomGroupe() {
		return nomGroupe;
	}
	public void setNomGroupe(String nomGroupe) {
		this.nomGroupe = nomGroupe;
	}
	public Student_Model getStudent() {
		return student;
	}

	public void setStudent(Student_Model student) {
		this.student = student;
	}

	public UE_Model getUe() {
		return ue;
	}

	public void setUe(UE_Model ue) {
		this.ue = ue;
	}

	public Sujet_Model getSujet() {
		return sujet;
	}

	public void setSujet(Sujet_Model sujet) {
		this.sujet = sujet;
	}


	
	public void creer_Groupe() {
		
	}
	
	public void supprimer_Groupe() {
		
	}


	public void creer_Groupes_aleatoire(Student_Model student) {
	
	}
	
	public void changer_student() {
	
	}
	

}
