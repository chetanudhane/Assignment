package Day2;

import java.util.Scanner;

public class WhileLoop1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		int sum = 0;  
		while(i <= n)  
		{  
		sum = sum + i;
		i++;  
		}  
		System.out.println("Sum of First"+ n +"Natural Numbers is = " + sum); 
	}

}
