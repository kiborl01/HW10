package lesson_7.HW_7;

public class Dog extends Animal {


    public Dog(String food, String location) {
        super(food, location);

    }

    @Override
    public void makeNoise() {
        System.out.println("Dogs make noise Gav-Gav");
    }

    @Override
    public void eat(String food) {
        System.out.println("Dogs like eating meat");
        ;
    }

    public void sniffDog() {
        System.out.println("Dogs have a very good nose");
    }
}
