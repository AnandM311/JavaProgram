package CollectionJava;

public class PowerConecpt {
public static void main(String[] args)
{
	int base = 8;
	int exponent = 3;
	long result =1;
	for(int i=exponent;i!=0;i--)
	{
		System.out.println(result + " ");
		result*=base;
	}
	
	System.out.println("Result "+result);
	primeNum(12);
	primeNum(9);
}

public static void primeNum(int num)
{
	
	boolean flag = false;
	for(int i=2;i<=num/2;i++)
	{
		if(num%i==0)
		{
			flag = true;
			break;
		}
	}
	if(flag==true)
	{
		System.out.println(num+" is not prime");
	}
	else System.out.println(num+" is prime");
	
}
}
