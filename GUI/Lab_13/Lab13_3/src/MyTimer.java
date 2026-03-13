import javax.swing.*;
import java.awt.*;

public class MyTimer extends JLabel implements Runnable {
    private int secondsPassed = 0;
    
    @Override
    public void run() {
        while (true) {
            int hour = secondsPassed / 3600;
            int min = (secondsPassed % 3600) / 60;
            int sec = secondsPassed % 60;
            
            this.setFont(new Font("Monospaced", Font.BOLD, 60));
            this.setHorizontalAlignment(JLabel.CENTER);
            this.setText(String.format("%02d:%02d:%02d", hour, min, sec));
            
            try {
                Thread.sleep(1000);
                secondsPassed++;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
