class Book {
    String title;
    int totalPages;
    int pagesRead;

    Book(String t, int tp) {
        title = t;
        totalPages = tp;
        pagesRead = 0;
    }

    void updateProgress(int pages) {
        pagesRead += pages;
        if (pagesRead > totalPages) {
            pagesRead = totalPages;
        }
    }

    double getCompletion() {
        return (pagesRead * 100.0) / totalPages;
    }
}

public class Bookshelf {
    public static void main(String[] args) {
        Book myBook = new Book("Java Basics", 200);
        myBook.updateProgress(50);
        System.out.println("You have completed " + myBook.getCompletion() + "% of the book.");
        myBook.updateProgress(70);
        System.out.println("You have completed " + myBook.getCompletion() + "% of the book.");
    }
}
