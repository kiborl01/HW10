package lesson_8.HW.HWexp1;

public class Book {
    private String name;
    private String author;

    public Book() {
    }

    public Book(String name, String author) {
        setName(name);
        setAuthor(author);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
