package com.variabletask;

import java.util.Scanner;

public class ItemsTotalCost {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the item:");
		String item=sc.next();
		double price=14000;
		int quantity=4;
		double totalCost=quantity*price;
		System.out.println("Total cost of the items:"+totalCost);
	}

}
