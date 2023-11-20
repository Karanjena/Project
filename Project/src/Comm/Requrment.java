package Comm;

import java.util.Scanner;

public class Requrment {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter passout Year");
		int year=sc.nextInt();
		System.out.println("Enter percentage");
		double percentage=sc.nextDouble();
		if(year>=2021&&year<=2023) {
			if(percentage>=70) {
				System.out.println("Select The Requrement");
			}else {
				System.out.println("percentage is not matched");
			}
		}else {
			System.out.println("year not match");
		}
	}
}
