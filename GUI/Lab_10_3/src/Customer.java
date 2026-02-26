import java.util.ArrayList;

public class Customer {
        private String firstName;
        private String lastName;
        private ArrayList<Account> acct;
        
        public Customer() {
            this("", "");
        }
            
        public Customer(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.acct = new ArrayList<Account>();
        }
        
        public Account getAccount(int index) {
            return acct.get(index);
        }
        
        public void addAccount(Account ac) {
            acct.add(ac);
        }
        
        public int getNumOfAccount() {
            return acct.size();
        }
        
        @Override
        public String toString() {
            return firstName + " " + lastName + " has " + acct.size() + " accounts.";
        }
}