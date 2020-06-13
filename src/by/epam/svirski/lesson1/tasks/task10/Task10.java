package by.epam.svirski.lesson1.tasks.task10;


import java.util.Map;

import by.epam.svirski.lesson1.services.DirectorService;
import by.epam.svirski.lesson1.utils.InputExceptionCustom;

public class Task10 {

	public static void main(String[] args) {
		DirectorService ds = new DirectorService();
		try {
			Map<Double, Double> mapResult = ds.executeCalculationTan("1", "2", "0.1");
			System.out.println(mapResult);
			
			Map<Double, Double> mapIncResult = ds.executeCalculationTan("", "", "");
			System.out.println(mapIncResult);
		} catch (InputExceptionCustom e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
