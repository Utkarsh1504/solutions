package CodeChef;
import java.io.*;
import java.util.*;
import java.math.*;

import static java.lang.Math.*;
import static java.lang.System.out;

public class Main2 {
    public static void println (Object o) {System.out.println(o);}
    public static void print (Object o) {System.out.print(o);}

    static boolean isAllowed(String str){
        int n=str.length();
        if(n==0 || n==1){
            return true;
        }
        if (n%2==0){
            return isAllowed(str.substring(0, n-1));
        }
        if(str.substring(0, n / 2).equals(str.substring(n / 2))){
            return isAllowed(str.substring(0, n/2));
        }
        return false;
    }
    public static void main(String[] args) {
        FScanner sc=new FScanner();
        PrintWriter out=new PrintWriter(System.out);
        int t=sc.nextInt();
        while(t-->0) {
            int n=sc.nextInt();
            int[] a=sc.readArray(n);
            sort(a);
            long sum=0;
            int temp=0, it=0;
            for(int u=0; u<n; u++){
                sum+=a[u];
                if(sum>=n) break;
                temp++;
            }
            println(temp);
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


