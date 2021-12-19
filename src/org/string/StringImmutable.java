package org.string;

public class StringImmutable {
	public static void main(String[] args) {

		String s = "java";
		System.out.println(s);
		int a = System.identityHashCode(s);
		System.out.println(a);

		String s1 = "java";
		System.out.println(s1);
		int b = System.identityHashCode(s1);
		System.out.println(b);

		String concat = s.concat(s1);
		System.out.println(concat);
		int c = System.identityHashCode(concat);
		System.out.println(c);
	}
}
