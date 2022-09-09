package Day2;

import java.util.Scanner;

public class ForLoop3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int rev=0;
		int temp = n;
  
        for( ;n != 0; n /= 10 )
        {
           int rem = n % 10;
            rev= rev* 10 + rem;
        }
        if (temp== rev) {
            System.out.println(temp + " is a palindrome.");
        }else {
            System.out.println(temp + " is not a palindrome.");
        }
	}

}
