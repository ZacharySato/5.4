import java.util.Random;

public class Reader {
    private final static Random random = new Random();
    //на всякий случай, для пустой библиотеки
    private final static Book holder = new Book("Каталог");

    public Book choiceBook(Book[] library) {
        int l = library.length;
        if (l > 0)
            return library[random.nextInt(l)];
        else
            return holder;
    }

    public void readBook(Book book) {
        System.out.println(book.toString());
    }

    public void rateBook(Book book) {
        int rating = book.name.replace(" ", "").length();

        if (book.author == null)
            rating -= random.nextInt(10);
        else
            rating += book.author.replace(" ", "").length();
        if (book.volume == 0)
            rating -= random.nextInt(10);
        else
            rating -= book.volume;
        if (book.pages == 0)
            rating -= random.nextInt(10);
        else
            rating += book.pages;

        System.out.println("Вежливая оценка книги \"" + book.name + "\": " + rating);
    }

    public static void main(String[] args) {
        //----------------------вручную для красоты----------------------------------------------------------------
        Book[] library = new Book[6];
        library[0] = new Book("Невероятные приключения", "Барный А. А.", 152, 1);
        library[1] = new Book("Полная энциклопедия кошачьих стрижек", "Мурзик К.", 600);
        library[2] = new Book("Максимально загадочное убийство пассажира самолета", "Генератор Б. Ю.");
        library[3] = new Book("Рыбалка в пустыне", 300, 2);
        library[4] = new Book("Накипь для чайников", 230);
        library[5] = new Book("Алгол за десять минут");
        //---------------------------------------------------------------------------------------------------------;
        Reader reader = new Reader();
        Book readerChoice = reader.choiceBook(library);
        reader.readBook(readerChoice);
        reader.rateBook(readerChoice);
    }
}
