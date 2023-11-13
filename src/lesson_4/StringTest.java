package lesson_4;

import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {

        String str = "Hello world";
        String str1 = new String("Hello from new initialization");

        System.out.println(str.length());
        System.out.println(str1.length());// кол-во букв которое есть в стринге (Дом длинна будет 3, собака - 6)

        Scanner scanner = new Scanner(System.in);
        String email = scanner.nextLine();
//        String email1 = scanner

        if (email.length() == 0) {
            System.out.println("Error. Length of email must not to be 0");
        }

        if (!email.toLowerCase().endsWith(".ru")) {
            System.out.println("Error. Email must to be ended on russian domen");
            return;
        }

        String[] split = email.split("@");

        if (split.length != 2) {
            System.out.println("Error. Email must contains char '@' ");
        }

        if (email.startsWith(".")){
            System.out.println("Error. Email must not to be started on char '.'");
        }

        String finalEmail = email.toLowerCase();
        System.out.println("Your email is correct : " + finalEmail);


//        int a = 5;
//        int b = 10;
//
//        System.out.println(a == b);

        String s1 = "Hello!";
        String s2 = "Goodbye";

        System.out.println(s1.equals(s2));
    }
}
