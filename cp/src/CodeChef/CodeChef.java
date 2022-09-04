package CodeChef;
import java.io.*;
import java.util.*;

public class CodeChef {
    public static void println (Object o) {System.out.println(o);}
    public static void print (Object o) {System.out.print(o);}

    public static void main(String[] args) {
        FScanner sc=new FScanner();
        PrintWriter out=new PrintWriter(System.out);
        int T=sc.nextInt();
        while(T-->0) {
            int n=sc.nextInt(), m=sc.nextInt();
            ArrayList<Integer> ls=new ArrayList<>(n);
            boolean fl=true;
            for(int i=0; i<m; i++){
                int xm=sc.nextInt();
                int ym=sc.nextInt();
                for(int u=0; u<ym; u++){
                    if((xm-1)<=u){
                        ls.add(xm);
                    } else {
                        fl=false;
                    }
                }
            }
            if(fl) {
                for (int i : ls) {
                    print(i + " ");
                }
                println("");
            } else {
                println(-1);
            }
        }
        out.close();
    }

    static void sortString(String str) {
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
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


