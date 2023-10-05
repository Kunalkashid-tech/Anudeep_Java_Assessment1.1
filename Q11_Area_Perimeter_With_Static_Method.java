package Anudeep_pro.java;

public class Q11_Area_Perimeter_With_Static_Method {

	// Using parameterized static method.
	public static int area(int length, int breadth) {
		
		// Formula to find area of rectangle.
		return length * breadth;
	}
	
	// Using parameterized static method.
	public static int perimeter(int length, int breadth) {
		
		// Formula to find perimeter of rectangle.
		return 2 * length + breadth;
	}
	
	public static void main(String[] args) {
		
		Q11_Area_Perimeter_With_Static_Method a = new Q11_Area_Perimeter_With_Static_Method();
		
		System.out.println("Area of rectangle using static method is : "+a.area(4, 8));
		
		System.out.println("Perimeter of rectangle using static method is : "+a.perimeter(4, 8));
		
	}

}

/*
  Output :-
Area of rectangle using static method is : 32
Perimeter of rectangle using static method is : 16
*/