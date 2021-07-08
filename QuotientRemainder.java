import java.util.Scanner;

public class QuotientRemainder {
	public static void main(String[] args) {
		int dividend=25, divisor=4;
		
		int quotient=dividend/divisor;
		int remainder=dividend%divisor;
		
		System.out.println("Quotient = " + quotient);
		System.out.println("remainder = "+ remainder);
		
		Scanner scan=new Scanner(System.in);
		int num;
		System.out.println("Enter An Integer Number.....:");
		num=scan.nextInt();
		if (num%2==0);
		System.out.println("Entered Number is Even...:");
		else
			System.out.println("Entered Number is Odd....:");
		
			
				
	}
}
