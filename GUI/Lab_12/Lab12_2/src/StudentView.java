import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class StudentView implements ActionListener ,WindowListener{
    private JFrame fr;
    private JTextField id,name,money;
    private JLabel idLabel,nameLabel ,moneyLabel;
    private JButton deposit , withdraw;
    private JPanel idpanel, namepanel,moneypanel,button;
    
    public StudentView(){
        fr =  new JFrame("Student view");
        id = new JTextField();
        name = new JTextField();
        money = new JTextField("0");
        idLabel = new JLabel("    ID :");
        nameLabel = new JLabel("    Name :");
        moneyLabel = new JLabel("    Money :");
        deposit = new JButton("Deposit");
        withdraw = new JButton("Withdraw");
        idpanel = new JPanel();
        namepanel = new JPanel();
        moneypanel = new JPanel();
        button = new JPanel();
        
        fr.setSize(300,500);
        
        idpanel.setLayout(new GridLayout(1,2));
        idpanel.add(idLabel);
        idpanel.add(id);
        
        namepanel.setLayout(new GridLayout(1,2));
        namepanel.add(nameLabel);
        namepanel.add(name);
        
        moneypanel.setLayout(new GridLayout(1,2));
        money.setEditable(false);
        moneypanel.add(moneyLabel);
        moneypanel.add(money);
        
        button.add(deposit);
        button.add(withdraw);
        
        fr.setLayout(new GridLayout(4,1));
        fr.add(idpanel);
        fr.add(namepanel);
        fr.add(moneypanel);
        fr.add(button);
        
        File f = new File("StudentM.dat");
        
        if(f.exists()){
            
            try{
                FileInputStream fis = new FileInputStream(f);
                try (ObjectInputStream ois = new ObjectInputStream(fis)) {
                    Student s = (Student) ois.readObject();
                    
                    name.setText(s.getName());
                    id.setText(String.valueOf(s.getID()));
                    money.setText(String.valueOf(s.getMoney()));
                }
            }
            catch(IOException | ClassNotFoundException ex){
                    ex.printStackTrace();
            }
        }
        
        deposit.addActionListener(this);
        withdraw.addActionListener(this);
        
        fr.addWindowListener(this);
        
        fr.pack();
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        int m = Integer.parseInt(money.getText());
        if (e.getSource() == deposit) {
            m = m +100;
        }
        else{
            if (m >= 100) {
                m = m - 100;
            }
            else{
                JOptionPane.showMessageDialog(fr,"Not enough money");
            }
        }
        
        money.setText(String.valueOf(m));
    }
    
    @Override
    public void windowOpened(WindowEvent e) {
    }

    @Override
    public void windowClosing(WindowEvent e) {
        try{
            FileOutputStream fos = new FileOutputStream("StudentM.dat");
            try (ObjectOutputStream oss = new ObjectOutputStream(fos)) {
                Student s = new Student(
                        name.getText(),
                        Integer.parseInt(id.getText()),
                        Integer.parseInt(money.getText())
                );
                
                oss.writeObject(s);
            }
            
        }
        
        catch(IOException ex){
            System.out.println(ex);
    }
    }

    @Override
    public void windowClosed(WindowEvent e) {
    }

    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }
    
}