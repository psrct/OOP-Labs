import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CalculatorTwoGUI implements ActionListener{
    private JFrame jf;
    private JPanel panel;
    private JTextField jt;
    private JButton bn0, bn1, bn2, bn3, bn4, bn5, bn6, bn7, bn8, bn9, bnp, bnm, bnx, bnd, bnc, bne;
    private String tout, sym;
    private int number;
    public CalculatorTwoGUI(){
        //create JButton
        jf = new JFrame("CalculatorTwoGUI");
        panel = new JPanel();
        jt = new JTextField();
        tout = "";
        sym = "";
        number = 0;
        bn0 = new JButton("0");
        bn1 = new JButton("1");
        bn2 = new JButton("2");
        bn3 = new JButton("3");
        bn4 = new JButton("4");
        bn5 = new JButton("5");
        bn6 = new JButton("6");
        bn7 = new JButton("7");
        bn8 = new JButton("8");
        bn9 = new JButton("9");
        bnp = new JButton("+");
        bnm = new JButton("-");
        bnx = new JButton("x");
        bnd = new JButton("/");
        bnc = new JButton("c");
        bne = new JButton("=");

        //Set Layout
        jt.setText(tout);
        jf.add(jt, BorderLayout.NORTH);
        jf.add(panel);
        panel.setLayout(new GridLayout(4, 4));
        panel.add(bn7);
        panel.add(bn8);
        panel.add(bn9);
        panel.add(bnp);
        panel.add(bn4);
        panel.add(bn5);
        panel.add(bn6);
        panel.add(bnm);
        panel.add(bn1);
        panel.add(bn2);
        panel.add(bn3);
        panel.add(bnx);
        panel.add(bn0);
        panel.add(bnc);
        panel.add(bne);
        panel.add(bnd);

        //Add Listener
        bn0.addActionListener(this);
        bn1.addActionListener(this);
        bn2.addActionListener(this);
        bn3.addActionListener(this);
        bn4.addActionListener(this);
        bn5.addActionListener(this);
        bn6.addActionListener(this);
        bn7.addActionListener(this);
        bn8.addActionListener(this);
        bn9.addActionListener(this);
        bnp.addActionListener(this);
        bnm.addActionListener(this);
        bnx.addActionListener(this);
        bnd.addActionListener(this);
        bnc.addActionListener(this);
        bne.addActionListener(this);
        
        //set 3 Default
        jf.setSize(300, 300);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource().equals(bn0)){
            tout = tout + "0";
        }else if(ae.getSource().equals(bn1)){
            tout = tout + "1";
        }else if(ae.getSource().equals(bn2)){
            tout = tout + "2";
        }else if(ae.getSource().equals(bn3)){
            tout = tout + "3";
        }else if(ae.getSource().equals(bn4)){
            tout = tout + "4";
        }else if(ae.getSource().equals(bn5)){
            tout = tout + "5";
        }else if(ae.getSource().equals(bn6)){
            tout = tout + "6";
        }else if(ae.getSource().equals(bn7)){
            tout = tout + "7";
        }else if(ae.getSource().equals(bn8)){
            tout = tout + "8";
        }else if(ae.getSource().equals(bn9)){
            tout = tout + "9";
        }else if(ae.getSource().equals(bnp)){
            int num1 = Integer.parseInt(jt.getText());
            tout = "";
            if(sym != "+"){
                number = num1;
            }
            else{
                number += num1;
            }
            sym = "+";
        }else if(ae.getSource().equals(bnm)){
            int num1 = Integer.parseInt(jt.getText());
            tout = "";
            if(sym != "-"){
                number = num1;
            }
            else{
                number -= num1;
            }
            sym = "-";
        }else if(ae.getSource().equals(bnx)){
            int num1 = Integer.parseInt(jt.getText());
            tout = "";
            if(sym != "x"){
                number = num1;
            }
            else{
                number *= num1;
            }
            sym = "x";
        }else if(ae.getSource().equals(bnd)){
            int num1 = Integer.parseInt(jt.getText());
            tout = "";
            if(sym != "/"){
                number = num1;
            }
            else{
                number /= num1;
            }
            sym = "/";
        }else if(ae.getSource().equals(bnc)){
            tout = "";
            number = 0;
        }else if(ae.getSource().equals(bne)){
            if (sym == "+"){
                sym = "";
                number += Integer.parseInt(tout);
                tout = String.valueOf(number);
            }else if(sym == "-"){
                sym = "";
                number -= Integer.parseInt(tout);
                tout = String.valueOf(number);
            }else if(sym == "x"){
                sym = "";
                number *= Integer.parseInt(tout);
                tout = String.valueOf(number);
            }else if(sym == "/"){
                sym = "";
                number /= Integer.parseInt(tout);
                tout = String.valueOf(number);
            }
        }
        jt.setText(tout);
    }
    
    
    
}
