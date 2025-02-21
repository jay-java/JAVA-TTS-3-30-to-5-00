package core;

public class P009_String {
	public static void main(String[] args) {
		char c[] = { 'j', 'a', 'v', 'a' };
		System.out.println(c);

		String name = "java tech is best to learn in 2025";
		System.out.println(name);
		System.out.println(name.length());
		System.out.println(name.charAt(25));
		System.out.println(name.contains("best to "));

		String s1 = "java";
		String s2 = "JAVA";
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s2));
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.concat(s2));
		System.out.println("changed data : " + s1);
		String s3 = "     java tech     ";
		System.out.println(s3);
		System.out.println(s3.trim());

		String s4 = "   ";
		System.out.println(s4.isBlank());
		System.out.println(s4.isEmpty());

		// StringBuffer & StringBuilder
		StringBuffer st1 = new StringBuffer("java");
		StringBuffer st2 = new StringBuffer("java");

		System.out.println(st1.append(st2));
		System.out.println(st1);
	}
}
