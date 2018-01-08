/**
 * Created by gitika on 1/5/18.
 */
public class StackUsingFixedCapacityArray {

    String[] stack;
    int N = 0;

    StackUsingFixedCapacityArray(int capacity) {
        stack = new String[capacity];
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public void push(String str) {
        if (N == stack.length) {
            System.out.println("Element cannot be added");
        }
        stack[N++] = str;
    }

    public String pop() {
        if (N == 0) {
            System.out.print("No item found");
            return "";
        }
        String item = stack[N-1];
        stack[N] = null;
        N--;
        return item;
    }

    public static void main(String args[]) {
        StackUsingFixedCapacityArray st = new StackUsingFixedCapacityArray(10);
        System.out.println(st.isEmpty());
        st.push("gitika");
        st.push("jain");
        System.out.println(st.pop());
    }
}
