package lesson_5;

public class Main {
    public static void main(String[] args) {

//        int[] array = new int[10];
//        int a = 90;
//        for (int i = 0; i < array.length; i++) {
//            array[i] = a++;
//        }
//
//        for (int element : array) {
//            System.out.println(element);
//        }
        int[] array1 = new int[50];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = i;
        }
        // 1- тип переменных, который хранится в массиве
        // 2- алиас (наименование переменной(a,b,c,у,elements и тд, просто название))
        // 3- за двоеточием ставим название массива
        for (int elements1 : array1) {
            System.out.print(elements1 + " ");
        }
        System.out.println();
        for (int a : array1) {
            if (a % 2 == 0) {
                System.out.print(a + " ");
            }
        }
        System.out.println();
        for (int b : array1) {
            if (b % 3 == 0) {
                System.out.print(b + " ");
            }
        }
        System.out.println();
        for (int c : array1) {
            if (c % 5 == 0 && c != 0 && c != 45) {
                System.out.print(c + " ");
            }
        }
        System.out.println();
        for (int element1 : array1) {
            if (element1 % 5 == 0 && element1 > 20 && element1 <= 45) {
                System.out.print(element1 + " ");
            }
        }


    }
}
