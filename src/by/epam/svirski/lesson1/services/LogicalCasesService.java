package by.epam.svirski.lesson1.services;

import by.epam.svirski.lesson1.entities.PointEntity;

public class LogicalCasesService {

	public static boolean checkForParity(int[] arrayOfNumberData) {
		int counterOfEvens = 0;
		for (int numberToCheck : arrayOfNumberData) {
			if (numberToCheck % 2 == 0) {
				counterOfEvens++;
			}
			if (counterOfEvens == 2) {
				return true;
			}
		}
		return false;
	}

	public static boolean checkForPerfection(int valueToCheck) {
		int sumOfDeviders = ArithmeticalService.findSumOfDeviders(valueToCheck);
		return (sumOfDeviders == valueToCheck) ? true : false;
	}

	public static boolean checkForNearest(PointEntity firstPoint, PointEntity secondPoint) {
		return (ArithmeticalService.calculateDistanceFromZero(firstPoint) > ArithmeticalService
				.calculateDistanceFromZero(secondPoint)) ? true : false;
	}

	public static boolean checkWhichSolution(double argument) {
		return (argument >= 3) ? true : false;
	}
}
