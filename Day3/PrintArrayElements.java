package Day3;

public class PrintArrayElements {

	public static void main(String[] args) {
		int[] array = new int[10];
		int n = 1;
		for (int i = 0; i < array.length; i++) {
			array[i] = n;
			n++;
		}
		System.out.print("Array Elements are : { ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.print("}");

	}

}
