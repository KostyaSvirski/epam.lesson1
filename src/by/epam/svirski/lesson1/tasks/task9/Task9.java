package by.epam.svirski.lesson1.tasks.task9;

import java.util.ArrayList;

import by.epam.svirski.lesson1.services.DirectorService;
import by.epam.svirski.lesson1.utils.InputExceptionCustom;

public class Task9 {

	public static void main(String[] args) {
		DirectorService ds = new DirectorService();
		try {
			ArrayList<Double> result = ds.executeCalculationOfCircle("5");
			System.out.println(result);
			ArrayList<Double> resultInc = ds.executeCalculationOfCircle("qwerty");
			
			System.out.println(resultInc);
		} catch (InputExceptionCustom e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
