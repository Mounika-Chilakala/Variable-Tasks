package com.variabletask;

import java.util.Scanner;

public class ArithmeticOperations {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number:");
		int firstNum=sc.nextInt();
		System.out.println("Enter the second number:");
		int secondNum=sc.nextInt();
		System.out.println("Addition of two numbers is:"+(firstNum+secondNum));
		System.out.println("Substraction of two numbers is:"+(firstNum-secondNum));
		System.out.println("Multiplication of two numbers is:"+(firstNum*secondNum));
		System.out.println("Division of two numbers is:"+(firstNum/secondNum));
	}

}
