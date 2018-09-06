package studentCounter;

public class studentCounter {

	// private: the class can only be called in the package
	private int numStudentInRoom = 0;
	
	// constructor: same name as the class
	studentCounter(){ 
		numStudentInRoom = 0 ;
	}
	
	// constructor2: with some student in the room
	studentCounter( int numStudentAlreadyInTheRoom ){ 
		numStudentInRoom = numStudentAlreadyInTheRoom ;
	}
	
	public int getNemStudentsInRoom() {
		return numStudentInRoom;
	}
	
	
	//method-overloading: methods with same name but different arguments
	public void StudentEntered() {
		numStudentInRoom ++;
	}	
	public void StudentsEntered(int numOfStudentsEntered) {
		numStudentInRoom += numOfStudentsEntered;
	}
	
	//method-overloading
	public void StudentLeft() {
		numStudentInRoom --;
	}
	public void StudentsLeft(int numOfStudentsLeft) {
		numStudentInRoom -= numOfStudentsLeft;
	}
}
