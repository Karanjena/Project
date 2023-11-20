package Comm;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter 1st Number");
		int a=sc.nextInt();
		System.out.println("Enter 2nd Number");
		int b=sc.nextInt();
		
		int count=0;
		
		for(int i=a ; i<=b ; i++) {
			for(int j)
			if(b%i==0) {
				count++;
			}
		}
		
	}
}
