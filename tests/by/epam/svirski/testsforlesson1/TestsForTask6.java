package by.epam.svirski.testsforlesson1;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.fail;

import org.testng.annotations.Test;

import by.epam.svirski.lesson1.services.DirectorService;
import by.epam.svirski.lesson1.utils.InputExceptionCustom;

public class TestsForTask6 {

	DirectorService ds = new DirectorService();

	@Test()
	public void testTask6PassedTrue() {
		try {
			int[] actual = ds.executeParsingOfTime("25000");
			int[] expected = {6, 56, 40};
			assertEquals(actual, expected);
		} catch (InputExceptionCustom e) {
			e.printStackTrace();
		}

	}
	
	@Test()
	public void testTask6PassedFalse() {
		try {
			int[] actual = ds.executeParsingOfTime("10000");
			int[] expected = {6, 56, 40};
			assertNotEquals(actual, expected);
		} catch (InputExceptionCustom e) {
			e.printStackTrace();
		}

	}
	
	@Test(expectedExceptionsMessageRegExp = "smth goes wrong")
	public void testTask6FailedEmptyInput() {
		try {
			int[] actual = ds.executeParsingOfTime("");
			int[] expected = {6, 56, 40};
			assertEquals(actual, expected);
			fail();
		} catch (InputExceptionCustom e) {
			assertEquals("smth goes wrong", e.getMessage());
		}

	}
	
	@Test(expectedExceptionsMessageRegExp = "error in validation!")
	public void testTask6FailedIncorrectInput() {
		try {
			int[] actual = ds.executeParsingOfTime("qwerty");
			int[] expected = {6, 56, 40};
			assertEquals(actual, expected);
			fail();
		} catch (InputExceptionCustom e) {
			assertEquals("error in validation!", e.getMessage());
		}

	}
	
	@Test(expectedExceptionsMessageRegExp = "error of validation of date")
	public void testTask6FailedNegativeInput() {
		try {
			int[] actual = ds.executeParsingOfTime("-1");
			int[] expected = {6, 56, 40};
			assertEquals(actual, expected);
			fail();
		} catch (InputExceptionCustom e) {
			assertEquals("error of validation of date", e.getMessage());
		}

	}
	
	
	
	

}
