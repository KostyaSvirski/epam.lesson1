package by.epam.svirski.lesson1.services;

import by.epam.svirski.lesson1.utils.Monthes;

public class TimeService {
	
	public static final int NUMBER_FEBRUARY = 2;
	public static final int FIRST_SIGN_OF_LEAP = 400;
	public static final int SIGN_OF_NOT_LEAP = 100;
	public static final int SECOND_SIGN_OF_LEAP = 4;

	public static int[] calculateTime(int timeInSeconds) {
		int[] time = new int[3];

		int hours = timeInSeconds / 3600;
		time[0] = hours;

		int minutes = timeInSeconds % 3600 / 60;
		time[1] = minutes;

		int seconds = timeInSeconds % 3600 % 60;
		time[2] = seconds;

		return time;
	}
	
	public static Monthes determiningHowManyDays(int year, int month) {
		if(confirmThatLeap(year) && month == NUMBER_FEBRUARY) {
			return Monthes.FEBRUARY_LEAP;
		} else {
			Monthes[] monthesArray = Monthes.values();
			return monthesArray[month];
		}

	}
	
	private static boolean confirmThatLeap(int year) {
		if (year % FIRST_SIGN_OF_LEAP == 0) {
			return true;
		} else if (year % SIGN_OF_NOT_LEAP == 0) {
			return false;
		} else if (year % SECOND_SIGN_OF_LEAP == 0) {
			return true;
		}
		return false;
	}
	
}
