//wajp to create a class name shopping there are 6 choice puma,adidas,nike,amiri
//lv,woodland


package Comm;

import java.util.Scanner;

public class Shoes_shopping {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Number");
		int shopping=sc.nextInt();
		
		switch(shopping) {
		case 1: System.out.println("Puma");
		break;
		case 2: System.out.println("Adidas");
		break;
		case 3: System.out.println("Nike");
		break;
		case 4: System.out.println("Amiri");
		break;
		case 5: System.out.println("L.V");
		break;
		case 6: System.out.println("woodland");
		break;
		default: System.out.println("Invalid Number");
		}
	}
}
