package day8.line_comparison;

import java.util.Scanner;

public class LineComparison1 {

	public static double lineLength(int lineNum) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x1 point");
		int x1 = sc.nextInt();
		System.out.println("Enter y1 point");
		int y1 = sc.nextInt();
		System.out.println("Enter x2 point");
		int x2 = sc.nextInt();
		System.out.println("Enter y2 point");
		int y2 = sc.nextInt();

		int X = x2 - x1;
		int Y = y2 - y1;
		double length = Math.sqrt((X * X) + (Y * Y));
		System.out.println("Length of Line-" + lineNum + " = " + length + "unit");

		return length;
	}

	public static void main(String[] args) {

		System.out.println("Enter coordinate of line-1");
		lineLength(1);

	}

}
