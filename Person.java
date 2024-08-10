package oops;
//
/*
class Circle{
	private double radius;
	public double getRadius() {
		return radius;
	}
	public void setRadius(double w) {
		radius =w;
	}
	 
	public double area() {
		return Math.PI*radius*radius;
	}
	public double perimeter() {
		return 2*Math.PI*radius;
	}
	public double circumference() {
		return perimeter();
	}
}
public class Person {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle();
		c1.setRadius(10);
        System.out.println(c1.area());
        System.out.println(c1.perimeter());
        System.out.println(c1.circumference());
		

	}

}
*/


//constructor

class Circle{
	private double radius;
	public Circle() {
		  radius=10;
	}
	public Circle(double l) {
		radius=l;
	}
	 
	public double area() {
		return Math.PI*radius*radius;
	}
	public double perimeter() {
		return 2*Math.PI*radius;
	}
	public double circumference() {
		return perimeter();
	}
}

public class Person{
	
	public static void main(String[] args){
		
		Circle c1 = new Circle(9);
        System.out.println(c1.area());
        System.out.println(c1.perimeter());
        System.out.println(c1.circumference());
		
		
		
	}
	
}