import javax.swing.*;
import java.awt.*;

public class CalculatorOneGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("เครื่องคิดเลข");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new GridLayout(4,1));
        JTextField num1 = new JTextField();
        JTextField num2 = new JTextField();
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        JButton btnPlus = new JButton("บวก");
        JButton btnMinus = new JButton("ลบ");
        JButton btnMultiply = new JButton("คูณ");
        JButton btnDivide = new JButton("หาร");
        buttonPanel.add(btnPlus);
        buttonPanel.add(btnMinus);
        buttonPanel.add(btnMultiply);
        buttonPanel.add(btnDivide);
        JTextField result = new JTextField();
        result.setEditable(false);
        frame.add(num1);
        frame.add(num2);
        frame.add(buttonPanel);
        frame.add(result);
        frame.setVisible(true);
    }
}
