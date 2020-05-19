
public class SmallestAndLargestNumber {

	public static void main(String[] args) {
		int[] num = {-10,9,-3,292,83,98989};
		int smallest=num[0];
		int largest= num[0];
		for(int i=1;i<num.length;i++)
		{
			if(num[i]>largest)
			{
				largest=num[i];
			}
			else if(num[i]<smallest)
			{
				smallest=num[i];
			}
		}
		
		System.out.println("Smallest number is "+smallest);
		System.out.println("Largest number is "+largest);

		String a = "ANAND";
		String b = "MANE";
		
	System.out.println("Before Swap A is "+a+" and B is "+b);
	
		
		a=a+b;
		b=a.substring(0, a.length()-b.length());
		a=a.substring(b.length());
	
		
		System.out.println("After Swap A is "+a+" and B is "+b);
				
	}

}
