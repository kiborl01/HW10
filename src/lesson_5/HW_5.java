package lesson_5;

import java.util.Scanner;

public class HW_5 {
    public static void main(String[] args) {
//        int arr[] = new int[5];
//        arr[0] = 24;
//        arr[1] = 15;
//        arr[2] = 21;
//        arr[3] = 7;
//        arr[4] = 11;
//
//        boolean isSorted = false;
//
//        while (!isSorted) {
//            isSorted = true;
//            int remember = 0;
//
//            for (int i = 0; i < arr.length - 1; i++) {
//                if (arr[i] > arr[i + 1]) {
//                    isSorted = false;
//                    remember = arr[i];
//                    arr[i] = arr[i + 1];
//                    arr[i + 1] = remember;
//                }
//            }
//        }
//        System.out.println(arr[1]);

        System.out.println("Задание 1");
//        1. Создать массив на 10 строк.
//        2. Ввести с клавиатуры 8 строк и сохранить их в массив.
//        3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.

        Scanner scanner = new Scanner(System.in);

        String[] string1 = new String[10];
        for (int i = 0; i < 8; i++) {
            string1[i] = scanner.nextLine();
        }
        for (int i = 9; i >= 0; i--) {
            System.out.println(string1[i]);
        }
        System.out.println("Задание ----------------------------------------");
        System.out.println("Задание 2");
//        1.1. Создай массив на 10 чисел
//        1.2. Считай с консоли 10 чисел и заполни ими массив
//        2. Найти максимальное число из элементов массива

        int[] array2 = new int[10];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = scanner.nextInt();
        }
        int remember = 0;

        for (int i = 0; i < array2.length - 1; i++) {
            for (int j = 0; j < array2.length - 1; j++) {
                if (array2[i] > array2[i + 1]) {
                    remember = array2[i];
                    array2[i] = array2[i + 1];
                    array2[i + 1] = remember;
                }
            }
        }
        System.out.println("Из десяти введённых чисел максимальное : " + array2[9]);


        System.out.println("Задание ----------------------------------------");
        System.out.println("Задание 3");
//        1. Создать массив на 10 строк.
//        2. Создать массив на 10 чисел.
//        3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
//        4. В каждую ячейку массива чисел записать длину строки из массива строк,
//        индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.

        String[] array3 = new String[10];
        int[] numbers3 = new int[10];

        for (int i = 0; i < array3.length; i++) {
            array3[i] = scanner.nextLine();
        }
        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < numbers3.length; j++) {
                if (i == j) {
                    numbers3[j] = array3[i].length();
                }
            }
        }
        for (int i = 0; i < numbers3.length; i++) {
            System.out.println("Длина строки в " + i + " ячейке : " + numbers3[i]);
        }

        System.out.println("Задание ----------------------------------------");
        System.out.println("Задание 4");
//        1. Создать массив на 10 чисел.
//        2. Ввести с клавиатуры 10 чисел и записать их в массив.
//        3. Вывести на экран элементы массива в обратном порядке, каждое значение выводить с новой строки.

        int[] array4 = new int[10];
        for (int i = 0; i < array4.length; i++) {
            array4[i] = scanner.nextInt();
        }
        for (int i = 9; i >= 0; i--) {
            System.out.println(array4[i]);
        }

        System.out.println("Задание ----------------------------------------");
        System.out.println("Задание 5");
//        1. Создать массив на 20 чисел.
//        2. Ввести в него значения с клавиатуры.
//        3. Создать два массива на 10 чисел каждый.
//        4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
//        5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.

        int[] array5 = new int[20];
        int[] firstMiniArray5 = new int[10];
        int[] secondMiniArray5 = new int[10];

        for (int i = 0; i < array5.length; i++) {
            array5[i] = scanner.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == j) {
                    firstMiniArray5[j] = array5[i];
                }
            }
        }
        for (int i = 10; i < array5.length; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == j + 10) {
                    secondMiniArray5[j] = array5[i];
                    System.out.println(secondMiniArray5[j]);
                }
            }
        }
        System.out.println("Задание ----------------------------------------");
        System.out.println("Задание 6");
//        Создать массив на 20 чисел.
//        3аполнить его числами с клавиатуры.
//        Найти максимальное и минимальное числа в массиве.
//        Вывести на экран максимальное и минимальное числа через пробел.

        int[] array6 = new int[20];

        for (int i = 0; i < array6.length; i++) {
            array6[i] = scanner.nextInt();
        }
        int remember6 = 0;
        for (int i = 0; i < array6.length - 1; i++) {
            for (int j = 0; j < array6.length - 1; j++) {
                if (array6[i] > array6[i + 1]) {
                    remember6 = array6[i];
                    array6[i] = array6[i+1];
                    array6[i+1] = array6[i];
                }
            }
        }
        System.out.println("Максимальное значение : " + array6[19] + ", минимальное значение : " + array6[0]);

        System.out.println("Задание ----------------------------------------");
        System.out.println("Задание 7");
//        Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.

        int[] array7 = new int[20];
        int remember7 = 0;
        for (int i = 0; i < array7.length; i++) {
            array7[i] = scanner.nextInt();
        }
        for (int i = 0; i < array7.length - 1; i++) {
            for (int j = 0; j < array7.length - 1; j++) {
                if (array7[i] > array7[i + 1]) {
                    remember7 = array7[i];
                    array7[i] = array7[i+1];
                    array7[i+1] = array7[i];
                }
            }
        }
        for (int i = 19; i >= 0; i--) {
            System.out.println(array7[i]);
        }
    }
}
