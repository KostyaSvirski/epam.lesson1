package by.epam.svirski.lesson1.utils;

public class CustomException extends Exception{
	
	private static final long serialVersionUID = 1L;

	public CustomException(String exceptionMessage) {
		super(exceptionMessage);
	}
}	
