// a)     Create interface named   ILoan   with two services   loanRequst()  loanStatus()
// b)     Only saving account   customers can request for the loan
// c)      If the saving account having balance more than 50000 thousand can apply for loan
// d)     Approval for loan can be checked by  loanStatus () which gives status as “Loan approved” Or “Loan rejected’
// e)     In the main method of AccountMaincreate an object of   Saving account 
// f)       Add some deposit to the account and request for the loan process
// g)     Check the status for the same


package person;
// ILoan interface
 interface ILoan {
    void loanRequest();
    void loanStatus();
}
// SavingAccount class that implements ILoan
 class SavingAccount implements ILoan {
    private double balance;
    
    public SavingAccount(double balance) {
        this.balance = balance;
    }
    
    public void deposit(double amount) {
        balance += amount;
    }
    
    // loanRequest() checks if the saving account has a balance greater than 50000
    // and allows the customer to request a loan if that is the case
    @Override
    public void loanRequest() {
        if (balance > 50000) {
            System.out.println("Loan request accepted.");
        } else {
            System.out.println("Loan request rejected. Insufficient balance.");
        }
    }
    
    // loanStatus() checks the status of the loan request and outputs it
    @Override
    public void loanStatus() {
        // TODO: check the status of the loan request and output it
        System.out.println("Loan status: Approved/Rejected");
    }
}

// AccountMain class
public class AccountMain {
    public static void main(String[] args) {
        SavingAccount account = new SavingAccount(40000);
        account.deposit(10000);
        account.loanRequest();
        account.loanStatus();
    }
}
