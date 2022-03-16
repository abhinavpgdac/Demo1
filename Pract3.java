package march16;

//wap to check is number is even or odd.
import java.util.*;
public class Pract3 {

	public static void main(String[] args) {
		int a;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number:- ");
		a=s.nextInt();
		if(a%2==0) {
			System.out.println("Number is Even:- " + a);
		}
		else {
			System.out.println("Number is odd:- " + a);
		}
			
	}

}
