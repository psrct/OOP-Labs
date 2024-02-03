import java.awt.*;
import javax.swing.*;
public class CalculatorTwoGUI {
    private JFrame jf;
    private JPanel panel;
    public CalculatorTwoGUI(){
        jf = new JFrame("CalculatorTwoGUI");
        panel = new JPanel();
        jf.add(new JTextField(), BorderLayout.NORTH);
        panel.setSize(300, 300);
        jf.add(panel);
        panel.setLayout(new GridLayout(4, 4));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));
        panel.add(new JButton("+"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("-"));
        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("x"));
        panel.add(new JButton("0"));
        panel.add(new JButton("c"));
        panel.add(new JButton("="));
        panel.add(new JButton("/"));
        jf.setSize(300, 300);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }
    
    
    
}
