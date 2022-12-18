public class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
      super(message);
    }
    
  }
  
  class Account {
    private double balance;
  
    public void withdraw(double amount) throws InsufficientBalanceException {
      if (balance < amount) {
        throw new InsufficientBalanceException("Insufficient balance in account");
      }
      balance -= amount;
    }
  }
  