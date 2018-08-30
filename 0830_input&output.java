package printing;

import java.util.Scanner;

public class helloWorldAgain {

	public static void main (String []args) {
		Scanner scan = new Scanner(System.in);
		String name;
		System.out.println("Hello,what's your name?");
		name = scan.nextLine();
		System.out.println("Nice to meet you "+name+"!");
        System.out.println("How old are you?");	
        int age = scan.nextInt();
        System.out.println(name+ " is "+age+" years old.");
       
		
	}
}
