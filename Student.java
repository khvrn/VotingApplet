
public class Student extends User {
	private static long studentID;
	public static Demographics demo;
	
	public Student() {
		super();
		studentID = 0000;
		demo = null;
	}
	
	public Student(String first, String last, long id, Demographics demograph) {
		super(first, last);
		studentID = id;
		demo = demograph;
	}
	
	public static void setStudentID(long id) {
		Student.studentID = id;
	}
	
	public static void setDemographics(Demographics demograph) {
		demo = demograph;
	}
}
