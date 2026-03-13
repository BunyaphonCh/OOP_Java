import javax.swing.*;
import java.awt.*;

public class MyFrame {

    public static void main(String[] args) {
        JFrame fr = new JFrame("Timer");
        MyTimer timerLabel = new MyTimer();
        
        Thread t = new Thread(timerLabel);
        t.start();
        
        fr.add(timerLabel);
        fr.setSize(350, 200);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setLocationRelativeTo(null);
        fr.setVisible(true);
    }
}
