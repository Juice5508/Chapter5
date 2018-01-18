package Chapter5;

public class Exercise4 {

	public static void main(String[] args) {
		checkFermat(0, 0, 0, 0);

	}
	public static void checkFermat(int a, int b, int c, int n) {
		if (n > 2 & a*n + b*n == c*n){
			System.out.println("Holy smokes, Fermat was wrong!");
		}
		else{
			System.out.println("No, that doesn’t work.");
		}
	} 
		
	

}
