package java10am;

import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		// 6-feb-23
		
		// Scanner class --> user input from console
//		Scanner sc = new Scanner(System.in);
////		System.out.println("Enter interger number: ");
////		int input = sc.nextInt();
////		System.out.println("Enter float number: ");
////		float inputf = sc.nextFloat();
//		System.out.println("Enter string value: ");
//		String inputs = sc.nextLine();
//		System.out.println("output");
////		System.out.println(input + " " + inputf + " " + inputs);
//		System.out.println(inputs);
//		
//		// convert String input to integer
//		Integer number = Integer.parseInt(inputs);
//		System.out.println(number + 1000);
		
		// array --> is a collection of homogenous elements/variables/container(primitive, non-primitive)
		int[] prime = new int[10];
		prime[0] = 2;
		prime[1] = 3;
		prime[2] = 5;
		prime[3] = 7;
		prime[4] = 11;
		prime[5] = 13;
		prime[6] = 17;
		prime[7] = 19;
		System.out.println(prime[5]);
		System.out.println(prime[9]);
		
		int[] n = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(n[0]);
		System.out.println(n[9]);
		
		Student[] stu = new Student[5];
		stu[0] = new Student();
		stu[1] = new Student();
		stu[2] = stu[0];
		
		System.out.println(stu[0]);
		System.out.println(stu[1]);
		System.out.println(stu[2]);
		
		// if statement
//		if(prime[7] > prime[6]) {
//			System.out.println("given condition is true...");
//		}
//		System.out.println("after IF statement");
		
		// if-else statement
//		if(n[3]>n[4]) {
//			System.out.println("condition is true");
//		} else {
//			System.out.println("condition is false");
//		}
//		System.out.println("after if-else block");
		
		// if-else-if statement
		if(n[3]>n[4]) {
			System.out.println("first condition is true");
		} else if(n[7]>n[8]) {
			System.out.println("second condition is true");
		} else {
			System.out.println("both condition are false");
		}
		System.out.println("after if-else block");
		
		// loop
		// while loop
		int z = 5;
		int x = 0;
		while(x<5) {
			x++;
			// x = x+1;
			System.out.println("while loop");
		}
	}
}
