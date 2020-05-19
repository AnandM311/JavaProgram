package testPack;

public class nthOccOfString {

	public static void main(String[] args) {
		String str = "ANAND MANE";
		int tempIndex = -1;
		int finalIndex = 0;
		for (int i = 0; i < 3; i++) {
			tempIndex = str.indexOf('A');
			if (tempIndex == -1) {
				finalIndex = 0;
				break;
			}

			str = str.substring(++tempIndex);
			finalIndex = finalIndex + tempIndex;
		}
		System.out.println("n-th occ of given char " + finalIndex);

		int array[] = { 9, 4, 5, 7, 8, 6, 2 };
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length-1; j++) {
				if (array[j] < array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		System.out.println(array[0]);
		System.out.println(array[1]);
	}

}
