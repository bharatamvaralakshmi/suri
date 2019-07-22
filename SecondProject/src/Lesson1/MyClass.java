package Lesson1;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter some number");
		int user_input_number = scan.nextInt();
		
		System.out.println("The entered value is");
		System.out.print(user_input_number);
		
		@SuppressWarnings("resource")
		Scanner scan1 = new Scanner (System.in);
		System.out.println("Enter some decimal");
		double user_input_decimal = scan1.nextDouble();
		
		System.out.println("The entered decimal is");
		System.out.print(user_input_decimal);
		
		@SuppressWarnings("resource")
		Scanner scan2 = new Scanner (System.in);
		System.out.println("Enter some string");
		String user_input_string = scan2.nextLine();
		System.out.println("The entered string is");
		System.out.print(user_input_string);

	}

}
