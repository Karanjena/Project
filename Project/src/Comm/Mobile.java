package Comm;

public class Mobile {
	String Name;
	double cost;
	String ram;
	String color;
	int camera;
	
	

	public Mobile(String Name, double cost, String ram, String color, int camera) {
		
		this.Name = Name;
		this.cost = cost;
		this.ram = ram;
		this.color = color;
		this.camera = camera;
	}

	void display() {
		System.out.println(Name+" "+cost+" "+ram+" "+color+" "+camera);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mobile m1=new Mobile("Realme", 20000, "8gb", "Black", 64);
		Mobile m2=new Mobile("Mi", 15000, "8gb", "Blue", 64);
		Mobile m3=new Mobile("Iphone", 200000, "8gb", "green", 64);
		Mobile m4=new Mobile("oneplus", 50000, "8gb", "red", 64);
		Mobile m5=new Mobile("samsang", 70000, "8gb", "Black", 64);
		
		m1.display();
		m2.display();
		m3.display();
		m4.display();
		m5.display();
		
	}

}
