package day2407;

/**
 * Created by ITHILLEL5 on 24.07.2015.
 */
public class Tree {
    private Node root;

    public void add(Object object) {
    Node node = new Node(object);
        add(node);

    }
    public void add(Node addTo, Node newNode){
       Object addToObj = addTo.getData();
        Object newNodeObj = newNode.getData();

        Comparable addToComperable = (Comparable)addToObj;
        Comparable newNodeComperable = (Comparable)newNodeObj;
        if(addToComperable.compareTo(newNodeComperable)==0){
            return;
        }
        if(addToComperable.compareTo(newNodeComperable)>0){
            if(addTo.getLeft()==null){

                addTo.setLeft(newNode);
            }
                else{
                add(addTo.getLeft(), newNode);
            }
            }
            else if (addToComperable.compareTo(newNodeComperable)<0) {
            if(addTo.getRight()==null){
                addTo.setRight(newNode);
            }else{
                add(addTo.getRight(), newNode);
            }
        }

    }
    public void add(Node newNode){
        if (root==null){
            root = newNode;
        }
        add(root,newNode);

    }
@Override
    public String toString() {
        return null ;
    }

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.add(3);
        tree.add(3);
        tree.add(4);
        System.out.println(tree);
    }
}
