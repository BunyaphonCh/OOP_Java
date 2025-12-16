import java.util.*;
public class Stamp {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        String Str = sc.nextLine();
        int price = Integer.parseInt(Str);
        int priceInt = (int) price;
        int stamp = priceInt/50;
        System.out.println("Total Price : "+Str);
        System.out.println("You got "+stamp+" stamp(s)");
    }
}