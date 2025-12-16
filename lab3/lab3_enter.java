import java.util.*;
public class lab3_enter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean hasData = false;
        int maxx = -9999, minn = 9999;
        while (true) {
            System.out.print("Enter a number (-1 to stop): ");
            int num = sc.nextInt();
            if (num == -1) {
                break;
            }
            hasData = true;
            if (num > maxx) {
                maxx = num;
            }
            if (num < minn) {
                minn = num;
            }
        }
        if (hasData) {
            System.out.println("");
            System.out.println("Maximum = "+maxx);
            System.out.println("Minimum = "+minn);
        } else {
            System.out.println("No numbers were entered.");
        }
    }
}
