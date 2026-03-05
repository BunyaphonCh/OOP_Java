public class CheckingAccount extends Account {
    private double credit;
    
    public CheckingAccount() {
        super(0, "");
        this.credit = 0;
    }
    
    public CheckingAccount(double balance, String name, double credit) {
        super(balance, name);
        this.credit = credit;
    }
    
    public double getCredit() {
        return credit;
    }
    
    public void setCredit(double credit) {
        if (credit > 0) {
            this.credit = credit;
        }
        else {
            System.out.println("Input number must be a positive integer.");
        }
    }
    
    @Override
    public String toString() {
        return "The " + name + " account has " + balance + " baht and " + credit + " credits.";
    }
    
    @Override
    public void withdraw(double amount) throws WithdrawException {
        if (amount <= 0) {
            throw new WithdrawException("Input number must be a positive integer.");
        }
        else if (balance - amount >= 0) {
            balance -= amount;
            System.out.println(amount + " baht is withdrawn from " + name + " and your credit balance is " + credit + ".");
        }
        else if (balance - amount + credit >= 0) {
            credit = credit + (balance - amount);
            balance = 0;
            System.out.println(amount + " baht is withdrawn from " + name + " and your credit balance is " + credit + ".");
        }
        else {
            throw new WithdrawException("Account " + name + " has not enough money.");
        }
    }
}