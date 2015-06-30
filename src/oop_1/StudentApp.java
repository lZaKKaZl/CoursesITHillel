package oop_1;

public class StudentApp {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.id = 99;
        System.out.println(student1.id);

        Student student2 = new Student();
        student2.id = 100;

        student1.come();
        student2.come();
        student1.leave();
        student2.leave();

    }
}
