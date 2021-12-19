package org.string;

public class StringNonLiteral {
	public static void main(String[] args) {

		String s = new String("java");
		System.out.println(s);
		int a = System.identityHashCode(s);
		System.out.println(a);

		String s1 = new String("java");
		System.out.println(s1);
		int b = System.identityHashCode(s1);
		System.out.println(b);

		String s2 = new String("Java");
		System.out.println(s2);
		int c = System.identityHashCode(s2);
		System.out.println(c);

		String s3 = new String("JavA");
		System.out.println(s3);
		int d = System.identityHashCode(s3);
		System.out.println(d);

	}
}
