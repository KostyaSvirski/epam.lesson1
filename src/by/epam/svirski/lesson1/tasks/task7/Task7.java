package by.epam.svirski.lesson1.tasks.task7;

import by.epam.svirski.lesson1.services.DirectorService;
import by.epam.svirski.lesson1.utils.InputExceptionCustom;

public class Task7 {

	public static void main(String[] args) {
		DirectorService ds = new DirectorService();
		try {
			if (ds.defineWhichDotNearly("1", "1", "2", "2")) {
				System.out.println("first");
			} else {
				System.out.println("second");
			}
			if (ds.defineWhichDotNearly("1", "100", "2", "2")) {
				System.out.println("first");
			} else {
				System.out.println("second");
			}

			if (ds.defineWhichDotNearly("1", "1", "2", "")) {
				System.out.println("first");
			} else {
				System.out.println("second");
			}

		} catch (InputExceptionCustom e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
