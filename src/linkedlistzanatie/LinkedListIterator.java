package linkedlistzanatie;

import java.util.Iterator;


public class LinkedListIterator implements Iterator {

    private Element currentElement;

    public LinkedListIterator (Element firstElement){
        this.currentElement = firstElement;
    };
//    TODO hasNext
    @Override
    public boolean hasNext() {

    }

    @Override
    public Object next() {
        Element toReturn = currentElement;
        currentElement = currentElement.getNext();
        return toReturn;
    }
}
