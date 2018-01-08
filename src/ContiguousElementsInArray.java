import java.util.Arrays;
import java.util.HashSet;

/**
 * Created by gitika on 1/4/18.
 */
public class ContiguousElementsInArray {

    public static void main(String args[]) {
        int[] arr = {5,2,3,6,4,4,6,6};
        System.out.println(findContigousArray(arr));

        int[] arr1 = {10,14,10,12,12,13,15};
        System.out.println(findContigousArray(arr1));

        int[] arr2 = {5,2,3,6,4,4,6,6};

        System.out.println(anotherWayTofindContigousArray(arr2));
        int[] arr3 = {10,14,10,12,12,13,15};
        System.out.println(anotherWayTofindContigousArray(arr3));
    }

    public static boolean findContigousArray(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length -1 ; i++) {
            if (arr[i+1] - arr[i]  > 1) {
                return false;
            }
        }

    return true;
    }

    public static boolean anotherWayTofindContigousArray(int[] arr) {
        HashSet<Integer> hashArraySet = new HashSet<>();
        for (int i = 0 ; i < arr.length -1 ; i++) {
            hashArraySet.add(arr[i]);
        }
        int currentElement = arr[0] - 1;

        int count = 1;

        while (hashArraySet.contains(currentElement)) {
            count++;
            currentElement--;
        }
        currentElement = arr[0] + 1;
        while (hashArraySet.contains(currentElement)) {
            count++;
            currentElement++;
        }

        return count == hashArraySet.size();
    }
}
