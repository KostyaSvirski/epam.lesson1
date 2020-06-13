package by.epam.svirski.testsforlesson1;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import org.testng.annotations.Test;

import by.epam.svirski.lesson1.services.DirectorService;

public class TestsForTask2 {

	DirectorService ds = new DirectorService();

	@Test()
	public void testTask2TrueLeapFirst() {
		double actual = ds.executeCalculationOfDays("2000", "2");
		double expected = 29;
		assertEquals(actual, expected, 0.001, " Test failed");
	}
	
	@Test()
	public void testTask2TrueLeapSecond() {
		double actual = ds.executeCalculationOfDays("1000", "2");
		double expected = 29;
		assertNotEquals(actual, expected, 0.001, " Test failed");
	}
	
	@Test()
	public void testTask2TrueLeapThird() {
		double actual = ds.executeCalculationOfDays("2004", "2");
		double expected = 29;
		assertEquals(actual, expected, 0.001, " Test failed");
	}
	
	@Test()
	public void testTask2False() {
		double actual = ds.executeCalculationOfDays("2019", "2");
		double expected = 29;
		assertNotEquals(actual, expected, 0.001, " Test failed");
	}
	
	
	@Test()
	public void testTask1EmptyInput() {
		double actual = ds.executeCalculationOfDays("", "2");
		double expected = -1;
		assertEquals(actual, expected, 0.001, " Test failed");
	}

	@Test()
	public void testTask1IncorrectInput() {
		double actual = ds.executeCalculationOfDays("qwerty", "2");
		double expected = -1;
		assertEquals(actual, expected, 0.001, " Test failed");
	}

}
