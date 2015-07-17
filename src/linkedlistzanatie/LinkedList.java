package linkedlistzanatie;

import java.util.Collection;
import java.util.Iterator;


public class LinkedList implements Collection{
    private Element first;

    @Override
    public int size() {
        int size = 0;
        Element currentElement = first;
        while (currentElement!=null){
            currentElement = currentElement.getNext();
            size ++;
        }
        return size;
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public boolean contains(Object o) {
        Element currentElement = first;
        while (currentElement!=null) {
            if (currentElement.getData().equals(o)) {
                return true;
            }
                currentElement = currentElement.getNext();

        }
        return false;
    }
    //TODO iterator
    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public T[] toArray(Object[] a) {
        return new T[0];
    }

    @Override
    public String toString(){
        String result = "";
        Element currentElement = first;
        if(currentElement==null){
            return result;
        }
        while (currentElement!=null) {
            result+= currentElement.getData() + ", ";
            currentElement = currentElement.getNext();

        }
        return result;
    }

    @Override
    public boolean add(Object o) {
        Element toAdd = new Element();
        Element lastElement = getLastElement();
        if (lastElement==null){first=toAdd;}
        else {
            return true;
        }
    }
    private Element getLastElement() {
        Element lastElement = first;
        if (lastElement == null) {
            return lastElement;
        }
        while (lastElement.getNext() != null) {
            lastElement = lastElement.getNext();
        }
    }


    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        if (c==null || c.isEmpty()){
            return false;
        }
        for (Object o : c){
            add(o);
        }
        return true;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    public static void main(String[] args) {
        System.out.println(1==1);
        System.out.println('a'=='a');
        Element firstElement = new Element(null,2.5);
        Element secondElement = new Element(null,2.5);
        System.out.println();
    }
}
