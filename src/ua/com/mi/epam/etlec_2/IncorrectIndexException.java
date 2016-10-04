package ua.com.mi.epam.etlec_2;

public class IncorrectIndexException extends RuntimeException {

	public IncorrectIndexException() {
		super();
	}

	public IncorrectIndexException(String message) {
		super(message);
	}

	public IncorrectIndexException(String message, Throwable cause) {
		super(message, cause);
	}

}
