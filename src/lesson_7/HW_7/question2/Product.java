package lesson_7.HW_7.question2;

public class Product {
    private String name;
    private int price;
    private double raring;

    public Product(String name, int price, double raring) {
        setName(name);
        setPrice(price);
        setRaring(raring);
    }

    public void setName(String name) {
        if (!name.isBlank()){
            this.name = name;
        } else {
            System.out.println("Ошибка");
        }
    }

    public void setPrice(int price) {
        if (price>0){
            this.price = price;
        }
        System.out.println("Цена не может быть < 0");
    }

    public void setRaring(double raring) {
        if (raring>0 && raring <=5){
            this.raring = raring;
        } else {
            System.out.println("Райтинг может быть только от [0 до 5]");
        }
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public double getRaring() {
        return raring;
    }

    @Override
    public String toString() {
        return getName() + " Цена: " + getPrice() + " Рейтинг: " + getRaring();
    }
}
