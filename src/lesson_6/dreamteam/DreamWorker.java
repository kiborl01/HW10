package lesson_6.dreamteam;

public class DreamWorker {

    // fields

    private String name;

    private String vacancy;

    // constructoe

    public DreamWorker() {
    }


    public DreamWorker(String name, String vacancy) {
        this.name = name;
        this.vacancy = vacancy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVacancy() {
        return vacancy;
    }

    public void setVacancy(String vacancy) {
        this.vacancy = vacancy;
    }

    public void work(String work) {
        System.out.println("This person is doing " + work);
    }

    public void getSalary(int salary) {
        System.out.println(this.vacancy + "is getting " + salary);
    }

}
