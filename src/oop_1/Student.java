package oop_1;

public class Student {
    String surname;
    int[] marks ;
    int id = 0;

    public void come() {
        System.out.println("Student � " + id + " Has come!!!");
    }

    public void leave() {
        System.out.println("Good bye student � " + id);
    }
}
