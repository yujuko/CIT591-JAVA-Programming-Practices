
//      Easter Sunday is the first Sunday after the first full moon of spring. To compute the date,
//      you can use this algorithm, invented by the mathematician Carl Friedrich Gauss in 1800 (15 points):

//1.    Let y be the year (such as 1800 or 2001).
//2.    Divide y by 19 and call the remainder a. Ignore the quotient.
//3.    Divide y by 100 to get a quotient b and a remainder c.
//4.    Divide b by 4 to get a quotient d and a remainder e.
//5.    Divide 8 * b + 13 by 25 to get a quotient g. Ignore the remainder.
//6.    Divide 19 * a + b - d - g + 15 by 30 to get a remainder h. Ignore the quotient.
//7.    Divide c by 4 to get a quotient j and a remainder k.
//8.    Divide a + 11 * h by 319 to get a quotient m. Ignore the remainder.
//9.    Divide 2 * e + 2 * j - k - h + m + 32 by 7 to get a remainder r. Ignore the quotient.
//10.    Divide h - m + r + 90 by 25 to get a quotient n. Ignore the remainder.
//11.    Divide h - m + r + n + 19 by 32 to get a remainder p. Ignore the quotient.

//Then Easter falls on day p of month n. For example, if y is 2001:
//a = 6                  h = 18                   n = 4
//b = 20, c = 1     j = 0, k = 1            p = 15
//d = 5, e = 0       m = 0
//g = 6                  r = 6

//Therefore, in 2001, Easter Sunday fell on April 15. Write a program that prompts the user for a year and prints out the month and day of Easter Sunday.


-----------------------------------------------------------------------------
package HW1Lucy;

import java.util.Scanner;

public class easterSunday {
	
	public static void main(String[] args) {
	
    System.out.print("Enter a year: ");
    
	Scanner scan = new Scanner(System.in);
	
    int y = scan.nextInt();
    int a = y % 19;
    int b = y / 100;
    int c = y % 100;
    int d = b / 4;
    int e = b % 4;
    int g = (8 * b + 13) / 25;
    int h = (19 * a + b - d - g + 15) % 30;
    int j = c /4;
    int k = c % 4;
    int m = (a + 11 * h) / 319;
    int r = (2 * e + 2 * j - k - h + m + 32) % 7;
    int n = (h - m + r + 90) / 25 ;
    int p = (h - m + r + n + 19) % 32;


    if(y <= 2018) {
        System.out.println("In "+ y +", Easter Sunday fell on "+n+"/"+p+"!");
    }
    else{
        System.out.println("In "+ y +", Easter Sunday falls on "+n+"/"+p+"!");
    }

}
}

