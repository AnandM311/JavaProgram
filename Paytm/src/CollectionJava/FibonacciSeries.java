package CollectionJava;

public class FibonacciSeries {

	public static void main(String[] args) {
		fibonacci(10, 0, 1);
		fibonacciUpto(150,10,11);

	}
	public static void fibonacci(int num, int num1, int num2) {
		int sum = 0; 
		for (int i = 1; i <= num; ++i) {
			System.out.print(num1 + " "); 
			sum = num1 + num2; 
			num1 = num2; 
			num2 = sum;
		}

	}
	
	public static void fibonacciUpto(int num, int num1, int num2)
	{
		int sum=0;
		System.out.println("\nUsing while loop");
		sum = num1+num2;
		System.out.print(num1+" "+num2+" ");
		while(sum<=num)
		{
			System.out.print(sum+" ");
			num1=num2;
			num2=sum;
			//System.out.print(num1+" "+num2);
			sum=num1+num2;
		}
	}
}
