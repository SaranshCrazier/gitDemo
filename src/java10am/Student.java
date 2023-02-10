package java10am;

// blueprint
public class Student {
	// constructor --> name same as class name
	//				--> dosen't have any return type
	//				--> execute before method
	//				--> a single class can have multiple overloaded constructor
	//				--> jvm will provide default constructor
	//				--> this() method --> first statement within constructor
//	Student(){
//		
//	}
	Student(){
		this(10, 20);
		// default constructor
		System.out.println("default constructor");
	}
	
	Student(int a){
		System.out.println("one argu constructor");
		System.out.println(a);
	}
//	
////	Student(float b){
////		System.out.println("");
////	}
//	
	Student(int a, int b){
		this(10);
		System.out.println("two argu constructor");
		System.out.println(a + " " + b);
	}
//	
////	Student(float z, int x){
////		System.out.println("two argu constructor");
////	}
//	
	Student(String name, int age, int rollNumber, String gender){
		this.name = name;
		this.age = age;
		this.rollNumber = rollNumber;
		this.gender = gender;
	}
	
	// properties(data)
	String name;
	int age = 101;
	int rollNumber;
	String gender;
	int height;
	char gen;
	static String college;
	
	public void stuAge() {
		int age = 16;
		System.out.println("instance varaiable: " + this.age);
		System.out.println("local varaiable: " + age);
	}
	
	// behaviour(action) --> method
	public void bunk(int a, int b, float c) {
		int z = 10;
		System.out.println("local varaiable z: " + z);
		System.out.println("sum of arguments");
		System.out.println(a + b + c);
		System.out.println("class bunk");
		
	}
	public Dog playGame() {
		System.out.println("playing game");
		Dog d = new Dog();
		return d;
	}
	static public void study(String subject) {
		System.out.println("studying hard..... " + subject);
		
	}
	
	public void getAge() {
		System.out.println("age of the Student is: " + age);
	}
	
	public int wholeSquare(int a, int b) {
		int z = (a*a) + (b*b) + 2*a*b;
		return z;
	}
	
	public void whlSquare(int a, int b) {
		int z = (a*a) + (b*b) + 2*a*b;
		System.out.println(z);
	}
	
	public int factorial(int a) {
		System.out.println(a);
		if(a == 1) {
			return a;
		}
		return a * factorial(a-1);
	}
	
	// == comparison operator, compare LHS with RHS
	// (a+b)^2 = (a*a) + (b*b) + 2*a*b
	// factorial 5! = 5*4*3*2*1;
	// sum of even sum
	// sum of odd number
	
	// accessModifier returnType methodName(){}
	//  void --> does not return any value
	// other returnType --> return --> last statement (return)
	
	// Array[]
	// loop --> if, if-else, if-else-if
	// for loop, while loop, do-while
}
