package Long;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

import static java.lang.Math.sqrt;
import static java.lang.Math.toRadians;


public class H {
    public static void println (Object o) {System.out.println(o);}
    public static void print (Object o) {System.out.print(o);}
    static final Random random=new Random();
    static final int MOD=1_000_000_007;
    static final int mod= 998_244_353;

    static long[] ut=new long[1000010];
    static long[] utm=new long[1000010];
    static long[] hlp=new long[1000010];

    static long calc(long a, long b){
        if(a<0 || b>a){
            return 0L;
        } else {
            return ut[(int) a] * utm[(int) b] % mod * utm[(int) (a - b)] % mod;
        }
    }

    public static void main(String[] args) {
        FScanner sc=new FScanner();
        PrintWriter out=new PrintWriter(System.out);
        ut[0]=hlp[0]=hlp[1]=utm[0]=utm[1]=1;
        for(long i=1; i<1000000; ++i){
            ut[(int) i]=ut[(int) (i-1)]*i%mod;
        }
        for(long i=2; i<=1000000; ++i){
            hlp[(int) i]=mod-mod/i*hlp[Math.toIntExact(mod % i)]%mod;
        }
        for(long i=2; i<=1000000; ++i){
            utm[(int) i]=utm[(int) (i-1)]*hlp[(int) i]%mod;
        }

        int T=sc.nextInt();
//        int T=1;
        while(T-->0) {
            long n=sc.nextInt();
            int pos=0, pos1=0;
            long cnt=0;
            for(int u=1; u<=n; u++){
                int temp=sc.nextInt();
                if(temp==0) pos++;
                else pos1++;
            }
            for(int u=0; u<=pos1; u++){
                cnt=(cnt+u*calc(pos1+pos-u, pos))%mod;
            }
            long exp=(((cnt*(pos+1)-calc(pos1+pos-2, pos-1))%mod+mod)%mod+calc(pos1+pos-2, pos-1))*ut[pos1]%mod*ut[pos]%mod;
            println(exp);
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



