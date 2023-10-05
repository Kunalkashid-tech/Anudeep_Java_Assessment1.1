// Java program to check vowel or consonant without using methods.

package Anudeep_pro.java;

// importing scanner class
import java.util.Scanner;

public class Q12_Vowel_Consonant {

	public static void main(String[] args) {
		
		// Using scanner class.
		System.out.println("Enter character you want to check : ");
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		
		// Using if-else statement.
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
			
			System.out.println(ch+" Character is vowel");
		}
		else {
			System.out.println(ch+" Character is consonant");
		}
		
	}

}

/* 
  Output :-
  Enter character you want to check : 
A
A Character is vowel
*/