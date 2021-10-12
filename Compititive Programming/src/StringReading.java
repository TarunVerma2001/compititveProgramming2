import java.util.Scanner;

public class StringReading {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		//reading String by indices
		
		int size = s.length();
		for(int i =0;i<size;i++) {
			System.out.print(s.charAt(i) + " ");
			// output in one line we use print not prinln
		}
		System.out.println();  	//we use prinln for output and go to next line also
		
		
	}

}
