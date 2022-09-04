import java.io.*;
import java.util.*;
import java.math.*;
import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.abs;
import static java.lang.System.out;

public class Temp {
    static void print (Object o) {System.out.print(o);}
    static void println (Object o) {System.out.println(o);}

//    Pair<Integer, Integer> pair=new Pair<>();
//    Map<Integer, Integer> map=new HashMap<>();
//    Set<Integer> set=new HashSet<>();
//    ArrayList<Integer> ls=new ArrayList<>();

    public static void main(String[] args) {
        FScanner sc=new FScanner();
        PrintWriter out=new PrintWriter(System.out);
        int T=sc.nextInt();
        while(T-->0) {
            int n = sc.nextInt();
            // code goes here
        }
        out.close();
    }

    static final Random random=new Random();
    static final int mod=1_000_000_007;

    static void ruffleSort(int[] a) {
        int n=a.length; // shuffle, then sort
        for (int i=0; i<n; i++) {
            int oi=random.nextInt(n), temp=a[oi];
            a[oi]=a[i]; a[i]=temp;
        }
        Arrays.sort(a);
    }
    static long add(long a, long b) {
        return (a+b)%mod;
    }
    static long sub(long a, long b) {
        return ((a-b)%mod+mod)%mod;
    }
    static long multi(long a, long b) {
        return (a*b)%mod;
    }
    static long exp(long base, long exp) {
        if (exp==0) return 1;
        long half=exp(base, exp/2);
        if (exp%2==0) return multi(half, half);
        return multi(half, multi(half, base));
    }

    static boolean isUpperCase(char ch){
        return ch >= 'A' && ch <= 'Z';
    }

    static long[] factorials=new long[2_000_001];
    static long[] invFactorials=new long[2_000_001];
    static void precompFacts() {
        factorials[0]=invFactorials[0]=1;
        for (int i=1; i<factorials.length; i++) factorials[i]=multi(factorials[i-1], i);
        invFactorials[factorials.length-1]=exp(factorials[factorials.length-1], mod-2);
        for (int i=invFactorials.length-2; i>=0; i--)
            invFactorials[i]=multi(invFactorials[i+1], i+1);
    }

    static long nCk(int n, int k) {
        return multi(factorials[n], multi(invFactorials[k], invFactorials[n-k]));
    }
    public static int computeXOR(int n) {
        if (n % 4 == 0)
            return n;
        if (n % 4 == 1)
            return 1;
        if (n % 4 == 2)
            return n + 1;

        return 0;
    }
    static void sort(int[] a) {
        // Arrays.sort() uses QuickSort
        // Collections.sort() uses MergeSort
        ArrayList<Integer> ls=new ArrayList<>();
        for (int i:a) ls.add(i);
        Collections.sort(ls);
        for (int i=0; i<a.length; i++) a[i]=ls.get(i);
    }

    public static boolean isPrime(long n) {
        if(n < 2) return false;
        if(n == 2 || n == 3) return true;
        if(n%2 == 0 || n%3 == 0) return false;
        long sqrtN = (long)Math.sqrt(n)+1;
        for(long i = 6L; i <= sqrtN; i += 6) {
            if(n%(i-1) == 0 || n%(i+1) == 0) return false;
        }
        return true;
    }

    public static long gcd(long a, long b) {
        if(a > b)
            a = (a+b)-(b=a);
        if(a == 0L)
            return b;
        return gcd(b%a, a);
    }

    public static long totient(long n) {
        long result = n;
        for (int p = 2; p*p <= n; ++p)
            if (n % p == 0) {
                while(n%p == 0)
                    n /= p;
                result -= result/p;
            }
        if (n > 1)
            result -= result/n;
        return result;
    }
    public static long power(long x, long y, long p) {
        //0^0 = 1
        long res = 1L;
        x = x%p;
        while(y > 0) {
            if((y&1)==1)
                res = (res*x)%p;
            y >>= 1;
            x = (x*x)%p;
        }
        return res;
    }
    public static int[] compress(int[] arr) {
        ArrayList<Integer> ls = new ArrayList<Integer>();
        for(int x: arr)
            ls.add(x);
        Collections.sort(ls);
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int boof = 1; // min value
        for(int x: ls)
            if(!map.containsKey(x))
                map.put(x, boof++);
        int[] brr = new int[arr.length];
        for(int i=0; i < arr.length; i++)
            brr[i] = map.get(arr[i]);
        return brr;
    }

    static class FScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");
        String next() {
            while (!st.hasMoreTokens())
                try {
                    st=new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
        int[] readArray(int n) {
            int[] a=new int[n];
            for (int i=0; i<n; i++) a[i]=nextInt();
            return a;
        }
        long nextLong() {
            return Long.parseLong(next());
        }
    }
}

class Pair<U, V> {
    public U first;
    public V second;

    // default
    public Pair() {}

    public Pair(U p1, V p2){
        this.first=p1;
        this.second=p2;
    }

    public U first() {
        return this.first;
    }
    public V second() {
        return this.second;
    }
    void setValue(U a, V b){
        this.first=a;
        this.second=b;
    }
    public Pair<U, V> get() {
        return this;
    }
    public boolean isEqual(){
        return this.first==this.second;
    }
}

