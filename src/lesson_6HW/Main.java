package lesson_6HW;

public class Main {
    public static void main(String[] args) {

        Human human1 = new Human("Dmitriy", true, 71);
        Human human2 = new Human("Maria", false, 70);
        Human human3 = new Human("Oleg", true, 66);
        Human human4 = new Human("Nina", false, 64);

        Human human5 = new Human("Petya", true, 45, human1, human2);
        Human human6 = new Human("Lisa", false, 41, human3, human4);

        Human human7 = new Human("Kolya", true, 22, human5, human6);
        Human human8 = new Human("Olya", false, 20, human5, human6);

        Human human9 = new Human("Ivan", true, 8, human7, human8);

        System.out.println(human1);
        System.out.println(human2);
        System.out.println(human3);
        System.out.println(human4);
        System.out.println(human5);
        System.out.println(human6);
        System.out.println(human7);
        System.out.println(human8);
        System.out.println(human9);


        Cat cat = new Cat("Barsik");
        Cat cat2 = new Cat("Busya", 2, 5);
        Cat cat3 = new Cat(" Рыжка", 4, 0);
        Cat cat4 = new Cat(4, "red", null);
        Cat cat5 = new Cat("Simba", null, 10);

    }
}
