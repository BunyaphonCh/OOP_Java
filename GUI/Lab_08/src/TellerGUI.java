import javax.swing.*;
import java.awt.*;
import javax.swing.border.EmptyBorder;
public class TellerGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Teller GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new BorderLayout());
        
        JPanel mainPanel = new JPanel(new GridLayout(4, 1, 5, 5));
        mainPanel.setBorder(new EmptyBorder(10, 10, 20, 10));
        
        JPanel p1 = new JPanel(new GridLayout(1, 2));
        p1.add(new JLabel("Balance"));
        JTextField txtBalance = new JTextField("6000");
        txtBalance.setEditable(false);
        p1.add(txtBalance);
        mainPanel.add(p1);
        
        JPanel p2 = new JPanel(new GridLayout(1, 2));
        p2.add(new JLabel("Amount"));
        JTextField txtAmount = new JTextField();
        p2.add(txtAmount);
        mainPanel.add(p2);
        
        JPanel p3 = new JPanel(new GridLayout(1, 3, 5, 0));
        JButton btnDeposit = new JButton("Deposit");
        JButton btnWithdraw = new JButton("Withdraw");
        JButton btnExit = new JButton("Exit");
        p3.add(btnDeposit);
        p3.add(btnWithdraw);
        p3.add(btnExit);
        mainPanel.add(p3);
        
        mainPanel.add(new JLabel("")); 
        frame.add(mainPanel);
        frame.setVisible(true);
    }
}
