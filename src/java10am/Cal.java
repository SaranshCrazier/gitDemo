package java10am;

public class Cal {
	
	// void, returnType, recursion
	// behaviour
	public int sum(int a, int b) {
		int z = a + b;
		return z;
	}
	
	public void add(int a, int b) {
		int z = a + b;
		System.out.println(z);
	}
	
	public double division(int a, int b) {
		double z = a/b;
		return z;
	}
	
	public int multiply(int a, int b) {
		return (a * b);
	}
	
	public int wholeSquare(int a, int b) {
		int z = (a*a) + (b*b) + 2*a*b;
		return z;
	}
}
