package Day5BasicPrograms;

import java.util.Scanner;

public class CheckNumberEvenOrOdd {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		if(n%2==0) {
			System.out.println(n+" : Is Even Number...");
		}else {
			System.out.println(n+" : Is Odd Number...");
		}

	}

}
