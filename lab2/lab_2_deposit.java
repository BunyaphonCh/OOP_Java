
import java.util.*;
public class lab_2_deposit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double income = sc.nextDouble(), res = 0;
        if (income > 50_000) {
            res = income * 0.1;
        }
        else if (income <= 50_000) {
            res = income * 0.05;
        }
        System.out.println(res);
    }
}
