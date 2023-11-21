package lesson_10.HW10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");

        ArrayList<String> arrayList1 = new ArrayList<>();

        arrayList1.add("AAA");
        arrayList1.add("BBB");
        arrayList1.add("CCC");
        arrayList1.add("DDD");
        arrayList1.add("EEE");

        System.out.println("Size for arrayList1 - " + arrayList1.size());
        for (int i = 0; i < arrayList1.size(); i++) {
            System.out.println(arrayList1.get(i));
        }

        System.out.println("------------------------------------");
        System.out.println("Задание 2");

        ArrayList<String> arrayList2 = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int max2=0;
        for (int i = 0; i < 5; i++) {
            arrayList2.add(i, scanner.nextLine());
            if (arrayList2.get(i).length()>max2){
                max2=arrayList2.get(i).length();
            }
        }
        for (int i = 0; i < arrayList2.size(); i++) {
            if (max2==arrayList2.get(i).length()){
                System.out.println(arrayList2.get(i));
            }
        }

        System.out.println("------------------------------------");
        System.out.println("Задание 3");

        ArrayList<String> arrayList3 = new ArrayList<>();
        int minimum3 = 1;
        for (int i = 0; i < 5; i++) {
            arrayList3.add(i, scanner.nextLine());
            if (arrayList3.get(i).length() <= minimum3) {
                minimum3 = arrayList3.get(i).length();
            }
        }

        for (int i = 0; i < arrayList3.size(); i++) {
            if (minimum3 == arrayList3.get(i).length()) {
                System.out.println(arrayList3.get(i));
            }
        }

        System.out.println("------------------------------------");
        System.out.println("Задание 4");

        ArrayList<String> arrayList4=new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList4.add(0,scanner.nextLine());
        }

        for (int i = 0; i < arrayList4.size(); i++) {
            System.out.println(arrayList4.get(i));
        }

        System.out.println("------------------------------------");
        System.out.println("Задание 5");


        ArrayList<String> arrayList5 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arrayList5.add(i, scanner.nextLine());
        }
        String lastElement = arrayList5.remove(arrayList5.size()-1);
        for (int i = 0; i < 13; i++) {
            arrayList5.add(0, lastElement);
        }

        for (String arr5: arrayList5) {
            System.out.println(arr5);
        }

        System.out.println("------------------------------------");
        System.out.println("Задание 6");

        ArrayList<String> arrayList6 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            arrayList6.add(i, scanner.nextLine());
        }
        int max6 = arrayList6.get(0).length();
        int min6 = arrayList6.get(0).length();
        for (String s: arrayList6) {
            if (s.length() < min6){
                min6 = s.length();
            }if (s.length() > max6){
                max6 = s.length();
            }
        }
        for (String s: arrayList6) {
            if (s.length() == min6) {
                System.out.println("Первой встретилась самая короткая строка - " + s);
                break;
            }
            if (s.length() == max6) {
                System.out.println("Первой встретилась самая длинная строка - " + s);
                break;
            }
        }

        System.out.println("------------------------------------");
        System.out.println("Задание 7");

        ArrayList<Integer> arrayList7 = new ArrayList<>();
        ArrayList<Integer> arrayList8 = new ArrayList<>();
        ArrayList<Integer> arrayList9 = new ArrayList<>();
        ArrayList<Integer> arrayList10 = new ArrayList<>();


        for (int i = 0; i < 20; i++) {
            arrayList7.add(i, scanner.nextInt());
            if (arrayList7.get(i) % 3 == 0) {
                arrayList8.add(arrayList7.get(i));
            }
            if (arrayList7.get(i) % 2 == 0) {
                arrayList9.add(arrayList7.get(i));
            }

            else if (arrayList7.get(i) % 2 != 0 &&arrayList7.get(i) % 3 != 0){
                arrayList10.add(arrayList7.get(i));
            }
        }
        printList(arrayList8);
        printList(arrayList9);
        printList(arrayList10);

    }

    public static void printList(List<Integer> list) {
        for (Integer s : list) {
            System.out.print(s + ", ");
        }
        System.out.println();
    }
}





