package Java;

class Pubg extends Phone{
	long Pid=552358889633l;
	void Play() {
		System.out.println("Pubg Gameplay is Best ");
	}
	public static void main(String[] args) {
		Pubg p=new Pubg();
		System.out.println(p.name);
		System.out.println(p.Eshopname);
		System.out.println(p.Pname);
		System.out.println(p.Pid);
		p.Play();
		p.gaming();
		p.Product();
		p.Buy();		
	}
}
