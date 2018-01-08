/**
 * Created by gitika on 1/5/18.
 */
public class StackUsingLinkedList {

    private Node first = null;

    public void push(String string) {
        Node oldFirst = first;
        first = new Node();
        first.item = string;
        first.next = oldFirst;

    }

    public String pop() {
        String item = first.item;
        first = first.next;
        return item;

    }

    public boolean isEmpty() {
        if (first == null) {
            return true;
        } return false;
    }

    public static void main(String args[]) {
        StackUsingLinkedList st = new StackUsingLinkedList();
        System.out.println(st.isEmpty());
        st.push("gitika");
        st.push("jain");
        System.out.println(st.pop());
    }

}
