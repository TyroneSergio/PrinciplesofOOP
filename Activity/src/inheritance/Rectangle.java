package inheritance;

public class Rectangle extends Shape{
	
	private double length, width;

	public Rectangle(double length, double width) {
		// TODO Auto-generated constructor stub
		this.length = length;
		this.width = width;
	}
	
	public double getArea() {
		return length * width;
	}

	
	

}
