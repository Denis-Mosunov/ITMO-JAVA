package Lab2;

public class Book {

    // Параметры класса (сущности)
    private String title;       // Название
    private String author;      // Автор
    private int year;           // Год издания
    private String genre;       // Жанр

    // Конструктор без параметров (по умолчанию)
    public Book() {
        this.title = "Неизвестное название";
        this.author = "Неизвестный автор";
        this.year = 0;
        this.genre = "Неизвестный жанр";
    }

    // Конструктор с параметрами
    public Book(String title, String author, int year, String genre) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.genre = genre;
    }

    //доступ к полям
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    // Метод для вывода информации о книге
    public void displayInfo() {
        System.out.println("Название: " + title);
        System.out.println("Автор: " + author);
        System.out.println("Год издания: " + year);
        System.out.println("Жанр: " + genre);
    }
}
