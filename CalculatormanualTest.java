public class CalculatorTest{

	public void testThatCalculatorCanAddTwoPositiveNumbers() { 
		int sum = Calculator.add(2,2);
		int expectedSum = 4;
		//assertion 
		if(sum!=expectedSum){
			System.err.printf("Test failed\nExpected: %\n Actual:", expectedSum, sum);
		}
		else { 
			System.out.println("Test passed, yay :)");


	}
}

	public static void main(String[] args) {
	CalculatorTest calculatorTest = new CalculatorTest();

	CalculatorTest.testThatCalculatorCanAddTwoPositiveNumbers();
	}
}
