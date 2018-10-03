
public class TeachingAssistantTester {
	
	public static void main(String[] args) {
		TeachingAssistant ta = new TeachingAssistant();
		Homework lucy = new Homework("Lucy", 3628800);
		Homework trevor = new Homework("Trevor", 2);
		
		// grade HW's
		ta.setCurrentHomework(lucy);
		ta.gradeHomework();
		ta.setCurrentHomework(trevor);
		ta.gradeHomework();
	}

}
