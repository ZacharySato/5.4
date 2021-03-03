public class Book {
    //что-то должно быть указано точно и наверняка
    public final String name;
    public String author;
    public int volume;
    public int pages;

    Book(String name, String author, int pages, int volume) {
        this.name = name;
        this.author = author;
        this.volume = volume;
        this.pages = pages;
    }

    Book(String name, String author, int pages) {
        this.name = name;
        this.author = author;
        this.pages = pages;
    }

    Book(String name, int pages, int volume) {
        this.name = name;
        this.volume = volume;
        this.pages = pages;
    }

    Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    Book(String name, int pages) {
        this.name = name;
        this.pages = pages;
    }

    Book(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        //оформим без нулей и нулов для порядка
        String spine = "Название: " + name;
        if (volume != 0) spine += "\n" + "Том: " + volume;
        if (author != null)  spine += "\n" + "Автор: " + author;
        if (pages != 0) spine += "\n" + "Объем: " + pages;
        return spine;
    }
}
