package polymorphism;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double radius = 1.0;
		Circle c = new Circle(radius);
		
		double length = 2.0, width = 3.0;
		Rectangle r = new Rectangle(length, width);
		
		double base = 4.0, height = 2.0;
		Triangle t = new Triangle(base, height);
		
		System.out.println("The area of Circle is " + c.calculateArea());
		System.out.println("The area of Rectangle is " + r.calculateArea());
		System.out.println("The area of Triangle is " + t.calculateArea());

	}

}
