import java.awt.*;
import javax.swing.*;
public class MDIFromGUI {
    private JFrame fr;
    private JMenuBar mb;
    private JMenu mn1, mn2, mn3, mns1;
    private JMenuItem mi1, mi2, mi3, msi1, msi2;
    private JDesktopPane dp;
    private JInternalFrame ip1, ip2, ip3;

    public MDIFromGUI(){
        //set MainFrame and MenuBar
        fr = new JFrame("SubMenuItem Demo");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mb = new JMenuBar();
        fr.setJMenuBar(mb);
        mn1 = new JMenu("Filerxxx");
        mn1.setMnemonic('F');
        mn2 = new JMenu("Edit");
        mn3 = new JMenu("View");
        mns1 = new JMenu("New");
        mb.add(mn1);
        mb.add(mn2);
        mb.add(mn3);
        mi1 = new JMenuItem("Open");
        mi2 = new JMenuItem("Save");
        mi3 = new JMenuItem("Exit");
        msi1 = new JMenuItem("Window");
        msi2 = new JMenuItem("Message");
        mn1.add(mns1);
        mns1.add(msi1);
        mns1.add(msi2);
        mn1.add(mi1);
        mn1.add(mi2);
        mn1.add(mi3);
        
        //set JDesktopPane
        dp = new JDesktopPane();
        dp.setSize(400, 400);
        dp.setVisible(true);
        dp.setBackground(Color.black);
        fr.add(dp);
        
        //set JInternalFrame 
        ip1 = new JInternalFrame("Application01", true, true, true, true);
        ip1.setSize(250,150);
        ip1.setVisible(true);
        ip2 = new JInternalFrame("Application02", true, true, true, true);
        ip2.setSize(250,200);
        ip2.setVisible(true);
        ip3 = new JInternalFrame("Application03", true, true, true, true);
        ip3.setSize(320,250);
        ip3.setVisible(true);
        dp.add(ip1);
        dp.add(ip2);
        dp.add(ip3);
        ip1.setLocation(50, 350);
        ip2.setLocation(150, 80);
        ip3.setLocation(430, 250);

        //show Frame
        fr.setSize(800, 600);
        fr.setVisible(true);
    }
}
