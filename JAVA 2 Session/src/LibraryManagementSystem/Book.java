package LibraryManagementSystem;

import java.util.List;

enum BookStatus
{
    ISSUED,OUTOFSTOCK,AVAILABLE;

}
class Book
{
   private String isbnno;
   private String author;
  private  BookStatus status;
   private float price;
    private String subject;
    private List<IssueQuery> bookissuehistory;

    public Book(String isbnno, String author, BookStatus status, float price, String subject)
    {
        this.isbnno = isbnno;
        this.author = author;
        this.status = status;
        this.price = price;
        this.subject = subject;
    }

    public String getIsbnno() {
        return isbnno;
    }

    public String getAuthor() {
        return author;
    }

    public BookStatus getStatus() {
        return status;
    }

    public float getPrice() {
        return price;
    }

    public String getSubject() {
        return subject;
    }

    public void setIsbnno(String isbnno) {
        this.isbnno = isbnno;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setStatus(BookStatus status) {
        this.status = status;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
