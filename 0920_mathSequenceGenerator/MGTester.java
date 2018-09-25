
public class MGTester {

	public static void main(String[] args) {
		
		MathSequenceGenerator mg = new MathSequenceGenerator(3,10);
		
		while(mg.hasNext()) {
			System.out.println(mg.next());
			
		}

	}

}
