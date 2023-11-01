package lesson_7.HW_7.question2;

public class Main {
    public static void main(String[] args) {

        Product watermelon = new Product("Арбуз", 300, 4.8);
        Product melon = new Product("Дыня", 200, 4.6);
        Product bananas = new Product("Банан", 100, 5.0);
        Product chips = new Product("Чипсы", 140, 4.1);
        Product croutons = new Product("Сухарики", 50, 3.8);
        Product straws = new Product("Соломка", 80, 3.9);

        Category fruits = new Category("Фрукты", new Product[]{watermelon, melon, bananas});
        Category snacks = new Category("Снеки", new Product[]{chips, croutons, straws});

        Basket basket = new Basket(new Product[]{watermelon,melon,bananas,chips,croutons,straws});

        User user = new User("dmdm","DmDm",basket);
        System.out.println(fruits + "\n" + snacks);
        System.out.println(user);
    }
}
