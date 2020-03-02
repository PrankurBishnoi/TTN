package LibraryManagementSystem;

import java.util.Date;

public interface Library
{
    void issueBook(String accontid, String bookisbn, Date issuedate);
    void returnBook(String accountid,String bookisbn,Date returndate);

}
