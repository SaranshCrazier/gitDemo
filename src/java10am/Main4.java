package java10am;

public class Main4 {
	public static void main(String[] args) {
		// while loop
		int count = 0;
		while(count<10) {
			// logic
			count++;
			System.out.println("inside while loop");
		}
		System.out.println("after while loop");
		
		// for(local varaiable initialization / condition / operation){ // logic }
		int[] n = {0,1,2,3,4,5,6,7,8,9,10};
		System.out.println("length of array n is: " + n.length);
//		String name = "boby";
//		System.out.println("length of name is: " + name.length());
		
//		for(int i = 0; i<5; i++) {
//			// logic
//			System.out.println(n[i]);
//		}
		
		// enhanced for loop
		// for(declare local variable : array/collection) { // logic }
		for(int i: n) {
			System.out.println(i);
		}
		
		String[] candidates = {"meera", "arun", "himanshu", "aditya", "abhijeet", "captain", "chauhan sir physics wale"};
		for(String name: candidates) {
			System.out.println(name.length());
		}
		
		// reverse array
		for(int i = n.length-1 ; i>=0 ; i--) {
			System.out.println(n[i]);
		}
		
		// break --> break entire loop
		// continue --> break current iteration/cycle
		
//		for(String i : candidates) {
//			if(i.equals("abhijeet")) {
//				break;
//			}
//			System.out.println(i);
//		}
//		System.out.println("after for loop");
		
		for(String i : candidates) {
			if(i.equals("abhijeet")) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("after for loop");
		// switch statement/ enhanced switch statement/ do-while
		
		Student objA = new Student();
		objA.stuAge();
		
		
	}
}
