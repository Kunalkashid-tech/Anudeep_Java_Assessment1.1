// Java program to find area and perimeter of rectangle without using methods. 

package Anudeep_pro.java;

public class Q11_Area_Perimeter_Rectangle {

	public static void main(String[] args) {
		
		
		int length = 4;
		
		int breadth = 8;
		
		int perimeter, area;
		
		// Formula to find area of rectangle.
		area = length * breadth;

		// Formula to find perimeter of rectangle.
		perimeter = 2 * length + breadth;
		
		
		System.out.println("Area of rectangle without using method is : "+area);
		
		System.out.println("Perimeter of rectangle without using method is : "+perimeter);
		
	}

}
