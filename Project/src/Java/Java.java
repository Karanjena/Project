package Java;

class Java extends Laptop{
	String Sname="Java";
	void Backend() {
		System.out.println("Java used the Backend Developer");
	}
	public static void main(String[] args) {
		Java j=new Java();
		System.out.println(j.name);
		System.out.println(j.Eshopname);
		System.out.println(j.Lname);
		System.out.println(j.Sname);
		j.Backend();
		j.Coding();
		j.Product();
		j.Buy();
	}
}
