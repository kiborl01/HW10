package lesson_7.HW_7;

public class Horse extends Animal {


    public Horse(String food, String location) {
        super(food, location);

    }

    @Override
    public void makeNoise() {
        System.out.println("Horses make noise Igogo");
    }

    @Override
    public void eat(String food) {
        System.out.println("Horses like eating fields");
    }

    public void runHorse() {
        System.out.println("Horses very fast run");
    }
}
