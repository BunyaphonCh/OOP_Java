import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class PoringConstructor extends JFrame {
    private JButton AddButton;
    private int poringTotal = 0;
    private ArrayList<Poring> poringList = new ArrayList<>();

    public PoringConstructor() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setSize(100, 75);
        this.setLocationRelativeTo(null);

        AddButton = new JButton("Add");
        
        AddButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                poringTotal++;
                Poring newPoring = new Poring(poringTotal);
                poringList.add(newPoring);
            }
        });

        this.add(AddButton);
        this.setVisible(true);
    }
}