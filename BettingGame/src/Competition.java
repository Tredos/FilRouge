import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;

public class Competition {
	private String name;
	private ArrayList<Competitor> listCompetitors = new ArrayList<Competitor>();
	Calendar dateClosure;
	
	public String getName(){
		return this.name;
	}
	
	public ArrayList<Competitor> getListCompetitors(){
		return this.listCompetitors;
	}
	public Calendar getDateClosure(){
		return this.dateClosure;
	}
	
	public void setName(String name){
		this.name = name;
	}

	public void setListCompetitors(ArrayList<Competitor> competitors){
		Collections.copy(this.listCompetitors, competitors);
	}
	
	public void  setDataClosure(Calendar dataClosure){
		this.dateClosure = dataClosure;
	}
}
