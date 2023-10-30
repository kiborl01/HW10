package lesson_7.HW_7;

public class Main {
    public static void main(String[] args) {

        Veterinarian veterinarian = new Veterinarian();

        Animal animal1 = new Animal("Milk", "House");
        Animal animal2 = new Animal("Meat", "Vol'er");
        Animal animal3 = new Animal("Grass", "Meadow");


        Animal[] animals = {animal1,animal2,animal3};
        for (Animal animal:animals) {
            veterinarian.treatAnimal(animal);
        }



    }
}
