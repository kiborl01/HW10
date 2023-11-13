package lesson_8.singleton;

public class Cat {
    private static Cat cat;
    private final String name;

    private Cat() {
        name = "Pushok";
    }

    public static Cat getCat() {
        if (cat == null) {
            return new Cat();
        }
        return cat;
    }

    public String getName() {
        return name;
    }
}
