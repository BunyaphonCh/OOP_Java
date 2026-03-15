import java.awt.event.*;
public class ActionHandler implements ActionListener{
    private CalculatorSample gui;
    
    public ActionHandler(CalculatorSample gui){
        this.gui = gui;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        String sc = ae.getActionCommand();
        
        if (sc.matches("[0-9]")) {
            gui.setDisplay(gui.getDisplay() + sc);
        }
        else if (sc.matches("[+\\-x/]")) {
            if(gui.getDisplay().equals("")) {
                return;
            }
            gui.setNum1(Double.parseDouble(gui.getDisplay()));
            gui.setOperator(sc);
            gui.setDisplay("");
        }
        else if (sc.equals("=")) {
            if (gui.getDisplay().equals("")) { 
                return; // case display still whitespace
            }
            gui.setNum2(Double.parseDouble(gui.getDisplay()));
            
            double result = 0;
            
            if (gui.getOperator().equals("+")) {
                result = gui.getNum1() + gui.getNum2();
                
            }
            else if (gui.getOperator().equals("-")) {
                result = gui.getNum1() - gui.getNum2();
            }
            else if (gui.getOperator().equals("x")) {
                result = gui.getNum1() * gui.getNum2();
            }
            else if (gui.getOperator().equals("/")) {
                result = gui.getNum1() / gui.getNum2();
            }
            gui.setDisplay(String.valueOf(result));
        }
        else if (sc.equals("c")) {
            gui.setDisplay("");
            gui.setNum1(0);
            gui.setNum2(0);
            gui.setOperator("");
        }
    }
}