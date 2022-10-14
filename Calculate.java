package assignment.java;

import java.util.Scanner;

public class Calculate {
	 public static void main(String[] args) {
	try (Scanner sc = new Scanner(System.in)) {
		double num1;
		double num2;
		System.out.println(" enter the first number");
		
		num1 = sc.nextDouble();
		System.out.println(" enter the second number");
		num2 = sc.nextDouble();
		System.out.println("addition" +(num1+num2));
		System.out.println("substaction" +(num1-num2));
		System.out.println("multiplication" +(num1*num2));
	}


}
}




