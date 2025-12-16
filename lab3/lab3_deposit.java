import java.util.*;
public class lab3_deposit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0, amount = 0;
        while (total < 1000) {
            System.out.print("Enter deposit amount: ");
            int money = sc.nextInt();
            total += money;
            amount += 1;
        }
        System.out.println("");
        System.out.println("Target reached!");
        System.out.println("Total amount saved = "+total);
        System.out.println("Number of deposits = "+amount);
    }
}
