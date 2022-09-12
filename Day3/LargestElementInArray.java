package Day3;

public class LargestElementInArray {

	public static void main(String[] args) {
		int arr[] = { 10, 50, 300, 9, 700 };
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}

		System.out.println("Largest Element In Array Is : " + max);
	}

}
