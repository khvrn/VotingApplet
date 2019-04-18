
public abstract class User {
	public static String firstName;
	public static String lastName;
	
	public User() {
		firstName = "";
		lastName = "";
	}
	
	public User(String first, String last) {
		firstName = first;
		lastName = last;
	}
	
	public static void setFirstName(String first) {
		firstName = first;
	}
	
	public static void setLastName(String last) {
		lastName = last;
	}
}
