import java.util.Collections;
import java.util.PriorityQueue;

/**
 * Created by gitika on 1/7/18.
 */

// Keep track of median for randomly generated numbers.
public class MedianOfRandomlyGeneratedNumbers {

    private static PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    private static PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    public static void addNewNumber(int randomNumber) {
        if (maxHeap.size() == minHeap.size()) {
            if (minHeap.peek() != null && randomNumber > minHeap.peek()) {
                maxHeap.offer(minHeap.poll());
                minHeap.offer(randomNumber);
            } else {
                maxHeap.offer(randomNumber);
            }

        } else {
            if (randomNumber < maxHeap.peek()) {
                minHeap.offer(maxHeap.poll());
                maxHeap.offer(randomNumber);
            } else {
                minHeap.offer(randomNumber);
            }
        }


    }

    public static int getMedian() {
        if (maxHeap.isEmpty()) {
            return minHeap.peek();
        }
        if (minHeap.isEmpty()) {
            return maxHeap.peek();
        }
        if (minHeap.size() == maxHeap.size()) {
            return (minHeap.peek() + maxHeap.peek())/2;
        } else if (maxHeap.size() > minHeap.size()){
            return maxHeap.peek();
        } else {
            return minHeap.peek();
        }
    }





    public  static  void main(String args[]) {
        addNewNumber(4);
        addNewNumber(2);
        addNewNumber(1);

        System.out.println(getMedian());
    }



}
