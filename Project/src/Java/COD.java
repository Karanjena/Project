package Java;

class COD extends Phone{
	long Cid=54588823555l;
	void  Playing() {
		System.out.println("COD Gameplay Bad");
	}
	public static void main(String[] args) {
		COD c=new COD();
		System.out.println(c.name);
		System.out.println(c.Eshopname);
		System.out.println(c.Pname);
		System.out.println(c.Cid);
		c.Playing();
		c.gaming();
		c.Product();
		c.Buy();
	}
}
