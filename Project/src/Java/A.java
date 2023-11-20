package Java;

public class A {
	A(){
		this(20.45,25);
		System.out.println("c-1");
	}
	A(int a){
		this(10,10.05);
		System.out.println("c-2");
	}
	A(double a){
		this(45.8,"Rahul");
		System.out.println("c-3");
	}
	A(int a,double b){
		this(10.89);
		System.out.println("c-4");
	}
	A(double a,String b){
		this("Rahul",25.89);
		System.out.println("c-5");
	}
	A(double a,int b){
		this(10);
		System.out.println("c-6");
	}
	A(String a,double b){
	    
		System.out.println("c-7");
	}
	public static void main(String[] args) {
		A a=new A();
	}
}
