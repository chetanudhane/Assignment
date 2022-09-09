package Day2;

import java.util.Scanner;

public class OperatorPrgrm1 {

	public static void main(String[] args) {
		int operation1, operation3, operation4;
		int operation2;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		operation1 = a + b * c;
		operation2 = c + a / b;
		operation3 = a % b + c;
		operation4 = a * b + c;
		System.out.println("-------------");
		System.out.println("Value of operation1 is : "+operation1);
		System.out.println("Value of operation2 is : "+operation2);
		System.out.println("Value of operation3 is : "+operation3);
		System.out.println("Value of operation4 is : "+operation4);
		System.out.println("-------------");
		
		int max=Math.max(Math.max(Math.max(operation1,operation2),operation3),operation4);
		System.out.println("Maximum value is : "+max);
		int min=Math.min(Math.min(Math.min(operation1,operation2),operation3),operation4);
		System.out.println("Minimum value is : "+min);
	}

}
