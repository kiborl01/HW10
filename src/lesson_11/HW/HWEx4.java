package lesson_11.HW;

import java.util.ArrayList;
import java.util.Scanner;

public class HWEx4 {
    public static void main(String[] args) {
        System.out.println("Задание 4");
//        1. Введи с клавиатуры 10 слов в список строк.
//        2. Метод doubleValues должен удваивать слова по принципу:
//        "альфа", "бета", "гамма" -> "альфа", "альфа", "бета", "бета", "гамма", "гамма"
//        3. Выведи результат на экран, каждое значение с новой строки.

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> arrayList4 = new ArrayList<>();
        System.out.println("Введите 10 строк");

        for (int i = 0; i < 10; i++) {
            arrayList4.add(scanner.nextLine());
        }

        arrayList4 = doubleValue(arrayList4);
        for (String s: arrayList4) {
            System.out.println(s);
        }
    }
    public static ArrayList<String> doubleValue(ArrayList<String> strings){
        ArrayList<String> stringsDouble = new ArrayList<>();
        for (String s: strings) {
            stringsDouble.add(s);
            stringsDouble.add(s);
        }
        return stringsDouble;
    }
}
