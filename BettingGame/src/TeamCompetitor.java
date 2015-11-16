import java.util.ArrayList;
import java.util.Collections;

public class TeamCompetitor {
	private String name;
	
	//TODO Have to change Competitor Alone <-> competitor
	private ArrayList<CompetitorAlone> listCompetitors = new ArrayList<CompetitorAlone>();
	
	public TeamCompetitor(String name,ArrayList<CompetitorAlone> listCompetitors){
		this.name = name;
		Collections.copy(this.listCompetitors, listCompetitors);
	}
	
	public String getName(){
		return name;
	}
	
	//TODO should it not be CompetitorAlone?
	public void addMember(CompetitorAlone competitorAlone){
		listCompetitors.add(competitorAlone);
	}
	public void deleteMember(Competitor competitor){
		listCompetitors.remove(competitor);
	}
	
	//TODO what are the constrains?
	public boolean hasValidName(){
		return false;
	}
}
