package polymorphism;

public class Circle extends Shape {
	
	private double radius;

	public Circle(double radius) {
		// TODO Auto-generated constructor stub
		this.radius = radius;
	}
	
	public double calculateArea() {
		return 3.14 * radius * radius;
	}

}
