package Comm;

public class InstgramAccount {
	String Name;
	String Username;
	String Password;
	long PhoneNumber;
	
	

	public InstgramAccount(String Name, String username, String password, long phoneNumber) {
		this.Name=Name;
		this.Username = username;
		this.Password = password;
		this.PhoneNumber = phoneNumber;
	}
	
	void details() {
		System.out.println("Name:-"+Name);
		System.out.println("Username:-"+Username);
		System.out.println("password:-"+Password);
		System.out.println("PhoneNumber:-"+PhoneNumber);
		System.out.println("--------------------------------");
	}



	public static void main(String[] args) {
		InstgramAccount I1=new InstgramAccount("Karan", "karan_17", "Karan@123", 9337671293l);
		InstgramAccount I2=new InstgramAccount("Rahul", "rahul_99", "Rahul@989", 9898767898l);
		InstgramAccount I3=new InstgramAccount("Santosh", "santosh_18", "Santosh@000", 9897673567l);
		InstgramAccount I4=new InstgramAccount("Yesh", "yash_675", "Yesh@987", 9890098912l);
		InstgramAccount I5=new InstgramAccount("Sayan", "sayan_1267", "Sayan@123", 8989988789l);
		
		I1.details();
		I2.details();
		I3.details();
		I4.details();
		I5.details();
	}

}
