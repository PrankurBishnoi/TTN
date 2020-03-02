package LibraryManagementSystem;

import java.util.Date;

public class IssueQuery
{
   private String IssuingAccount;
   private String BookISBN;
   private Date issueDate;
    private Date returnDate;
    private float fine;

    public IssueQuery(String issuingAccount, String bookISBN, Date issueDate, Date returnDate, float fine) {
        IssuingAccount = issuingAccount;
        BookISBN = bookISBN;
        this.issueDate = issueDate;
        this.returnDate = returnDate;
        this.fine = fine;
    }
    public void calculateFine(Date issueddate,Date returndate)
    {

    }

    public String getIssuingAccount() {
        return IssuingAccount;
    }

    public String getBookISBN() {
        return BookISBN;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public float getFine() {
        return fine;
    }
}
