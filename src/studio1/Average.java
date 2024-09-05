package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in1 = new Scanner(System.in);
		System.out.print("Enter the first integer: ");
		int num1 = in1.nextInt();
		
		Scanner in2 = new Scanner(System.in);
		System.out.print("Enter the second integer: ");
		int num2 = in2.nextInt();
	
		int avg = (num1 + num2)/2;
		
		System.out.print("The average of ");
		System.out.print(num1);
		System.out.print(" and ");
		System.out.print(num2);
		System.out.print(" is ");
		System.out.print(avg);
		System.out.print(".");
	}

}
