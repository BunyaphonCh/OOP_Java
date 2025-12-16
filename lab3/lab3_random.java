import java.util.*;
public class lab3_random {
    public static void main(String[] args) {
        int odd = 0, even = 0;
        while (true) {
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            if (num == -1) {
                break;
            }
            else {
                if (num % 2 == 0) {
                    even++;
                }
                else {
                    odd++;
                }
            }
        }
        System.out.println("Odd number = "+odd+" and Even number = "+even);
    }
}
