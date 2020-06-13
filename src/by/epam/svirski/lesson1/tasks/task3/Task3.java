package by.epam.svirski.lesson1.tasks.task3;

import java.util.Map;

import by.epam.svirski.lesson1.services.DirectorService;

public class Task3 {

	public static void main(String[] args) {
		DirectorService ds = new DirectorService();

		Map<Double, Double> correctMap = ds.executeCalculationRatioArea("25.0");
		Map<Double, Double> incorrectMapWithoutData = ds.executeCalculationRatioArea("");
		Map<Double, Double> incorrectMapIncorrectInput = ds.executeCalculationRatioArea("qqq");

		System.out.println(correctMap + " not data: " + incorrectMapWithoutData + " incorrect input: "
				+ incorrectMapIncorrectInput);

	}

}
