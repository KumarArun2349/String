package org.string;

public class String1 {
	public static void main(String[] args) {
		String s = " java selenium ";
		int length = s.length();
		System.out.println(length);
		char charAt = s.charAt(1);
		System.out.println(charAt);
		int indexOf = s.indexOf("a");
		System.out.println(indexOf);
		int indexOf2 = s.indexOf("b");
		System.out.println(indexOf2);
		int lastIndexOf = s.lastIndexOf("a");
		System.out.println(lastIndexOf);
		boolean empty = s.isEmpty();
		System.out.println(empty);
		boolean contains = s.contains("a");
		System.out.println(contains);
		String upperCase = s.toUpperCase();
		System.out.println(upperCase);
		String lowerCase = s.toLowerCase();
		System.out.println(lowerCase);
		String trim = s.trim();
		System.out.println(trim);
		String replace = s.replace("j", "J");
		System.out.println(replace);
		String replaceAll = s.replaceAll(s, "Selenium Java");
		System.out.println(replaceAll);
		String s1 = "Automation testing";
		String concat = replaceAll.concat(" " + s1);
		System.out.println(concat);
		boolean equals = s.equals(s);
		System.out.println(equals);
		boolean equalsIgnoreCase = s.equalsIgnoreCase(s1);
		System.out.println(equalsIgnoreCase);
		String[] split = s.split(" ");
		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
		}
		String substring = s.substring(3);
		System.out.println(substring);
		String substring2 = s.substring(0, 5);
		System.out.println(substring2);
		boolean startsWith = s.startsWith(" ");
		System.out.println(startsWith);
		boolean endsWith = s.endsWith(" ");
		System.out.println(endsWith);
	}
}
