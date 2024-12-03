package inheritance;

public class Circle extends Shape{
	
	private double radius;

	public Circle(double radius) {
		// TODO Auto-generated constructor stub
		this.radius = radius;
	}
	
	public double getArea() {
		return 3.14 * radius * radius;
	}


}
