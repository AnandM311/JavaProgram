package testPack;

import java.util.Arrays;

public class ClockWise {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80 };
		int count = 2;

		int temp;
		while (count > 0) {
			temp = arr[arr.length - 1];
			for (int i = arr.length - 1; i >= 1; i--) {
				arr[i] = arr[i - 1];
			}
			arr[0] = temp;
			count--;
		}

		System.out.println(Arrays.toString(arr));

		int arr2[] = { 10, 20, 30, 40, 50, 60, 70, 80 };
		int count1 = 3;
		while (count1 > 0) {
			temp = arr2[0];
			for (int i = 0; i <= arr2.length - 2; i++) {
				arr2[i] = arr2[i + 1];
			}
			arr2[arr2.length - 1] = temp;
			count1--;
		}
		System.out.println(Arrays.toString(arr2));

		int num = 5;
		boolean isprime = false;

		for (int i = 2; i < Math.sqrt(num); i++) {
			if (num % i == 0) {
				isprime = false;
			}
			isprime = true;
		}
		if (!isprime) {
			System.out.println("Not Is Prime");
		} else
			System.out.println("Is Prime");

	}

}
