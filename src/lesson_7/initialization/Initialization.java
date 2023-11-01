package lesson_7.initialization;

public class Initialization {
    public static void main(String[] args) {

        double random = Algebra.randomDouble();

        System.out.println(random);


        int value;
        value = 7;

        Algebra algebra = new Algebra();
        System.out.println(algebra.getPi());

        String email;


        email = "test@mail.ru";


        if (Util.check(email)){
            System.out.println(email);
        }else {
            return;
        }


        String newHello = algebra.hello + " from class Initialization";
        System.out.println(newHello);
    }
}
