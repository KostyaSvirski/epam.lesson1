package by.epam.svirski.lesson1.utils;

public class InputExceptionCustom extends Exception{
	
	private static final long serialVersionUID = 1L;
	
	public InputExceptionCustom(String exceptionMessage) {
		super(exceptionMessage);
	}
	
}
