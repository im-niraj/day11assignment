package com.day11AnswerNo1;

public interface Y {
	void fun1y();
	default void fun2y() {
		System.out.println("fun2 of Y default");
	}
	public static void fun3y() {
		System.out.println("fun3 of Y static");
	}
}
