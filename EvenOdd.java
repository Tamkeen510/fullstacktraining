import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		
			System.out.println("Enter a Number.....");
			
			int number=scan.nextInt();
			
			if(number%2==0)
			System.out.println(number +"..is An even number");
			else
			System.out.println(number +"...is an odd Number");
			
			
			
			
	}
}
