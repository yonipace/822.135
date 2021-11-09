package c;

public class AgeException extends Exception {

	public AgeException() {
		super();
	}

	public AgeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public AgeException(String message, Throwable cause) {
		super(message, cause);
	}

	public AgeException(String message) {
		super(message);
	}

	public AgeException(Throwable cause) {
		super(cause);
	}

}
