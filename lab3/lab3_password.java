import java.util.*;
public class lab3_password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of digits: ");
        int num = sc.nextInt();
        String res = sc.nextLine();
        for (int i = 1; i <= num; i++) {
            System.out.print("Enter digit "+i+": ");
            int digit = sc.nextInt();
            res += digit;
        }
        System.out.println("");
        System.out.println("Final Code = "+res);
    }
}
