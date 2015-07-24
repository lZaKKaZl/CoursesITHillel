package day2407;

/**
 * Created by ITHILLEL5 on 24.07.2015.
 */
public class Node implements Comparable{
    private Object data;
    private Node left;
    private Node right;

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    public Node(Object data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
