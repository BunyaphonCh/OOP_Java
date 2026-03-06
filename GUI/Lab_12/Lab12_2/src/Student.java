import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private int ID;
    private int money;
    
    public Student() {
        this.name = "";
        this.ID = 0;
        this.money = 0;
    }
    
    public Student(String name, int ID, int money) {
        this.name = name;
        this.ID = ID;
        this.money = money;
    }
    
    public String getName() {
        return name;
    }
    
    public int getID() {
        return ID;
    }
    
    public int getMoney() {
        return money;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setID(int ID) {
        this.ID = ID;
    }
    
    public void setMoney(int money) {
        this.money = money;
    }
    
    public void deposit(int amount) {
        this.money += amount;
    }
    
    public boolean withdraw(int amount) {
        if (this.money >= amount) {
            this.money -= amount;
            return true;
        }
        return false;
    }
    
}
