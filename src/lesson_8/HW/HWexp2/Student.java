package lesson_8.HW.HWexp2;

public class Student {
    private String firstName;
    private String lastName;
    private String group;
    private double averageMark;

    public Student() {
    }

    public Student(String firstName, String lastName, String group, double averageMark) {
        setFirstName(firstName);
        setLastName(lastName);
        setGroup(group);
        setAverageMark(averageMark);
    }

    public Student(double averageMark) {
        setAverageMark(averageMark);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        if (averageMark > 0.0 && averageMark <= 5.0) {
            this.averageMark = averageMark;
        } else {
            System.out.println("Не верно ввёденная оценка");
        }
    }

    public int getScholarship() {
        if (getAverageMark() == 5.0) {
            return 2000;
        } else {
            return 1900;
        }
    }

}
