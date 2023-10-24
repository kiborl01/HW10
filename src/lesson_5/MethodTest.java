package lesson_5;

public class MethodTest {


    public static void main(String[] args) {
        // public - зона видимости , к нему может обратиться еще кто то
        // static - статичный метод , ...
        // void - (сам по себе обозначает пустой) программ отрабатывает от начала и до конца
//        System.out.println("Сейчас я вызову метод printFrom1to5");
//        printFrom1to5();
//        System.out.println("Вызов метода printFrom1to5 окончен");
//        writeHello();
//        printName("Dmitry");
//        printAge(26);
//        printCity("Moscow");
//        print2ndNameAndLastname("Dmitry","Dmitrov");
//        printParentsNames("Vlad","Lyudmila");
//
//        int dream = getFutureSalary();
//        System.out.println("My future salary " + dream + "rub.");

        int otvet = get7x7();
        System.out.println("Result of 7 * 7 = " + otvet);

        System.out.println("Result of 7x9 = " + get7x(9));

        System.out.println("Summa = " + getSumma(148960, 25680));
        System.out.println("Umnozhenie = " + getUmn(23, 44));
        System.out.println("Result of kvadrat" + getkvadrat(5));
    }
//    public static void printFrom1to5() {
//        System.out.println("1");
//        System.out.println("2");
//        System.out.println("3");
//        System.out.println("4");
//        System.out.println("5");
//    }
//    public static void writeHello() {
//        System.out.println("Hello");
//    }
//    public static void printName(String name) {
//        System.out.println("My name is " + name);
//    }
//
//    public static void printAge(int age) {
//        System.out.println("My age is : " + age);
//    }
//    public static void printCity (String city){
//        System.out.println("I'm from is " + city);
//    }
//    public static void print2ndNameAndLastname (String secondName, String lastname ){
//        System.out.println("My name is " + secondName + " and my lastname is " + lastname);
//    }
//    public static void printParentsNames (String fatherName, String motherName){
//        System.out.println("My father's name is " + fatherName + " and my mother's name is " + motherName);
//    }
//
//
//
//    public static int getFutureSalary (){
//        System.out.println("Сейчас подумаю.....");
//        return 300000;
//    }







    public static int get7x7(){
        return 7*7;
    }

    public static int get7x (int num){
        return 7*num;
    }

    public static int getSumma (int num1, int num2){
        return  num1+num2;
    }
    public static int getUmn (int num1, int num2){
        return  num1*num2;
    }

    public static int getkvadrat (int num1){
        return  num1*num1;
    }


}
