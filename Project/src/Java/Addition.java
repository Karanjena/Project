package Java;

class Addition {
	void Add() {
		this.Add("Karan",10.23);
		System.out.println("A1");
	}
	void Add(int a) {
		this.Add();
		System.out.println("A2");
	}
	void Add(String a,double b) {
		this.Add();
		System.out.println("A3");
	}
}
