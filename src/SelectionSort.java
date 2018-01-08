/**
 * Created by gitika on 1/7/18.
 */
public class SelectionSort {

    public int[] sort(int[] a) {

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                int min = i;
                if (a[j] < a[min]) {
                    min = j;
                    int temp = a[i];
                    a[i] = a[min];
                    a[min] = temp;
                }
            }
        }
        return a;

    }

    public static void  main(String args[]) {
        SelectionSort selSort = new SelectionSort();
        int a[] = {5,4,1,2,3};
        selSort.sort(a);
        for (int i : a) {
            System.out.print(i);
        }
    }


}
