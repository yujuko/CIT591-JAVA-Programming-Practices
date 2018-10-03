
public class TeachingAssistant {
	
	// instance vars
	public static final int CORRECT_ANSWER = 3628800;
	private Homework currentHomework;
	
	// methods
	public void setCurrentHomework(Homework hw) {
		this.currentHomework = hw;
	}
	
	public void gradeHomework() {
		if(this.currentHomework == null) {
			System.out.println("No homework given to TA. Please assign a HW");
		} else {
			boolean ans = this.currentHomework.getAnswer() == CORRECT_ANSWER;
			this.currentHomework.setGrade(ans);
			System.out.println(ans);
		}
	}
}
