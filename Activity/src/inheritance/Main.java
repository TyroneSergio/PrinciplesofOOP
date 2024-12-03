package inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double radius = 1.0;
		Circle c = new Circle(radius);
		
		double length = 2.0, width = 4.0;
		Rectangle r = new Rectangle(length, width);
		
		System.out.println("The area of Circle is " + c.getArea());
		System.out.println("The area of Rectangle is " + r.getArea());
		

	}

}
