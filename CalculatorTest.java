import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest{

	@Test
	public void testThatCalculatorCanAddTwoPositiveNumbers() { 
		int sum = Calculator.add(2,2);
		int expectedSum = 4;
		assertEquals(expectedSum, sum);
	}

	@Test 
	public void testThatCalculatorCanSubtractTwoPositiveNumbers() {
		int subtract = Calculator.diff(2,4);
		int expectedSubtract = 2;
		//assertion
		assertEquals(expectedSubtract, subtract);
	}
	
	@Test
	public void testThatCalculatorCanAddTwoNegativeNumbers() { 
		int sumDigit = Calculator.add(-2, -2);
		int expectedSumDigit = -4;
		assertEquals(expectedSumDigit, sumDigit);
	}

	@Test 
	public void testThatCalculatorCanSumMultiplyNumbers() {
		int sumMultiply = Calculator.multipleSum(3,5);
		int expectedSumMultiply = 15;
		assertEquals(expectedSumMultiply, sumMultiply);
	}
		

}

