import javax.swing.*;
import java.awt.*;

public class MDIFromGUI {
    private JFrame frame;
    private JDesktopPane desktopPane;
    private int openFrameCount = 0;

    public MDIFromGUI() {
        frame = new JFrame("SubMenuItem Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        
        desktopPane = new JDesktopPane();
        desktopPane.setBackground(Color.BLACK);
        frame.add(desktopPane);

        JMenuBar menuBar = new JMenuBar();
        
        JMenu mFile = new JMenu("File");
        JMenu mEdit = new JMenu("Edit");
        JMenu mView = new JMenu("View");
        
        JMenu mNew = new JMenu("New");
        JMenuItem mWindow = new JMenuItem("Window");
        JMenuItem mMessage = new JMenuItem("Message");
        
        mNew.add(mWindow);
        mNew.addSeparator();
        mNew.add(mMessage);

        JMenuItem mOpen = new JMenuItem("Open");
        JMenuItem mSave = new JMenuItem("Save");
        JMenuItem mExit = new JMenuItem("Exit");

        mFile.add(mNew);
        mFile.addSeparator();
        mFile.add(mOpen);
        mFile.addSeparator();
        mFile.add(mSave);
        mFile.addSeparator();
        mFile.add(mExit);
        
        menuBar.add(mFile);
        menuBar.add(mEdit);
        menuBar.add(mView);
        frame.setJMenuBar(menuBar);

        mWindow.addActionListener(e -> {
            openFrameCount++;
            createInternalFrame();
        });

        mExit.addActionListener(e -> System.exit(0));

        frame.setVisible(true);
    }

    private void createInternalFrame() {

        String title = String.format("Application %02d", openFrameCount);

        JInternalFrame iframe = new JInternalFrame(title, true, true, true, true);
        
        iframe.setSize(300, 200);
        iframe.setLocation(20 * openFrameCount, 20 * openFrameCount); 
        iframe.setVisible(true);
        
        desktopPane.add(iframe);
        try {
            iframe.setSelected(true);
        } catch (java.beans.PropertyVetoException e) {}
    }

    public static void main(String[] args) {
        try {

            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        new MDIFromGUI();
    }
}