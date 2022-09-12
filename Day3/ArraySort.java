package Day3;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		int arr[] = { 23, 22, 45, 45, 12, 36, 28, 19, 20 };
		int temp = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.print("Sorted Array as : " + Arrays.toString(arr));
	}

}
