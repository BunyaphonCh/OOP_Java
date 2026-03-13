import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyTimer extends JLabel implements Runnable, MouseListener {
    private int secondsPassed = 0;
    private boolean isPaused = false;
    
    public MyTimer() {
        this.setFont(new Font("Monospaced", Font.BOLD, 60));
        this.setHorizontalAlignment(JLabel.CENTER);
        this.addMouseListener(this);
    }
    
    @Override
    public void run() {
        while (true) {
            int hour = secondsPassed / 3600;
            int min = (secondsPassed % 3600) / 60;
            int sec = secondsPassed % 60;
            
            this.setText(String.format("%02d:%02d:%02d", hour, min, sec));
            
            try {
                Thread.sleep(1000);
                if (!isPaused) {
                    secondsPassed++;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        isPaused = !isPaused;
        if (!isPaused) {
            this.setForeground(Color.black);
        } else {
            this.setForeground(Color.red);
        }
    }
    
    @Override
    public void mousePressed(MouseEvent e) {
        
    }
    
    @Override
    public void mouseReleased(MouseEvent e) {
        
    }
    
    @Override
    public void mouseEntered(MouseEvent e) {
        
    }
    
    @Override
    public void mouseExited(MouseEvent e) {
        
    }
}
