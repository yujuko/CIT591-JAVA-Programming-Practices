package objectPractice;

public class SimpleCalculator {
	
	int num;
	
	SimpleCalculator(int initialNum){
		num = initialNum;
	}
	SimpleCalculator(){
		num = 0;
	}
	
	public void add(int numAdded) {
		num += numAdded;
	}
	
	public void subtract(int numSubtracted) {
		num += numSubtracted;
	}
	
	public void multiply(int numMultiply) {
		num *= numMultiply;
	}
	
	public void divide(int numDivided) {
		num /= numDivided;
	}
	public void getRemainder(int numRemainder) {
		num %= numRemainder;}
	
	public int getNumber() {
		return num;
	}

}
