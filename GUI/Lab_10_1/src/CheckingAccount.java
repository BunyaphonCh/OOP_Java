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
    
    public void setCredit(double credit) {
        this.credit = credit;
    }
    
    public double getCredit() {
        return credit;
    }
    
    @Override
    public void withdraw(double a) {
        if (a > 0) {
            if (this.balance - a >= 0) {
                this.balance -= a;
            }
            else if (this.balance - a + this.credit >= 0) {
                double shortfall = a - this.balance;
                this.balance = 0;
            }
            else {
                System.out.println("Not enough money!");
            }
        }
    }
    
    public void withdraw(int a) {
        this.withdraw((double)a);
    }
    
    @Override
    public String toString() {
        return "The " + name + " account has " + balance + " baht and " + credit + " credits.";
    }
}
