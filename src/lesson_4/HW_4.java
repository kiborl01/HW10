package lesson_4;

import java.util.Scanner;

public class HW_4 {
    public static void main(String[] args) {
        System.out.println("Задание 1");

        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        for (int i = m; i > 0; i--) {
            for (int j = n; j > 0; j--) {
                System.out.print("8");
            }
            System.out.println();
        }

        System.out.println("-------------------------------------------");
        System.out.println("Задание 2");

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("8");
            }
            System.out.println();
        }

        System.out.println("-------------------------------------------");
        System.out.println("Задание 3");

        int[] array3 = new int[3];
        for (int i = 0; i < array3.length; i++) {
            array3[i] = scanner.nextInt();
        }
        int p = array3[0];
        int l = array3[1];
        int k = array3[2];
        if ((p > l && p < k) || (p < l && p > k)) {
            System.out.println("Среднее число - " + p);
        } else if ((l > p && l < k) || (l < p && l > k)) {
            System.out.println("Среднее число - " + l);
        } else if ((k > l && k < p) || (k < l && k > p)) {
            System.out.println("Среднее число - " + k);
        } else if ((p == l && p != k) || (l == k && l != p) || (p == k && k != l)) {
            System.out.println("Два из трёх чисел равны, не получается найти среднее из них");
        } else {
            System.out.println("Все три введеных числа  = " + p);
        }

        

        System.out.println("-------------------------------------------");
        System.out.println("Задание 4");

        int summa = 0;
        while (true) {
            int numbers4 = scanner.nextInt();
            summa = numbers4 + summa;
            if (numbers4 == -1) {
                break;
            }
        }
        System.out.println(summa);

        System.out.println("-------------------------------------------");
        System.out.println("Задание 5");

        int q = 1;
        int w = 1;
        while (q <= 10) {
            while (w <= 10) {
                System.out.print(q * w + " ");
                w++;
            }
            System.out.println();
            q++;
            w=1;
        }

        System.out.println("-------------------------------------------");
        System.out.println("Задание 6");

        String name = scanner.next();
        int day = scanner.nextInt();
        int month = scanner.nextInt();
        int year = scanner.nextInt();

        if ((day <= 31 && day > 0) && (month < 13 && month > 0)) {
            System.out.println("Меня зовут " + name + ".");
            System.out.println("Я родился " + day + "." + month + "." + year);
        } else {
            System.out.println("Не корректно введённые данные");
        }
    }
}
