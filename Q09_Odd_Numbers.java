// Java program to find odd numbers using for, while and do-while looping statements

package Anudeep_pro.java;

public class Q09_Odd_Numbers {

	public static void main(String[] args) {
		
		// Print odd numbers using for loop.
		System.out.println("Odd numbers using for loop :");
		
		// Using for loop
		for(int i = 0; i <= 10; i++) {
			
		// Using if statement
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		// Print odd numbers using while loop.
		System.out.println("Odd numbers using while loop :");
		
		int w = 0;
		
		// Using while loop.
		while(w <= 10) {
		
		// Using if statement
			if(w % 2 != 0) {
		
		System.out.println(w);
			
			}
		w++;
		
		}
		
		// Print odd numbers using do-while loop.
		System.out.println("Odd numbers using do-while loop :");
		
		int dw = 0;
		
		// Using do-while loop.
		do {
		
		// Using if statement.
			if(dw % 2 != 0) {
		
		System.out.println(dw);
			
			}
		dw++;
		
		}
		
		// Using while loop.
		while(dw <= 10);
	
	}

}

/*
  Output :-
  Odd numbers using for loop :
1
3
5
7
9
  Odd numbers using while loop :
1
3
5
7
9
  Odd numbers using do-while loop :
1
3
5
7
9
*/
