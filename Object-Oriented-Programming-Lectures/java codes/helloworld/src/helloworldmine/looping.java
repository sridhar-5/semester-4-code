package helloworldmine;
import java.util.*;

public class looping {

	public static void main(String[] args) {
		
		int a,b;
		
		Scanner input = new Scanner (System.in);
		
		a = input.nextInt();
		b = input.nextInt();
		while (b == 1)
		{
		a = input.nextInt();
		if ( a % 2 == 0)
		{
			System.out.println("This is an even number");
		}
		else 
		{
			System.out.println("This is an odd number .");
		}
		
		System.out.println("press 2 to exit : ");
		b = input.nextInt();
		
		}

 	}

}
