import java.util.ArrayList;

public abstract class Database {
	private static ArrayList<Election> elections;
	
	public Database() {
		Database.elections = new ArrayList<Election>();
	}
	
	public Database(ArrayList<Election> elections) {
		Database.elections = elections;
	}
}
