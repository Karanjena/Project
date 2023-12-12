package Comm;

public class Prime {
	public static void main(String[] args) {
		int a=1;
		int b=20;
		
		for(int i=a ;i<=b ; i++) {
			int count=0;
			for(int j=1 ; j<=i ; j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println(i);
			}
		}
	}
}
