import java.util.Scanner;

public class elevator {

	public static void main(String[] args) {
		
		/*Scenario: Elevator has buttons 1-12 and 14-20
		 * There is not button for floor 13. When user hits any button
		 * over 12, it actually goes to one floor lower than that button pressed.
		 */
		int buildingFloor=0;
		int actualFloor=0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter floor");
		
		buildingFloor = scan.nextInt();
		
		if(buildingFloor > 13) {
			actualFloor = buildingFloor - 1;
			//System.out.println("Pressed floor number "+buildingFloor+" going to "+actualFloor);
			
		} else {
			actualFloor = buildingFloor;
			//System.out.println("Pressed floor number "+buildingFloor+" going to "+actualFloor);
		}
		
		System.out.println("Pressed floor number "+buildingFloor+" going to "+actualFloor);
		
		//if you have the same statement in both conditional blocks of code, remove it and
		//present it once.
		
		Scanner scan2 = new Scanner(System.in);
		
		System.out.println("Would you like to quit? Enter q to quit");
		
		String quit = scan2.nextLine();
		//if (quit == "q") {
		int confirmQuit;
		
		if (quit.equals("q")) {
			System.out.println("User entered q");
			System.out.println("Are you sure you want to quit? 1 for yes 0 for no");
			confirmQuit = scan.nextInt();
			
			if (confirmQuit == 1) {
				System.out.println("Exit program");
			}
			
			else {
				System.out.println("Program continues");
			}
		} else {
			System.out.println("Don't quit");
		}		
	}
}
