import javax.swing.*;
import java.awt.*;
import javax.swing.border.EmptyBorder;

public class TellerGUI {
    private JFrame frame;
    private JPanel mainPanel, p1, p2, p3;
    private JTextField txtBalance, txtAmount;
    private JButton btnDeposit, btnWithdraw, btnExit;
    private JLabel lblBalance, lblAmount;
    
    public TellerGUI() {
        frame = new JFrame("Teller GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new BorderLayout());
        
        mainPanel = new JPanel(new GridLayout(4, 1, 5, 5));
        mainPanel.setBorder(new EmptyBorder(10, 10, 20, 10));
        
        p1 = new JPanel(new GridLayout(1, 2));
        lblBalance = new JLabel("Balance");
        txtBalance = new JTextField("6000");
        txtBalance.setEditable(false);
        p1.add(lblBalance);
        p1.add(txtBalance);
        mainPanel.add(p1);
        
        p2 = new JPanel(new GridLayout(1,2));
        lblAmount = new JLabel("Amount");
        txtAmount = new JTextField();
        p2.add(lblAmount);
        p2.add(txtAmount);
        mainPanel.add(p2);
        
        p3 = new JPanel(new GridLayout(1, 3, 5, 0));
        btnDeposit = new JButton("Deposit");
        btnWithdraw = new JButton("Withdraw");
        btnExit = new JButton("Exit");
        p3.add(btnDeposit);
        p3.add(btnWithdraw);
        p3.add(btnExit);
        mainPanel.add(p3);
        
        mainPanel.add(new JLabel(""));
        frame.add(mainPanel);
        btnExit.addActionListener(e -> System.exit(0));
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
        new TellerGUI();
    }
}
