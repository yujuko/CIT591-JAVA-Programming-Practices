package investmentCounter;

public class InvestmentTester {

	public static void main(String[] args) {
		
		double balance = 1000;
		double target = 2000;
		double rate = 7;
		int years = 0;
		
		Investment invest = new Investment(balance,rate);
		invest.waitForBalance(target);
		years = invest.getYears();
		
		System.out.println("It will take "+ years+ " years to hit the target.");
		
		invest.waitYears(years);
		
// two ways to format the output:
		System.out.printf("After an additional %d years. Balance is %.2f ", years, invest.getBalance());
		
		System.out.println("");
		
		System.out.printf("After an additional "+ years+ " years. Balance is %.2f ", invest.getBalance());

	}

}
