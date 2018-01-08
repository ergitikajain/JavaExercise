/**
 * Created by gitika on 1/7/18.
 */

// Timecomplexity to calculate the big O notation is O(n!)
    // Time complexity along with printing the string O(n*n!)
public class PermutationOfString {

    public static void main(String args[]) {
        String str = "abc";
        PermutationOfString p = new PermutationOfString();
       p.generatePermutation(str, 0, str.length()-1);

    }

    private void  generatePermutation(String str, int l, int r) {
       if (l == r) {
           System.out.println(str);
       } else {

           for (int i = l; i <=r ; i++ ) {
               str = swap(str, l, i);
               generatePermutation(str,l+1, r );
               str = swap(str, l, i);
           }

       }
    }

    private String swap(String s, int i, int j) {
        char cAti= s.charAt(i);
        char cAtj = s.charAt(j);
        char[] charArray = s.toCharArray();
        charArray[i] = cAtj;
        charArray[j] = cAti;
        return String.valueOf(charArray);
    }


}
