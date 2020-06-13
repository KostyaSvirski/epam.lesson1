package by.epam.svirski.lesson1.tasks.task2;

import by.epam.svirski.lesson1.services.DirectorService;

public class Task2 {

	public static void main(String[] args) {
		DirectorService ds = new DirectorService();
		int days1 = ds.executeCalculationOfDays("2020", "2");
		int daysWithoutData = ds.executeCalculationOfDays("2020", "");
		int daysIncorrectInput = ds.executeCalculationOfDays("2020", "qqq");
		System.out.println(days1 + " " + daysIncorrectInput + " " + daysWithoutData + " correct days: 29");

	}

}
