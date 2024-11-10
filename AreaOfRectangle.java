package com.variabletask;

import java.util.Scanner;

public class AreaOfRectangle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length value:");
		double length=sc.nextDouble();
		System.out.println("Enter the width value:");
		double width=sc.nextDouble();
		double area=length*width;
		System.out.println("Area of the rectangle is:"+area);
	}

}
