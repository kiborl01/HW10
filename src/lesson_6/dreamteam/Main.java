package lesson_6.dreamteam;

public class Main {
    public static void main(String[] args) {
        // 3 сущности - фронт,бэк,проджменеджр
        // Фронт - работать, писать скрипты, получать зп
        // Бэк - работать, записать данные в БД
        // Проджектменеджер - получать зп, работать(тех задание),
        Frontender frontender = new Frontender("Vasiliy","frontender");
        Backender backender = new Backender("Dmitriy","java-backender");
        ProjectManager projectManager = new ProjectManager("Victor","analytic");

        frontender.writingScrypts();
        frontender.getSalary(1000);

        backender.writingCode();
        backender.work("Writing spring application");
        backender.getSalary(1500);

        projectManager.work("Analysing data");
        projectManager.getSalary(700);


    }
}
