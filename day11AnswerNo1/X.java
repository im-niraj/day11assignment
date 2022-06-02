package com.day11AnswerNo1;

public interface X {
	void fun1x();
	public default void fun2x() {
		System.out.println("fun2 of X default");
	}
	static void fun3x() {
		System.out.println("fun3 of X static");
	}
}
