package lesson_6;

public class Main {
    public static void main(String[] args) {
        Cat snezhok = new Cat("Snezhok" );
        Cat pushok = new Cat(10);
        Cat belok = new Cat("Belyash",10);
        System.out.println("My cat's name is " + belok.getName() + " his age is " + belok.getAge());

        Dog dog1 = new Dog();
        dog1.setHeight(30);

        Dog dog2 = new Dog("Barny", 25 ,60);



        dog2.setName("peeeeeeesssss");
        dog2.setSpeed(40);
        dog2.setHeight(70);
        dog2.setFriend(pushok);


        System.out.println("I have Cat. His name is " + snezhok.getName());
        System.out.println("His age is " + snezhok.getAge());
        System.out.println("His breed is " + snezhok.getBreed());
        System.out.println("Hi is " + snezhok.getColor());
    }
}
