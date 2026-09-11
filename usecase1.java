class Book{
    static int bookCount=0;
    static final String libraryName = "Sunrise Public Library";
    private String Title;
    private String Author;
    private double Price;
    private String ISBN;

    Book(String Title, String Author, double Price, String ISBN){
        this.Title=Title;
        this.Author=Author;
        this.Price=Price;
        this.ISBN=ISBN;
        bookCount++;
    }

    String getTitle(){
        return this.Title;
        
    }
    String getAuthor(){
        return this.Author;

    }
    double getPrice(){
        return this.Price;

    }
    String getISBN(){
        return this.ISBN;

    }


}

public class usecase1 {
    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", "J. Author", 350.0, "ISBN001");
        Book b2 = new Book("OOP Concepts", "K. Writer", 420.0, "ISBN002");
 
        System.out.println(b1.getTitle() + " by " + b1.getAuthor());
        System.out.println("Price: " + b2.getPrice());
        System.out.println("Library: " + Book.libraryName);
        System.out.println("Total books added: " + Book.bookCount);
    }
}
