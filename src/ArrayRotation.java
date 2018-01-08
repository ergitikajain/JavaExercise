/**
 * Created by gitika on 1/6/18.
 * Sample Input

 5 4
 1 2 3 4 5
 */


    import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

    public class ArrayRotation {

        public static int[] arrayLeftRotation(int[] a, int n, int k) {
            int[] result = new int[n];

            for (int i = 0; i < n; i++) {
                if (n - k + i < n) {
                    result[n-k+i] = a[i];
                } else {
                    result[n-k+i-n] = a[i];
                }

            }



            return result;

        }

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int k = in.nextInt();
            int a[] = new int[n];
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }

            int[] output = new int[n];
            output = arrayLeftRotation(a, n, k);
            for(int i = 0; i < n; i++)
                System.out.print(output[i] + " ");

            System.out.println();

        }
    }

