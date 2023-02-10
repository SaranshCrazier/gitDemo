package java10am;

public class Main6 {
	public static void main(String[] args) {
		// 9 - feb
		// block
		// execute before constructor
		// single class --> multiple block
		// dosen't have any name
		// top to bottom execution in case of multiple blocks
		// static block --> depend upon class load
		// logic will be common for all object
		
		Animal a = new Animal("Dog", "omnivourous");
		System.out.println(a.name + " " + a.category);
//		System.out.println(a.category);
		
		Animal b = new Animal();
		Animal c = new Animal();
		System.out.println(b.name + " " + b.category);
		
		// recursion --> sum of odd number using Scanner (string format)
		// sum of even number
		// product of number (factorial)
		// hypotnous(traingle)
		// table(1 -20) --> Scanner
		// pyramid print
		
	}
}
