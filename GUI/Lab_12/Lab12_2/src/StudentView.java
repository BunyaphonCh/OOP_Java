import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class StudentView extends JFrame {
    private JTextField idField, nameField;
    private JLabel moneyLabel;
    private JButton depositBtn, withdrawBtn;
    private Student student;
    private String filePath = "StudentM.dat";
    
    public StudentView() {
        setTitle("StudentProfile");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        JLabel idLbl = new JLabel("ID:");
        idField = new JTextField(20);
        
        JLabel nameLbl = new JLabel("Name:");
        nameField = new JTextField(20);
        
        JLabel moneyLbl = new JLabel("Money:");
        moneyLabel = new JLabel("0");  // ✅ moneyLabel (ไม่ moneyLbl)
        
        depositBtn = new JButton("Deposit");
        withdrawBtn = new JButton("Withdraw");
        
        depositBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                depositMoney();
            }
        });
        
        withdrawBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                withdrawMoney();
            }
        });
        
        JPanel mainPanel = new JPanel(new GridLayout(4, 2, 10, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        mainPanel.add(idLbl);
        mainPanel.add(idField);
        mainPanel.add(nameLbl);
        mainPanel.add(nameField);
        mainPanel.add(moneyLbl);
        mainPanel.add(moneyLabel);  // ✅ moneyLabel
        mainPanel.add(depositBtn);
        mainPanel.add(withdrawBtn);
        add(mainPanel);
        
        loadStudentData();
        
        setVisible(true);
    }
    
    private void loadStudentData() {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            student = (Student) ois.readObject();
            updateUI();
        } catch(IOException | ClassNotFoundException e) {
            student = new Student();
        }
    }
    
    private void saveStudentData() {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(student);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private void depositMoney() {
        try {
            int id = Integer.parseInt(idField.getText());
            String name = nameField.getText();
            
            if (name.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter name");
                return;
            }
            
            student.setID(id);
            student.setName(name);
            student.deposit(100);
            
            saveStudentData();
            updateUI();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter valid ID");
        }
    }
    
    private void withdrawMoney() {
        try {
            int id = Integer.parseInt(idField.getText());
            String name = nameField.getText();
            
            if (name.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter name");
                return;
            }
            
            student.setID(id);
            student.setName(name);
            
            if (student.withdraw(100)) {
                saveStudentData();
                updateUI();
            } else {
                JOptionPane.showMessageDialog(this, "Not enough money");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter valid ID");
        }
    }
    
    private void updateUI() {
        idField.setText(String.valueOf(student.getID()));
        nameField.setText(student.getName());
        moneyLabel.setText(String.valueOf(student.getMoney()));
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new StudentView());
    }
}