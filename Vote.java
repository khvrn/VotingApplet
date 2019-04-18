
public class Vote extends Election {
	public static long voteID;
	public static long ballotID;
	
	public Vote() {
		voteID = 0000;
		ballotID = 0000;
	}
	
	public Vote(long voteID, long ballotID) {
		Vote.voteID = voteID;
		Vote.ballotID = ballotID;
	}

}
