package by.epam.svirski.lesson1.tasks.task6;

import by.epam.svirski.lesson1.services.DirectorService;
import by.epam.svirski.lesson1.utils.InputExceptionCustom;

public class Task6 {

	public static void main(String[] args) {

		DirectorService ds = new DirectorService();
		try {
			int[] timeCorrect = ds.executeParsingOfTime("25000");

			//int[] timeOutOfBounds = ds.executeParsingOfTime("-1");
			//int[] timeIncorrect = ds.executeParsingOfTime("");

			for (int i = 0; i < timeCorrect.length; i++) {
				System.out.print(timeCorrect[i] + "\t");
			}
		} catch (InputExceptionCustom e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
