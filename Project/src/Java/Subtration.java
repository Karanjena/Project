package Java;

public class Subtration {
	void sub(int a,int b) {
		this.sub(10,12.02);
		System.out.println("M1");
	}
	void sub(int c,double d) {
		this.sub("Karan", 10);
	    System.out.println("M2");
	}
	void sub(String e,int f) {
		this.sub(10.23, "Karan");
		System.out.println("M3");
	}
	void sub(double g,String h) {
		System.out.println("M4");
	}
}
