package abstraction;

public class Triangle extends Shape{
	
	private double s1;
	private double s2;
	private double s3;

	public Triangle(double s1, double s2, double s3) {
		// TODO Auto-generated constructor stub
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
	}

	@Override
	double calculateArea() {
		// TODO Auto-generated method stub
		// calculating semi-perimeter
		double s = (s1+s2+s3)/2;
		//calculate area using heron's formula
		return Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
	}

	@Override
	double calculatePerimeter() {
		// TODO Auto-generated method stub
		return s1 + s2 + s3;
	}

}
