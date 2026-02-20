import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculatorSample implements ActionListener {
    private JFrame frame;
    private JTextField textField;
    private JPanel panel;
    
    private double firstNum = 0;
    private String operator = "";
    private boolean isOperatiorClicked = false;
            
    public CalculatorSample() {
        frame = new JFrame("My Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 350);
        
        frame.setLayout(new BorderLayout());
        
        textField = new JTextField();
        textField.setFont(new Font("Arial", Font.BOLD, 24));
        textField.setHorizontalAlignment(JTextField.RIGHT);
        textField.setEditable(false);
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
            btn.addActionListener(this);
            panel.add(btn);
        }
        frame.add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if (command.equals("c")) {
            textField.setText("");
            firstNum = 0;
            operator = "";
        }
        else if (command.equals("+") || command.equals("-") || command.equals("x") || command.equals('/')) {
            firstNum = Double.parseDouble(textField.getText());
            operator = command;
            textField.setText("");
        }
        else if (command.equals("=")) {
            double secondNum = Double.parseDouble(textField.getText());
            double result = 0;
            switch (operator) {
                case "+" : result = firstNum + secondNum; break;
                case "-" : result = firstNum - secondNum; break;
                case "x" : result = firstNum * secondNum; break;
                case "/": 
                    if (secondNum != 0) result = firstNum / secondNum;
                    else { textField.setText("Error"); return; }
                    break;
            }
            textField.setText(String.valueOf(result));
        }
        else {
            textField.setText(textField.getText() + command);
        }
    }
    public static void main(String[] args) {
        new CalculatorSample();
    }
}
