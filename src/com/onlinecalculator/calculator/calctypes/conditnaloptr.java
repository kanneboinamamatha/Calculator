package com.onlinecalculator.calculator.calctypes;
public class conditnaloptr {
	public static void main (String args[])
	{
		int a,b,c;
		a=50;
		b=30;
		c=a>b?a:b;;
		System.out.println("biggest of two numbers is:"+c);
		c=(a<b)?(a=a+10):(b=b+10);
		System.out.println("a=="+a);
		System.out.println("b=="+b);
		System.out.println("c=="+c);
	}

}
