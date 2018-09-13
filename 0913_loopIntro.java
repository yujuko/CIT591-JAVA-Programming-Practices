
public class loopIntro {
 
	public static void main(String[] args) {
		
//while loop: set a limit and exit the loop when reaching the limit
		
		System.out.println("This is in the While loop: ");
		int startLoop = 0;
		int endLoop = 5;
		
		while(startLoop < endLoop) {
			System.out.print("Hello! ");
			startLoop ++;
		}
		System.out.println(" ");

//while loop with a counter		
		System.out.println("This is in the While loop with a counter: ");
		int counter = 0;
		while(counter<5) {
			System.out.print("Hello! ");
			counter ++;		
		}
		System.out.println(" ");
		
//for Loop: know exactly how much we want to increment
		
		System.out.println("Now in a For loop: ");
		for(int i=0; i<5; i++) {
			System.out.print("Hello! ");
		}
	}
}
