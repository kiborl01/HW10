package lesson_11.HW;

import java.util.ArrayList;
import java.util.Scanner;

public class HWex5 {

    //    1. Введи с клавиатуры 10 слов в список строк.
//    2. Определить, является ли список упорядоченным по возрастанию длины строки.
//    3. В случае отрицательного ответа вывести на экран индекс первого элемента, нарушающего такую упорядоченность.
    public static void main(String[] args) {
        ArrayList<String> arrayList5 = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 10 строк");
        for (int i = 0; i < 10; i++) {
            arrayList5.add(scanner.nextLine());
        }
        for (int i = 0; i < arrayList5.size()-1; i++) {
            if (arrayList5.get(i).length() > arrayList5.get(i + 1).length()) {
                System.out.println(i);
                break;
            } else if (i == 9) {
                System.out.println("Всё верно, список упорядочен");
            }
        }
    }
}
