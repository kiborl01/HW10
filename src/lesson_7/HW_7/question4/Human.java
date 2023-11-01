package lesson_7.HW_7.question4;

public class Human {

    // поля
    private String name;
    private Boolean sex;
    private int age;
    private Human dad;
    private Human mom;
    // конструктор


    public Human(String name, Boolean sex, int age) {
        setName(name);
        setSex(sex);
        setAge(age);
    }

    public Human(String name, Boolean sex, int age,Human dad, Human mom) {
        this(name, sex, age);
        setDad(dad);
        setMom(mom);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean isSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public Human getDad() {
        return dad;
    }

    public void setDad(Human dad) {
        this.dad = dad;
    }

    public Human getMom() {
        return mom;
    }

    public void setMom(Human mom) {
        this.mom = mom;
    }

    public String toString() {
        String text = "";
        text += "Имя: " + getName();
        text += ", пол: " + (isSex() ? "мужской" : "женский");
        text += ", возраст: " + getAge();

        if (this.dad != null) {
            text += ", отец: " + getDad().getName();
        }

        if (this.mom != null) {
            text += ", мать: " + getMom().getName();
        }

        return text;
    }
}


