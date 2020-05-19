package CollectionJava;

public class StringToInt {

	public static void main(String[] args) {
		String str = "1920";
		int sum = 0;
		char[] charArr = str.toCharArray();
		int zeroAscii = (int)'0';
		for(int i=0;i<charArr.length;i++)
		{
			int temp = (int) charArr [i];
			sum = sum*10 + (temp-zeroAscii);
		}
		
		System.out.println(sum);
	}

}
