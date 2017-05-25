package com.onlinecalculator.calculator.calctypes;

import java.util.Scanner;

public class logicaloptr {
	public static void main (String args[])
	{
		int a,b,c;
		Scanner s=new Scanner(System.in);
		System.out.println("enter first number");
		a=s.nextInt();
		System.out.println("enter second number");
		b=s.nextInt();
		System.out.println("enter third number");
		c=s.nextInt();
		System.out.println("(a<b)&&(a>c):"+((a<b)&&(a>c)));
		System.out.println("(a==b)+(b==c):"+((a==b)||(b==c)));
		System.out.println("a==b"+(a==b));
	}
}
