// Java program to find character is vowel or consonant using static methods.

package Anudeep_pro.java;

// importing scanner class.
import java.util.Scanner;

public class Q12_Vowel_Consonant2 {

	// Using static method.
	public static String Isvowel(char ch) {
		
    // Using if-else statement		
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' 
				|| ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
				
				return ch+" Character is vowel";
		}
		else {
				return ch+" Character is consonant";
		}
		
	}
	
	
	public static void main(String[] args) {
		
		Q12_Vowel_Consonant2 v = new Q12_Vowel_Consonant2();
		
	
		System.out.println(v.Isvowel('a'));
		
	
	}

}

/*
  Output :-
  a Character is vowel
*/
