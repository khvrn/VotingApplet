
public class Race extends Ballot {
	public static long raceID;
	
	public Race() {
		super();
		raceID = 0000;
	}
	
	public Race(String name, int electID, boolean stat, Result result, String race, long ballotID, long id) {
		super(name, electID, stat, result, race, ballotID);
		raceID = id;
	}
	
	public static void setRaceID(long id) {
		raceID = id;
	}
	
	public long getRaceID() {
		return raceID;
	}
}
