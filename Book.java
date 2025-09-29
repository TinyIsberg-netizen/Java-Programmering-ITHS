public class Book {

    public static void main(String[] args) {
        Book book1 = new Book();
        book1.author = "George Orwell";
        book1.title = "1984";
        book1.year = 1949;

        Book book2 = new Book();
        book2.author = "Harper Lee";
        book2.title = "To Kill a Mockingbird";
        book2.year = 1960;

        System.out.println(book1.title + " by " + book1.author + ", published in " + book1.year);
        System.out.println(book2.title + " by " + book2.author + ", published in " + book2.year);
    }


    
}
