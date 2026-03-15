import java.awt.*;
import javax.swing.*;

public class CalculatorOneGUI {

    private JFrame fr;
    private JTextField num1, num2, num3, ans;
    private JPanel opers;
    private JButton b1, b2, b3, b4;

    public CalculatorOneGUI() {
        fr = new JFrame("เครื่องคิดเลข");
        num1 = new JTextField();
        num2 = new JTextField();
        ans = new JTextField();
        opers = new JPanel();

        fr.setLayout(new GridLayout(4, 1));
        fr.add(num1);
        fr.add(num2);
        fr.add(opers);
        fr.add(ans);

        b1 = new JButton("บวก");
        b2 = new JButton("ลบ");
        b3 = new JButton("คูณ");
        b4 = new JButton("หาร");
        opers.setLayout(new FlowLayout());
        opers.add(b1);
        opers.add(b2);
        opers.add(b3);
        opers.add(b4);

        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(350, 175);
        fr.setVisible(true);
    }
}