package CollectionJava;

import java.util.HashMap;

public class HashCodeAndEqualsInHashMap {

	public static void main(String[] args) {
		HashMap<Student, Integer> stuHashMap = new HashMap<Student, Integer>();
		Student s1 = new Student("Anand", 1);
		stuHashMap.put(s1, 1);
		stuHashMap.put(new Student("Amit", 2), 2);
		stuHashMap.put(new Student("Karan", 3),3);
		Student s4 = new Student("Kiran", 3);

		stuHashMap.put(s4, 3);

//		int stu1 = s1.hashCode();
//		int stu3 = s3.hashCode();
//		int stu4 = s4.hashCode();


		System.out.println(stuHashMap);
		
		System.out.println("Map size :- "+stuHashMap.size());

	}

}
