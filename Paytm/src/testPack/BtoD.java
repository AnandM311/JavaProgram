package testPack;

public class BtoD {

	public static void main(String[] args) {
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
		
		String str="1920";
		int sum=0;
		int zAc= (int) '0'; //49
		for(int i=0;i<str.length();i++)
		{
			int temp1 = (int) str.charAt(i);
			sum= sum*10 + (temp1-zAc);
		}
		System.out.println(sum);
		
		String[] str1="Anand Mane".split(" ");
		String str2="";
		for(int i=str1.length-1;i>=0;i--)
		{
			str2=str2+str1[i]+" ";
		}
		
		System.out.println(str2);

	}

}
