
public class Demographics extends Student {
	public static int age;
	public static String sex;
	public static String college;
	public static String classStanding;
	
	public Demographics() {
		//super();
		sex = "";
		college = "";
		classStanding = "";
	}
	
	public Demographics(int age, String sex, String college, String standing) {
		//super();
		Demographics.age = age;
		Demographics.sex = sex;
		Demographics.college = college;
		Demographics.classStanding = standing;
	}
	
	public static void setAge(int Age) {
		age = Age;
	}
	
	public static void setSex(String seX) {
		sex = seX;
	}
	
	public static void setCollege(String colleGe) {
		college = colleGe;
	}
	
	public static void setClassStanding(String standing) {
		classStanding = standing;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getSex() {
		return sex;
	}
	
	public String getCollege() {
		return college;
	}
	
	public String getClassStanding() {
		return classStanding;
	}
	
}
