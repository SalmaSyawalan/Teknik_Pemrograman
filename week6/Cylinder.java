package week6;

public class Cylinder extends Circle {
	private double height;
	
	//constructor with default color, radius, and height
	public Cylinder() {
		super();	//call Circle()
		height = 1.0;
	}
	
	public Cylinder(double height) {
		super();	//call Circle()
		this.height = height;
	}
	
	//constructor with default color, but given radius, height
	public Cylinder(double radius, double height) {
		super(radius);	//call Circle(r)
		this.height = height;
	}
	
	//a public method for retrieving the height
	public double getHeight() {
		return height;
	}
	
	@Override
	public double getArea() {
		return (2 * super.getArea()) + (super.getRadius()*2*Math.PI*height) ;
	}
	
	//a public method for computing the volume of cylinder
	//use superclass method getArea()
	public double getVolume() {
		return super.getArea() * height;
	}
	
	@Override
	public String toString() {
		return "Cylinder: subclass of " + super.toString() + " height=" + height ;
	}

}
