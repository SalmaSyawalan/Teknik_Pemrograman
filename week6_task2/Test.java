package week6_task2;

import static java.lang.System.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s = new Shape("blue", true);
		s.setColor("grey");
		out.println(s.toString());
		
		Circle c = new Circle(7.0);
		out.println(c.toString() + ", area = " + c.getArea() + ", perimeter = " + c.getPerimeter());
		
		Rectangle r = new Rectangle(5.0, 10.0, "magenta", true);
		out.println(r.toString() + ", area = " + r.getArea() + ", perimeter = " + r.getPerimeter());
		
		Square sq = new Square(4.0, "peacock green", true);
		sq.setWidth(6.0);
		out.println(sq.toString() + ", area = " + sq.getArea() + ", perimeter = " + sq.getPerimeter());
	}

}
