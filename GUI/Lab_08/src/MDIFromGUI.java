import java.awt.*;
import javax.swing.*;
public class MDIFromGUI {
    private JFrame fr;
    private JMenuBar mb;
    private JMenu m1, m2, m3, ms1;
    private JMenuItem mi1, mi2, mi3, msi1, msi2;
    private JDesktopPane desktopPane;
    private JInternalFrame frame1, frame2, frame3;

    public MDIFromGUI() {
        fr = new JFrame("SubMenuItem Demo");
        desktopPane = new JDesktopPane();
        desktopPane.setBackground(Color.BLACK);

        mb = new JMenuBar();
        m1 = new JMenu("File");
        m2 = new JMenu("Edit");
        m3 = new JMenu("View");
        fr.setJMenuBar(mb);
        mb.add(m1);
        mb.add(m2);
        mb.add(m3);

        ms1 = new JMenu("New");
        mi1 = new JMenuItem("Open");
        mi2 = new JMenuItem("Save");
        mi3 = new JMenuItem("Exit");
        
        m1.add(ms1);
        m1.add(mi1);
        m1.addSeparator();
        m1.add(mi2);
        m1.addSeparator();
        m1.add(mi3);

        msi1 = new JMenuItem("Window");
        msi2 = new JMenuItem("Message");
        ms1.add(msi1);
        ms1.addSeparator();
        ms1.add(msi2);

        frame1 = new JInternalFrame("Application 01", true, true, true, true); // ยืดหดขนาดได้, ปิดได้, ขยายเต็มจอได้, และย่อลงแถบงานได้
        frame2 = new JInternalFrame("Application 02", true, true, true, true);
        frame3 = new JInternalFrame("Application 03", true, true, true, true);

        frame1.setSize(250, 150);
        frame1.setLocation(50, 400);
        frame1.setVisible(true);

        frame2.setSize(250, 180);
        frame2.setLocation(230, 80);
        frame2.setVisible(true);

        frame3.setSize(350, 250);
        frame3.setLocation(500, 300);
        frame3.setVisible(true);

        desktopPane.add(frame1);
        desktopPane.add(frame2);
        desktopPane.add(frame3);

        fr.add(desktopPane);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(900, 700);
        fr.setVisible(true);
    }
}