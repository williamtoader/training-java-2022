package exceptionDemo;


public class IncorrectFileNameException extends RuntimeException {
	public IncorrectFileNameException(String errorMessage, Throwable err) {
		super(errorMessage, err);
	}
}
