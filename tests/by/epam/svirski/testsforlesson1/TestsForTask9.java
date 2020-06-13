package by.epam.svirski.testsforlesson1;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.fail;

import java.util.ArrayList;

import org.testng.annotations.Test;

import by.epam.svirski.lesson1.services.DirectorService;
import by.epam.svirski.lesson1.utils.InputExceptionCustom;

public class TestsForTask9 {
	
	DirectorService ds = new DirectorService();

	@Test()
	public void testTask9PassedTrue() {
		try {
			ArrayList<Double> actual = ds.executeCalculationOfCircle("5");
			ArrayList<Double> expected = new ArrayList<Double>();
			expected.add(31.42);
			expected.add(78.54);
			
			double expectedResult = expected.get(0) - expected.get(1);
			double actualResult = actual.get(0) - actual.get(1);
			
			assertEquals(actualResult, expectedResult, 0.01);
			
		} catch (InputExceptionCustom e) {
			e.printStackTrace();
		}

	}
	
	@Test()
	public void testTask9PassedFalse() {
		try {
			ArrayList<Double> actual = ds.executeCalculationOfCircle("8");
			ArrayList<Double> expected = new ArrayList<Double>();
			expected.add(31.42);
			expected.add(78.54);
			
			double expectedResult = expected.get(0) - expected.get(1);
			double actualResult = actual.get(0) - actual.get(1);
			
			assertNotEquals(actualResult, expectedResult, 0.01);
			
		} catch (InputExceptionCustom e) {
			e.printStackTrace();
		}

	}
	
	@Test(expectedExceptionsMessageRegExp = "error of validation")
	public void testTask9FailedIncorrectInput() {
		try {
			ArrayList<Double> actual = ds.executeCalculationOfCircle("qwerty");
			ArrayList<Double> expected = new ArrayList<Double>();
			expected.add(31.42);
			expected.add(78.54);
			
			double expectedResult = expected.get(0) - expected.get(1);
			double actualResult = actual.get(0) - actual.get(1);
			
			assertEquals(actualResult, expectedResult, 0.01);
			
			fail();
		} catch (InputExceptionCustom e) {
			assertEquals("error of validation", e.getMessage());
		}

	}
	
	@Test(expectedExceptionsMessageRegExp = "smth goes wrong")
	public void testTask9FailedEmptyInput() {
		try {
			ArrayList<Double> actual = ds.executeCalculationOfCircle("");
			ArrayList<Double> expected = new ArrayList<Double>();
			expected.add(31.42);
			expected.add(78.54);
			
			double expectedResult = expected.get(0) - expected.get(1);
			double actualResult = actual.get(0) - actual.get(1);
			
			assertEquals(actualResult, expectedResult, 0.01);
			
			fail();
		} catch (InputExceptionCustom e) {
			assertEquals("smth goes wrong", e.getMessage());
		}

	}
}
