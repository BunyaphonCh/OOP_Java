import java.util.*;
public class Time {
        public static void main(String[] agrs){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your exercise time 1 :");
        int num1 = input.nextInt();
        System.out.print("Enter your exercise time 2 :");
        int num2 = input.nextInt();
        int AllTime = num1+num2;
        int Hour = AllTime/3600;
        int Min = (AllTime%3600)/60;
        int Sec = (AllTime%60);
        System.out.println("It is "+Hour+" hours "+Min+" minutes and "+Sec+" seconds.");
    }
}
