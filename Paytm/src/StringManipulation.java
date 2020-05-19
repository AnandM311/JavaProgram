import java.util.HashMap;
import java.util.Map;

public class StringManipulation {

	public static void main(String[] args) {
		String strName="ANAND MANE";
		
		String strName2="ANAND MANE";
		char[] charArr = strName.toCharArray();
		
		
		//Reverse String using StringBuffer
		StringBuffer sf = new StringBuffer(strName2);
		System.out.println("Reverse String using StringBuffer :- "+sf.reverse());
		
		//Reverse String using for loop
		String revStr="";
		if(strName!=null)
		{
		;
		for(int i=strName.length()-1;i>=0;i--) {
			revStr=revStr+strName.charAt(i);
		}
		System.out.println(revStr);
		if(strName==revStr)
		{
		System.out.println("String is palindrome");	
		}
		else 
		System.out.println("String is not palindrome");	
		}
		else System.out.println("Not vaild string");
		
		//count character in string
		Map<Character, Integer> baseMap = new HashMap<Character,Integer>();
		for(char ch : charArr)
		{
			baseMap.put(ch, baseMap.getOrDefault(ch, 0)+1);
		}
		
		for(Map.Entry<Character, Integer> entryMap : baseMap.entrySet())
		{
			System.out.println(entryMap.getKey()+":"+entryMap.getValue());
		}
		//Reverse number and sum of all digit 
		int number =123456;
		int sum=0, temp,revs=0;
		while(number!=0)
		{
			temp=number%10;
			sum= sum+temp;
			revs=(revs*10)+ number%10;
			number= number/10;
		}
		System.out.println("Sum of all digit is "+sum);
		System.out.println("Reverse number "+revs);
		
		//Reverse number using StringBuffer
		long num=19839;
		System.out.println("Reverse number using StringBuffer "+ new StringBuffer(String.valueOf(num)));
		
		//remove spl char from String using Regular Expression 
		
		String s1 = "1234567@*&(#(&*(@*(!*)(String";
		s1=s1.replaceAll("[^0-9a-zA-Z]", "");
		System.out.println("Regular Expression : "+s1);
		
		
		
		
		
		
		
		

	}

}
