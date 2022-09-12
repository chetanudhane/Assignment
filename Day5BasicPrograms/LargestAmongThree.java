package Day5BasicPrograms;

import java.util.Scanner;

public class LargestAmongThree {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		System.out.print("x:"+x+"  y:"+y+"  z:"+z);
		System.out.println();
		if(x>y && x>z) {
			System.out.println("Largest Among Three : "+x);
		}else if(y>x && y>z) {
			System.out.println("Largest Among Three : "+y);
		}
		else if(z>x && z>y) {
			System.out.println("Largest Among Three : "+z);
		}else {
			System.out.println("Largest Two Numbers Are Equals...");
		}

	}

}
