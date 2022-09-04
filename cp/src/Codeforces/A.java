package Codeforces;

import java.io.*;
import java.util.*;

import static java.lang.Math.*;

public class A {
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
           ArrayList<Integer> ls=new ArrayList<>();
           for(int i=9; i>=1; i--){
               if(n>=i) {
                   ls.add(i);
                   n-=i;
               } else {
                   ls.add(n);
                   break;
               }
           }
           for(int u=ls.size()-1; u>=0; u--){
               print(ls.get(u));
           }
           println("");
        }
        out.close();
    }

    static boolean isUpperCase(char ch){
        return ch >= 'A' && ch <= 'Z';
    }

    static int countDigits(int n) {
        String num = Integer.toString(n);
        return +num.length();
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


