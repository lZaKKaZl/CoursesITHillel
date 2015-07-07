package oop_3heap.stack;

/**
 * Created by ITHILLEL5 on 07.07.2015.
 */
public class TestArrayChange {
    public static void main(String[] args) {
       Person person = new Person(10,"Marakew");
        StudentNewVersion student = new StudentNewVersion(100, "Ivaniw", new int[]{1,2,3});

        System.out.println(person.getId());
        System.out.println(student.getId());

        student.print();
        person.print();

    }
}
