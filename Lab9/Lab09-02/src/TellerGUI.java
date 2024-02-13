import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class TellerGUI implements ActionListener{
    private Account ac;
    private JFrame frame;
    private JPanel panel1, panel2, panel3;
    private JButton bn1, bn2, bn3;
    private JLabel label1, label3;
    private JTextField jt1, jt2;
    private Double money;
    public TellerGUI(){
        //Create
        ac = new Account(6000, "Petch");
        frame = new JFrame("Teller GUI");
        jt1 = new JTextField();
        jt2 = new JTextField();
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        label1 = new JLabel();
        label3 = new JLabel();
        bn1 = new JButton("Deposit");
        bn2 = new JButton("Withdraw");
        bn3 = new JButton("Exit");
        
        //Set Layout
        frame.setLayout(new GridLayout(4, 0));
        panel1.setLayout(new GridLayout(1, 2));
        frame.add(panel1);
        label1.setFont(new Font("Angsana New", Font.BOLD, 20));
        label1.setText("    Balance");
        panel1.add(label1);
        jt1.setFont(new Font("Angsana New", Font.BOLD, 18));
        jt1.setText(String.valueOf(ac.getBalance()));
        jt1.setEditable(false);
        panel1.add(jt1);
        
        frame.add(panel2);
        panel2.setLayout(new GridLayout(1,2));
        label3.setFont(new Font("Angsana New", Font.BOLD, 20));
        label3.setText("    Amount");
        panel2.add(label3);
        panel2.add(jt2);
        
        panel3.add(bn1);
        panel3.add(bn2);
        panel3.add(bn3);
        frame.add(panel3);
        frame.add(new JPanel());
        
        //ADD Listener
        bn1.addActionListener(this);
        bn2.addActionListener(this);
        bn3.addActionListener(this);
        
        //Set 3 Default
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(bn1)){
            ac.deposit(Double.parseDouble(jt2.getText()));
            jt1.setText(String.valueOf(ac.getBalance()));
        }else if(e.getSource().equals(bn2)){
            ac.withdraw(Double.parseDouble(jt2.getText()));
            jt1.setText(String.valueOf(ac.getBalance()));
        }else if(e.getSource().equals(bn3)){
            System.exit(JFrame.EXIT_ON_CLOSE);
        }
    }
}
