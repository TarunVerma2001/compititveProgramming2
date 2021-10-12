import java.util.Scanner;

public class evenOdd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int c = a + b;
		System.out.println("Sum of A and B is: " + c);
		
		// Even Odd Finding
		
		if(a % 2 == 0) {
			System.out.println("a is Even");
		} else {
			System.out.println("a is Odd");
		}
		
		
	}

}
