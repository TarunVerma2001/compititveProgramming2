import java.util.Scanner;

public class DD {
	Scanner sc = new Scanner(System.in);
	
	int t = sc.nextInt();
	for(int tt = 0;tt<t;tt++) {
		long a = sc.nextLong();
		long b = sc.nextLong();
	
		long aa = b;
		long bb = (long) 1e9 + 5;
		long pp = a;
		
		aa %= pp;
	    long res = 1;
	    while (bb > 0) {
	        if ((bb & 1) == 0)
	            res = (res * aa) % pp;
	        aa = (aa * aa) % pp;
	        bb >>= 1;
	    }
	    long req=  res % pp;
		
		if(req == 0) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
}
