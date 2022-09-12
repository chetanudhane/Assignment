package Day5BasicPrograms;

import java.util.Scanner;

public class CheckLeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		boolean leap = false;
		int a=year%4;
		System.out.println(a);
		int b=year%400;
		System.out.println(b);
		int c=year%100;
		System.out.println(c);

		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					leap = true;
				} else {
					leap = false;
				}
			} else {
				leap = true;
			}
		} else {
			leap = false;
		}

		if (leap) {
			System.out.println(year + " is a leap year.");
		} else {
			System.out.println(year + " is not a leap year.");
		}

	}

}
