package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;
import java.lang.Math.*;

public class G {
    public static void println (Object o) {System.out.println(o);}
    public static void print (Object o) {System.out.print(o);}

    public static void main(String[] args) {
        FScanner sc=new FScanner();
        PrintWriter out=new PrintWriter(System.out);
        int T=sc.nextInt();
        while(T-->0) {
            int n = sc.nextInt(),k=sc.nextInt();
            ArrayList<Integer> al=new ArrayList<>();
            int sum=0;
            for(int i=0; i<n; i++){
                int temp=sc.nextInt();
                al.add(temp);
                sum+=temp;
            }
            int res=sum-n*k;
            int[] b=new int[32];
            for(int i=n-1; i>=0; i--){
                sum-=al.get(i);
                int currSum=sum;
                for(int j=0; j<31; j++){
                    b[j]=b[j+1];
                }
                for(int j=0; j<31; j++){
                    b[j]+=(((al.get(i)>>1)>>j)&1);
                }
                for(int j=0; j<31; j++){
                    currSum+=b[j]*(1L<<j);
                }
                currSum-=k*i;
                res=Math.max(res, currSum);
            }
            println(res);
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


