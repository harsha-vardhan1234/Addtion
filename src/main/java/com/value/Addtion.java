package com.value;

import java.util.Scanner;

public class Addtion {
	public static int add(int a,int b) {
		return a+b;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value:");
		int a=sc.nextInt();
		System.out.println("enter b value:");
		int b=sc.nextInt();
		System.out.println(Addtion.add(a,b));
		

	}

}
