package oop_3heap.stack;

/**
 * Created by ITHILLEL5 on 07.07.2015.
 */
public class Person {
    private int id;
    private String person;

    public Person(int id, String person) {
        this.id = id;
        this.person = person;
    }

    public int getId() {
        return id;
    }

    public String getPerson() {
        return person;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public void print (){
        System.out.println("Hello I am person");
    }
}
