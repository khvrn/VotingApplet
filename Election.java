

public class Election extends Database {
	public static String electionName;
	//eligibility
	public static int ecID;
	public static boolean status; //true for open false for closed
	public static Result res;
	
	public Election() {
		electionName = "";
		//eligibility
		ecID = 0000;
		status = false;
		res = null;
	}
	
	public Election(String name, int id, boolean stat, Result result) {
		electionName = name;
		//eligibility
		ecID = id;
		status = stat;
		res = result;
	}
	
	public static void setElectionName(String name) {
		electionName = name;
	}
	
	//setEligibility
	
	public static void setECID(int id) {
		ecID = id;
	}
	
	public static void setStatus(boolean stat) {
		status = stat;
	}
	
	//setResults?
	
	public String getElectionName() {
		return electionName;
	}
	
	//getEligibity
	
	public int getECID() {
		return ecID;
	}
	
	public Result getResult() {
		return res;
	}
	
	public String toString() {
		return "/nElection: " + electionName + "/nECID: " + ecID + "/nStatus: " + status + "/nResults: " + res.toString();   
	}

}
