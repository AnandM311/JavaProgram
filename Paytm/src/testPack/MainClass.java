package testPack;

import java.util.HashMap;
import java.util.Map;

public class MainClass {
	public static void main(String[] args) {
		HashMap<Student, Integer> studentMap = new HashMap<Student, Integer>();
		studentMap.put(new Student(1, "Anand", 53), 1);
		studentMap.put(new Student(2, "Amit", 60), 2);
		Student student = new Student(1, "Aman", 80);

		for (Map.Entry<Student, Integer> entry : studentMap.entrySet()) {
			System.out.println(entry.getValue() + ":" + entry.getKey());
		}

		int base = 8;
		int expoent = 3;
		int result = 1;
		for (int i = expoent; i != 0; i--) {
			result = result * base;
		}

		System.out.println(result);

		int i = 1;
		int sum = 0;
		for (i = 1; i < 2000; i++) {
			sum = 0;
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					sum = sum + j;
				}
			}
			if (sum == i)
				System.out.println(i + " is perfect number");
		}
		

	}

}
