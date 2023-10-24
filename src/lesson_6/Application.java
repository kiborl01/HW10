package lesson_6;

public class Application {
    public static void main(String[] args) {
        int result = factorial(6);
        System.out.println(result);
    }

    public static int factorial (int n){
//        int n1 = n * (n-1);
//        int n2 = n1 * (n-2);
//        int n3 = n2 * (n-3);
//        int n4 = n3 * (n-4);
//        int n5 = n4 * (n-5);
//
//        return n5;
        if (n == 0 ){
            return 1;
        }
    return n* factorial(n -1);

    }
}
