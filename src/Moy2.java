import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Moy2 implements ActionListener {
    JFrame f=new JFrame("moyenne");
    JPanel p=new JPanel();
    JButton b=new JButton("CAL");
    JLabel l1=new JLabel("matiere");
    JLabel l2=new JLabel("cc");
    JLabel l3=new JLabel("DS");
    JLabel l4=new JLabel("examen");
    JLabel l5=new JLabel("compta");
    JLabel l6=new JLabel("pe");
    JLabel l7=new JLabel("pg");
    JLabel l8=new JLabel("math");
    JLabel l9=new JLabel("stat");
    JLabel l10=new JLabel("fr");
    JLabel l11=new JLabel("eng");
    JLabel l12=new JLabel("c2i");
    JTextField t1_1=new JTextField(5);
    JTextField t1_2=new JTextField(5);
    JTextField t1_3=new JTextField(5);
    JTextField t2_1=new JTextField(5);
    JTextField t2_2=new JTextField(5);
    JTextField t2_3=new JTextField(5);
    JTextField t3_1=new JTextField(5);
    JTextField t3_2=new JTextField(5);
    JTextField t3_3=new JTextField(5);
    JTextField t4_1=new JTextField(5);
    JTextField t4_2=new JTextField(5);
    JTextField t4_3=new JTextField(5);
    JTextField t5_1=new JTextField(5);
    JTextField t5_2=new JTextField(5);
    JTextField t5_3=new JTextField(5);
    JTextField t6_1=new JTextField(5);
    JTextField t6_2=new JTextField(5);
    JTextField t6_3=new JTextField(5);
    JTextField t7_1=new JTextField(5);
    JTextField t7_2=new JTextField(5);
    JTextField t7_3=new JTextField(5);
    JTextField t8_1=new JTextField(5);
    JTextField t8_2=new JTextField(5);
    JTextField t8_3=new JTextField(5);
    double m=0;

    public Moy2(){
        f.pack();
        f.add(p);
        f.setVisible(true);
        f.setSize(500, 500);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
        p.setLayout(new GridLayout(0,4));
        p.add(l1);
        p.add(l2);
        p.add(l3);
        p.add(l4);
        //
        p.add(l5);
        p.add(t1_1);
        p.add(t1_2);
        p.add(t1_3);
        //
        p.add(l6);
        p.add(t2_1);
        p.add(t2_2);
        p.add(t2_3);
        //
        p.add(l7);
        p.add(t3_1);
        p.add(t3_2);
        p.add(t3_3);
        //
        p.add(l8);
        p.add(t4_1);
        p.add(t4_2);
        p.add(t4_3);
        //
        p.add(l9);
        p.add(t5_1);
        p.add(t5_2);
        p.add(t5_3);
        //
        p.add(l10);
        p.add(t6_1);
        p.add(t6_2);
        p.add(t6_3);
        //
        p.add(l11);
        p.add(t7_1);
        p.add(t7_2);
        p.add(t7_3);
        //
        p.add(l12);
        p.add(t8_1);
        p.add(t8_2);
        p.add(t8_3);
        p.add(b);
        b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
        m=0;
        //compta
        double n = ((Double.parseDouble(t1_1.getText())*0.1)+(Double.parseDouble(t1_2.getText())*0.2) + (Double.parseDouble(t1_3.getText())*0.7))*2.5;
        m=m+n ;

        //pe
        double n1 = ((Double.parseDouble(t2_1.getText())*0.1) + (Double.parseDouble(t2_2.getText())*0.2)+(Double.parseDouble(t2_3.getText())*0.7))*2.5;
        m=m+n1 ;
        //pg
        double n2 = ((Double.parseDouble(t3_1.getText())*0.1) + (Double.parseDouble(t3_2.getText())*0.2)+(Double.parseDouble(t3_3.getText())*0.7))*2.5;
        m=m+n2 ;

        //math
        double n3 = ((Double.parseDouble(t4_1.getText())*0.1) + (Double.parseDouble(t4_2.getText())*0.2)+(Double.parseDouble(t4_3.getText())*0.7))*2.5;
        m=m+n3 ;
        //stat
        double n4 = ((Double.parseDouble(t5_1.getText())*0.1) + (Double.parseDouble(t5_2.getText())*0.2)+(Double.parseDouble(t5_3.getText())*0.7))*2.5;
        m=m+n4 ;

        //fr
        double n5 = ((Double.parseDouble(t6_1.getText())*0.1) + (Double.parseDouble(t6_2.getText())*0.2)+(Double.parseDouble(t6_3.getText())*0.7))*0.75;
        m=m+n5 ;
        //eng
        double n6 = ((Double.parseDouble(t7_1.getText())*0.1) + (Double.parseDouble(t7_2.getText())*0.2)+(Double.parseDouble(t7_3.getText())*0.7))*0.75;
        m=m+n6 ;

        //c2i
        double n7 = (Double.parseDouble(t8_1.getText())*0.1) + (Double.parseDouble(t8_2.getText())*0.2)+(Double.parseDouble(t8_3.getText())*0.7);
        m=m+n7 ;
        JOptionPane.showMessageDialog(f,"moyennek "+m/15);
    }
    public static void main(String[] args) {
        new Moy2();
    }

}

