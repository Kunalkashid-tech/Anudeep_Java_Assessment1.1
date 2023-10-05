// Java program to initialize 2 numbers and 1 char variable to perform mathematical operations like add,difference,quotient and remainder.

package Anudeep_pro.java;

// importing scanner class
import java.util.Scanner;

public class Q07_Mathematical_Operations {

	public static void main(String[] args) {
		
		int num1 = 4;
		int num2 = 2;
		
		// Using scanner class.
		System.out.println("Enter the Operators to perform Operations : ");
		Scanner sc = new Scanner(System.in);
		char sum = sc.next().charAt(0);
		
		// Using switch statement.
		switch(sum) {
		
		case '+':
			System.out.println("Sum of "+num1+" + "+num2+" is : "+(num1 + num2));
			break;
			
		case '-':
			System.out.println("Difference of "+num1+" - "+num2+" is : "+(num1 - num2));
		    break;
			
		case '*':
			System.out.println("Product of "+num1+" * "+num2+" is : "+(num1 * num2));
			break;
			
		case '/':
			System.out.println("Quotient of "+num1+" / "+num2+" is : "+(num1 / num2));
			break;
			
	    default:
	    	System.out.println("Invalid Operation");
			
		}
		
		
	}

}

/*
 Output :-
 Enter the Operators to perform Operations : 
 Product of 4 * 2 is : 8
*/

