
public class modulusFunction {
	static int N = (int)2e5 + 5; // initialize array Length
	static int mod= 998244353; // modulus
	static long fact[],inv[];

	static void pre()
	{
		fact = new long[N];
		inv = new long[N];
	    fact[0]=1;
	    inv[0]=1;
	    for(int i=1;i<N;i++)
	    fact[i]=(i*fact[i-1])%mod;
	    for(int i=1;i<N;i++)
	    inv[i]=mod_pow(fact[i], mod-2, mod);
	}

	static long mod_mul(long x, long y,int p)
	{
	    x %= p;
	    y %= p;
	    return (x * 1l * y) % p;
	}
	 
	static long mod_add(long x,long y,int p)
	{
	    x %= p;
	    y %= p;
	    x += y;
	    while(x >= p) x -= p;
	    while(x < 0) x += p;
	    return x;
	}
	static long mod_pow(long a,long b,long p) {
	    a %= p;
	    long res = 1;
	    while (b > 0) {
	        if ((b & 1) == 1)
	            res = (res*a)%p;
	        a =(a*a)%p;
	        b >>= 1;
	    }
	    return res % p;
	}
	static long nCr(long  n, long  r, long  p) 
	{ 
	    if(r>n)
	    return 0;
	    if(n==r)
	    return 1;
	    if (r==0) 
	    return 1; 
	    return (((fact[(int) n]*inv[(int) r]) % p )*inv[(int) (n-r)])%p;
	} 
}
