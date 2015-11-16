import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CompetitorAlone {
	
	private String firstname;
	private String lastname;
	private Calendar birthDate;
	
	public CompetitorAlone(String firstname, String lastname, Calendar birthDate){
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
	public Calendar getBirthDate(){
		return birthDate;
	}
	
	public void setFirstname(String firstname){
		this.firstname =  firstname;
	}
	
	public void setLastname(String lastname){
		this.lastname =  lastname;
	}
	public void setBirthDate(Calendar birthDate){
		this.birthDate =  birthDate;
	}
	
	public String toString(){
		
		SimpleDateFormat strDate = new SimpleDateFormat();
        strDate.applyPattern("dd/MM/yyyy");
        System.out.println(strDate.format(this.birthDate.getTime()));
		String str = "Name: " + firstname + " Lastname: " +lastname + " Birth date: " + strDate;
		return str;
	}
	
	
	
}
