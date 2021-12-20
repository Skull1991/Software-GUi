package view;

import business_logic.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Arithmeticview extends JFrame implements ActionListener {
    JLabel first;
    JLabel second;
    JButton sum;
    JButton close;
    JTextField first_label;
    JTextField second_label;
    public Arithmeticview(){
        setTitle("ARITHMETIC VIEW");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300,200);
        setLayout(null);

        //label
        first=new JLabel("First Number:");
        first.setBounds(20, 20, 100, 20);
        add(first);

        second=new JLabel("Second Number:");
        second.setBounds(20, 50, 100, 20);
        add(second);

        //field
        first_label=new JTextField();
        first_label.setBounds(150, 20, 100, 20);
        add(first_label);

        second_label=new JTextField();
        second_label.setBounds(150, 50, 100, 20);
        add(second_label);

        //button
        sum=new JButton("Sum");
        sum.setBounds(50, 100, 80, 20);
        add(sum);
        sum.addActionListener(this);

        close=new JButton("Close");
        close.setBounds(150, 100, 80, 20);
        add(close);
        close.addActionListener(this);

        



    }
    public static void main(String[]args){
        new Arithmeticview().setVisible(true);
      

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        int a = Integer.parseInt(first_label.getText());
        int b = Integer.parseInt(second_label.getText());

        if (e.getSource().equals(sum)) {
            Arithmetic obb = new Arithmetic(a, b);

            JOptionPane.showMessageDialog(null, "Sum: " + obb.add());
        }

        if (e.getSource().equals(close)) {
            System.exit(0);
        }
        
    }
}
