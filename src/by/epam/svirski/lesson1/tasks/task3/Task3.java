package by.epam.svirski.lesson1.tasks.task3;

import java.util.ArrayList;


import by.epam.svirski.lesson1.services.DirectorService;

public class Task3 {

	public static void main(String[] args) {
		DirectorService ds = new DirectorService();

		ArrayList<Double> result = ds.executeCalculationRatioArea("25.0");
		ArrayList<Double> incorrectMapWithoutData = ds.executeCalculationRatioArea("");
		ArrayList<Double> incorrectMapIncorrectInput = ds.executeCalculationRatioArea("qqq");

		System.out.println(result + " not data: " + incorrectMapWithoutData + " incorrect input: "
				+ incorrectMapIncorrectInput);

	}

}
