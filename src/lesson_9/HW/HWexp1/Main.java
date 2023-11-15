package lesson_9.HW.HWexp1;

import java.util.Scanner;
//Login должен содержать только латинские буквы, цифры и знак подчеркивания.
//Длина login должна быть меньше 20 символов.
//Password должен содержать только латинские буквы, цифры и знак подчеркивания.
//Длина password должна быть меньше 20 символов. Также password и confirmPassword должны быть равны.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите логин который должен содержать только латинские буквы, цифры и знак подчеркивания при этом" +
                "длина должна быть меньше 20 символов.");
        String login = scanner.nextLine();

        System.out.println("Введите пароль который должен содержать только латинские буквы, цифры и знак подчеркивания при этом" +
                "длина должна быть меньше 20 символов.");
        String password = scanner.nextLine();

        System.out.println("Повторите введёный пароль, он должен быть таким идентичным");
        String confirmPassword = scanner.nextLine();

        if (checkLogPas(login,password,confirmPassword)){
            System.out.println("Всё верно");
        }else {
            System.out.println("Повторите попытку");
        }
    }

    public static boolean checkLogPas(String login, String password, String confirmPassword) {
        try {
            if (!login.matches("^[a-zA-Z0-9_]+$") || login.length() > 20) {
                throw new WrongLoginException("Неверно введёный логин.");
            }
            if (!password.matches("^[a-zA-Z0-9_]+$") || password.length() > 20) {
                throw new WrongPasswordException("Неверно введёный пароль.");
            }
            if (!confirmPassword.matches("^[a-zA-Z0-9_]+$") || !password.equals(confirmPassword)) {
                throw new WrongPasswordException("Неверно, пароли не сопадают.");
            }
            return true;
        } catch (WrongLoginException | WrongPasswordException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
}


