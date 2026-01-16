public class Seller extends Employee {
    private Food f = new Food();
    
    public Food getFood() {
        return f;
    }
    
    public Food sell(Employee e) {
        double foodPrice = this.f.getPrice();
        
        if (e.getWallet().getBalance() >= foodPrice) {
            this.getWallet().setBalance(this.getWallet().getBalance() + foodPrice);
            e.getWallet().setBalance(e.getWallet().getBalance() - foodPrice);
            return new Food();
        } else {
            System.out.println("Your money is not enough.");
            return null;
        }
    }
}
