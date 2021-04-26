package week6_task3;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee[] staff = new Employee[3];
		staff[0] = new Employee("Antonio Rossi", 3000000, 1, 10, 1989);
		staff[1] = new Employee("Maria Bianchi", 2500000, 1, 12, 1991);
		staff[2] = new Employee("Isabel Vidal", 2000000, 1, 11, 1993);
		
		int i;
		for(i = 0; i < 3; i++) staff[i].raiseSalary(5);
		for(i = 0; i < 3; i++) staff[i].print();
		
		System.out.println("\nAfter sorting :");
		for(i = 0; i < 3; i++) staff[i].shell_sort(staff);
		for(i = 0; i < 3; i++) staff[i].print();
	}
}
