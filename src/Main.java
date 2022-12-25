import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Reader user1 = new Reader("Иванов И.И.", 777, "Информацика", "18.09.2000", "+79165556688");
        Reader user2 = new Reader("Петров П.П.", 666, "Информацика", "18.10.1990", "+79167779966");
        System.out.println(getArrayObj(user1, user2));

        user1.takeBook(20);
        System.out.println();

        user1.takeBook("Приключения", "Словарь", "Энциклопедия");

        Book book1 = new Book("Приключения");
        Book book2 = new Book("Словарь");
        Book book3 = new Book("Энциклопедия");

        System.out.println();
        user2.takeBook(book1, book2, book3);
        System.out.println();
        user2.returnBook(book1,book2,book3);

    }

    // 7. Разработать программу, в которой создается массив объектов данного класса.
    public static ArrayList getArrayObj(Reader... users) {
        List<Reader> arrayObj = new ArrayList<>();
        for (Reader user : users) {
            arrayObj.add(user);
        }
        return (ArrayList) arrayObj;
    }
}