import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Book {  //create a Book class
    private String title;
    private String author;
    
    //constructor to initialize Book fields
    public Book(String title,String author) {
        this.title=title;
        this.author=author;
    }
        
    //override equals() to compare Books based on title and author
    public boolean equals(Object Obj) {
        if(this==Obj)
        return true;
        if(Obj==null||getClass()!=Obj.getClass())
        return false;
            
        Book book=(Book) Obj;
        return Objects.equals(title,book.title) && Objects.equals(author,book.author);
    }
    //override hashcode()
    public int hashCode() {
        return Objects.hash(title,author);
    }
    public String toString() {
        return (this.title+"="+this.author);
    }
}
public class BookHashSet {
    public static void main(String[] args) {
        //step 1: create a HashSet to store Book
        Set<Book> bookSet=new HashSet<>();
        
        //step 2: Add book objects to the HashSet
        bookSet.add(new Book("Book A","Author 1"));
        bookSet.add(new Book("Book B","Author 2"));
        bookSet.add(new Book("Book C","Author 3"));
        bookSet.add(new Book("Book A","Author 1"));
        bookSet.add(new Book("Book B","Author 2"));
        
        //step 3: Print unique books from the HashSet
        System.out.println("Unique books in the HashSet:");
        for(Book book:bookSet) {
            System.out.println(book);
        }
    }
}
