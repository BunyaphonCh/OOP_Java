import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        double a = 0, b = 0, c = 0;
        Scanner scanner = new Scanner(System.in);
        
        try {
            if (args.length == 3) {
                a = Double.parseDouble(args[0]);
                b = Double.parseDouble(args[1]);
                c = Double.parseDouble(args[2]);
            } else if (args.length == 0) {
                boolean validA = false;
                while (!validA) {
                    try {
                        System.out.print("Enter a: ");
                        String inputA = scanner.nextLine();
                        a = Double.parseDouble(inputA);
                        validA = true;
                    } catch (NumberFormatException e) {
                        System.out.println("Please input data in number format only.");
                        System.out.println();
                    }
                }
                
                boolean validB = false;
                while (!validB) {
                    try {
                        System.out.print("Enter b: ");
                        String inputB = scanner.nextLine();
                        b = Double.parseDouble(inputB);
                        validB = true;
                    } catch (NumberFormatException e) {
                        System.out.println("Please input data in number format only.");
                        System.out.println();
                    }
                }
                
                boolean validC = false;
                while (!validC) {
                    try {
                        System.out.print("Enter c: ");
                        String inputC = scanner.nextLine();
                        c = Double.parseDouble(inputC);
                        validC = true;
                    } catch (NumberFormatException e) {
                        System.out.println("Please input data in number format only.");
                        System.out.println();
                    }
                }
            } else {
                System.out.println("Please enter 3 numbers as a, b, and c respectively.");
                System.out.println();
                scanner.close();
                return;
            }
            
            if (a != 0) {
                double discriminant = (b * b) - (4 * a * c);
                double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                
                System.out.println("x1: " + x1);
                System.out.println("x2: " + x2);
                System.out.println();
            }
        } catch (NumberFormatException e) {
            System.out.println("Please input data in number format only.");
            System.out.println();
        }
        
        scanner.close();
    }
}