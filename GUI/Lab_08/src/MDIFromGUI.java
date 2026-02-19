import javax.swing.*;
import java.awt.*;

public class MDIFromGUI {
    private JFrame frame;
    private JDesktopPane desktopPane;
    private int openFrameCount = 0;
    
    private JMenuBar menuBar;
    private JMenu mFile, mEdit, mView, mNew;
    private JMenuItem mWindow, mMessage, mOpen, mSave, mExit;

    public MDIFromGUI() {
        frame = new JFrame("SubMenuItem Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        
        desktopPane = new JDesktopPane();
        desktopPane.setBackground(Color.BLACK);
        frame.add(desktopPane);

        menuBar = new JMenuBar();
        
        mFile = new JMenu("File");
        mEdit = new JMenu("Edit");
        mView = new JMenu("View");
        
        mNew = new JMenu("New");
        mWindow = new JMenuItem("Window");
        mMessage = new JMenuItem("Message");
        mNew.add(mWindow);
        mNew.addSeparator();
        mNew.add(mMessage);
        
        mOpen = new JMenuItem("Open");
        mSave = new JMenuItem("Save");
        mExit = new JMenuItem("Exit");
        
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