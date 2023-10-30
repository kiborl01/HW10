package lesson_6HW;

import java.util.Objects;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Man man = new Man("Dima", 26, "Moscow");
        Woman woman = new Woman("Maria", 20, "Moscow");

        System.out.println("Задание 3");
        System.out.println(man.getName() + " " + man.getAge() + " " + man.getAddress());
        System.out.println(woman.getName() + " " + woman.getAge() + " " + woman.getAddress());
        System.out.println("-------------------------------");
        System.out.println("Задание 4");
        Scanner scanner = new Scanner(System.in);
        int summa = 0;
        String b;
        while (true) {
            b = scanner.nextLine();
            if (b.equals("сумма")) {
                System.out.println(summa);
                break;
            } else {
                summa += Integer.parseInt(b);
            }
        }
        System.out.println("-------------------------------");
        System.out.println("Задание 5");

        int N = scanner.nextInt();

        if (N > 0) {
            int[] arr5 = new int[N];
            for (int i = 0; i < N; i++) {
                arr5[i] = scanner.nextInt();
            }
            int Maximum = arr5[0];
            for (int i = 0; i < N; i++) {
                if (arr5[i] > Maximum) {
                    Maximum = arr5[i];
                }
            }
            System.out.println(Maximum);
        } else {
            System.out.println("Ввели N<0, нужно больше 0.");
        }

    }

    public static class Man {
        private String name;
        private int age;
        private String address;

        public Man(String name, int age, String address) {
            setName(name);
            setAge(age);
            setAddress(address);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }
    }

    public static class Woman {
        String name;
        int age;
        String address;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }
    }




}