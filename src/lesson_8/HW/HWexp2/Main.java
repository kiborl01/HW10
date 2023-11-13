package lesson_8.HW.HWexp2;

public class Main {

    public static void main(String[] args) {

        Student[] students;

        Student student1 = new Student(5.0);
        Student student2 = new Student(2.0);

        Aspirant aspirant1 = new Aspirant(3.0);
        Aspirant aspirant2 = new Aspirant(5.0);

        students = new Student[]{student1,student2,aspirant1,aspirant2};

        for (Student money: students) {
            System.out.println(money.getScholarship());
        }
    }
}
