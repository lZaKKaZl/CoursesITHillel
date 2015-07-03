package oop_1;

public class Student {
    private String surname;
    private int[] marks;
    private int id;

    public Student() {
        id = 0;
        surname = "N/A";
        marks = new int[34];
    }

    public Student(int i, String s, int[] m) {
        id = i;
        surname = s;
        marks = m;
    }

    public Student(int i, String s) {
        id = i;
        surname = s;
        marks = new int[34];
    }

    public Student(Student st) {     // поверхностное клонирование
        id = st.id;
        surname = st.surname;
        marks = st.marks;
    }

//    public Student(Student sts) {     // глубинное клонирование(deep clone)
//        id = sts.id;
//        surname = sts.surname;
//        marks = new int[sts.marks.length];
//        for (int i = 0; i < sts.marks.length; i++) {
//            marks[i] = sts.marks[i];
//        }
//    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        if(id > 999999){
            System.out.println("ID is incorrect!!!");
            id = 0;
        }
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setMark(int lessonNum, int mark){
        this.marks[lessonNum] = mark;

    }

    public int getMark(int lessonNum){
        return this.marks[lessonNum];
    }

    //    public void come() {
//        System.out.println("Student № " + id + " has come!!!");
//    }
//
//    public void leave() {
//        System.out.println("Good bye student № " + id);
//    }
}
