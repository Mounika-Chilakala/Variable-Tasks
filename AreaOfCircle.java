package com.variabletask;

import java.util.Scanner;

public class AreaOfCircle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius value:");
		double radius=sc.nextDouble();
		double pi=3.14159;
		double area=pi*radius*radius;
		System.out.println("The area of the circle is:"+area);
	}

}
