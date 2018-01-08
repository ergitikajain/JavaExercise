import java.util.Arrays;
import java.util.IntSummaryStatistics;

/**
 * Created by gitika on 1/5/18.
 */
public class BinarySearch {


    public int binarySearch(int[] a, int t) {
        Arrays.sort(a);
        int low = 0;
        int high = a.length - 1;


        while (low <= high) {
            int mid = low + (high- low) / 2;
            if (t > a[mid]) {
                low = mid + 1;
            } else if (t < a[mid]) {
                high = mid - 1;
            } else {
                return mid;
            }

        }
        return -1;

    }
}