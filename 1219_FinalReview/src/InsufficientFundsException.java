
public class InsufficientFundsException extends RuntimeException {
	private static final long serialVersionUID = 8226094121089030034L;

	public InsufficientFundsException(String message) {
		super(message);
	}

	public InsufficientFundsException() {
		super();
	}

}
