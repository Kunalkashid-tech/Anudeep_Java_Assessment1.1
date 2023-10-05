// Java program to find area and circumference of circle using static methods.

package Anudeep_pro.java;

public class Q10_Area_Circumference_Circle_With_Static_Method {

	// Using static method for area of circle
	public static double area(double radius, double PI) {
	
	// Formula to find area of circle.
	return PI * radius * radius;
    
	}
	
	// Using static method for circumference of circle.
    public static double circumference(double radius, double PI) {
    
    // Formula to find circumference of circle.
    return 2 * PI * radius;
    
    }
	
	public static void main(String[] args) {
		
		Q10_Area_Circumference_Circle_With_Static_Method obj = new Q10_Area_Circumference_Circle_With_Static_Method();
		
		System.out.println("Area of circle using static method is : "+obj.area(6, 3.14));
		
		System.out.println("Circumference of circle using static method is : "+obj.circumference(6, 3.14));
		
			
	}
		
}

/* 
 Output :-
 Area of circle using static method is : 113.03999999999999
Circumference of circle using static method is : 37.68
*/
 

