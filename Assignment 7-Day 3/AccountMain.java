// a)     Create Account class having propertiesaccountId,branchNamemaxBbalanceLimit(50000)minBalanceLimit
// b)     Add methods withdraw () / deposit () / balanceCheck()
// c)      withdraw () and deposit()  are abstract methods
// d)     balanceCheck() is concrete method 
// e)     Create class SavingAccount class which inherits properties of Account class
// f)       create class CurrentAccount class which inherits properties of Account class
// g)     minBalancelimit for SavingAcountis 2000
// h)     minBalanceLimit for CurrentAccount is  5000
// i)       override the  withdraw() and deposit() method in Saving and Current account classes
// j)       Add logic to check  min and max balance limit  when the process is done
// k)     if the withdrawal() or deposit exceed the given limit then  print proper message to  the user
// l)       Create  class  AccountMain with main  entry point
// m)  Create  object of  SavingAccount and CurrentAccount  make a call towithdrawal and deposit  and display the  balance .


class Account {
  private long accountId;
  private String branchName;
  protected double maxBalanceLimit = 50000;
  protected double minBalanceLimit;

  public Account(long accountId, String branchName, double minBalanceLimit) {
    this.accountId = accountId;
    this.branchName = branchName;
    this.minBalanceLimit = minBalanceLimit;
  }

  public void withdraw(double amount) {
}

  public void deposit(double amount) {
}

  public void balanceCheck() {
    System.out.println("Your current balance is: " + maxBalanceLimit);
  }
}

class SavingAccount extends Account {
  private static final double MIN_BALANCE_LIMIT = 2000;

  public SavingAccount(long accountId, String branchName) {
    super(accountId, branchName, MIN_BALANCE_LIMIT);
  }

  @Override
  public void withdraw(double amount) {
    if (amount > maxBalanceLimit) {
      System.out.println("Error: withdrawal amount exceeds maximum limit.");
    } else if (maxBalanceLimit - amount < minBalanceLimit) {
      System.out.println("Error: withdrawal would bring balance below minimum limit.");
    } else {
      maxBalanceLimit -= amount;
    }
  }

  @Override
  public void deposit(double amount) {
    if (amount > maxBalanceLimit) {
      System.out.println("Error: deposit amount exceeds maximum limit.");
    } else {
      maxBalanceLimit += amount;
    }
  }
}

class CurrentAccount extends Account {
  private static final double MIN_BALANCE_LIMIT = 5000;

  public CurrentAccount(long accountId, String branchName) {
    super(accountId, branchName, MIN_BALANCE_LIMIT);
  }

  @Override
  public void withdraw(double amount) {
    if (amount > maxBalanceLimit) {
      System.out.println("Error: withdrawal amount exceeds maximum limit.");
    } else if (maxBalanceLimit - amount < minBalanceLimit) {
      System.out.println("Error: withdrawal would bring balance below minimum limit.");
    } else {
      maxBalanceLimit -= amount;
    }
  }

  @Override
  public void deposit(double amount) {
    if (amount > maxBalanceLimit) {
      System.out.println("Error: deposit amount exceeds maximum limit.");
    } else {
      maxBalanceLimit += amount;
    }
  }
}

class AccountMain {
  public static void main(String[] args) {
    SavingAccount sa = new SavingAccount(123456, "XYZ Branch");
    CurrentAccount ca = new CurrentAccount(987654, "ABC Branch");

    sa.deposit(3000);
    sa.withdraw(1500);
    sa.balanceCheck();

    ca.deposit(7000);
    ca.withdraw(4000);
    ca.balanceCheck();
  }
}
