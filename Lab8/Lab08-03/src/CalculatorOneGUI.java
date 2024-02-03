import java.awt.*;
import javax.swing.*;
public class CalculatorOneGUI {
    private JFrame jr;
    private JPanel jp;
    private JButton bt1, bt2, bt3, bt4;
    private JTextField jt;
    public CalculatorOneGUI(){
        jr = new JFrame("CalculatorOneGUI");
        jp = new JPanel();
        bt1 = new JButton("บวก");
        bt2 = new JButton("ลบ");
        bt3 = new JButton("คูณ");
        bt4 = new JButton("หาร");
        bt1.setFont(new Font("Angsana New", Font.BOLD, 18));
        bt2.setFont(new Font("Angsana New", Font.BOLD, 18));
        bt3.setFont(new Font("Angsana New", Font.BOLD, 18));
        bt4.setFont(new Font("Angsana New", Font.BOLD, 18));
        jr.setLayout(new GridLayout(4, 0));
        jp.add(bt1);
        jp.add(bt2);
        jp.add(bt3);
        jp.add(bt4);
        jr.add(new JTextField());
        jr.add(new JTextField());
        jr.add(jp);
        jr.add(new JTextField());
        jr.pack();
        jr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jr.setVisible(true);
    }
}
