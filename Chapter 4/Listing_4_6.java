package latihan;

import employee.Employee;

import static java.lang.System.*;

//the Employee class is defined in this package

public class Listing_4_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee harry = new Employee("Harry Hacker", 50000, 1989, 10, 1);
		
		harry.raiseSalary(5);
		
			//because of the static import statement, we don't have to use System.out here  -buku
		//tapi disini gabisa kalau gapake System.out
		out.println("name = " + harry.getName() + ", salary = " + harry.getSalary());
	}

}
