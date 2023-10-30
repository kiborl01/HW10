package lesson__8;

import lesson__8.singleton.Cat;

public class Main {
    public static void main(String[] args) {
        Cat cat = Cat.getCat();

        System.out.println(cat);

        System.out.println(cat.getName());

    }
}
