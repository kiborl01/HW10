package lesson_7.HW_7.question2;

public class User {

    private String log;
    private String pass;
    private Basket basket;

    public User(String log, String pass, Basket basket) {
        setLog(log);
        setPass(pass);
        setBasket(basket);
    }

    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    @Override
    public String toString() {
        return "Логин: " + getLog() + " Пароль: " + getPass() + " Корзина: " + getBasket();
    }
}
