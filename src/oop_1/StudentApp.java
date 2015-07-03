package oop_1;

import oop_2.Group;

public class StudentApp {
    public static void main(String[] args) {
        Student student1 = new Student(5, "Ivanov");
        Student student2 = new Student(3, "Petrov");
        student1.setMark(2,5);
        student2.setMark(6,4);

//        System.out.println(student1.getMark(2));
//        System.out.println("Student number"+ student1.setId() +;student2.getMark(6));

        Group group = new Group();
        group.addStudents(student1);
        group.addStudents(student2);
        group.addStudents("Petrov");
        group.print();
    }
}
