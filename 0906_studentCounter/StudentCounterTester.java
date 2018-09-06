package studentCounter;

public class StudentCounterTester {

	public static void main(String[] args) {
		
		studentCounter counter1 = new studentCounter();
		System.out.println("Expected: counter1 number of student is 0 ");
		System.out.println("Actual: counter1 number of student is "+ counter1.getNemStudentsInRoom());
		System.out.println("");
		
		studentCounter counter2 = new studentCounter(50);
		System.out.println("Expected: counter2 number of student is 50 ");
		System.out.println("Actual: counter2 number of student is "+ counter2.getNemStudentsInRoom());
		System.out.println("");
		
		counter2.StudentsEntered(20);
		System.out.println("Expected: counter2 number of student is 70 ");
		System.out.println("Actual: counter2 number of student is "+ counter2.getNemStudentsInRoom());
		System.out.println("");
		
		counter2.StudentEntered();
		counter2.StudentEntered();
		counter2.StudentEntered();
		System.out.println("Expected: counter2 number of student is 73 ");
		System.out.println("Actual: counter2 number of student is "+ counter2.getNemStudentsInRoom());
		System.out.println("");
		
		counter2.StudentsLeft(60);
		System.out.println("Expected: counter2 number of student is 13 ");
		System.out.println("Actual: counter2 number of student is "+ counter2.getNemStudentsInRoom());
		System.out.println("");
		
		counter2.StudentLeft();
		counter2.StudentLeft();
		System.out.println("Expected: counter2 number of student is 11 ");
		System.out.println("Actual: counter2 number of student is "+ counter2.getNemStudentsInRoom());
		
		
	}
	
}
