// Java program to print pass if marks is more than equal to 50 or fail.

package Anudeep_pro.java;

// importing scanner class package.
import java.util.Scanner;

public class Q06_Exam_Result {

	public static void main(String[] args) {
		
		int  marks;
		
		// Using scanner class.
		System.out.println("Enter marks to check :");
		Scanner sc = new Scanner(System.in);
		marks = sc.nextInt();
		
		// Using if-else statements.
		if(marks >= 50) {
			
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		
	}

}

/*
  Output:-
Enter marks to check :
100
Pass
*/