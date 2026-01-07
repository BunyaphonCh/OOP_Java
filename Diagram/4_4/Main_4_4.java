/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Main_4_4 {
    public static void main(String[] args) {
        MyDate birthday = new MyDate();
        birthday.day = 1;
        birthday.month = 1;
        birthday.year = 1990;
        
        Account myAccount = new Account();
        myAccount.name = "Saving Account";
        myAccount.balance = 1000.0;
        
        Customer person = new Customer();
        person.name = "Somchai";
        person.DOB = birthday;
        person.acct = myAccount;
        
        System.out.println("Customer Name: " + person.name);
        
        System.out.print("Date of Birth: ");
        person.DOB.showDate();
        
        person.acct.deposit(500);
        person.acct.showInfo();
    }
}
