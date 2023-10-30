package lesson_7.HW_7;

public class Cat extends Animal {

    public Cat(String food, String location) {
        super(food, location);
    }

    @Override
    public void makeNoise() {
        System.out.println("Cats make noise meow");
    }

    @Override
    public void eat(String food) {
        System.out.println("Cats like eating milk");

    }


    public void SmellCat() {
        System.out.println("Cats don't smell anything");
    }
}
