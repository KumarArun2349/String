package org.string;

public class StringMutable {
	public static void main(String[] args) {

		StringBuilder s=new StringBuilder("java");
		System.out.println(s);
		int a = System.identityHashCode(s);
		System.out.println(a);
		
		StringBuilder s1=new StringBuilder("java");
		System.out.println(s1);
		int b = System.identityHashCode(s1);
		System.out.println(b);
		
		StringBuilder append = s.append(s1);
		System.out.println(append);
		int c = System.identityHashCode(append);
		System.out.println(c);

	}
}
