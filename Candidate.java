
public class Candidate {
	public static String firstName;
	public static String lastName;
	
	public Candidate() {
		firstName = "";
		lastName = "";
	}
	
	public Candidate(String first, String last) {
		firstName = first;
		lastName = last;
	}
	
	public String toString() {
		return firstName + " " + lastName;
	}
}
