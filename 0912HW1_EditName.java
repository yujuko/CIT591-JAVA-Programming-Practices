

//StringBuilder in Java (25 points)

//  We have seen how to use the String class in Java. One big constraint with String is that the object cannot be modified after it has been created. (Note that methods like toUpperCase and replace return a new String object and don’t change the original object.) For this project, you will explore the StringBuilder class in Java that lets you modify existing objects. Start by looking through Oracle’s tutorial on StringBuilder (https://docs.oracle.com/javase/tutorial/java/data/buffers.html) and the Javadocs (https://docs.oracle.com/javase/8/docs/api/java/lang/StringBuilder.html). Once you’ve done this, write a Java program that does the following:
//  a.Create an instance of StringBuilder that spells your name. Print this.
//  b.Add, delete, or modify at least 3 characters in this StringBuilder object to make it spell a   different word of your choice. Print this word.
//  c.Some crazy program requires that you have a password with the following features:
//      i.must be between 20 and 30 characters long
//      ii.must contain a decimal number
//      iii.must contain at least one letter and at least one symbol
//  Modify your StringBuilder object to fit these requirements so you can use it as your password. Print this password.

----------------------------------------------------------------------------------------------------

package HW1Lucy;

public class editName {

	public static void main(String[] args) {
	    
//a.
        StringBuilder name = new StringBuilder("Lucy");
        System.out.println("My name is " + name + ".");

//b.
        name.delete(2, 4); //delete "cy" ,edited name: Lu
        name.append("Apple"); //edited name: LuApple
        name.insert(2, "lu"); //edited name: LuluApple
        name.replace(4, 9, "Lemon"); //edited name: Lululemon
        
        System.out.println("I got a new name: " + name + "!");

//c.
        name.append("FoundedInVancouver,CanadaIn1998"); //extend the name
        name.insert(9, "- "); //insert a symbol
        
        System.out.println("I got a new password: " + name + "!");

//d.
        name.delete(3, 42); //edited name: Lul
        name.append(name);
        System.out.println(name + " is a palindrome now ! ");

	}

}
