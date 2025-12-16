import java.util.*;
public class lab3_grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt(), exc = 0, good = 0, fair = 0, poor = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter score for student "+i+": ");
            int score = sc.nextInt();
            if (score >= 80) {
                System.out.println("Excellent");
                exc++;
            }
            else if (score >= 60) {
                System.out.println("Good");
                good++;
            }
            else if (score >= 50) {
                System.out.println("Fair");
                fair++;
            }
            else {
                System.out.println("Poor");
                poor++;
            }
        }
        System.out.println("");
        System.out.println("Summary:");
        System.out.println("Excellent:"+exc);
        System.out.println("Good:"+good);
        System.out.println("Fair:"+fair);
        System.out.println("Poor:"+poor);
    }
}
