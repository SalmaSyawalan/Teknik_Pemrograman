package week6_task2;

public class Circle extends Shape {
	private double radius;
	
	public Circle() {	//default
		radius = 1.0;
	}
	
	public Circle(double r) {	//2nd constructor
		radius = r;
	}
	
	public Circle(double r, String color, boolean filled) {
		super(color, filled);
		this.radius = r;
	}
	
	//getter setter
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return radius*radius*Math.PI;
	}
	
	public double getPerimeter() {
		return radius*2*Math.PI;
	}
	
	public String toString() {
		return "A circle with radius = " + radius + ", which is inherited a subclass of " + super.toString();
	}

}
