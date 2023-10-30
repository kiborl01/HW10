package lesson_6.interfaces;

public class OldMan implements HumanInterface{
    @Override
    public int swim() {
        return 5;
    }

    @Override
    public int run() {
        return 20000;
    }

    @Override
    public int sleepHours() {
        return 12;
    }
}
