import javax.swing.*;
import java.awt.*;
public class TellerGUI {
    private JFrame fr;
    private JPanel pTop, pCen, pBot, p;
    private JLabel lbBa, lbAm;
    private JTextField txt1, txt2;
    private JButton bDe, bWi, bEx;
    double balance = 6000;
    
    public TellerGUI() {
        fr = new JFrame("Teller GUI");
        fr.setLayout(new GridLayout(4,1));
        
        pTop = new JPanel();
        pTop.setLayout(new GridLayout(1,2));
        lbBa = new JLabel("Balance");
        txt1 = new JTextField("6000");
        txt1.setEditable(false);
        pTop.add(lbBa);
        pTop.add(txt1);
        
        pCen = new JPanel();
        pCen.setLayout(new GridLayout(1,2));
        lbAm = new JLabel("Amount");
        txt2 = new JTextField();
        pCen.add(lbAm);
        pCen.add(txt2);
        

        pBot = new JPanel();
        pBot.setLayout(new FlowLayout());
        bDe = new JButton("Deposit");
        bWi = new JButton("Withdraw");
        bEx = new JButton("Exit");
        pBot.add(bDe);
        pBot.add(bWi);
        pBot.add(bEx);
        
        p = new JPanel();
        
        TellerHandler handler = new TellerHandler(this);
        bDe.addActionListener(handler);
        bWi.addActionListener(handler);
        bEx.addActionListener(handler);
        
        fr.add(pTop);
        fr.add(pCen);
        fr.add(pBot);
        fr.add(p);
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(260,200);
        fr.setVisible(true);
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
        txt1.setText(String.valueOf(balance));
    }
    public String getAmountText() {
        return txt2.getText();
    }
    public void clear() {
        txt2.setText("");
    }
}