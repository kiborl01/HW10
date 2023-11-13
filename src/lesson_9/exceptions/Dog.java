package lesson_9.exceptions;

public class Dog {
    private String name;

    private boolean isCollarPuton;
    private boolean isLeashPuton;
    private boolean isMuzzlePuton;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCollarPuton() {
        return isCollarPuton;
    }

    public void setCollarPuton(boolean collarPuton) {
        isCollarPuton = collarPuton;
    }

    public boolean isLeashPuton() {
        return isLeashPuton;
    }

    public void setLeashPuton(boolean leashPuton) {
        isLeashPuton = leashPuton;
    }

    public boolean isMuzzlePuton() {
        return isMuzzlePuton;
    }

    public void setMuzzlePuton(boolean muzzlePuton) {
        isMuzzlePuton = muzzlePuton;
    }

    public void putCollar() {
        System.out.println("Ошейник надет");
        this.isCollarPuton = true;
    }

    public void putLeash() {
        System.out.println("Поводок надет");
        this.isLeashPuton = true;
    }

    public void putMuzzle() {
        System.out.println("Намордник надет");
        this.isLeashPuton = true;
    }

//    public void walk() {
//        System.out.println("Идём на прогулку!");
//
//        if (isLeashPuton && isCollarPuton && isMuzzlePuton) {
//            System.out.println("Да мы готовы, идём гулять!");
//        } else {
//            throw new DogIsNotReadyException("Собака не готова");
//        }
//    }

}
