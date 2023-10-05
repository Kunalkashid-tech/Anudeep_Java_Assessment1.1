// Java program to find area and circumference of circle without using methods.

package Anudeep_pro.java;

public class Q10_Area_Circumfernce_Circle_Without_Methods {

	public static void main(String[] args) {
		
		double area, circumference;
		double radius = 6;
		
		// Taking value of PI.
		double PI = 3.14;
		
		// Formula to find area of circle.
		area = 3.14 * radius * radius;
		
		// Formula to find circumference of circle.
		circumference = 2 * 3.14 * radius;
		
		System.out.println("Area of circle without using methods is : "+area);
		
		System.out.println("Circumference of circle without using methods is : "+circumference);
		
		
	}

}

/* 
  Output :-
  Area of circle without using methods is : 113.03999999999999
  Circumference of circle without using methods is : 37.68
*/