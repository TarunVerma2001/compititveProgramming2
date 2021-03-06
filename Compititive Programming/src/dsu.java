//jai Shree Krishna
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Collections;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.StringTokenizer;
public class dsu{
// author: Tarun Verma
	static FastScanner sc = new FastScanner();
	static int inf = Integer.MAX_VALUE;
	static long mod = 1000000007;
	
	//dsu
	static class dsu1 {
		int parent[], size[];

		public int getPar(int i) {
			if (parent[i] != parent[parent[i]]) {
				parent[i] = getPar(parent[i]);
			}
			return parent[i];
		}

		public void union(int u, int v) {
			int parent_u = getPar(u);
			int parent_v = getPar(v);
			if (parent_u == parent_v) {
				return;
			}
			if (size[parent_u] >= size[parent_v]) {
				//		            swap
				int tmp = parent_u;
				parent_u = parent_v;
				parent_v = tmp;
			}
			size[parent_v] += size[parent_u];
			parent[parent_u] = parent_v;
			return;
		}

		dsu1(int n) {
			parent = new int[n];
			size = new int[n];
			for (int i = 0; i < n; i++) {
				parent[i] = i;
				size[i] = 1;
			}
		}
	}
	
	
	static void dfs(int node, int[] a, long b[], int vis[]) {
		vis[node] = 1;
		int index = a[(int) b[node]];
		if (vis[index] == 1)
			return;
		dfs(index, a, b, vis);
	}
	
	
	//modulus fxns
	static int N = (int) 2e5 + 5; // initialize array Length
	static int mod = 998244353; // modulus
	static long fact[], inv[];

	static void pre() {
		fact = new long[N];
		inv = new long[N];
		fact[0] = 1;
		inv[0] = 1;
		for (int i = 1; i < N; i++)
			fact[i] = (i * fact[i - 1]) % mod;
		for (int i = 1; i < N; i++)
			inv[i] = mod_pow(fact[i], mod - 2, mod);
	}

	static long mod_mul(long x, long y, int p) {
		x %= p;
		y %= p;
		return (x * 1l * y) % p;
	}

	static long mod_add(long x, long y, int p) {
		x %= p;
		y %= p;
		x += y;
		while (x >= p)
			x -= p;
		while (x < 0)
			x += p;
		return x;
	}

	static long mod_pow(long a, long b, long p) {
		a %= p;
		long res = 1;
		while (b > 0) {
			if ((b & 1) == 1)
				res = (res * a) % p;
			a = (a * a) % p;
			b >>= 1;
		}
		return res % p;
	}

	static long nCr(long n, long r, long p) {
		if (r > n)
			return 0;
		if (n == r)
			return 1;
		if (r == 0)
			return 1;
		return (((fact[(int) n] * inv[(int) r]) % p) * inv[(int) (n - r)]) % p;
	}
	
	/* Common Mistakes By Me
	 * make sure to read the bottom part of question
	 * special cases (n=1?)
	 * In Game Theory Check your solution and consider all the solutions
	 * Always initialise value to the declare array in local scope
	 * don't use debugs in interactive problems
	 * Always Reset vis,adj array upto n+1 otherwise can cause TLE
	 */
	public static void solve() {
		
	}
	
	public static void main(String[] args) {
		int t = 1;
		t = sc.nextInt();
		outer: for (int tt = 0; tt < t; tt++) {
			solve();
		}
	}
	
////////////////////////////////////////////////////////////////////////////////////
////////////////////DO NOT BELOW BEFORE THIS LINE //////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////
	
	static boolean isPalindrom(char[] arr, int i, int j) {
		boolean ok = true;
		while (i <= j) {
			if (arr[i] != arr[j]) {
				ok = false;
				break;
			}
			i++;
			j--;
		}
		return ok;
	}
	
	static int max(int a, int b) {
		return Math.max(a, b);
	}
	
	static int min(int a, int b) {
		return Math.min(a, b);
	}
	
	static long max(long a, long b) {
		return Math.max(a, b);
	}
	
	static long min(long a, long b) {
		return Math.min(a, b);
	}
	static void sort(int arr[]) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		for(int i: arr) a.add(i);
		Collections.sort(a);
		for(int i=0;i<arr.length;i++) arr[i] = a.get(i);
	}
	static void sort(long arr[]) {
		ArrayList<Long> a = new ArrayList<Long>();
		for(long i: arr) a.add(i);
		Collections.sort(a);
		for(int i=0;i<arr.length;i++) arr[i] = a.get(i);
	}
	static int abs(int a) {
		return Math.abs(a);
	}
	
	static long abs(long a) {
		return Math.abs(a);
	}
	
	static void swap(long arr[], int i, int j) {
		long temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	static int maxArr(int arr[]) {
		int maxi = Integer.MIN_VALUE;
		for (int x : arr)
			maxi = max(maxi, x);
		return maxi;
	}
	
	static int minArr(int arr[]) {
		int mini = Integer.MAX_VALUE;
		for (int x : arr)
			mini = min(mini, x);
		return mini;
	}
	
	static long maxArr(long arr[]) {
		long maxi = Long.MIN_VALUE;
		for (long x : arr)
			maxi = max(maxi, x);
		return maxi;
	}
	
	static long minArr(long arr[]) {
		long mini = Long.MAX_VALUE;
		for (long x : arr)
			mini = min(mini, x);
		return mini;
	}
	
	static int gcd(int a, int b) {
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}
	
	static long gcd(long a, long b) {
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}
	
	static void ruffleSort(int[] a) {
		int n = a.length;
		Random r = new Random();
		for (int i = 0; i < a.length; i++) {
			int oi = r.nextInt(n);
			int temp = a[i];
			a[i] = a[oi];
			a[oi] = temp;
		}
		Arrays.sort(a);
	}
	
	public static int binarySearch(int a[], int target) {
		int left = 0;
		int right = a.length - 1;
		int mid = (left + right) / 2;
		int i = 0;
		while (left <= right) {
			if (a[mid] <= target) {
				i = mid + 1;
				left = mid + 1;
			} else {
				right = mid - 1;
			}
			mid = (left + right) / 2;
		}
		return i;
	}
	
	static class FastScanner {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer("");
		
		String next() {
			while (!st.hasMoreTokens())
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}
		
		int nextInt() {
			return Integer.parseInt(next());
		}
		
		int[] readArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
		}
		
		long[] readLongArray(int n) {
			long[] a = new long[n];
			for (int i = 0; i < n; i++)
				a[i] = nextLong();
			return a;
		}
		
		int[][] read2dArray(int n, int m) {
			int arr[][] = new int[n][m];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					arr[i][j] = nextInt();
				}
			}
			return arr;
		}
		
		ArrayList<Integer> readArrayList(int n) {
			ArrayList<Integer> arr = new ArrayList<Integer>();
			for (int i = 0; i < n; i++) {
				int a = nextInt();
				arr.add(a);
			}
			return arr;
		}
		
		long nextLong() {
			return Long.parseLong(next());
		}
	}
	
	static class pair {
		int fr, sc;
		
		pair(int fr, int sc) {
			this.fr = fr;
			this.sc = sc;
		}
	}
	
////////////////////////////////////////////////////////////////////////////////////	
	
}
