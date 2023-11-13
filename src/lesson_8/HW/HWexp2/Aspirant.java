package lesson_8.HW.HWexp2;

public class Aspirant extends Student {
    private String scientificWork;

    public Aspirant() {
    }

    public Aspirant(double averageMark) {
        super(averageMark);
    }


    public Aspirant(String firstName, String lastName, String group, double averageMark, String scientificWork) {
        super(firstName, lastName, group, averageMark);
        setScientificWork(scientificWork);
    }


    public String getScientificWork() {
        return scientificWork;
    }

    public void setScientificWork(String scientificWork) {
        this.scientificWork = scientificWork;
    }

    @Override
    public int getScholarship() {
        if (getAverageMark() == 5.0) {
            return 2500;
        } else {
            return 2200;
        }
    }
}
