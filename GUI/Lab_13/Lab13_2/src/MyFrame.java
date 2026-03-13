import java.awt.*;
import javax.swing.*;

public class MyFrame {
    public static void main(String[] args) {
        JFrame fr = new JFrame("Clock");
        MyClock clock = new MyClock();
        Thread t = new Thread(clock);
        t.start();
        
        fr.add(clock, BorderLayout.CENTER);
        fr.setSize(300, 150);
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
