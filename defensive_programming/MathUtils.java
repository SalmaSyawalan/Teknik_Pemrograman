package defensive_programming;

public class MathUtils {
	//returns the factorial of argument given
	
	public static int factorial(int n) {
		if(n < 0) {
			throw new IllegalArgumentException("Negative numbers can't be executed");
		}
		if(n > 16) {
			throw new IllegalArgumentException("Arithmetic overflow — the factorial is bigger than can be represented by an int");
		}
		int fac = 1;
		for (int i = n; i > 0; i--)
			fac *= i;
		return fac;
	}
}
