package Java;

class Aurtimetic {
	public static int add(int a,int b) {
		int c=a+b;
		return c;
	}
	public static int sub(int d,int e) {
		int f=d-e;
		return f;
	}
	int mult(int g, int h) {
		int i=g*h;
		return i;
	}
	int div(int j,int k) {
		int l=j/k;
		return l;
	}
	int modu(int m,int n) {
		int o=m%n;
		return o;
	}
	public static void main(String[] args) {
		System.out.println(Aurtimetic.add(10,15));
		System.out.println(Aurtimetic.sub(10, 10));
		Aurtimetic a=new Aurtimetic();
		System.out.println(a.mult(10, 9));
		System.out.println(a.div(20, 10));
		System.out.println(a.modu(100, 10));
	}
}
