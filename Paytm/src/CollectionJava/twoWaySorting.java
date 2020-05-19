package CollectionJava;

import java.util.Arrays;

public class twoWaySorting {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 2, 7, 5, 4 };

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				arr[i] = arr[i] * -1;
			}
		}

		Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0)
				arr[i] = arr[i] * -1;
		}

		System.out.println(Arrays.toString(arr));

	}
}
