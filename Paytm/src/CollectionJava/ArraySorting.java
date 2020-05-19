package CollectionJava;

public class ArraySorting {

	public static void main(String[] args) {
		int array[] = { 9, 4, 5, 7, 8, 6, 2 };
		quickSort(array, 0, array.length - 1);
		System.out.println("QuickSort");
		showArray(array);

		System.out.println("\nBubbleSort");
		int[] array2 = bubbleSort(array, array.length);
		showArray(array2);
		
		System.out.println("\nInsertionSort");
		int[] array3 = insertionSort(array,array.length);
		showArray(array3);

	}
	
	public static void showArray(int[] arr)
	{
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void quickSort(int[] array, int left, int right) {
		int index = partition(array, left, right);
		if (left < index - 1)
			quickSort(array, left, index - 1);
		if (right > index)
			quickSort(array, index, right);
	}

	public static int partition(int[] array, int left, int right) {

		int pivot = array[(left + right) / 2];
		while (left <= right) {
			while (array[left] < pivot) {
				left++;
			}
			while (array[right] > pivot) {
				right--;
			}
			if (left <= right) {
				int temp;
				temp = array[left];
				array[left] = array[right];
				array[right] = temp;
				left++;
				right--;
			}
		}
		return left;
	}

	public static int[] bubbleSort(int[] array, int n) {
		int flag = 0;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1; j++) {
				if (array[j] < array[j + 1]) {
					int temp;
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
					flag = 1;
				}
			}
			if (flag == 0)
				break;
		}
		return array;
	}

	public static int[] insertionSort (int[] arr, int n)
	{
		for(int i=1;i<n;i++)
		{
			int j= i-1;
			int temp = arr[i];
			while(j>=0 && arr[j]>temp) //(j<=0 && arr[j]<temp)
			{
				arr[j+1]=arr[j]; //arr[j]=arr[j+1];
				j--;             //j++ 
			}
			arr[j+1]=temp;
		}
		return arr;
	}

}
