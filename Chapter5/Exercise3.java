package Chapter5;

public class Exercise3 {

	public static void main(String args[])
	{
		countdown(4);
	}
	public static void countdown(int n) { 
		if (n == 0) { 
			System.out.println("Blastoff!"); 
		} 
		else { 
			System.out.println(n);
			countdown(n - 1); 
		} 
			
	}

}


