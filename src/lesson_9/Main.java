package lesson_9;

import lesson_9.dao.Admin;
import lesson_9.dao.HumanDAO;
import lesson_9.dao.User;

public class Main {
    public static void main(String[] args) {
        // DAO- data access object
        // CRUD - create read update delete

        HumanDAO dao = new HumanDAO();
        User user = new User("userOfSite", "user@mail.ru");
        Admin admin = new Admin("adminOfSite","admin@mail.ru");

        dao.create(user);
        dao.create(admin);
        dao.read(user.getName());
        dao.read(admin.getName());
        dao.update(user);
        dao.update(admin);
        dao.delete(user);
        dao.delete(admin);


    }
}
