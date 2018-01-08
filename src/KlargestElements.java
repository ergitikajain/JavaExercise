/**
 * Created by gitika on 1/4/18.
 */
public class KlargestElements {

    public static int[] findKLargestElement (int[] a, int k) {


        for (int i = 0; i < k; i++) {
            for (int j = 0; j < a.length -i -1 ; j ++) {
                if (a[j+1] > a[j] ) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;

                }


            }
        }

        return null;

    }
}
