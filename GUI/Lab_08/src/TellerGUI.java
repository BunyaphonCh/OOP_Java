import java.awt.*;
import javax.swing.*;

public class TellerGUI {

    private JFrame fr;
    private JPanel balPanel, amtPanel, btnPanel;
    private JLabel balanceLabel, amtLabel;
    private JTextField balanceValue, amtInput;
    private JButton dep, with, exit;

    public TellerGUI() {
        fr = new JFrame("Teller GUI");
        fr.setLayout(new GridLayout(4, 1));

        balPanel = new JPanel();
        balPanel.setLayout(new GridLayout(1, 2));
        balanceLabel = new JLabel("  Balance");
        balanceValue = new JTextField("6000");
        balanceValue.setEditable(false);
        balPanel.add(balanceLabel);
        balPanel.add(balanceValue);

        amtPanel = new JPanel();
        amtLabel = new JLabel("  Amount");
        amtPanel.setLayout(new GridLayout(1, 2));
        amtInput = new JTextField();
        amtPanel.add(amtLabel);
        amtPanel.add(amtInput);

        btnPanel = new JPanel();
        dep = new JButton("Deposit");
        with = new JButton("Withdraw");
        exit = new JButton("Exit");
        btnPanel.add(dep);
        btnPanel.add(with);
        btnPanel.add(exit);

        fr.add(balPanel);
        fr.add(amtPanel);
        fr.add(btnPanel);

        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
    }
}