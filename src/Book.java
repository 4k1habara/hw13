public class Book {
    private String name;
    private Author author;
    private int year;

    public Book(String name, Author author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public String getName() {
        return this.name;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString() {
        return "Название " + this.name + " " + author.toString() + " Год " + this.year;
    }

    public boolean equals(Object object) {
        return this.name.equals(((Book) object).name) && this.author.equals(((Book) object).author);
    }

    public int hashCode() {
        return java.util.Objects.hash(name);
    }
}
