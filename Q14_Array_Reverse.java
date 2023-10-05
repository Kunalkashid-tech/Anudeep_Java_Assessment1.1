// Java program to store integers in array and reverse it

package Anudeep_pro.java;

public class Q14_Array_Reverse {

	public static void main(String[] args) {
		
		System.out.println("Original array is :");
		int[] arr = {1, 2, 3, 4, 5};
		
		// Using for each loop
		for(int arr1 : arr) {
			
		System.out.println(arr1);
		
		}
		
		// Print reverse array.
		System.out.println("Reverse array is :");
		
		int temp;
		
		// Using for each loop
		for(int i = arr.length; i >=1 ; i--) {
			
		temp = i;
			
		System.out.println(temp);
		
		}
		
		
	}

}

/* 
  Output :-
  Original array is :
1
2
3
4
5
Reverse array is :
5
4
3
2
1
*/
