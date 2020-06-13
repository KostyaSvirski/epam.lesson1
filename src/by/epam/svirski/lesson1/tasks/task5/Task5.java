package by.epam.svirski.lesson1.tasks.task5;

import by.epam.svirski.lesson1.services.DirectorService;
import by.epam.svirski.lesson1.utils.InputExceptionCustom;

public class Task5 {

	public static void main(String[] args) {
		DirectorService ds = new DirectorService();
		try {
			if(ds.executeCheckPerfection("5")) {
				System.out.println(true);
			} else {
				System.out.println(false);
			}
			if(ds.executeCheckPerfection("28")) {
				System.out.println(true);
			} else {
				System.out.println(false);
			}
			if(ds.executeCheckPerfection("qwerty")) {
				System.out.println(true);
			} else {
				System.out.println(false);
			}
		} catch (InputExceptionCustom e) {
			
			e.printStackTrace();
		}

	}

}
