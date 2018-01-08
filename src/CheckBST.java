/**
 * Created by gitika on 1/7/18.
 */
public class CheckBST {

    /* Hidden stub code will pass a root argument to the function below. Complete the function to solve the challenge. Hint: you may want to write one or more helper functions.

The Node class is defined as follows:*/
    class Node {
        int data;
        Node left;
        Node right;
     }

    public   boolean checkBST(Node root) {
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        return isBst(root, min, max);


    }

    public boolean isBst(Node root, int min, int max) {

        if (root == null) {
            return true;
        }
        if (root.data <= min || root.data >= max) {
            return false;
        }


        return isBst(root.left, min, root.data) && isBst(root.right, root.data, max );

    }
}
