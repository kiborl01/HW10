package lesson_8.HW.HWexp1;

public class Main {
    public static void main(String[] args) {
        Reader[] readers;
        Reader reader1 = new Reader("Дмитров Д.И.");
        Reader reader2 = new Reader("Богданов А.В.");
        Reader reader3 = new Reader("Сергеев С.С.");
        readers = new Reader[]{reader1, reader2, reader3};

        Book book1 = new Book("Детектив", "Хейли А.");
        Book book2 = new Book("Методичка", "Рупин И.С.");
        Book book3 = new Book("Словарь", "Толстой Л.Н.");

        reader1.takeBook(4);
        reader1.takeBook("Методичка","Словарь","Детектив");
        System.out.println("");
        reader1.takeBook(book1,book2,book3);
        System.out.println("");
        reader2.returnBook(3);
        reader2.returnBook("Словарь","Детектив","Методичка");
        System.out.println("");
        reader2.returnBook(book1,book2,book3);
    }
}