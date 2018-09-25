
public class MathSequenceGenerator {

	private int addBy;
	private int currentNum;
	private int endSequence;
	
	public MathSequenceGenerator(int ab, int es) {
		addBy = ab;
		endSequence = es;
		currentNum = 1;
	}
	public boolean hasNext() {
		if(currentNum <= endSequence) 
			return true;
		else 
			return false;
			
	}	
	public int next() {
		int retNum = currentNum;
			currentNum += addBy;
			return retNum;
		}
	}

