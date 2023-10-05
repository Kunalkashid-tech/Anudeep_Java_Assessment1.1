// Java program to initialize integer, character and string array.

package Anudeep_pro.java;

public class Q15_Java_Ass {

	public static void main(String[] args) {
		
		// Initializing integer array.
		int[] n = {1,2,3,4,5};
		
		// Initializing String array.
		String[] str = {"kunal"};
		
		// Initializing Character array.
		char[] c = {'k','u','n','a','l'};
		
		System.out.println("Integer Array Initialization : ");
		
		// Using for each loop.
		for(int n1 : n) {
			
			System.out.println(n1);
		}
		
		System.out.println("String Array Initialization : ");
		
		// Using for each loop.
		for(String str1 : str) {
			
			System.out.println(str1);
		}
		
		System.out.println("Character Array Initialization : ");
		
		// Using for each loop.
		for(int i = 0; i<c.length; i++) {
			
			System.out.println(c[i]);
		}
		
	}

}

/* 
  Output :-
  Integer Array Initialization : 
1
2
3
4
5
  String Array Initialization : 
kunal

  Character Array Initialization : 
k
u
n
a
l
*/