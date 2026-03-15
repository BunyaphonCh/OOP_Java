import java.awt.*;
import javax.swing.*;

public class CalculatorSample {
    private JFrame fs;
    private JTextField ans;
    private JPanel foper;
    private JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9;
    private JButton o1, o2, o3, o4, eq, c;
    
    double num1 = 0, num2 = 0;
    String operator = "";
    
    public CalculatorSample(){
        fs = new JFrame("My Calculator");
        ans = new JTextField();
        foper = new JPanel();
        
        fs.setLayout(new BorderLayout());
        fs.add(ans, BorderLayout.NORTH);
        fs.add(foper, BorderLayout.CENTER);
        
        ActionHandler handler = new ActionHandler(this);
        b0 = new JButton("0");
        b0.addActionListener(handler);
        b1 = new JButton("1");
        b1.addActionListener(handler);
        b2 = new JButton("2");
        b2.addActionListener(handler);
        b3 = new JButton("3");
        b3.addActionListener(handler);
        b4 = new JButton("4");
        b4.addActionListener(handler);
        b5 = new JButton("5");
        b5.addActionListener(handler);
        b6 = new JButton("6");
        b6.addActionListener(handler);
        b7 = new JButton("7");
        b7.addActionListener(handler);
        b8 = new JButton("8");
        b8.addActionListener(handler);
        b9 = new JButton("9");
        b9.addActionListener(handler);
        
        o1 = new JButton("+");
        o1.addActionListener(handler);
        o2 = new JButton("-");
        o2.addActionListener(handler);
        o3 = new JButton("x");
        o3.addActionListener(handler);
        o4 = new JButton("/");
        o4.addActionListener(handler);
        eq = new JButton("=");
        eq.addActionListener(handler);
        c = new JButton("c");
        c.addActionListener(handler);
        
        foper.setLayout(new GridLayout(4, 4));
        foper.add(b7);
        foper.add(b8);
        foper.add(b9);
        foper.add(o1);
        
        foper.add(b4);
        foper.add(b5);
        foper.add(b6);
        foper.add(o2);
        
        foper.add(b1);
        foper.add(b2);
        foper.add(b3);
        foper.add(o3);
        
        foper.add(b0);
        foper.add(c);
        foper.add(eq);
        foper.add(o4);
        
        fs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fs.setSize(225, 225);
        fs.setVisible(true);
    }
    
    public String getDisplay() {
        return ans.getText();
    }
    public void setDisplay(String text) {
        ans.setText(text);
    }
    public double getNum1() {
        return num1;
    }
    public void setNum1(double num1) {
        this.num1 = num1;
    }
    public double getNum2() {
        return num2;
    }
    public void setNum2(double num2) {
        this.num2 = num2;
    }
    public String getOperator() {
        return operator;
    }
    public void setOperator(String operator) {
        this.operator = operator;
    }
}