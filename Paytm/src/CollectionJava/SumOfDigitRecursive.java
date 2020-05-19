package CollectionJava;

public class SumOfDigitRecursive {

	public static int sumOfDigit(int num) {
		if (num == 0) {
			return 0;
		}
		
		return (num % 10 + sumOfDigit(num / 10));
	}

	public static void main(String[] args) {

		int num = 1234;
		int sum = sumOfDigit(num);
		System.out.println("Sum of all digit is " + sum);

	}

}
