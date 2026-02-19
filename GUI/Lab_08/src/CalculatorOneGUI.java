import javax.swing.*;
import java.awt.*;

public class CalculatorOneGUI {
    private JFrame frame;
    private JTextField num1, num2, result;
    private JPanel buttonPanel;
    private JButton btnPlus, btnMinus, btnMultiply, btnDivide;
    
    public CalculatorOneGUI() {
        frame = new JFrame("เครื่องคิดเลข");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        
        frame.setLayout(new GridLayout(4,1));
        
        num1 = new JTextField();
        num2 = new JTextField();
        result = new JTextField();
        result.setEditable(false);
        
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        
        btnPlus = new JButton("บวก");
        btnMinus = new JButton("ลบ");
        btnMultiply = new JButton("คูณ");
        btnDivide = new JButton("หาร");
        
        buttonPanel.add(btnPlus);
        buttonPanel.add(btnMinus);
        buttonPanel.add(btnMultiply);
        buttonPanel.add(btnDivide);
        
        frame.add(num1);
        frame.add(num2);
        frame.add(buttonPanel);
        frame.add(result);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new CalculatorOneGUI();
    }
}
