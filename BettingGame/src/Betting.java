import java.util.Calendar;
public interface Betting {
	
	//TODO what are the arguments?
	public void addCompetition(String name, Calendar date, Competitor[] competitors, String sth);
	//TODO what are the arguments?
	public void addCompetitor(String name, Competitor competitor, String sth);
	
	//TODO name, password...? 
	public void authenticateMngr(String name);
	
	
}
