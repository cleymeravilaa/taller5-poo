public class BankAccount {
    private double balance;
    private int accountNumber;
    public String accountType;

    public BankAccount(int accountNumber, String accountType) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = 0;
    }

    public void setBalance(double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Balance must be positive");
        } else {
            this.balance = balance;
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    
    public void showAccountDetails() {
        System.out.println("Account number: " + accountNumber);
        System.out.println("Account type: " + accountType);
        System.out.println("Balance: " + this.getBalance());
    }
}
