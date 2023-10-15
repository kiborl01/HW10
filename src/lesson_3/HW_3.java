package lesson_3;

import java.util.Scanner;

public class HW_3 {
    public static void main(String[] args) {

        System.out.println("Задание 1");

        Scanner sc1 = new Scanner(System.in);
        int w = sc1.nextInt();

        if (w < 5) {
            System.out.println("Число меньше 5");
        } else if (w > 5) {
            System.out.println("Число больше 5");
        } else {
            System.out.println("Число равно 5");
        }

        System.out.println("----------------------------");
        System.out.println("Задание 2");

        int number = sc1.nextInt();
        if (number >= 50 && number <= 100) {
            System.out.println("Число " + number + " содержится в интервале.");
        } else {
            System.out.println("Число " + number + " не содержится в интервале.");
        }

        System.out.println("----------------------------");
        System.out.println("Задание 3");

        int month = sc1.nextInt();
        switch (month) {
            case 12, 1, 2:
                System.out.println("Зима");
                break;
            case 3, 4, 5:
                System.out.println("Весна");
                break;
            case 6, 7, 8:
                System.out.println("Лето");
                break;
            case 9, 10, 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не бывает");
                break;
        }

        System.out.println("----------------------------");
        System.out.println("Задание 4");

        int s = sc1.nextInt();
        if (s > 0) {
            System.out.println(s * 2);
        } else if (s < 0) {
            System.out.println(s+1);
        } else {
            System.out.println(0);
        }

        System.out.println("----------------------------");
        System.out.println("Задание 6(в задании нет номера 5)");

        int year = sc1.nextInt();
        if (year % 400 == 0) {
            System.out.println("количество дней в этом году: 366");
        } else if (year % 100 == 0) {
            System.out.println("количество дней в этом году: 365");
        } else if (year % 4 == 0) {
            System.out.println("количество дней в этом году: 366");
        } else {
            System.out.println("количество дней в этом году: 365");
        }

        System.out.println("----------------------------");
        System.out.println("Задание 7");

        int a = sc1.nextInt();
        int b = sc1.nextInt();
        int c = sc1.nextInt();

        if (a < b + c && b < a + c && c < a + b) {
            System.out.println("Треугольник существует");
        } else {
            System.out.println("Треугольник не существет");
        }

        System.out.println("----------------------------");
        System.out.println("Задание 8");

        double t = sc1.nextDouble();
        if (t >= 60) {
            System.out.println("Такое число нельзя");
            return;
        }

        double q = t % 10;

        if (q >= 0 && q < 3 || q >= 5 && q < 8) {
            System.out.println("Зеленый");
        } else if (q >= 3 && q < 4 || q >= 8 && q < 9) {
            System.out.println("Жёлтый");
        } else if (q >= 4 && q < 5 || q >= 9 && q < 10) {
            System.out.println("Красный");
        }
    }
}
