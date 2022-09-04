package Codeforces;
import java.io.*;
import java.util.*;
import java.math.*;
import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.abs;
import static java.lang.System.out;

public class D {
    public static void println (Object o) {System.out.println(o);}
    public static void print (Object o) {System.out.print(o);}

    public static void main(String[] args) {
        FScanner sc=new FScanner();
        PrintWriter out=new PrintWriter(System.out);
        int T=sc.nextInt();
//        int T=1;
        while(T-->0) {
            String s=sc.next();
            int ques=0;
            int tp=0;
            for(int u=0; u<s.length(); u++){
                if(s.charAt(u)=='(') tp++;
                else if (s.charAt(u)==')') tp--;
                else ques++;
            }
            if(abs(tp)==ques) println("YES");
            else if(tp==0 && ques==2) println("YES");
            else println("NO");
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


