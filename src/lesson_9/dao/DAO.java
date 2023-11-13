package lesson_9.dao;

public interface DAO {

    Human create(Human human);
    Human read(String name);
    Human update(Human human);
    void delete(Human human);

}
