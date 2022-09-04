package CodeChef;
import java.io.*;
import java.util.*;
import java.math.*;
import static java.lang.Math.*;
import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.abs;
import static java.lang.System.*;

public class Main {
    public static void println (Object o) {System.out.println(o);}
    public static void print (Object o) {System.out.print(o);}
    static final Random random=new Random();
    static final int MOD=1_000_000_007;

    public static void main(String[] args) {
        FScanner sc=new FScanner();
        PrintWriter out=new PrintWriter(System.out);
        int T=sc.nextInt();
        while(T-->0) {
            int n=sc.nextInt(), k=sc.nextInt();
            char[] ch=sc.next().toCharArray();

        }
        out.close();
    }

    static boolean isVowel(char ch)
    {
        boolean check = false;
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                check = true;
                break;
        }
        return check;
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


