// Method changing Process 

package Java;
class K {
	void run() {
		this.run(10);
		System.out.println("M1");
	}
	void run(int a) {
		this.run(10.09);
		System.out.println("M2");
	}
	void run(double a) {
		this.run("Karan");
		System.out.println("M3");
	}
	void run(String a) {
		System.out.println("M4");
	}
	public static void main(String[] args) {
		K k=new K();
		k.run( );
	}
}