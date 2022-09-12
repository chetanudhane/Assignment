package Day3;

public class SmallestElementInArray {

	public static void main(String[] args) {
		int arr[] = { 10, 50, 300, 9, 700 };
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}

		System.out.println("Largest Element In Array Is : " + min);

	}

}
