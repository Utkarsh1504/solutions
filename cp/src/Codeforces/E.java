package Codeforces;
import java.io.*;
import java.util.*;
import java.math.*;
import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.abs;
import static java.lang.System.out;

//    Pair<Integer, Integer> pair=new Pair<>();
//    Map<Integer, Integer> map=new HashMap<>();
//    Set<Integer> set=new HashSet<>();
//    ArrayList<Integer> ls=new ArrayList<>();


public class E {
    public static void println (Object o) {System.out.println(o);}
    public static void print (Object o) {System.out.print(o);}

    public static void main(String[] args) {
        FScanner sc=new FScanner();
        PrintWriter out=new PrintWriter(System.out);
//        int T=sc.nextInt();
        int T=1;
        while(T-->0){
            int x=sc.nextInt();
            if(x>5){
                if(x%5==0) println(x/5);
                else println(x/5+1);
            } else println(1);
        }
        out.close();
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
        int[][] read2Array(int n){
            int[][] a=new int[n][n];
            int sum=0;
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    a[i][j]=nextInt();
                    sum+=a[i][j];
                }
            }
            return a;
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


