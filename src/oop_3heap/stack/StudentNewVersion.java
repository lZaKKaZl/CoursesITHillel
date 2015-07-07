package oop_3heap.stack;

/**
 * Created by ITHILLEL5 on 07.07.2015.
 */
public class StudentNewVersion extends Person {
    private int[] marks = new int[34];

    public StudentNewVersion(int id, String sur, int[] marks) {
        super(id,sur);
        this.marks = marks;
    }

    public void print (){
        super.print();
        System.out.println("Hello I am student");
    }

    public void setMarks(int[] marks) {
        System.out.println(this.getId());
        this.marks = marks;
    }

    public int[] getMarks() {

        return marks;
    }
}
