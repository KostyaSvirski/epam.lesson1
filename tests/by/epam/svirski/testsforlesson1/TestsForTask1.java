package by.epam.svirski.testsforlesson1;

import static org.testng.Assert.*;
import org.testng.annotations.*;
import by.epam.svirski.lesson1.services.DirectorService;

public class TestsForTask1 {
	
	DirectorService ds = new DirectorService();
	
	@Test()
	public void testTask1True() {
	    double actual = ds.executeCalculationLastNumber("123");
	    double expected = 9.;
	    assertEquals(actual, expected, 0.001, " Test failed");
	  }
	
	@Test()
	public void testTask1False() {
		double actual = ds.executeCalculationLastNumber("123");
		double expected = 3.;
		assertNotEquals(actual, expected, 0.001, " Test failed");
	}
	
	@Test()
	public void testTask1EmptyInput() {
		double actual = ds.executeCalculationLastNumber("");
		double expected = -1.;
		assertEquals(actual, expected, 0.001, " Test failed");
	}
	
	@Test()
	public void testTask1IncorrectInput() {
		double actual = ds.executeCalculationLastNumber("qwerty");
		double expected = -1.;
		assertEquals(actual, expected, 0.001, " Test failed");
	}
	
	
	
}
