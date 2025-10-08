class Book  
{
    //instance variables or data members
    String title, author;
    long isbn;
    boolean availability;
    Book()          //Default constructor - member function
    {
        title="";
        author="";
        isbn=0;
        availability=false;
    }
    Book(String x,String y,long z,boolean w)
    {
        title=x;
        author=y;
        isbn=z;
        availability=w;
    }
    public string getBookInfo() {
        return "Title:" +title+ ", Author:" +author+ ", ISBN:" +isbn+ ", Available:" +availability;
    }
}
class Member
{
    String name,memberID;
    Book[] borrowedBooks;
    int bookCount;
    
    Member(String x,String y,int z[])
    {
        name=x;
        memberID=y;
        borrowedBooks= new Book[z]; //Array to hold borrowedBooks
        bookCount=z;
    }
    //for borrowing the bookCount
    void borrowedbook(Book book)
    {
        if(bookCount < borrowedBooks.length)
        {
            borrowedBooks[bookCount]=book;
            bookCount++;
        }
        else {
            System.out.print(name + "can't borrow more books.");
        }
    }
    //Return a books
    public void returnBook(Book book)
    {
        for(i=0;i<bookCount;i++)
        {
            if(borrowedBooks[i]==book) {
                borrowedBooks[i]=null;
            }
            //Shift the remaining books in the Array
            for(int j=i;j<bookCount-1;j++) {
                borrowedBooks[j]=borrowedBooks[j+1];
            }
            borrowedBooks[bookCount-1]=null; //clear the last slot
            bookcount--;
            break;
        }
    }
    String getMemberInfo()
    {
    String info="Name:" +name+ ", Member ID:" +memberID+ ", Borrowed Books:";
    if(bookCount==0)
    {
        info+="none";
    }
    else {
        for(int i=0;i<bookCount; i++)
        {
            info+=borrowedbooks[i].title+ " ";
        }
    }
    return info;
    }
}   //closing of Member class

public class Library
{
    Book book1, book2;
    Member member1, member2;
    
    Library() {
        //Initialize Books
        book1= new Book(x:"Let us C",y:"Y.Kanetkar",z:12345L,true);
        book2= new Book(x:"Let us Python",y:"Y.Kanetkar",z:67890L,true);
        book3= new Book(x:"Complete Reference Java2",y:"H.Schildt",z:89333L,false);
        
        //Initialize members witha max of 2 borrowed Books
        memeber1= new Member(x:)
    }
    //Borrow a Book
    public void borrowBook(long ISBN, String memberID) {
        Book bookToBorrow=findBookByISBN(ISBN);
        Member borrowingMember=findMemberById(member ID)
        
    }
    public static void main (String[] args) 
    {
        Book b=new Book();
        Book b1=new Book("Programmig with Java","E.Balagurusamy",78562356L,true);
        Book b2=new Book("Learning Jquery","Flanagan",8856636L,false);
        b1.borrowStatus();
        b2.borrowStatus();
        Member m=new Member();
        String x[]=new String[]{"Programming with Java","Learning Jquery","Soft Skills","Quantative Aptitude"};
        Member m1=new Member("Ram","A783387",x);
    } 
}

