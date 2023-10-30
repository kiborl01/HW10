package lesson_6.interfaces;

public interface HumanInterface {
    default int maxOfLifeInYears(){
        return 150;
    }
    int swim();
    int run();
    int sleepHours();
}
