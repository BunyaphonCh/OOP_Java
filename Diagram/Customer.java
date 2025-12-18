public class Account {
    public double balance;
    public String name;
    
    public void deposit(double b) {
        if (b >= 0) {
            balance += b;
        }
        else {
            System.out.println("The balance variable must be greather than or equal to zero.");
        }
    } 
    
    public double withdraw(double b) {
        if (b < 0) {
            System.out.println("The balance variable must be greater than or equal to zero.");
            return 0;
        }
        if (balance < b) {
            System.out.println("Your account balance is insufficient.");
            return 0;
        }
        balance -= b;
        return b;
    }
    
    public void showInfo() {
        System.out.println("In " + name + " account, there is a balance equal to " + balance + " baht. ");
    }
}

public class MyDate {
    public int day;
    public int month;
    public int year;
    
    public void showDate() {
        System.out.println(day + "/" + month + "/" + year);
    }
}

public class Customer {
    public String name;
    public MyDate DOB;
    public Account acct;
}
