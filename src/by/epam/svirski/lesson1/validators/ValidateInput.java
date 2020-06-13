package by.epam.svirski.lesson1.validators;

import by.epam.svirski.lesson1.utils.CustomException;

public class ValidateInput {

	public static final int QUANTITY_OF_SECONDS_PER_DAY = 86400;
	public static final int QUANTITY_OF_MONTHES_MAX = 12;
	public static final int QUANTITY_OF_MONTHES_MIN = 1;

	public static boolean validateIntNumberInput(String value) throws CustomException {
		if (value.isEmpty()) {
			throw new CustomException("value is empty!");
		} else {
			try {
				int valueCorrect = Integer.valueOf(value);
			} catch (NumberFormatException exception) {
				return false;
			}
		}
		return true;
	}

	public static boolean validateDoubleNumberInput(String value) throws CustomException {
		if (value.isEmpty()) {
			throw new CustomException("value is empty!");
		} else {
			try {
				double valueCorrect = Double.valueOf(value);
			} catch (NumberFormatException e) {
				return false;
			}
		}
		return true;
	}

	public static boolean validateArray(String[] values) throws CustomException {
		if (values.length == 0) {
			throw new CustomException("empty array!");
		} else {
			try {
				for (int i = 0; i < values.length; i++) {
					int checkableValue = Integer.valueOf(values[i]);
				}
			} catch (NumberFormatException exception) {
				return false;
			}
		}

		return true;
	}

	public static boolean validateDate(Integer year, Integer month) throws CustomException {
		if (year >= 0 && month >= QUANTITY_OF_MONTHES_MIN && month <= QUANTITY_OF_MONTHES_MAX) {
			return true;
		} else {
			throw new CustomException("incorrect input of date!");
		}
	}

	public static boolean validateTime(Integer seconds) throws CustomException {
		if (seconds <= QUANTITY_OF_SECONDS_PER_DAY && seconds >= 0) {
			return true;
		} else {
			throw new CustomException("incorrect input of seconds!");
		}
	}

}
