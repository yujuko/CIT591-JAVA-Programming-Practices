package HW1Lucy;

public class studentTester {

	public static void main(String[] args) {
	
		//test2: initialize with 1 score;
		studentAndScore studentTest = new studentAndScore("Lucy", 90);
    	
		studentTest.addQuiz(95);				
		studentTest.addQuiz(100);
		studentTest.addQuiz(97);
		
		
		System.out.println(studentTest.getName()+"'s total score is "+studentTest.getTotalScore()+
				" and the average is "+ studentTest.getAverageScore()+".");
		
		
		//test2: initialize with more than 1 scores 
		studentAndScore studentTest2 = new studentAndScore("Jay", 247, 3);
				
		studentTest2.addQuiz(75);
		studentTest2.addQuiz(65);
		
		System.out.println(studentTest2.getName()+"'s total score is "+studentTest2.getTotalScore()+
				" and the average is "+ studentTest2.getAverageScore()+".");

	}

}
