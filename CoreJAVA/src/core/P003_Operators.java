package core;

public class P003_Operators {
	public static void main(String[] args) {
		// assignment->=,+=,-=,/=,*=
		int a = 1, b = 12;
		a += b;//a = a+b
		System.out.println(a);
		
		//conditional-> >,<,>=,<=,!=,==
		System.out.println(a>b);
		System.out.println(a<b);
		
		int i =10,j=12;
		System.out.println(i==j);
		//logical->&&,||,!
		
		
		//unary ->++,-- 
		a--;
		System.out.println(a);
		j = i++;
		System.out.println(j);
		int l = j++;
		System.out.println(l);
	}
}
