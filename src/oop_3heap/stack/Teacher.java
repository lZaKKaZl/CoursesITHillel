package oop_3heap.stack;

/**
 * Created by ITHILLEL5 on 07.07.2015.
 */
public class Teacher {

    private  int id = 0;
    private String surname;
    private double salary;

    public Teacher(int id, String surname, double salary) {
        this.id = id;
        this.surname = surname;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public double getSalary() {
        return salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
