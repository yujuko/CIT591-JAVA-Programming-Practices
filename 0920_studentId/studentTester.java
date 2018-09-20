
public class studentTester {

	public static void main(String[] args) {
		
		student joe = new student("Joe" , 15);
		student jane = new student("Jane" , 16);
		student bob = new student("Bob" , 17);

		System.out.println("Joe's id is "+ joe.getStudentId());
		System.out.println("Jane's id is "+ jane.getStudentId());
		System.out.println("Bob's id is "+ bob.getStudentId());
	}

}
