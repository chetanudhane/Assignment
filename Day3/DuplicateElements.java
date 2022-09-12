package Day3;

public class DuplicateElements {

	public static void main(String[] args) {
		int arr[] = { 23, 22, 45, 45, 12, 36, 12, 29, 23, 28, 19, 20 };
		System.out.print("Duplicate Elements In Array Are : ");
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.print(arr[i] + " ");
				}
			}
		}

	}

}
