package lesson_7.HW_7.question3;

public class Person {
    private String fullName;
    private int age;


    public void move(){
        System.out.println("Неизвестный что-то говорит");
    }

    public void talk(){
        System.out.println(getFullName() + " говорит, мне " + getAge() + " лет.");
    }

    public Person() {
    }

    public Person(String fullName, int age) {
        setFullName(fullName);
        setAge(age);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
