package lesson_2;

public class HW2 {
        public static void main(String[] args) {
            System.out.println("Задание 1");

            int a = 1;
            int b = 3;
            int c = 9;
            int d = 27;

            int result = -a + b - c + d;

            System.out.println(result);
            System.out.println("---------------------------------------------------");

            System.out.println("Задание 2");

            int A=1000;
            int B=500;
            double sale=(A+B)*0.1;
            double discontPrice=(A+B)-sale;

            System.out.println("Скидка = " + sale + " руб.");
            System.out.println("Стоимость товара с учётом скидки = " + discontPrice + " руб.");
            System.out.println("---------------------------------------------------");

            System.out.println("Задание 3");

            int l=200;
            double k=200*0.15;
            double q=l-k;
            int w=30;
            double e=(10*q)+(2*w);

            int h=500;
            double g=500*0.5;
            double r=h-g;
            int t=50;
            double y=(7*r)+t;

            int f=300;
            double p=300*0.1;
            double u=f-p;
            int i=20;
            double o=(2*u)+(3*i);

            System.out.println("а) " + e + " руб.");
            System.out.println("б) " + y + " руб.");
            System.out.println("в) " + o + " руб.");

        }


    }



