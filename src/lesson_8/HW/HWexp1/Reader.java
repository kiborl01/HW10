package lesson_8.HW.HWexp1;

public class Reader {
    private String fio;
    private int readTicket;
    private String departament;
    private String dateOfBirthday;
    private String Number;

    public Reader(String fio) {
        setFio(fio);
    }

    public Reader(String fio, int readTicket, String departament, String dateOfBirthday, String number) {
        setFio(fio);
        setReadTicket(readTicket);
        setDepartament(departament);
        setDateOfBirthday(dateOfBirthday);
        setNumber(number);
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getReadTicket() {
        return readTicket;
    }

    public void setReadTicket(int readTicket) {
        this.readTicket = readTicket;
    }

    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    public String getDateOfBirthday() {
        return dateOfBirthday;
    }

    public void setDateOfBirthday(String dateOfBirthday) {
        this.dateOfBirthday = dateOfBirthday;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }
    public  void takeBook(int quantityBook){
        System.out.println(getFio() + " взял " + quantityBook + " книги.");
    }

    public void takeBook(String... nameBook) {
        System.out.print(getFio() + " Взял книги: ");
        for (int i = 0; i < nameBook.length; i++) {
            if (i ==nameBook.length - 1){
                System.out.print(nameBook[i] + ".");
            }else {
                System.out.print(nameBook[i] + ", ");
            }
        }
    }

    public void takeBook(Book... books) {
        System.out.print(getFio() + " Взял книги: ");
        for (int i = 0; i < books.length; i++) {
            if (i ==books.length - 1){
                System.out.print(books[i].getName() + ".");
            }else {
                System.out.print(books[i].getName() + ", ");
            }
        }
    }

    public void returnBook (int quantityBook){
        System.out.println(getFio() + " вернул " + quantityBook + " книги.");
    }
    public void returnBook(String... nameBook) {
        System.out.print(getFio() + " Вернул книги: ");
        for (int i = 0; i < nameBook.length; i++) {
            if (i ==nameBook.length - 1){
                System.out.print(nameBook[i] + ".");
            }else {
                System.out.print(nameBook[i] + ", ");
            }
        }
    }
    public void returnBook(Book... books) {
        System.out.print(getFio() + " Вернул книги: ");
        for (int i = 0; i < books.length; i++) {
            if (i ==books.length - 1){
                System.out.print(books[i].getName() + ".");
            }else {
                System.out.print(books[i].getName() + ", ");
            }
        }
    }

}
