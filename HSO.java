
public class HSO extends User {
	private static long employeeID;
	
	public HSO() {
		employeeID = 0000;
	}
	
	public HSO(long id) {
		employeeID = id;
	}
	
	public long getEmployeeID() {
		return employeeID;
	}

}
