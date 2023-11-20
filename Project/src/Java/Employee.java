package Java;

public class Employee {
	static {
		System.out.println("Karan Jena");
	}
	{
		System.out.println("Santosh Sahu");
	}
	static int age=22;
	int ID=89798;
	public static void post() {
		System.out.println("Manger");
	}
	void work() {
		System.out.println("Developer");
	}
	public static void main(String[] args) {
		System.out.println(Employee.age);
		Employee.post();
		Employee e=new Employee();
		System.out.println(e.ID);
		e.work(); 
	}
}
