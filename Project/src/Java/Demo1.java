package Java;

public class Demo1 {
	static String name="Karan";
	static int n=123;
	double d=12.094;
	public static int add() {
		System.out.println("display the Nmae");
		return 0 ;
	}
	void Sec() {
		System.out.println("Bye");
	}
	public static void main(String[] args) {
		Demo1 d=new Demo1();
		System.out.println(Demo1.name);
		System.out.println(Demo1.n);
		System.out.println(d.d);
		Demo1.add();
		d.Sec();
	}
}
