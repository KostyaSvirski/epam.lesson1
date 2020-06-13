package by.epam.svirski.testsforlesson1;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

import org.testng.annotations.Test;

import by.epam.svirski.lesson1.services.DirectorService;
import by.epam.svirski.lesson1.utils.InputExceptionCustom;

public class TestsForTask5 {

	DirectorService ds = new DirectorService();

	@Test()
	public void testTask5PassedFalse() {
		try {
			boolean actual = ds.executeCheckPerfection("4");
			assertFalse(actual);
		} catch (InputExceptionCustom e) {
			e.printStackTrace();
		}

	}
	
	@Test()
	public void testTask5PassedTrue() {
		try {
			boolean actual = ds.executeCheckPerfection("28");
			assertTrue(actual);
		} catch (InputExceptionCustom e) {
			e.printStackTrace();
		}

	}
	
	@Test(expectedExceptionsMessageRegExp = "smth goes wrong")
	public void testTask5FailedEmptyInput() {
		try {
			boolean actual = ds.executeCheckPerfection("");
			assertFalse(actual);
			fail();
		} catch (InputExceptionCustom e) {
			assertEquals("smth goes wrong", e.getMessage());
		}
	}
	
	@Test(expectedExceptionsMessageRegExp = "error in validation")
	public void testTask5FailedIncorrectInput() {
		try {
			boolean actual = ds.executeCheckPerfection("qwerty");
			assertFalse(actual);
			fail();
		} catch (InputExceptionCustom e) {
			assertEquals("error in validation", e.getMessage());
		}
	}

}
