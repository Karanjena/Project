package Java;

class HTML extends Laptop{
	String Hname="HTML";
	void Frontend() {
		System.out.println("HTML used the Frontend Developer");
	}
	public static void main(String[] args) {
		HTML h=new HTML();
		System.out.println(h.name);
		System.out.println(h.Eshopname);
		System.out.println(h.Lname);
		System.out.println(h.Hname);
		h.Frontend();
		h.Coding();
		h.Product();
		h.Buy();
	}
}
