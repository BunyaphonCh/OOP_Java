import java.awt.event.*;
public class TellerHandler implements ActionListener{
    private TellerGUI gui;
    
    public TellerHandler(TellerGUI gui) {
        this.gui = gui;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        String sc = ae.getActionCommand();
        double amount;
        
        if(sc.equals("Deposit")) {
            amount = Double.parseDouble(gui.getAmountText());
            gui.setBalance(gui.getBalance() + amount);
            gui.clear();
        }
        else if (sc.equals("Withdraw")) {
            amount = Double.parseDouble(gui.getAmountText());
            if (gui.getBalance() >= amount) {
                gui.setBalance(gui.getBalance() - amount);
            }
            gui.clear();
        }
        else if (sc.equals("Exit")) {
            System.exit(0);
        }
    }
}