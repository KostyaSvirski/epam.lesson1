package by.epam.svirski.lesson1.tasks.task1;

import by.epam.svirski.lesson1.services.DirectorService;

public class Task1 {

	public static void main(String[] args) {
		DirectorService ds = new DirectorService();
		double result = ds.executeCalculationLastNumber("qwerty");
		
		System.out.println(result + " 9");
	}

}
