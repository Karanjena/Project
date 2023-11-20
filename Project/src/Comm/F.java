package Comm;

public class F {
	public static void main(String[] args) {
		int a=10;
		int b=12;
		int c=13;
		//int d=26;
		
		System.out.println(a++ + b-- + --c + b-- + c++ + --b + ++a );
		System.out.println(b-- + ++c + --a > b++ + c-- + --a);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	}
}
