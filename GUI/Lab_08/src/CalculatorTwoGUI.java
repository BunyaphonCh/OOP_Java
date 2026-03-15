import java.awt.*;
import javax.swing.*;

public class CalculatorTwoGUI {

    private JFrame fr;
    private JTextField ans;
    private JPanel btns;
    private JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0;
    private JButton ac, eq, o1, o2, o3, o4;

    public CalculatorTwoGUI() {
        fr = new JFrame("My Calculator");
        ans = new JTextField();
        btns = new JPanel();

        fr.setLayout(new BorderLayout());
        fr.add(ans, BorderLayout.NORTH);
        fr.add(btns, BorderLayout.CENTER);

        b0 = new JButton("0");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");

        o1 = new JButton("+");
        o2 = new JButton("-");
        o3 = new JButton("x");
        o4 = new JButton("/");
        ac = new JButton("c");
        eq = new JButton("=");

        btns.setLayout(new GridLayout(4, 4));
        btns.add(b7);
        btns.add(b8);
        btns.add(b9);
        btns.add(o1);
        btns.add(b4);
        btns.add(b5);
        btns.add(b6);
        btns.add(o2);
        btns.add(b1);
        btns.add(b2);
        btns.add(b3);
        btns.add(o3);
        btns.add(b0);
        btns.add(ac);
        btns.add(eq);
        btns.add(o4);

        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(225, 225);
        fr.setVisible(true);
    }
}