package CollectionJava;

public class ZeroAnaOne {

	public static void main(String[] args) {
		int arr[] = {0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 0};
		int i=0;
		int j = arr.length-1;
		int temp;
		System.out.println("Before sorting");
		for(int k= 0;k<arr.length;k++)
		{
			System.out.print(arr[k]+" ");
		}
		while(i<j)
		{
			if( arr[i]==1 && arr[j]==0)
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
			}
			else
			if (arr[i]==0){
			i++;
			}
			else if(arr[j]==1)
			{
				j--;
			}
		}
		
		System.out.println("\nAfter sorting");
		for(int k= 0;k<arr.length;k++)
		{
			System.out.print(arr[k]+" ");
		}

	}

}
