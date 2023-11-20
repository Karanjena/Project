package Comm;

public class Comm {
	public static void main(String[] args) {
		int age =15;
		if(0<=age&&age<=15) {
			System.out.println("Child");
		} 
		else if(16<=age&&age<=20) {
			System.out.println("teenage");
		}
		else if(21<=age&&age<=30) {
		    System.out.println("adult");
		}
		else if(31<=age&&age<=50) {
			System.out.println("midilage");
		}
		else if(51<=age&&age<=100) {
			System.out.println("oldage");
		}
		else {
			System.out.println("invalid age");
		}
	}
}
