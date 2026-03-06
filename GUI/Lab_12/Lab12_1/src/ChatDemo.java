import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ChatDemo extends JFrame {
    private JTextArea textArea;
    private JTextField textField;
    private JButton submitBtn, resetBtn;
    private String filePath = "ChatDemo.dat";
    
    public ChatDemo() {
        setTitle("ChatDemo");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        textArea = new JTextArea(20, 45);
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        
        textField = new JTextField(45);
        textField.setPreferredSize(new Dimension(500, 35));
        
        submitBtn = new JButton("Submit");
        resetBtn = new JButton("Reset");
        
        submitBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                submitMessage();
            }
        });
        
        resetBtn.addActionListener(new ActionListener()  {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetMessage();
            }
        });
        
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(submitBtn);
        buttonPanel.add(resetBtn);
        
        JPanel bottomPanel = new JPanel(new BorderLayout());
        bottomPanel.add(textField, BorderLayout.NORTH);
        bottomPanel.add(buttonPanel, BorderLayout.SOUTH);
        
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(scrollPane, BorderLayout.CENTER);
        mainPanel.add(bottomPanel, BorderLayout.SOUTH);
        
        setContentPane(mainPanel);
        
        loadChatHistory();
        
        setVisible(true);
    }
    
    private void loadChatHistory() {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                textArea.append(line + "\n");
            }
        } catch (IOException e) {
            
        }
    }
    
    private void submitMessage() {
        String message = textField.getText();
        
        if (message.isEmpty()) {
            return;
        }
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        String timeStamp = LocalDateTime.now().format(dtf);
        String fullMessage = timeStamp + " " + message;
        textArea.append(fullMessage + "\n");
        saveChatHistory(fullMessage);
        textField.setText("");
    }
    
    private void saveChatHistory(String message) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(message);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private void resetMessage() {
        textArea.setText("");
        textField.setText("");
        File file = new File(filePath);
        if (file.exists()) {
            file.delete();
        }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ChatDemo());
    }
    
}
