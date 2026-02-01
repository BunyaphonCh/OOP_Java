public class main {
    public static void main(String[] args) {
        CheckingAccount myAcct = new CheckingAccount(500, "Somsak", 500);
        Customer myCustomer = new Customer("Somsak", "Chatree", myAcct);
        System.out.println(myCustomer.toString());
        System.out.println("--- Withdrawal Testt ---");
        myCustomer.getAcct().withdraw(200);
        myCustomer.getAcct().withdraw(400);
        myCustomer.getAcct().withdraw(1000);
        System.out.println("Final Status : " + myCustomer.getAcct().toString());
    }
}
