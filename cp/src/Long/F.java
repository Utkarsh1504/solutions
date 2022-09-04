package Long;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

import static java.lang.Math.abs;
import static java.lang.Math.sqrt;

public class F {
    public static void println (Object o) {System.out.println(o);}
    public static void print (Object o) {System.out.print(o);}
    static final Random random=new Random();
    static final int MOD=1_000_000_007;

    public static void main(String[] args) {
        FScanner sc=new FScanner();
        PrintWriter out=new PrintWriter(System.out);
        int T=sc.nextInt();
//        int T=1;
        while(T-->0) {
             long n=sc.nextInt(), m=sc.nextInt();
             if(m<n*2) println(m+" "+m);
             else if(m>=n*2 && m%n==0) println(m+" "+n);
             else {
                 long pA=0, pB=0;
                 long tmp=m/2;
                 if(m>=n*2) tmp=n*2;
                 long it=0;
                 for(long i=n; i<tmp; i++){
                     if((i*(m/i)-i)>it){
                         pA=i; pB=i*(m/i);
                         it=(i*(m/i)-i);
                     }
                 }
                 println(pA+" "+pB);
             }
        }
        out.close();
    }

    static int fact(int n) {
        int sumf = 0;
        for (int i = 2; i <= sqrt(n); i++) {
            while (n % i == 0) {
                sumf += i;
                n /= i;
            }
        }
        if (n != 1) {
            sumf += n;
        }
        return sumf;
    }
    public static int gcd(int a, int b) {
        if(a > b)
            a = (a+b)-(b=a);
        if(a == 0L)
            return b;
        return gcd(b%a, a);
    }
    static void sort(int[] a) {
        // Arrays.sort() uses QuickSort
        // Collections.sort() uses MergeSort
        ArrayList<Integer> ls=new ArrayList<>();
        for (int i:a) ls.add(i);
        Collections.sort(ls);
        for (int i=0; i<a.length; i++) a[i]=ls.get(i);
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



