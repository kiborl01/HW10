package lesson_11.HW;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Введи с клавиатуры 5 слов в HashSet.
//        Удали 3 - ий элемент списка, и выведи оставшиеся элементы в обратном порядке.

        System.out.println("Задание 1");
        Scanner scanner = new Scanner(System.in);
//        ArrayList<Integer> fiveElement = new ArrayList<>();
//        System.out.println("Введите 5 чисел");
//        for (int i = 0; i < 5; i++) {
//            fiveElement.add(scanner.nextInt());
//        }
//        fiveElement.remove(2);
//        for (int i = fiveElement.size() - 1; i >= 0; i--) {
//            System.out.println(fiveElement.get(i));
//        }

        System.out.println("-----------------------");
        System.out.println("Задание 2");

//        1. Создай список из слов HashSet "мама", "мыла", "раму".
//        2. После каждого слова вставь в список строку, содержащую слово "именно".
//        3. Вывести результат на экран, каждый элемент списка с новой строки.

        ArrayList<String> momWash = new ArrayList<>();
        momWash.add("Мама");
        momWash.add("мыла");
        momWash.add("раму");
        for (int i = 0; i < 6; i++) {
            if (i % 2 != 0) {
                momWash.add(i, "именно");
            }
        }
        for (String s : momWash) {
            System.out.println(s);
        }

        System.out.println("-----------------------");
        System.out.println("Задание 3");

//        1. Создай список слов, заполни его самостоятельно.
//        2. Метод fix должен:
//        2.1. удалять из списка строк все слова, содержащие букву "р"
//        2.2. удваивать все слова содержащие букву "л".
//        2.3. если слово содержит и букву "р" и букву "л", то оставить это слово без изменений.
//        2.4. с другими словами ничего не делать.

        ArrayList<String> strings = new ArrayList<>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лошадь");
        strings.add("езда");
        strings.add("лира");
        strings.add("пора");
        strings.add("машина");
        strings = fix(strings);

        for (String s : strings) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        ArrayList<String> result = new ArrayList<>();
        for (String words: strings) {

            if (words.contains("р") && words.contains("л")) {
                result.add(words);
            }
            else if (words.contains("р")) {
                result.remove(words);
            }
            else if (words.contains("л")) {
                result.add(words + words);
            }
            else if(!words.contains("р") && !words.contains("л")) {
                result.add(words);
            }
        }
        return result;
    }


}

