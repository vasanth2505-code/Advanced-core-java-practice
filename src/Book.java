import java.util.Scanner;

public class Book {
    int bookID;
    String title;
    String author;
    String journal;
    static int availablebooks = 0;


    Book(int bookID, String title, String author, String journal) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.journal = journal;
        System.out.println(bookID + "\t" + title + "\t" + author + "\t" + journal);
        System.out.println(author);
        ++availablebooks;
        System.out.println(availablebooks);
    }

    void borrowBook() {
        System.out.println("Please Enter the books to be borrowed : ");
        Scanner sc = new Scanner(System.in);
        int borrowedBooks = sc.nextInt();
        System.out.println("Books Borrowed : " + borrowedBooks);
        System.out.println("Available books after borrowed : " + (availablebooks - borrowedBooks));
        availablebooks = (availablebooks - borrowedBooks);
    }

    void returnBook() {
        System.out.println("Please Enter the books to be returned : ");
        Scanner sc1 = new Scanner(System.in);
        int returnedBooks = sc1.nextInt();
        System.out.println("Books returned :" + returnedBooks);
        System.out.println("Available books after Returning : " + (availablebooks + returnedBooks));
        availablebooks = (availablebooks + returnedBooks);
        System.out.println("Final check :" + availablebooks);
    }

    void displayBookInfo() {
        System.out.println("The Books Information :" + bookID + "\t" + title + "\t" + author + "\t" + journal);
    }

    static void displayAvailablebooks() {
        System.out.println("The Total available books as of now is : " + availablebooks);
    }

    public static void main(String[] args) {
        Book obj = new Book(1, "Harry potter", "Jake", "adventure");
        Book obj2 = new Book(2, "wings", "phil", "horror");
        Book obj3 = new Book(1, "Harry potter", "Jake", "adventure");
        Book obj4 = new Book(2, "wings", "phil", "horror");
        Book obj5 = new Book(1, "Harry potter", "Jake", "adventure");
        Book obj6 = new Book(2, "wings", "phil", "horror");
        Book obj7 = new Book(1, "Harry potter", "Jake", "adventure");
        Book obj8 = new Book(2, "wings", "phil", "horror");
        Book obj9 = new Book(1, "Harry potter", "Jake", "adventure");
        Book obj10 = new Book(2, "wings", "phil", "horror");

        obj.borrowBook();
        obj.returnBook();
        obj.displayBookInfo();
        obj2.displayBookInfo();
        displayAvailablebooks();
    }
}
