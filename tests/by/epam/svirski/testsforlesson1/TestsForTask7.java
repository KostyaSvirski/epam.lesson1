package by.epam.svirski.testsforlesson1;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

import org.testng.annotations.Test;

import by.epam.svirski.lesson1.services.DirectorService;
import by.epam.svirski.lesson1.utils.InputExceptionCustom;

public class TestsForTask7 {

	DirectorService ds = new DirectorService();

	@Test()
	public void testTask7PassedTrue() {
		try {
			boolean actual = ds.defineWhichDotNearly("1", "1", "2", "2");
			assertTrue(actual);
		} catch (InputExceptionCustom e) {
			e.printStackTrace();
		}

	}
	
	@Test()
	public void testTask7PassedFalse() {
		try {
			boolean actual = ds.defineWhichDotNearly("10", "10", "2", "2");
			assertFalse(actual);
		} catch (InputExceptionCustom e) {
			e.printStackTrace();
		}

	}
	
	@Test(expectedExceptionsMessageRegExp = "smth goes wrong")
	public void testTask7FailedEmptyInput() {
		try {
			boolean actual = ds.defineWhichDotNearly("", "", "", "2");
			assertTrue(actual);
			fail();
		} catch (InputExceptionCustom e) {
			assertEquals("smth goes wrong", e.getMessage());
		}
	}
	
	@Test(expectedExceptionsMessageRegExp = "error in validation")
	public void testTask7FailedIncorrectInput() {
		try {
			boolean actual = ds.defineWhichDotNearly("qwert", "qwe", "qwerty", "2");
			assertTrue(actual);
			fail();
		} catch (InputExceptionCustom e) {
			assertEquals("error in validation", e.getMessage());
		}
	}
	
}
