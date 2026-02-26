public class Account {
    protected double balance;
    protected String name;
    
    public Account(double balance, String name) {
        this.balance = balance;
        this.name = name;
    }
    
    public void deposit(double b) {
        if (b >= 0) {
            balance += b;
        }
        else {
            System.out.println("Input number must be greater than or equal to zero.");
        }
    } 
    
    public void withdraw(double b) {
        if (b < 0) {
            System.out.println("The balance variable must be greater than or equal to zero.");
            return;
        }
        if (balance < b) {
            System.out.println("Your account balance is insufficient.");
            return;
        }
        balance -= b;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public void showAccount() {
        System.out.println("In " + name + " account, there is a balance equal to " + balance + " baht. ");
    }
}