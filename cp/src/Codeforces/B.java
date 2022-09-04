package Codeforces;
import java.io.*;
import java.util.*;
import static java.lang.Math.min;
import static java.lang.Math.max;
import static java.lang.Math.*;


public class B {
    public static void println (Object o) {System.out.println(o);}
    public static void print (Object o) {System.out.print(o);}


    //    Pair<Integer, Integer> pair=new Pair<>();
    //    Map<Integer, Integer> map=new HashMap<>();
    //    Set<Integer> set=new HashSet<>();
    //    ArrayList<Integer> ls=new ArrayList<>();

    public static void main(String[] args) {
        FScanner sc=new FScanner();
        PrintWriter out=new PrintWriter(System.out);
        int T=sc.nextInt();
//        int T=1;
        while(T-->0) {
            int n=sc.nextInt();
            int[] a=sc.readArray(n);
            HashMap<Integer, Integer> map=new HashMap<>();
            int ans=0;
            for(int i=n-1; i>=0; i--){
                if(!map.containsKey(a[i])) {
                    map.put(a[i], i);
                    ans++;
                }
                else break;
            }
            println(n-ans);
        }
        out.close();
    }

    static long gcd(long a, long b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
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
     
     