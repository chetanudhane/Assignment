package Day2;

import java.util.Scanner;

public class ForLoop1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		for(int i = 1 ; i <= num ; i++) {
			sum = sum + i;
		}
		System.out.println("Sum of first "+ num +" numbers is : "+sum);
	}

}
