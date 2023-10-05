// Java program to find even numbers using for, while and do-while looping statements

package Anudeep_pro.java;

public class Q08_Even_Numbers {

	public static void main(String[] args) {
		
		// Print even numbers using for loop.
		System.out.println("Even numbers using for loop : ");
		
		// Using for loop.
		for(int i = 0; i <= 10; i++) {
	    
		// Using if statement.
			if(i % 2 == 0) {
				
		System.out.println(i);
			}
		}
		
		// Print even numbers using while loop.
		System.out.println("Even numbers using while loop : ");
        
		int w = 0;
		
        // Using while loop.
		while(w <= 10) {
		
		// Using if statement.
			if(w % 2 == 0) {
		
		System.out.println(w);
			}
			w++;
		}
		
		// Print even numbers using do-while loop.
		System.out.println("Even numbers using do-while loop : ");

		int dw = 0;
		
		// using do-while loop.
		do {
		
		// Using if statement.
		   if(dw % 2 == 0) {
		
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
  Even numbers using for loop : 
0
2
4
6
8
10
Even numbers using while loop : 
0
2
4
6
8
10
Even numbers using do-while loop : 
0
2
4
6
8
10
*/
 

