import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        double a = 0, b = 0, c = 0;
        Scanner scanner = new Scanner(System.in);
        
        try {
            if (args.length == 3) {
                // ✅ รับจาก command line - ไม่มี loop
                try {
                    a = Double.parseDouble(args[0]);
                    b = Double.parseDouble(args[1]);
                    c = Double.parseDouble(args[2]);
                } catch (NumberFormatException e) {
                    System.out.println("Please input data in number format only.");
                    System.out.println();
                    scanner.close();
                    return;
                }
            } else {
                // ✅ Argument ไม่ครบ 3 ตัว
                System.out.println("Please enter 3 numbers as a, b, and c respectively.");
                System.out.println();
                scanner.close();
                return;
            }
            
            // ✅ คำนวณผลลัพธ์
            if (a != 0) {
                double discriminant = (b * b) - (4 * a * c);
                double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                
                System.out.println("x1: " + x1);
                System.out.println("x2: " + x2);
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Please input data in number format only.");
            System.out.println();
        }
        
        scanner.close();
    }
}