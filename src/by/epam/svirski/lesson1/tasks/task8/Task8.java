package by.epam.svirski.lesson1.tasks.task8;

import by.epam.svirski.lesson1.services.DirectorService;
import by.epam.svirski.lesson1.utils.InputExceptionCustom;

public class Task8 {

	public static void main(String[] args) {
		
		DirectorService ds = new DirectorService();
		try {
			double result1 = ds.calculateSystem("2");
			double result2 = ds.calculateSystem("4");
			//double incResult = ds.calculateSystem("qwerty");
			
			System.out.println("1. " + result1 + "\n2. " + result2);
		} catch (InputExceptionCustom e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
