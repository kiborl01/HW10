package lesson_10;

import java.util.ArrayList;

public class Tasks {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 1; i < 11; i++) {
            arrayList.add(i);
        }

        for (Integer i : arrayList) {
            System.out.print(i + " ");
        }
        System.out.println("");
        System.out.println("-----------------------");



        ArrayList<Integer> arrayList2 = new ArrayList<>();
        for (int i = 10; i < 21; i++) {
            arrayList2.add(i);
        }
        for (Integer i : arrayList2) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");
        System.out.println("-----------------------");

        ArrayList<Integer> arrayList3 = new ArrayList<>();
        for (int i = 1; i < 100; i++) {
            arrayList3.add(i);
        }

        for (Integer n : arrayList3) {
            if (n % 3 == 0 && n % 5 == 0) {
                System.out.print(n + " ");
            }
        }
        System.out.println("");
        System.out.println("-----------------------");

        ArrayList<String> arrayList4 = new ArrayList<>();
        arrayList4.add("A");
        arrayList4.add("B");
        arrayList4.add("C");
        arrayList4.add("D");
        arrayList4.add("E");
        arrayList4.add("F");
        arrayList4.add("G");
        arrayList4.add("H");

        arrayList4.remove("c");
        arrayList4.remove("D");
        arrayList4.remove("G");

        System.out.println(arrayList4);




    }

}
