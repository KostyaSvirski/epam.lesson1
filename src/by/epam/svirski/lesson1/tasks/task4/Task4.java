package by.epam.svirski.lesson1.tasks.task4;

import by.epam.svirski.lesson1.services.DirectorService;
import by.epam.svirski.lesson1.utils.InputExceptionCustom;

public class Task4 {

	public static void main(String[] args) {
		DirectorService ds = new DirectorService();
		String[] inputTrue = {"1", "2", "3", "4"};
		String[] inputFalse = {"1", "1"};
		String[] errorInput = {""};
		try {
			if(ds.executeCheckOfEvens(inputTrue)){
				System.out.println(true);
			} else {
				System.out.println(false);
			}
			if(ds.executeCheckOfEvens(inputFalse)) {
				System.out.println(true);
			} else {
				System.out.println(false);
			}
			if(ds.executeCheckOfEvens(errorInput)) {
				System.out.println(true);
			} else {
				System.out.println(false);
			}
			
		} catch (InputExceptionCustom e) {
			
			e.printStackTrace();
		}
		
	}
}
