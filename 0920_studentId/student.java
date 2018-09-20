
public class student {

	private String name;
	private int age;
	private int studentId;
	private static int startingStudentId = 1000;
	//static variables have same values in all objects
	
	student (String n, int a) {
		name = n;
		age = a;
		studentId = startingStudentId;
		startingStudentId++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name; 
		//(this) is optional: shows that this.name is an instense variable
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getStudentId() {
		return studentId;
	}
	
	
}
