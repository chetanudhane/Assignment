package Day5BasicPrograms;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		int a=20;
		int b=10;
		System.out.println("Before Swapping...");
		System.out.println("a :"+a+"  b :"+b);
		b=a+b;
		a=b-a;
		b=b-a;
		System.out.println("After Swapping...");
		System.out.println("a :"+a+"  b :"+b);

	}

}
