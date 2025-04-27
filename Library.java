


public class Library {

    private static int totalBooks = 0;

    private String bookTitle; 
    private String author;
    private int num;




    public Library(String bookTitle, String author) {
        this.bookTitle = bookTitle;
        this.author = author;
        totalBooks++;
    }

    public static void addBook(String bookTitle, String author) {
        Library book = new Library(bookTitle, author);
        book.displayBookInfo();
    }

    public static int getTotalBooks() {
        return totalBooks;
    }
    public void setNum(int num){
       this.num=num;
    }
    public int getNum(){
        return num;
    }
    

    public void displayBookInfo() {
        System.out.println("Title: " + bookTitle);
        System.out.println("Author: " + author);
    }

    public static void main(String[] args) {

        Library book1 = new Library("To Kill a Mockingbird", "Harper Lee");
        Library book2 =new Library("1984", "George Orwell");

        System.out.println("Book 1 information:");
        book1.displayBookInfo();

        System.out.println("Book 2 information:");
        book2.displayBookInfo();

        System.out.println("New Book Added:");
        Library.addBook("Object Oriented Programming using Java", "Norazah Yusof");
        
        System.out.println("Total number of books: " + Library.getTotalBooks());
        





    }

}