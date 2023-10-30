package lesson_7.HW_7;

public class Animal {

    private String food;
    private String location;

    public Animal(String food, String location) {
        setFood(food);
        setLocation(location);
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food=food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void makeNoise() {
        System.out.println("The animal make noise ");
    }

    public void eat(String food) {
        System.out.println("The animal eating: " + food);
    }

    public void sleep() {
        System.out.println("The animal sleeping ");
    }


}
