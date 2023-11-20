package Java;

class Student {
	String username;
	String password;
	long phonenumber;
	Student(String username,String password,long phonenumber){
		this.username=username;
		this.password=password;
		this.phonenumber=phonenumber;
	}
	void details() {
	System.out.println("User Nmae is "+ username);
	System.out.println("Password is " + password);
	System.out.println("Phonre Number is "  + phonenumber);
    }
	public static void main(String[] args) {
		Student s=new Student("Karan jena","Karan@123",9337671293l);
		Student s1=new Student("Santosh Sahoo","Santosh@123",8457949709l);
		Student s2=new Student("Rahul jena","Rahul@123",8569297989l);
		s.details();
		s1.details();
		s2.details();
	}
	
}
