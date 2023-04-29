package com.google.com;

public class Parent {

	public void m1() {
		System.out.println("I am instance method");

	}

	public static void main(String[] args) {
		Parent p = new Parent();
		p.m1();
	}

}
