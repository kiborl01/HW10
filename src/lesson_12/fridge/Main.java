package lesson_12.fridge;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Fridge fridge = new Fridge();

        fridge.addProducts("Milk", 2);
        fridge.addProducts("Potatos", 12);
        fridge.addProducts("Meat", 3);
        fridge.addProducts("Apple", 6);

        fridge.printFridge();

        fridge.take("Apple",2);

        fridge.addOrders("Bananas",2);
        fridge.addOrders("Meat",2);
        fridge.printFridge();

    }
}
