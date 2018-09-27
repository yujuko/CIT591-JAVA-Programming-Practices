
public class FutureCashFlow {
	
	private double futureCash;
	private double interestRate;
	private int time;
	
	FutureCashFlow(double fc, double rate, int y) {
		futureCash = fc;
		interestRate = rate;
		time = y;
		}
	
	public double getFutureCash() {
		return futureCash;
		}
	
	public double getInterestRate() {
		return interestRate;
		}
	
	public int getTime() {
		return time;
		}
	
	public void setTime(int t) {
		time = t;
		}
	

}
