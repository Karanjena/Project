
package Comm;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st Number");
		int a=sc.nextInt();
		System.out.println("Enter 2nd Number");
		int b=sc.nextInt();
		for(int i=b; i>=a ;i--) {
			if(i%2==0||i%2!=0) {
			System.out.println(i);
			}
		}
	}
}
