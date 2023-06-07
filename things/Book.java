package things;
import skeleton.Thing;
public class Book extends Thing {
    
    private String bookName; 

    


    public Book(String bookName) {
        this.bookName = bookName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

   
   
   
    @Override
    public void setName(String name) {
        
    }

    @Override
    public void getName() {
        
    }

    @Override
    public String toString() {
        return "Book [bookName=" + bookName + "]";
    }

    


    



    
    
    
}