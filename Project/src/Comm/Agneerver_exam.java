/* wajp to create a class agneveer Exam and select the candidate
 * whos hight is 6ft and age is in between 21-25*/

package Comm;

import java.util.Scanner;

public class Agneerver_exam {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Hight");
		double hight=sc.nextDouble();
		System.out.println("Enter Age");
		int age=sc.nextInt();
		
		
		if(hight>=6) {
			if(age>=21&&age<=25) {
				System.out.println("Select agneerver");
			}else {
				System.out.println("Age not match");
			}
		}else {
			System.out.println("Hight is not match");
		}
	}
}
