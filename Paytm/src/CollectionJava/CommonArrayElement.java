package CollectionJava;

public class CommonArrayElement {

	public static void main(String[] args) {
		int[] array1 = {10,29,39,28,20};
		int[] array2 = {8,39,29,38,2};
		for(int i=0;i<array1.length;i++)
		{
			for(int j=0;j<array2.length;j++)
		{
			if(array1[i]==array2[j])
			{
				System.out.println(array1[i]+" is common between both array");
			}
		}
			
		}
		
		
		

	}

}
