package Comm;

public class Constructor {
	int id;
	String name;
	Constructor(int id, String name){
		this.id=id;
		this.name=name;
		
	}
	void details() {
		System.out.println("Student id "+id);
		System.out.println("Student name "+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Constructor c1=new Constructor(1,"Karan");
		Constructor c2=new Constructor(2,"Rahul");
		
		c1.details();
		c2.details();
		
	}

}
