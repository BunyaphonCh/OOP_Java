
import java.util.*;
public class lab2_gpa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter GPA: ");
        double gpa = sc.nextDouble();
        System.out.print("Enter family income: ");
        int salary = sc.nextInt();
        if (gpa >= 3.5) {
            if (salary <= 15_000) {
                System.out.println("You are eligible for the scholarship.");
            }
            else {
                System.out.println("You are not eligible for a scholarship.");
            }
        }
        else {
            System.out.println("You are not eligible for a scholarship.");
        }
    }
}
