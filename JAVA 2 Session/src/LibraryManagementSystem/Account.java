package LibraryManagementSystem;

import java.util.Date;
import java.util.List;

enum AccountStatus
{
    ACTIVE,BLOCKED,CLOSED,DORMANT
}
class Account
{
    private String Account_id;
    private String AccountHolderName;
   private  Date AccountopeningDate;
   private  AccountStatus accountstatus;
    private float totalfine;
    List<IssueQuery> accountHistory;

    public Account(String account_id, String accountHolderName, Date accountopeningDate, AccountStatus accountstatus, float totalfine) {
        Account_id = account_id;
        AccountHolderName = accountHolderName;
        AccountopeningDate = accountopeningDate;
        this.accountstatus = accountstatus;
        this.totalfine = totalfine;
    }

    public String getAccount_id() {
        return Account_id;
    }

    public String getAccountHolderName() {
        return AccountHolderName;
    }

    public Date getAccountopeningDate() {
        return AccountopeningDate;
    }

    public AccountStatus getAccountstatus() {
        return accountstatus;
    }

    public float getTotalfine() {
        return totalfine;
    }

}
