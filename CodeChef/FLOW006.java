import java.io.*;
import java.lang.*;
import java.util.*;

class CodeChef {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            int sum = 0;
            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }
            System.out.println(sum);
        }
    }
}