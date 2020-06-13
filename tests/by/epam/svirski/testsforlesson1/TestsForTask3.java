package by.epam.svirski.testsforlesson1;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import java.util.ArrayList;



import org.testng.annotations.Test;

import by.epam.svirski.lesson1.services.DirectorService;

public class TestsForTask3 {
	
	DirectorService ds = new DirectorService();

	@Test()
	public void testTask3Passed() {
		ArrayList<Double> actualResult = ds.executeCalculationRatioArea("25.0");
		ArrayList<Double> expectedResult = new ArrayList<Double>();
		
		expectedResult.add(12.5);
		expectedResult.add(0.5);
		
		double actual = actualResult.get(0) - actualResult.get(1);
		double expected = 12;
			
		assertEquals(actual, expected, 0.01, " Test failed");
	}
	
	@Test()
	public void testTask3Fail() {
		ArrayList<Double> actualResult = ds.executeCalculationRatioArea("12.0");
		ArrayList<Double> expectedResult = new ArrayList<Double>();
		
		expectedResult.add(12.5);
		expectedResult.add(0.5);
		
		double actual = actualResult.get(0) - actualResult.get(1);
		double expected = 12;
			
		assertNotEquals(actual, expected, 0.01, " Test failed");
	}
	

	@Test()
	public void testTask3IncorrectInput() {
		ArrayList<Double> actualResult = ds.executeCalculationRatioArea("qwerty");
		ArrayList<Double> expectedResult = new ArrayList<Double>();
		
		expectedResult.add(12.5);
		expectedResult.add(0.5);
		
		double actual = actualResult.get(0) - actualResult.get(1);
		double expected = 12;
			
		assertNotEquals(actual, expected, 0.01, " Test failed");
	}
	
	@Test()
	public void testTask3EmptyInput() {
		ArrayList<Double> actualResult = ds.executeCalculationRatioArea("");
		ArrayList<Double> expectedResult = new ArrayList<Double>();
		
		expectedResult.add(12.5);
		expectedResult.add(0.5);
		
		double actual = actualResult.get(0) - actualResult.get(1);
		double expected = 12;
			
		assertNotEquals(actual, expected, 0.01, " Test failed");
	}
	
	
	
}
