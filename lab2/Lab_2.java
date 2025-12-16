
import java.util.*;
public class Lab_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your money : ");
        int money = sc.nextInt();
        double total = 0;
        System.out.print("Input your account type(Please type A B C or X in uppercase) : ");
        char type = sc.next().charAt(0);
        if (type == 'A') {
            total = money + (money * 0.015);
        }
        else if (type == 'B') {
            total = money + (money * 0.02);
        }
        else if (type == 'C') {
            total = money + (money * 0.015);
        }
        else if (type == 'X') {
            total = money + (money * 0.05);
        }
        System.out.println("Your total money in one year = " + (int)total);
    }
}
