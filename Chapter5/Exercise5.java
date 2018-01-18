package Chapter5;

public class Exercise5 {

	public static void main(String[] args) {
		int beer = 99;
		while (beer != 0){
			System.out.println(beer + " bottles of beer on the wall,");
			System.out.println(beer + " bottles of beer,");
			System.out.println("ya’ take one down, ya’ pass it around,");
			beer = beer - 1;
			System.out.println(beer + " bottles of beer on the wall.");
		}
	}

}
