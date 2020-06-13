package by.epam.svirski.lesson1.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import by.epam.svirski.lesson1.entities.PointEntity;

public class ArithmeticalService {

	public static final double PI = Math.PI;
	public static final double SQRT_TWO = Math.sqrt(2);

	public static double calculateLastNumber(int value) {
		int lastNumberDefault = value % 10;
		double lastNumberSqr = Math.pow(lastNumberDefault, 2) % 10;
		return lastNumberSqr;
	}

	public static double calculateAreaOfInternalSquare(double areaOfDefaultSquare) {
		double diameter = calculateInternalDiameter(areaOfDefaultSquare);
		double sideOfInternalSquare = calculateSideOfInternalSquare(diameter);
		double areaOfInternalSquare = Math.pow(sideOfInternalSquare, 2);
		return areaOfInternalSquare;
	}

	private static double calculateSideOfInternalSquare(double diameter) {
		double side = diameter / SQRT_TWO;
		return side;
	}

	private static double calculateInternalDiameter(double areaOfDefaultSquare) {
		double diameter = Math.sqrt(areaOfDefaultSquare);
		return diameter;
	}

	public static double calculateRatio(double areaOfDefaultSquare, double areaOfInternalSquare) {
		double ratio = areaOfInternalSquare / areaOfDefaultSquare;
		return ratio;
	}

	public static double calculateDistanceFromZero(PointEntity point) {
		double distance = Math.hypot(point.getCoordinateX(), point.getCoordinateY());
		return distance;
	}

	public static int findSumOfDeviders(int valueToCheck) {
		int sum = 0;
		for (int devider = 2; devider <= Math.sqrt(valueToCheck); devider++) {
			if (valueToCheck % devider == 0) {
				sum += devider + valueToCheck / devider;
			}
		}
		return sum + 1;
	}

	public static double resultOfFunction(double argument) {
		if(LogicalCasesService.checkWhichSolution(argument)) {
			return firstExpression(argument);
		} else {
			return secondExpresion(argument);
		}
	}

	private static double firstExpression(double argument) {
		double result = -Math.pow(argument, 2) + 3 * argument + 9;
		return result;
	}

	private static double secondExpresion(double argument) {
		double result = 1. / (Math.pow(argument, 3) - 6);
		return result;
	}

	public static ArrayList<Double> calculateParametresOfCircle(double radius) {
		ArrayList<Double> parametres = new ArrayList<Double>();

		double circumference = calculateCircumference(radius);
		double area = calculateArea(radius);

		parametres.add(circumference);
		parametres.add(area);

		return parametres;
	}

	private static double calculateArea(double radius) {
		double areaOfCircle = PI * Math.pow(radius, 2);
		return areaOfCircle;
	}

	private static double calculateCircumference(double radius) {
		double circumference = 2 * radius * PI;
		return circumference;
	}

	public static Map<Double, Double> calculateTangent(double startOfSegment, double finishOfSegment, double step) {
		Map<Double, Double> valuesOfTangent = new HashMap<Double, Double>();
		for (double argument = startOfSegment; argument <= finishOfSegment; argument += step) {
			valuesOfTangent.put(argument, Math.tan(argument));
		}
		return valuesOfTangent;
	}

}
