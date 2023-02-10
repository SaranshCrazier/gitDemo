package java10am;

public class Main {

	public static void main(String[] args) {
		// language --> procedural (c language) --> single file --> refactor
		//				oops (object oriented programming) --> multiple files
		
		// advantage --> platform independent(android, ios, linux, mac, windows, smart appliances)
		//			--> stability, reusability, vast library, large community, widely accepted, modular
		// write once, run everywhere
		// disadvantages --> slow as compared to c language
		
		
		// platform - independent
		// source code/human readable/.java extension --> 
		// compiler(check syntax/ grammer)/ byte code(.class extension), jvm readable -->
		// jvm (java virtual machine) --> execute
		
		// humanBeing, Car, Dog, Chair
		
		// Object --> properties (data) 
		//			--> behaviour (action)
		
		// Dog --> properties --> name, breed, color, age, height, weight
		//		--> behaviour --> running, eat, bite, bark, jump, sleep
		
		// object --> require blueprint
		// car object --> blueprint(idea)
		// blueprint(logical/virtual) --> multiple object (pure physical/ occupy memory)
		
		// porperties(data) --> primitive dataType
		//					--> refencential dataType
		
	// primitive dataType --> 8 types
		// numerical data --> 4/8 dataType
			// byte < short < int < long  eg --> 10, 999, 5327235732
		// decimal data --> 2/8 dataType
			// float < double  eg --> 53.536, 6753.72362353526326
		// boolean --> true, false
		// char --> '@', 'A'
		
		// varaiable(hold data/ container), constant(raw data/ value)
		
	// syntax for defining and assigning varaiable
		// dataType varaiableName;		eg:-  float x;
		// varaiableName = data;		eg:-  x = 50.99;
		
		byte b = 127;
		short s = 32000;
		int i = 2000000000;
		long l = 9999999999l;
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		
		float dec = 11.99f;
		double dou = 53.62353276326;
		char ch = 'A';
		boolean bo = b<s;
		
		System.out.println(b + s);
		System.out.println(dec + " " + dou + " " + ch + " " + bo + " " + (b+s));
		
		// referential data type
		// String, Array[]- collection of homogenous element/varaiable, 
		// Class(blueprint) , Interface
		
		// String varaiableName = "aditi";
		String name = "aditi";
		System.out.println("aditi");
		
		// main method --> starting point for our application
		// only one main method per application
		// execution --> main method scope
		
		// syntax for object creation from blueprint
		// className varaiableName = new className();
		Student stuA = new Student();
		Dog myDog = new Dog();
		// object --> heap memory(memory region)
		stuA.playGame();
		System.out.println(stuA);
		
		// create atleast 5 blueprint (5 property, 3 behaviour)
		// main method --> 2 object for each and every blueprint
		// print each refence varaiable
		
		// Dod 2 month, Dog 5 year
		System.out.println(stuA.age + " " + stuA.gender + " " + stuA.name + " " + stuA.rollNumber);
		stuA.age = 25;
		stuA.gender = "m";
		stuA.name = "boby";
		stuA.rollNumber = 5235632;
		
		System.out.println(stuA.age + " " + stuA.gender + " " + stuA.name + " " + stuA.rollNumber);
		
		// jvm provide deafault values to instance variable
		// int -- 0, float -- 0.0, String -- null, boolean -- false, char -- space
		System.out.println("default value of character: " + stuA.gen);
		
		// varaiable --> 3 types (instance, local, static)
		// instance varaiable --> inside class, but outside method
		// reside inside object (heap memory)
		// jvm will provide default value
		// sepearte copy each and every object
		// instance varaiable can only be access through object reference in static area
		
		Student stuB = new Student();
		System.out.println(stuA.age);
		stuA.getAge();

		System.out.println(stuB.age);
		stuB.getAge();
		
		// local varaiable
		// inside in both class & method
		// it must be initialized before use beacuse jvm will not provide any default value
		
		stuB.bunk(10, 55, 99.99f);
		stuB.study("physics");
		
		Cal calculation = new Cal();
		System.out.println(calculation.multiply(10, 99));
		System.out.println(calculation.division(100, 3));
		System.out.println(calculation.sum(9, 9));
		
		int extVar = calculation.sum(9, 9);
		System.out.println(extVar * 10);
		// void --> simply do some action, no further operation
		// return --> perform action/ conduct further operation 
		System.out.println(Math.sqrt(25));
		System.out.println(calculation.wholeSquare(2, 2));
		
	}
}

