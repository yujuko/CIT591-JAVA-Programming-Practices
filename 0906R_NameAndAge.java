package nameAndAge;

import java.util.Scanner;

public class NameAndAge {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String userName;
		int userAge;
		int partnerAge;
		
		System.out.print("What's your name? ");
		userName= scan.nextLine();
		
		System.out.println("Welcome! "+ userName);
		System.out.println();
		
		System.out.print("How old are you? ");
		userAge = scan.nextInt();
		
		System.out.printf("The square root of "+ userName+"'s age is %.2f.",Math.sqrt(userAge));
		System.out.println();
		
//		System.out.printf("4%.2f",Math.sqrt(userAge));
//		System.out.println(".");
		
		System.out.println();
		
		System.out.print("How old is your partner? ");
		partnerAge = scan.nextInt();
		System.out.println();
		
		System.out.println("The product of two ages is "+ userAge * partnerAge+".");
		System.out.println("The quotient of two ages is "+ userAge / partnerAge+".");
		System.out.println("The mod of two ages is "+ userAge % partnerAge + ".");
	
	}
}
