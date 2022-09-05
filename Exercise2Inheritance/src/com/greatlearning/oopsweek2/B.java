package com.greatlearning.oopsweek2;
public class B extends A{
String s1="Hello Sam";
public void printName() {
	System.out.println(s1);
}
	public static void main(String[] args) {
B obj=new B();
obj.printName();
	}
}
