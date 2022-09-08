package Day1;

import java.util.Scanner;

public class StringEqual {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
		System.out.println("Enter the first string: ");
        String string1 = sc.nextLine();
        
        System.out.println("Enter the second string: ");
        String string2 = sc.nextLine();
 
        if (string1.equals(string2) == true) {
            System.out.println("Strings are Equal.");
        }
        else {
            System.out.println("Strings are not equal.");
        }

	}

}
