
public class CompetitorAlone {
	
	private String firstname;
	private String lastname;
	private String birthDate;
	
	public CompetitorAlone(String firstname, String lastname, String birthDate){
		setFirstname(firstname);
		setLastname(lastname);
		setBirthDate(birthDate);
	}
	
	public String getFirstname(){
		return firstname;
	}
	
	public String getLastname(){
		return lastname;
	}
	public String getBirthDate(){
		return birthDate;
	}
	
	public void setFirstname(String firstname){
		this.firstname =  firstname;
	}
	
	public void setLastname(String lastname){
		this.lastname =  lastname;
	}
	public void setBirthDate(String birthDate){
		this.birthDate =  birthDate;
	}
	
	public String toString(){
		String str = "Name: " + firstname + " Lastname: " +lastname + " Birth date: " + birthDate;
		return str;
	}
	
	
	
}
