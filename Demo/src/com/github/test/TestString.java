package com.github.test;

public class TestString {
	public static void test(){
		String s = "hello";
		String s1 = "java";
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			s+=s1;
		}
		long end = System.currentTimeMillis();
		long runt0 = end - start;
		System.out.println(runt0);
	}
	public static void test1(){
		StringBuffer buf = new StringBuffer("hello");
		String s1 = "java";
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			buf.append(s1);
		}
		long end = System.currentTimeMillis();
		long runt1 = end - start;
		System.out.println(runt1);
	}
	public static void test2(){
		StringBuilder buf = new StringBuilder("hello");
		String s1 = "java";
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			buf.append(s1);
		}
		long end = System.currentTimeMillis();
		long runt1 = end - start;
		System.out.println(runt1);
	}
	public static void main(String[] args) {
		test();
		test1();
		test2();
	}
}
