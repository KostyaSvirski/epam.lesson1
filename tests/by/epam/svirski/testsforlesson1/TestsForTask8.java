package by.epam.svirski.testsforlesson1;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import org.testng.annotations.Test;

import by.epam.svirski.lesson1.services.DirectorService;
import by.epam.svirski.lesson1.utils.InputExceptionCustom;

public class TestsForTask8 {
	
	DirectorService ds = new DirectorService();

	@Test()
	public void testTask8PassedFirstBrunch() {
		try {
			double actual = ds.calculateSystem("4");
			double expected = 5.0;
			assertEquals(actual, expected);
		} catch (InputExceptionCustom e) {
			e.printStackTrace();
		}

	}
	
	@Test()
	public void testTask8PassedSecondBrunch() {
		try {
			double actual = ds.calculateSystem("2");
			double expected = 0.5;
			assertEquals(actual, expected);
		} catch (InputExceptionCustom e) {
			e.printStackTrace();
		}

	}
	
	@Test(expectedExceptionsMessageRegExp = "smth goes wrong")
	public void testTask8FailedEmptyInput() {
		try {
			double actual = ds.calculateSystem("");
			double expected = 0.5;
			assertEquals(actual, expected);
			fail();
		} catch (InputExceptionCustom e) {
			assertEquals("smth goes wrong", e.getMessage());
		}

	}
	
	@Test(expectedExceptionsMessageRegExp = "error in validation")
	public void testTask8FailedIncorrectInput() {
		try {
			double actual = ds.calculateSystem("qwerty");
			double expected = 0.5;
			assertEquals(actual, expected);
			fail();
		} catch (InputExceptionCustom e) {
			assertEquals("error in validation", e.getMessage());
		}

	}

}
