package practical.java;

import java.util.Scanner;

public class Cube {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number: ");
			    int num = sc.nextInt();
			for(int i=1; i<=num; i++){
			    System.out.println("the cube of " + num + " is " + num*num*num);
			}
		
	}


}
