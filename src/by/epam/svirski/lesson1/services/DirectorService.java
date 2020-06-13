package by.epam.svirski.lesson1.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import by.epam.svirski.lesson1.entities.PointEntity;
import by.epam.svirski.lesson1.entities.SquareEntity;
import by.epam.svirski.lesson1.entities.TimeEntity;
import by.epam.svirski.lesson1.utils.CustomException;
import by.epam.svirski.lesson1.utils.InputExceptionCustom;
import by.epam.svirski.lesson1.validators.ValidateInput;

public class DirectorService {

	// first task
	public double executeCalculationLastNumber(String valueStr) {
		try {
			if (ValidateInput.validateIntNumberInput(valueStr)) {
				int valueToCalculate = Integer.valueOf(valueStr);
				return ArithmeticalService.calculateLastNumber(valueToCalculate);
			}
		} catch (CustomException exception) {
			return -1;
		}
		return -1;
	}

	// second task
	public int executeCalculationOfDays(String year, String month) {
		try {
			if (ValidateInput.validateIntNumberInput(year) && ValidateInput.validateIntNumberInput(month)) {
				int yearToCheck = Integer.valueOf(year);
				int monthToCheck = Integer.valueOf(month);
				try {
					if (ValidateInput.validateDate(yearToCheck, monthToCheck)) {
						return TimeService.determiningHowManyDays(yearToCheck, monthToCheck).getDays();
					}
				} catch (CustomException exception) {
					return -1;
				}
			}
		} catch (CustomException exception) {
			return -1;

		}
		return -1;
	}

	// third task
	public Map<Double, Double> executeCalculationRatioArea(String areaOfSquare) {

		try {
			Map<Double, Double> mapResult = new HashMap<Double, Double>();
			if (ValidateInput.validateDoubleNumberInput(areaOfSquare)) {

				SquareEntity squareOut = new SquareEntity();
				squareOut.setArea(Double.valueOf(areaOfSquare));
				SquareEntity squareIn = new SquareEntity();
				squareIn.setArea(ArithmeticalService.calculateAreaOfInternalSquare(squareOut.getArea()));

				double ratio = ArithmeticalService.calculateRatio(squareOut.getArea(), squareIn.getArea());

				mapResult.put(squareIn.getArea(), ratio);
				return mapResult;
			}
		} catch (CustomException exception) {
			return null;
		}
		return null;
	}

	// forth task
	public boolean executeCheckOfEvens(String[] numbersToCheck) throws InputExceptionCustom {
		try {
			if (ValidateInput.validateArray(numbersToCheck)) {
				int[] correctNumbers = new int[numbersToCheck.length];
				for (int i = 0; i < numbersToCheck.length; i++) {
					correctNumbers[i] = Integer.valueOf(numbersToCheck[i]);
				}
				return LogicalCasesService.checkForParity(correctNumbers);
			} else {
				throw new InputExceptionCustom("error in validation");
			}
		} catch (CustomException exception) {
			throw new InputExceptionCustom("smth goes wrong");
		}

	}

	// fifth task
	public boolean executeCheckPerfection(String valueToCheck) throws InputExceptionCustom {
		try {
			if (ValidateInput.validateIntNumberInput(valueToCheck)) {
				int correctValue = Integer.valueOf(valueToCheck);
				return LogicalCasesService.checkForPerfection(correctValue);
			} else {
				throw new InputExceptionCustom("error in validation");
			}
		} catch (CustomException exception) {
			throw new InputExceptionCustom("smth goes wrong");
		}

	}

	// sixth task
	public int[] executeParsingOfTime(String secondsToCheck) throws InputExceptionCustom {
		try {
			if (ValidateInput.validateIntNumberInput(secondsToCheck)) {
				TimeEntity time = new TimeEntity();
				time.setSeconds(Integer.valueOf(secondsToCheck));
				try {
					if (ValidateInput.validateTime(time.getSeconds())) {
						return TimeService.calculateTime(time.getSeconds());
					} else {
						throw new InputExceptionCustom("idk");
					}
				} catch (CustomException exception) {
					throw new InputExceptionCustom("error of validation of date");
				}
			} else {
				throw new InputExceptionCustom("error in validation!");
			}
		} catch (CustomException exception) {
			throw new InputExceptionCustom("smth goes wrong");
		}
	}

	// seventh task
	public boolean defineWhichDotNearly(String coordinateX1, String coordinateY1, String coordinateX2,
			String coordinateY2) throws InputExceptionCustom {
		try {
			if (ValidateInput.validateIntNumberInput(coordinateX1) && ValidateInput.validateIntNumberInput(coordinateY1)
					&& ValidateInput.validateIntNumberInput(coordinateX2)
					&& ValidateInput.validateIntNumberInput(coordinateY2)) {

				PointEntity firstPoint = new PointEntity();
				PointEntity secondPoint = new PointEntity();

				firstPoint.setCoordinateX(Integer.parseInt(coordinateX1));
				firstPoint.setCoordinateY(Integer.parseInt(coordinateY1));
				secondPoint.setCoordinateX(Integer.parseInt(coordinateX2));
				secondPoint.setCoordinateY(Integer.parseInt(coordinateY2));

				if (LogicalCasesService.checkForNearest(firstPoint, secondPoint)) {
					return true;
				} else {
					return false;
				}

			} else {
				throw new InputExceptionCustom("error in validation");
			}
		} catch (CustomException exception) {
			throw new InputExceptionCustom("smth goes wrong");
		}
	}

	// eights task
	public double calculateSystem(String argument) throws InputExceptionCustom {
		try {
			if (ValidateInput.validateDoubleNumberInput(argument)) {
				return ArithmeticalService.resultOfFunction(Double.parseDouble(argument));
			} else {
				throw new InputExceptionCustom("error in validation");
			}
		} catch (CustomException exception) {
			throw new InputExceptionCustom("smth goes wrong");
		}
	}

	// ninth task
	public ArrayList<Double> executeCalculationOfCircle(String radius) throws InputExceptionCustom {
		try {
			if (ValidateInput.validateDoubleNumberInput(radius)) {
				ArrayList<Double> parametres = ArithmeticalService
						.calculateParametresOfCircle(Double.parseDouble(radius));
				return parametres;
			} else {
				throw new InputExceptionCustom("error of validation");
			}
		} catch (CustomException exception) {
			throw new InputExceptionCustom("smth goes wrong");
		}
	}

	// tenth task
	public Map<Double, Double> executeCalculationTan(String startSegment, String finishSegment, String step)
			throws InputExceptionCustom {
		try {
			if (ValidateInput.validateDoubleNumberInput(startSegment)
					&& ValidateInput.validateDoubleNumberInput(finishSegment)
					&& ValidateInput.validateDoubleNumberInput(step)) {
				
				Map<Double, Double> tableOfParamsAndTan = ArithmeticalService.calculateTangent(
						Double.parseDouble(startSegment), Double.parseDouble(finishSegment),
						Double.parseDouble(step));
				
				return tableOfParamsAndTan;
			} else {
				throw new InputExceptionCustom("error in validation");
			}
		} catch (CustomException e) {
			throw new InputExceptionCustom("smth goes wrong");
		}

		
	}

}
