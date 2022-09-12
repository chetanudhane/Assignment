package Day3;

public class ElementsOnOddPosition {

	public static void main(String[] args) {
		int arr[] = { 12, 23, 22, 45, 45, 36, 28, 19, 20 };
		System.out.print("Elements on Odd Position Are : ");
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 != 0) {
				System.out.print(arr[i] + " ");
			}
		}

	}

}
