


    import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

    public class LikesAdvertisement {

        static int viralAdvertising(int n) {
            int totalLike = 0;
            int like = 0;
            int share = 0;
            for (int i =0; i < n; i++) {
             //   like = Math.floor(5/2);
                share = like * 3;
                totalLike = like + totalLike;
                System.out.println(totalLike);
            }
            return totalLike;
        }

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int result = viralAdvertising(n);
            System.out.println(result);
            in.close();
        }
    }


