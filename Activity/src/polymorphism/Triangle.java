package polymorphism;

public class Triangle extends Shape {
	
	private double base, height;

	public Triangle(double base, double height) {
		// TODO Auto-generated constructor stub
		this.base = base;
		this.height = height;
	}
	
	public double calculateArea() {
		return 0.5 * base * height;
	}

}
