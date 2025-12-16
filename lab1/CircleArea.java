import java.util.*;
public class CircleArea {
        public static void main(String[] agrs){
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        double area = Math.PI*Math.pow(radius,2);
        System.out.println(area);
    }
}
