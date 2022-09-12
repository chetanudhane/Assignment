package Day3;

public class SecondLargestElement {

	public static void main(String[] args) {
		int arr[] = { 23, 22, 45, 45, 12, 36, 28, 19, 20 };
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		if (arr[0] != arr[1]) {
			System.out.print("Second Largest Element of an Array is : " + arr[1]);
		} else {
			System.out.print("Second Largest Element of an Array is : " + arr[2]);
		}

	}

}
