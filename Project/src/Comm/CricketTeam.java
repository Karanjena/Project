package Comm;

public class CricketTeam {
	String Name;
	int HighestScore;
	int JerseyNo;
	int Match;
	

      CricketTeam(String name, int highestScore, int jerseyNo, int match) {
		
		this.Name = name;
		this.HighestScore = highestScore;
		this.JerseyNo = jerseyNo;
		this.Match = match;

	}
      
      void details() {
    	  System.out.println("Player Name:-"+Name);
    	  System.out.println("Highest Score:-"+ HighestScore);
    	  System.out.println("Jersey No:-"+ JerseyNo);
    	  System.out.println("Total Match Played:-"+ Match);
    	  System.out.println("---------------------------------");
      }
	public static void main(String[] args) {
		CricketTeam c1=new CricketTeam("Virat Kohli", 178, 18, 289);
		CricketTeam c2=new CricketTeam("Rohit", 264, 45, 309);
		CricketTeam c3=new CricketTeam("S.gil", 202, 77, 108);
		CricketTeam c4=new CricketTeam("Rahul", 123, 1, 98);
		CricketTeam c5=new CricketTeam("Suryakumar", 121, 63, 154);
		CricketTeam c6=new CricketTeam("Hardik.P", 102, 33, 201);
		CricketTeam c7=new CricketTeam("Siraj", 46, 13, 93);
		CricketTeam c8=new CricketTeam("Sami", 65, 11, 109);
		CricketTeam c9=new CricketTeam("Kuldeep", 48, 23, 121);
		CricketTeam c10=new CricketTeam("Bumrah", 87, 93, 134);
		CricketTeam c11=new CricketTeam("Jadeja", 107, 8, 187);
		
		c1.details();
		c2.details();
		c3.details();
		c4.details();
		c5.details();
		c6.details();
		c7.details();
		c8.details();
		c9.details();
		c10.details();
		c11.details();
		

		
	}

}
