import java.awt.*;
import javax.swing.*;
public class TellerGUI {
    private JFrame frame;
    private JPanel panel1, panel2, panel3;
    private JButton bn1, bn2, bn3;
    private JLabel label1, label3;
    private JTextField jt1, jt2;
    public TellerGUI(){
        frame = new JFrame("Teller GUI");
        frame.setLayout(new GridLayout(4, 0));
        panel1 = new JPanel();
        panel1.setLayout(new GridLayout(1, 2));
        frame.add(panel1);
        label1 = new JLabel();
        label1.setFont(new Font("Angsana New", Font.BOLD, 20));
        label1.setText("    Balance");
        panel1.add(label1);
        jt1 = new JTextField();
        jt1.setFont(new Font("Angsana New", Font.BOLD, 18));
        jt1.setText("6000");
        jt1.setEditable(false);
        panel1.add(jt1);
        panel2 = new JPanel();
        frame.add(panel2);
        panel2.setLayout(new GridLayout(1,2));
        label3 = new JLabel();
        label3.setFont(new Font("Angsana New", Font.BOLD, 20));
        label3.setText("    Amount");
        panel2.add(label3);
        jt2 = new JTextField();
        panel2.add(jt2);
        panel3 = new JPanel();
        bn1 = new JButton("Deposit");
        bn2 = new JButton("Withdraw");
        bn3 = new JButton("Exit");
        panel3.add(bn1);
        panel3.add(bn2);
        panel3.add(bn3);
        frame.add(panel3);
        frame.add(new JPanel());
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
