package Model;

public class Student_Model {
	
	private int idStudent;
	private String nomStudent;
	private String prenomStudent;
	private int ageStudent;
	private String mailStudent;
	private int Filiere;
	
	public Student_Model(int idStudent,String nomStudent, String prenomStudent,int ageStudent,String mailStudent,int Filiere) {
		
		this.idStudent = idStudent;
		this.nomStudent=nomStudent;
		this.prenomStudent = prenomStudent;
		this.ageStudent= ageStudent;
		this.mailStudent = mailStudent;
		this.Filiere = Filiere;
		
	}
	
	public int getIdStudent() {
		return idStudent;
	}
	public void setIdStudent(int idStudent) {
		this.idStudent = idStudent;
	}
	
	public String getNomStudent() {
		return nomStudent;
	}
	public void setNomStudent(String nomStudent) {
		this.nomStudent = nomStudent;
	}
	
	public String getPrenomStudent() {
		return prenomStudent;
	}
	public void setPrenomStudent(String prenomStudent) {
		this.prenomStudent = prenomStudent;
	}
	
	public int getAgeStudent() {
		return ageStudent;
	}
	public void setAgeStudent(int ageStudent) {
		this.ageStudent = ageStudent;
	}
	
	public String getMailStudent() {
		return mailStudent;
	}
	public void setMailStudent(String mailStudent) {
		this.mailStudent = mailStudent;
	}
	
	public int getFiliere() {
		return Filiere;
	}
	public void setFiliere(int Filiere) {
		this.Filiere = Filiere;
	}

	
	public void creerStudent() {		
			
	}
	
	public void suprimerStudent() {
		
	}
	
	/*public void modifierStudent() {
	
	}
	public void consulterStudent() {
		
	}*/
	
	
}
