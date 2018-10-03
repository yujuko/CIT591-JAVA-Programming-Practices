
public class Homework {
	
	// instance vars
	private String name;
	private int answer;
	private boolean grade;
	
	// constructor
	Homework(String name, int answer){
		this.name = name;
		this.answer = answer;
	}
	
	// getters
	public int getAnswer() {
		return this.answer;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setGrade(boolean grade) {
		this.grade = grade;
	}

}
