package week6;

/*task 1.1
 * add
 * variable color : String
 * constructor Circle(radius : double, color : String)
 * getter and setter for color*/

public class Circle {
	private double radius;
	private String color;
	//private double area;
	
	public Circle() {	//default
		radius = 1.0;
		color = "red";
	}
	
	public Circle(double r) {	//2nd constructor
		radius = r;
		color = "red";
	}
	
	public Circle(double r, String color) {
		this.radius = r;
		this.color = color;
	}
	
	//getter setter
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getArea() {
		return radius*radius*Math.PI;
	}
	
	public String toString() {
		return "Circle[radius=" + radius + " color=" + color + "]";
	}

}
