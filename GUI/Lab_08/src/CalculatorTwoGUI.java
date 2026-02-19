import javax.swing.*;
import java.awt.*;

public class CalculatorTwoGUI {
    private JFrame frame;
    private JTextField textField;
    private JPanel panel;
            
    public CalculatorTwoGUI() {
        frame = new JFrame("My Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 350);
        
        frame.setLayout(new BorderLayout());
        
        textField = new JTextField();
        textField.setFont(new Font("Arial", Font.BOLD, 24));
        textField.setHorizontalAlignment(JTextField.RIGHT);
        frame.add(textField, BorderLayout.NORTH);
        
        panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 5, 5));
        String[] buttons = {
            "7", "8", "9", "+",
            "4", "5", "6", "-",
            "1", "2", "3", "x",
            "0", "c", "=", "/"
        };
        
        for (String label : buttons) {
            JButton btn =new JButton(label);
            btn.setFont(new Font("Arial", Font.PLAIN, 18));
            panel.add(btn);
        }
        frame.add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        try 
        {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
        
        new CalculatorTwoGUI();
    }
}
