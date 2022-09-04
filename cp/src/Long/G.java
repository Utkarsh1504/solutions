package Long;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.StringTokenizer;

import static java.lang.Math.sqrt;

public class G {
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
             int n=sc.nextInt();
             long[] a=sc.readArrayLong(n);
             long init=-1, val=-1;
             for(int u=0; u<n-1; u++){
                 if(a[u]>a[u+1]){
                     init=u+1;
                     val=a[(int)init];
                     break;
                 }
             }
             if(init==-1 || init==n-1) {
                 println("Yes");
                 continue;
             }
             long leftMax = 0;
             for(int u=0; u<init; u++){
                 if(a[u]>val){
                     leftMax=a[u];
                     break;
                 }
             }
             long rightMax=a[(int) (init-1)];
             int u;
             for(u= (int)(init+1); u<n; u++){
                 if(a[u]>=rightMax){
                     rightMax=a[u];
                 }
                 else if(a[u]<=leftMax && a[u]>=val){
                     val=a[u];
                 }
                 else {
                     println("No");
                     break;
                 }
             }
             if(u==n) println("Yes");
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
        long[] readArrayLong(int n) {
            long[] a=new long[n];
            for (int i=0; i<n; i++) a[i]=nextInt();
            return a;
        }
        long nextLong() {
            return Long.parseLong(next());
        }
    }
}



