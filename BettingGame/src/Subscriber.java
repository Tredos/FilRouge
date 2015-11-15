
public class Subscriber {

	private String firstname;
	private String lastname;
	private String username;
	private String password;
	public Subscriber(String firstname, String lastname, String username, String password){
		//TODO check if he is in the base
		this.firstname = firstname;
		this.lastname = lastname;
		this.username = username;
		// TODO password encryption
		this.password =password;
	}
	
	public String getFirstname(){
		return firstname;
	}
	
	public String getLastname(){
		return lastname;
	}
	public String getUsername(){
		return username;
	}
	public String getPassword(){
		return password;
	}
	
	
	
	public boolean equals(Object obj){
		if(!(obj instanceof Subscriber)){return false;}
		if (obj ==this){return true;}
		Subscriber trans = (Subscriber) obj;
		if (this.firstname.equals(trans.firstname) && this.lastname.equals(trans.lastname) && this.username.equals(trans.username)){
			return true;
		}
		else return false;
	}

	public String toString(){
		String str = "Name: " + firstname + " Lastname: " + lastname + " Username: " + username;
		return str;
	}
	//TODO hashcode()
	//TODO hasUsername()
}
