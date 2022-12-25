class Reader {
    // 1. ФИО
    private String fio;
    // 2. Номер читательского билета
    private int ticketNumber;
    // 3. Факультет
    private String faculty;
    // 4. Дата рождения
    private String birthDate;
    // 5. Телефон
    private String telephone;


    public Reader(String fio, int ticketNumber, String faculty, String birthDate, String telephone) {
        this.fio = fio;
        this.ticketNumber = ticketNumber;
        this.faculty = faculty;
        this.birthDate = birthDate;
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "fio='" + fio + '\'' +
                ", ticketNumber=" + ticketNumber +
                ", faculty='" + faculty + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", telephone='" + telephone + '\'' +
                "}\n";
    }

    //  6. Методы (экземпляра, без слова static)  takeBook(), returnBook()
    public void takeBook() {
    }

    public void returnBook() {
    }

    // 8. Перегрузить методы takeBook(), returnBook():
    //- takeBook, который будет принимать количество взятых книг.
    // Выводит на консоль сообщение "Петров В. В. взял 3 книги".

    public void takeBook(int countBooks) {
        String endBooks;
        if (countBooks % 100 > 4 && countBooks % 100 < 21) {
            endBooks = "книг";
        } else if (countBooks % 10 == 1) {
            endBooks = "книгу";
        } else if (countBooks % 10 > 1 && countBooks % 10 < 5) {
            endBooks = "книги";
        } else {
            endBooks = "книг";
        }
        System.out.printf("%s взял %d %s", this.fio, countBooks, endBooks);
    }

    // 8. Перегрузить методы takeBook(), returnBook():
    // - takeBook, который будет принимать переменное количество названий книг.
    // Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".

    public void takeBook(String... nameBooks) {
        StringBuilder books = new StringBuilder();
        for (String nameBook : nameBooks) {
            books.append(nameBook + ", ");
        }
        books.setLength(books.length() - 2);
        System.out.print(this.fio + " взял книги: " + books);
    }

    // 8. Перегрузить методы takeBook(), returnBook():
    // - takeBook, который будет принимать переменное количество (Тип... parameterName) объектов класса
    // Book (создать новый класс, содержащий имя и автора книги).
    // Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".

    public void takeBook(Book... books) {
        StringBuilder stringBook = new StringBuilder();
        for (Book book : books) {
            stringBook.append(book + ", ");
        }
        stringBook.setLength(stringBook.length() - 2);
        System.out.print(this.fio + " взял книги: " + stringBook);
    }
    // 9. Аналогичным образом перегрузить метод returnBook().
    // Выводит на консоль сообщение "Петров В. В. вернул книги: Приключения, Словарь, Энциклопедия".
    // Или  "Петров В. В. вернул 3 книги".

    public void returnBook(Book... books) {
        StringBuilder stringBook = new StringBuilder();
        for (Book book : books) {
            stringBook.append(book + ", ");
        }
        stringBook.setLength(stringBook.length() - 2);
        System.out.print(this.fio + " вернул книги: " + stringBook);
    }
}