package week6_task2;

public class Square extends Rectangle {
	public Square() {
		super();
	}
	
	public Square(double side) {
		super(side, side);
	}
	
	public Square(double side, String color, boolean filled) {
		super(side, side, color, filled);
	}
	
	public double getSide() {
		return super.getLength();
	}
	
	public void setSide(double side) {
		super.setWidth(side);
		super.setLength(side);
	}
	
	public void setWidth(double side) {
		setSide(side);
	}
	
	public double getArea() {
		return getSide() * getSide();
	}
	
	public double getPerimeter() {
		return getSide() * 4 ;
	}
	
	public void setLength(double side) {
		setSide(side);
	}
	
	public String toString() {
		return "A square with side = " + getSide() + " , which is a subclass of " + super.toString();
	}

}
