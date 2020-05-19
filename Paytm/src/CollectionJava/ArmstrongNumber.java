package CollectionJava;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int num = 15;
		int exponent = String.valueOf(num).length();
		int atucalNum = num;

		System.out.println(exponent);
		System.out.println("Num :- " + num);
		double result = 0;
		while (atucalNum != 0) {
			double temp = atucalNum % 10;
			result = (double) result + Math.pow(temp, exponent);
			atucalNum = atucalNum / 10;
		}

		System.out.println("result :- " + result);

		if (num == result) {
			System.out.println("num is armstrong");
		} else
			System.out.println("num is not armstrong");

	}
}
