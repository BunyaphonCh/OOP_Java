
import java.util.*;
public class lab_2_temp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature (°C): ");
        double temp = sc.nextDouble();
        System.out.print("Enter humidity (%): ");
        int humidity = sc.nextInt();
        System.out.println("");
        if (temp > 37.5) {
            System.out.println("Warning: High temperature!");
        }
        else {
            System.out.println("Temperature normal.");
        }
        if (humidity > 80) {
            System.out.println("Humidity is too high.");
        }
        else {
            System.out.println("Humidity is acceptable.");
        }
    }
}
