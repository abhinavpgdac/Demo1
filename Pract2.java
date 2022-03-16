package march16;

// How to swap two numbers without using a third variable?

public class Pract2 {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println("a:- " + a +"," + "b:- " + b);
		 a = a + b;   
	     b = a - b;   
	     a = a - b;
		System.out.println("a:- " + a +"," + "b:- " + b);

	}

}
