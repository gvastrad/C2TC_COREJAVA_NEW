package com.tns.corejava;
//Local and instance Variable explanation
class Demo
{
	int a;
	int b=20;
	final int d=45;
	static final int f=100;
	void m1()
	{
		a=35;
		b=45;
		int c=90;
		final int e=65;
		System.out.println("The value of a, b, c,d is "+a+" "+b+" "+c+" "+d);
		System.out.println("The value of e is "+ e);
	}
	static void m2()
	{
		//Local variables can't be static
		//static int g=60;
		//f=90;
		//static method cant have static variable
		//static int x=50;
		int y=80;
		System.out.println("The value of f is "+ f);
		System.out.println("The value of y is "+ y);
	}
}
public class VariablesDemo {
	public static void main(String[] args) {
		Demo obj=new Demo();
		obj.m1();
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println("The value of f is "+ Demo.f);
		Demo.m2();
	}
}
