package lesson_6;

public class chernovic {
    public static void main(String[] args) {
//                int[] array2 = new int[10];
//        for (int i = 0; i < array2.length; i++) {
//            array2[i] = scanner.nextInt();
//        }
//        int remember = 0;
//
//        for (int i = 0; i < array2.length - 1; i++) {
//            for (int j = 0; j < array2.length - 1; j++) {
//                if (array2[i] > array2[i + 1]) {
//                    remember = array2[i];
//                    array2[i] = array2[i + 1];
//                    array2[i + 1] = remember;
//                }
//            }
//        }
//        System.out.println("Из десяти введённых чисел максимальное : " + array2[9]);
//
//        int[] array2 = new int[10];
//        for (int i = 0; i < array2.length; i++) {
//            array2[i] = scanner.nextInt();
//        }
//        int maxNumber = 0;
//        for (int i = 0; i < array2.length - 1; i++) {
//            if (array2[i] > array2[i + 1]) {
//                maxNumber = array2[i];
//            } else if (array2[i] < array2[i + 1]) {
//                maxNumber = array2[i + 1];
//            }
//        }
//        System.out.println("Из десяти введённых чисел максимальное : " + maxNumber);
//
////        String myArr = "Молоко","яйца","хлеб", "мука";
//        String newString = "String 1 " + "String 2";
//        newString = newString.concat(" String 4");
//        System.out.println(newString);
//
//        StringBuilder sb = new StringBuilder();
//        sb.append("New").append(" ");
//        sb.append("String ");
//        sb.append(5);
//        System.out.println(sb.toString());
//
////        String resArr = String.join(";", myArr);
//
//        printq(8, 0);
//        System.out.println(calc(4, 1));
//    }
//
//    public static int calc(int finishNum, int start) {
//        if (start < finishNum) {
//            return start + calc(finishNum, start + 1);
//        }
//        return finishNum;
//    }
//
//    public static void printq(int a, int cur) {
//        if (a != cur) {
//            for (int i = 0; i < cur; i++) {
//                System.out.print("*");
//            }
//            System.out.println();
//            printq(a, cur + 1);
//        }

        String list = "Молоко, Яйцо, Хлкб";
        Product milk = new Product();
        milk.name = "Молоко";
        milk.count = 2;
    }
}
