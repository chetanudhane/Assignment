package Day5BasicPrograms;

import java.util.Scanner;

public class PowerOf2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Power of 2 : ");
		int n=sc.nextInt();
		int power=1;
		for(int i=1;i<=n;i++) {
			power=power*2;
			System.out.println(power);
		}

	}

}
