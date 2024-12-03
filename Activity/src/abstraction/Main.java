package abstraction;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double radius = 1.0;
		Circle c = new Circle(radius);
		
		
		double s1 = 3.0, s2 = 4.0, s3 = 5.0;
		Triangle t = new Triangle(s1, s2, s3);
		
		double areaC = c.calculateArea();
		double perimeterC = c.calculatePerimeter();
		
		System.out.println("The area of C is " + areaC);
		System.out.println("The perimeter of C is " + perimeterC);
		
		double areaT = t.calculateArea();
		double perimeterT = t.calculatePerimeter();
		
		System.out.println("The area of T is " + areaT);
		System.out.println("The perimeter of T is " + perimeterT);
				

	}

}
