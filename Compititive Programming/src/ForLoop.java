import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		
		int arr[] = new int[n];	//initializing ans Array
		
		// reading input in Array
		for(int i =0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		//Calculating sum of Array
		for(int i =0;i<n;i++) {
			sum += arr[i];
		}
		System.out.println("Sum of Array is : " + sum +" from first method");
		
		
		int sum2 = 0;
		//calculating sum from second method
		//reading array directly without indexes
		
		for(int i: arr) {
			sum2 += i;
		}
		System.out.println("Sum of Array is : " + sum +" from second method");
		
		
		
	}

}
