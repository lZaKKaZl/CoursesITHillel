package day2807;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * Created by ITHILLEL5 on 28.07.2015.
 */
public class HashTable {
    private LinkedList[] table = new LinkedList[10];
    private static int DEFAULT_TABLE_SIZE = 10;

    public void put(Object key, Object value){
        int index =key.hashCode()%DEFAULT_TABLE_SIZE;

    LinkedList linkedList = table[index];
    if(linkedList==null) {
        linkedList = new LinkedList();
    }
        Entry entryToAdd = new Entry(key, value);
        if (linkedList.contains(entryToAdd)) {
            linkedList.add(new Entry(key, value));
        }
        table[index]=linkedList;
    }

    public Object get(Object key){
        int index =key.hashCode()%DEFAULT_TABLE_SIZE;
        LinkedList list = table[index];
        if(list==null)return null;
       for(Object entryFromList : list){
           Entry entry = (Entry)entryFromList;
           if(entry.getKey().equals(key)){
               return entry.getValue();
           }
       }
       return null;
    }

    public static class Entry{
        private Object key;
        private Object value;

        public Entry(Object key, Object value){
        this.key=key;
            this.value=value;
        }

        public Object getKey() {
            return key;
        }

        public Object getValue() {
            return value;
        }
    }

    @Override
    public String toString() {
        return "HashTable{" +
                "table=" + Arrays.toString(table) +
                '}';
    }

    public static void main(String[] args) {
    HashTable table = new HashTable();
        table.put(6,"Petrov is very big MAN!!!");
        table.put(5, 1233);
        table.put(2, 1213);
        table.put(3, 12343);
        table.put(4, 1523);
        System.out.println(table.get(5));
    }
}
