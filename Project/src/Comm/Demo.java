package Comm;

public class Demo {
	public static void main(String[] args) {

		int a=5;
		int count=0;
		for(int i=1;i<=a;i++) {
			if(a%i==0) {
				count++;
			}
			}
		if(count==2) {
			System.out.println("prime");
		}else {
			System.out.println("Not peime");
		}
		}
}