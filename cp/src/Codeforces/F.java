package Codeforces;
import java.io.*;
import java.net.CookieHandler;
import java.util.*;
import java.math.*;
import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.abs;
import static java.lang.System.out;

public class F {
    public static void println (Object o) {System.out.println(o);}
    public static void print (Object o) {System.out.print(o);}

    public static void main(String[] args) {
        FScanner sc=new FScanner();
        PrintWriter out=new PrintWriter(System.out);
        int T=sc.nextInt();
        while(T-->0) {
            int n = sc.nextInt();
            long count=0;
            ArrayList<Integer> a=new ArrayList<>();
            ArrayList<Integer> b=new ArrayList<>();
            for(int i=0;i<n;i++){
                int temp=sc.nextInt();
                if(temp<i+1) {
                    a.add(i+1);
                    b.add(temp);
                }
            }
            if(b.size()<2){
                println(count);
            } else {
                Collections.sort(a);
                Collections.sort(b);
                for(int i=0; i<b.size()-1; i++){
                    int val=i;
                    int m=b.size();
                    while(m>val+1){
                        int mid=(m+val)/2;
                        if(b.get(mid)>a.get(i)){
                            m=mid;
                        } else {
                            val=mid;
                        }
                    }
                    count+=b.size()-m;
                }
                println(count);
            }

        }
        out.close();
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


