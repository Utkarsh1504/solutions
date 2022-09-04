package Long;

import java.awt.image.AreaAveragingScaleFilter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

import static java.lang.Math.*;

public class C {
    public static void println (Object o) {System.out.println(o);}
    public static void print (Object o) {System.out.print(o);}
    static final Random random=new Random();
    static final int MOD=1_000_000_007;

    static void reverse(ArrayList<Integer> ls, int num, int ind){
        for(int i=num; i<ind+1; i++){

        }
    }

    public static void main(String[] args) {
        FScanner sc=new FScanner();
        PrintWriter out=new PrintWriter(System.out);
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0; i<100000; i++){
            map.put(i, i*i);
        }
        int T=sc.nextInt();
//        int T=1;
        while(T-->0) {
            int n=sc.nextInt();
            ArrayList<Integer> ls=new ArrayList<>(n);
            ArrayList<Integer> ind=new ArrayList<>(n);
            for(int u=0; u<n; u++){
                ind.add(u);
                ls.add(u);
            }
            for(int u=n-1; u>=0;){
                int perfect = min(map.get(u), ind.get(u));
                int num=perfect-ind.get(u);
                reverse(ls, num, ind.get(u));
                u=num-1;
            }
            for(int l:ls){
                print(l+" ");
            }
            println("");
        }
        out.close();
    }

    public static int gcd(int a, int b) {
        if(a > b)
            a = (a+b)-(b=a);
        if(a == 0L)
            return b;
        return gcd(b%a, a);
    }
    static void sort(long[] a) {
        // Arrays.sort() uses QuickSort
        // Collections.sort() uses MergeSort
        ArrayList<Long> ls=new ArrayList<>();
        for (long i:a) ls.add(i);
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



