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
