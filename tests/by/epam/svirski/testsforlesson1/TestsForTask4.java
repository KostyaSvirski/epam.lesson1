package by.epam.svirski.testsforlesson1;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

import org.testng.annotations.Test;

import by.epam.svirski.lesson1.services.DirectorService;
import by.epam.svirski.lesson1.utils.InputExceptionCustom;

public class TestsForTask4 {

	DirectorService ds = new DirectorService();

	@Test()
	public void testTask4PassedTrue() {
		String[] input = { "1", "2", "3", "4" };
		boolean actual;
		try {
			actual = ds.executeCheckOfEvens(input);
			assertTrue(actual, " Test failed");
		} catch (InputExceptionCustom e) {
			e.getMessage();
			fail();
		}
	}

	@Test()
	public void testTask4PassedFalse() {
		String[] input = { "1", "1", "3", "4" };
		boolean actual;
		try {
			actual = ds.executeCheckOfEvens(input);
			assertFalse(actual, " Test failed");
		} catch (InputExceptionCustom e) {
			e.getMessage();
			fail();
		}
	}

	@Test(expectedExceptionsMessageRegExp = "error in validation")
	public void testTask4FailedEmptyInput() {
		String[] input = { "", "1", "3", "4" };
		boolean actual;
		try {
			actual = ds.executeCheckOfEvens(input);
			fail("test should throw exception");
			assertTrue(actual);
		} catch (InputExceptionCustom e) {
			assertEquals(e.getMessage(), "error in validation");
		}
	}
	

}
