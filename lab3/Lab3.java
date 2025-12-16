import java.util.*;
public class Lab3 {

    public static void main(String[] args) {
        while (true) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Password: ");
        String pw = sc.nextLine();
        if (pw.equals("PASS2025")) {
            System.out.println("Access granted.");
            break;
        } else {
            System.out.println("Try again.");
        }
        }
    }
    
}
