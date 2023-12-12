package Comm;

public class Employee {

	String  name;
	double sal;
	int empId;
	
	Employee(String  name,double sal,int empId){
		this.name=name;
		this.sal=sal;
		this.empId=empId;
	}
	void details() {
		System.out.println("Employee name "+name);
		System.out.println("Employee sal "+sal);
		System.out.println("Employee id "+empId);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee E1=new Employee("Karan",20780.40,98);
		Employee E2=new Employee("Rahul",42530.08,95);
		Employee E3=new Employee("Santosh",50390.00,88);
		E1.details();
		E2.details();
		E3.details();

	}

}
