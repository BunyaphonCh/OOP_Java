import java.util.*;
public class lab3_char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String res = "", con = "";
        while (true) {
            System.out.print("Enter a character: ");
            char text = sc.next().charAt(0);
            if (text == 'z') {
            break;
            }
            else if (text >= 'a' && text <= 'z') {
                res = res + text;
                if (text != 'a' & text != 'e' & text != 'i' & text != 'o' & text != 'u') {
                    con = con + text;
                }
            }
            else {
                System.out.println("Invalid input. Only lowercase a-z are allowed.");
            }
        }
        System.out.println("");
        System.out.println("All characters entered: "+res);
        System.out.println("Consonants only: "+con);
    }
}
