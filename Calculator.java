public class Calculator {

	public static int add(int firstNumber, int secondNumber) {
		int sum = firstNumber + secondNumber;
	return sum;
	}

	public static int diff(int firstNumber, int secondNumber) {
		int subtract = secondNumber - firstNumber;
	return subtract;
	}

	public static int negativeSum(int firstNumber, int secondNumber) {
		int addNegative = firstNumber + secondNumber;
	return addNegative;
	}

	public static int multipleSum(int firstNumber, int secondNumber) {
		int total = 0;
		for(int i = 0; i < secondNumber; i++) {
			total += firstNumber;
		}
	return total;
	}
	

}