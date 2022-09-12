package Day3;

public class ReverseArray {

	public static void main(String[] args) {
		int arr[] = { 23, 22, 45, 45, 12, 36, 28, 19, 20 };
		System.out.print("Array in Reverse Order is : ");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}

	}

}
