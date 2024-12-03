package abstraction;

public class Circle extends Shape {
	
	private double radius;

	public Circle(double radius) {
		// TODO Auto-generated constructor stub
		this.radius = radius;
	}

	@Override
	double calculateArea() {
		// TODO Auto-generated method stub
		return 3.14 * radius * radius;
	}

	@Override
	double calculatePerimeter() {
		// TODO Auto-generated method stub
		return 2 * 3.14 * radius;
	}

}
