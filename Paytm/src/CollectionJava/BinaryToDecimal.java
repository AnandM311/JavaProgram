package CollectionJava;

public class BinaryToDecimal {

	public static void main(String[] args) {
		int num =101011;
		int temp=num;
		int decVal=0;
	int base =1;
		while(temp>0)
		{
			int last_digit = temp%10;
			temp=temp/10;
			decVal= decVal + last_digit*base;
			base=base*2;	
		}
		
		System.out.println("Decimale :"+decVal);
		
		System.out.println("Given num is binary "+isBinary(101101));
		System.out.println("Given num is binary "+isBinary(1011020));

	}
	
	
	public static boolean isBinary(int num)
	{
		int temp = num;
		while(temp>0)
		{
			if(temp%10 > 1)
			{
			return false;
			}
			temp= temp/10;
		}
		return true;
	}

	
	/*
	    int num = 10101;
		int temp = num;
		int dVal = 0;
		int base = 1;

		while (temp > 0) {
			int lastD = temp % 10;
			temp = temp / 10;
			if (lastD > 1) {
				dVal = 0;
				break;
			} else {
				dVal = dVal + lastD * base;
				base = base * 2;
			}

		}

		System.out.println(dVal);
*/
}
