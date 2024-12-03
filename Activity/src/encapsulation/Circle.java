package encapsulation;

public class Circle {
	
	private double radius;

	public void setRadius(double radius) {
		// TODO Auto-generated method stub
		this.radius  = radius;
	}

	public double getRadius() {
		// TODO Auto-generated method stub
		return radius;
	}

	public double calculateArea() {
		// TODO Auto-generated method stub
		return 3.14 * radius * radius;
	}

	public double calculatePerimeter() {
		// TODO Auto-generated method stub
		return 2 * 3.14 * radius;
	}

}
