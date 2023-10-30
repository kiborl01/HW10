package lesson_6.polymorhism;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.eat();

        Animal animal = new Cat();
        animal.eat();


    }
}
