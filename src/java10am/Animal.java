package java10am;

public class Animal {
	// class  --> properties(data) + behaviour(method) + constructor + block
	// properties(data)
	String name;
	String category;
	
	// Block
	static
	{
		System.out.println("static block");
	}
	{
		System.out.println("instance block 1");
	}
	{
		System.out.println("instance block 2");
	}
	
	// constructor
	Animal(){
		System.out.println("default constructor");
	}
	
	Animal(String name, String category){
		this.name = name;
		this.category = category;
		System.out.println("2 argu constructor");
	}
	
	// behaviour(action)
	public void eat() {
		System.out.println("eating meal");
	}
	
	public void sleep() {
		System.out.println("sleeping quietly");
	}
	
	{
		System.out.println("instance block 3");
	}
}
