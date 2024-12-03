package encapsulation;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle c = new Circle();
		
		c.setRadius(1.0);
		
		c.getRadius();
		
		double area = c.calculateArea();
		double perimeter = c.calculatePerimeter();
		
		System.out.println("The area is : " + area);
		System.out.println("The perimeter is : " + perimeter);
		

	}

}
