package lesson_8;

import lesson_8.singleton.Cat;

public class Main {
    public static void main(String[] args) {
        Cat cat = Cat.getCat();

        System.out.println(cat);

        System.out.println(cat.getName());

    }
}
