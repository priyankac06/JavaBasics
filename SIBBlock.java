package Programs;

public class SIBBlock {
	static 
	  {
		  System.out.println("SIB1");
	  }
	static 
	  {
		  System.out.println("SIB2");
	  }
	static 
	  {
		  System.out.println("SIB3");
	  }
//if u add SIB below the main method,execution is same first will run SIB block then main method
//Purpose of SIB: to have any prerequisite
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  System.out.println("Main Method");
	}

}
