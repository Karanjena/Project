package Comm;

public class Laptop {
	String Brand;
	double cost;
	String RAM;
	String Processer;
	
	

	public Laptop(String brand, double cost, String RAM, String processer) {
		
		this.Brand = brand;
		this.cost = cost;
		this.RAM = RAM;
		this.Processer = processer;
	}
	
	void details() {
		System.out.println("Brand Name:-"+Brand);
		System.out.println("cost:-"+cost);
		System.out.println("Ram:-"+RAM);
		System.out.println("Prpcesser:-"+Processer);
		System.out.println("----------------------------");
	}



	public static void main(String[] args) {

		Laptop l1=new Laptop("MadBook", 120000, "8gb", "i7");
		Laptop l2=new Laptop("hp", 60000, "8gb", "i7");
		Laptop l3=new Laptop("Lenvo", 90000, "8gb", "i7");
		Laptop l4=new Laptop("acer", 70000, "8gb", "i7");
		Laptop l5=new Laptop("Mi", 70000, "8gb", "i7");
		
		l1.details();
		l2.details();
		l3.details();
		l4.details();
		l5.details();
		
		
		 
	}

}
