
public class Ballot extends Election {
	public static String raceName;
	public static long ballotID;
	
	public Ballot() {
		super();
		raceName = "";
		ballotID = 0000;
	}
	
	public Ballot(String name, int electID, boolean stat, Result result, String race, long ballotID) {
		super(name, electID, stat, result);
		raceName = race;
		Ballot.ballotID = ballotID;
	}
	
	public static void setRaceName(String race) {
		raceName = race;
	}
	
	public static void setBallotID(long id) {
		ballotID = id;
	}
	
	public String getRaceName() {
		return raceName;
	}
	
	public long getBallotID() {
		return ballotID;
	}
	
	public String toString() {
		return super.toString() + "/nRace: " + raceName + "/nBallot ID: " + ballotID;
	}
}
