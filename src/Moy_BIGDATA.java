import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Moy_BIGDATA implements ActionListener {
JFrame f=new JFrame("moyenne");
JPanel p=new JPanel();
JButton b=new JButton("CAL");
JLabel l1=new JLabel("matiere");
    JLabel l2=new JLabel("CC");
    JLabel l3=new JLabel("DS1");
    JLabel l4=new JLabel("DS2");
    JLabel l5=new JLabel("examen");
    JLabel l6=new JLabel("proba");
    JLabel l7=new JLabel("TLA");
    JLabel l8=new JLabel("graphe");
    JLabel l9=new JLabel("UML");
    JLabel l10=new JLabel("JAVA");
    JLabel l11=new JLabel("PL SQL");
    JLabel l12=new JLabel("reseaux");
    JLabel l13=new JLabel("anglais");
    JLabel l14=new JLabel("gestion");
    JLabel l15=new JLabel("sys dis");
    JLabel l16=new JLabel("cloud");
    JLabel l17=new JLabel("sab was here");
    JTextField t1_1=new JTextField(5);
    JTextField t1_2=new JTextField(5);
    JTextField t2_1=new JTextField(5);
    JTextField t2_2=new JTextField(5);
    JTextField t3_1=new JTextField(5);
    JTextField t3_2=new JTextField(5);
    JTextField t4_1=new JTextField(5);
    JTextField t4_2=new JTextField(5);
    JTextField t5_1=new JTextField(5);
    JTextField t5_2=new JTextField(5);
    JTextField t6_1=new JTextField(5);
    JTextField t6_2=new JTextField(5);
    JTextField t7_1=new JTextField(5);
    JTextField t7_2=new JTextField(5);
    JTextField t8_1=new JTextField(5);
    JTextField t8_2=new JTextField(5);
    JTextField t8_3=new JTextField(5);
    JTextField t9_1=new JTextField(5);
    JTextField t9_2=new JTextField(5);
    JTextField t9_3=new JTextField(5);
    JTextField t10_1=new JTextField(5);
    JTextField t10_2=new JTextField(5);
    JTextField t10_3=new JTextField(5);
    JTextField t11_1=new JTextField(5);
    JTextField t11_2=new JTextField(5);
    JTextField t11_3=new JTextField(5);
    double m=0;
    int c=0;

    public Moy_BIGDATA(){
        f.pack();
        f.add(p);
        f.setVisible(true);
        f.setSize(500, 500);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
        p.setLayout(new GridBagLayout());
        GridBagConstraints gbc=new GridBagConstraints();
        gbc.gridx=0;
        gbc.gridy=0;
        p.add(l1,gbc);
        gbc.gridx=1;
        gbc.gridy=0;
        p.add(l2,gbc);
        gbc.gridx=2;
        gbc.gridy=0;
        p.add(l3,gbc);
        gbc.gridx=3;
        gbc.gridy=0;
        p.add(l4,gbc);
        gbc.gridx=4;
        gbc.gridy=0;
        p.add(l5,gbc);
        //
        gbc.gridx=0;
        gbc.gridy=1;
        p.add(l6,gbc);
        gbc.gridx=2;
        gbc.gridy=1;
        p.add(t1_1,gbc);
        gbc.gridx=4;
        gbc.gridy=1;
        p.add(t1_2,gbc);
        //
        gbc.gridx=0;
        gbc.gridy=2;
        p.add(l7,gbc);
        gbc.gridx=2;
        gbc.gridy=2;
        p.add(t2_1,gbc);
        gbc.gridx=4;
        gbc.gridy=2;
        p.add(t2_2,gbc);
        //
        gbc.gridx=0;
        gbc.gridy=3;
        p.add(l8,gbc);
        gbc.gridx=2;
        gbc.gridy=3;
        p.add(t3_1,gbc);
        gbc.gridx=4;
        gbc.gridy=3;
        p.add(t3_2,gbc);
        //
        gbc.gridx=0;
        gbc.gridy=4;
        p.add(l9,gbc);
        gbc.gridx=2;
        gbc.gridy=4;
        p.add(t4_1,gbc);
        gbc.gridx=4;
        gbc.gridy=4;
        p.add(t4_2,gbc);
        //
        gbc.gridx=0;
        gbc.gridy=5;
        p.add(l10,gbc);
        gbc.gridx=2;
        gbc.gridy=5;
        p.add(t5_1,gbc);
        gbc.gridx=4;
        gbc.gridy=5;
        p.add(t5_2,gbc);
        //
        gbc.gridx=0;
        gbc.gridy=6;
        p.add(l11,gbc);
        gbc.gridx=2;
        gbc.gridy=6;
        p.add(t6_1,gbc);
        gbc.gridx=4;
        gbc.gridy=6;
        p.add(t6_2,gbc);
        //
        gbc.gridx=0;
        gbc.gridy=7;
        p.add(l12,gbc);
        gbc.gridx=2;
        gbc.gridy=7;
        p.add(t7_1,gbc);
        gbc.gridx=4;
        gbc.gridy=7;
        p.add(t7_2,gbc);
        //
        gbc.gridx=0;
        gbc.gridy=8;
        p.add(l13,gbc);
        gbc.gridx=1;
        gbc.gridy=8;
        p.add(t8_1,gbc);
        gbc.gridx=2;
        gbc.gridy=8;
        p.add(t8_2,gbc);
        gbc.gridx=3;
        gbc.gridy=8;
        p.add(t8_3,gbc);
        //
        gbc.gridx=0;
        gbc.gridy=9;
        p.add(l14,gbc);
        gbc.gridx=1;
        gbc.gridy=9;
        p.add(t9_1,gbc);
        gbc.gridx=2;
        gbc.gridy=9;
        p.add(t9_2,gbc);
        gbc.gridx=3;
        gbc.gridy=9;
        p.add(t9_3,gbc);
        //
        gbc.gridx=0;
        gbc.gridy=10;
        p.add(l15,gbc);
        gbc.gridx=1;
        gbc.gridy=10;
        p.add(t10_1,gbc);
        gbc.gridx=2;
        gbc.gridy=10;
        p.add(t10_2,gbc);
        gbc.gridx=3;
        gbc.gridy=10;
        p.add(t10_3,gbc);
        //
        gbc.gridx=0;
        gbc.gridy=11;
        p.add(l16,gbc);
        gbc.gridx=1;
        gbc.gridy=11;
        p.add(t11_1,gbc);
        gbc.gridx=2;
        gbc.gridy=11;
        p.add(t11_2,gbc);
        gbc.gridx=3;
        gbc.gridy=11;
        p.add(t11_3,gbc);
        //
        gbc.gridx=2;
        gbc.gridy=13;
        p.add(b,gbc);
        b.addActionListener(this);
        gbc.gridx=4;
        gbc.gridy=14;
        p.add(l17,gbc);
    }
    public void actionPerformed(ActionEvent e) {
       m=0;
       c=0;
        //proba
        double n = ((Double.parseDouble(t1_1.getText())*0.3) + (Double.parseDouble(t1_2.getText())*0.7))*2;
        m=m+n ;
        if(n>10)
            c=c+4;
        //TLA
        double n1 = (Double.parseDouble(t2_1.getText())*0.3) + (Double.parseDouble(t2_2.getText())*0.7);
        m=m+n1 ;
        //graphe
        double n2 = (Double.parseDouble(t3_1.getText())*0.3) + (Double.parseDouble(t3_2.getText())*0.7);
        m=m+n2 ;
        if((n1+n2)/2>=10)
            c=c+4;
        //UML
        double n3 = ((Double.parseDouble(t4_1.getText())*0.3) + (Double.parseDouble(t4_2.getText())*0.7))*1.5;
        m=m+n3 ;
        //JAVA
        double n4 = ((Double.parseDouble(t5_1.getText())*0.3) + (Double.parseDouble(t5_2.getText())*0.7))*2;
        m=m+n4 ;
        if(((n3+n4)/3.5)>=10)
            c=c+7;
        //PL SQL
        double n5 = ((Double.parseDouble(t6_1.getText())*0.3) + (Double.parseDouble(t6_2.getText())*0.7))*1.5;
        m=m+n5 ;
        //reseau
        double n6 = (Double.parseDouble(t7_1.getText())*0.3) + (Double.parseDouble(t7_2.getText())*0.7);
        m=m+n6 ;
        if(((n5+n6)/2.5)>=10)
            c=c+5;
        //anglais
        double n7 = (Double.parseDouble(t8_1.getText())*0.2) + (Double.parseDouble(t8_2.getText())*0.4) +(Double.parseDouble(t8_3.getText())*0.4);
        m=m+n7 ;
        //gestion
        double n8 = (Double.parseDouble(t9_1.getText())*0.2) + (Double.parseDouble(t9_2.getText())*0.4) +(Double.parseDouble(t9_3.getText())*0.4);
        m=m+n8 ;
        if(((n7+n8)/2)>=10)
            c=c+4;
        //sys dis
        double n9 = ((Double.parseDouble(t10_1.getText())*0.2) + (Double.parseDouble(t10_2.getText())*0.4) +(Double.parseDouble(t10_3.getText())*0.4))*1.5;
        m=m+n9 ;
        //cloud
        double n10 = ((Double.parseDouble(t11_1.getText())*0.2) + (Double.parseDouble(t11_2.getText())*0.4) +(Double.parseDouble(t11_3.getText())*0.4))*1.5;
        m=m+n10 ;
        if(((n9 + n10) / 3) >= 10)
            c=c+6;
        JOptionPane.showMessageDialog(f,"moyennek "+m/15+" wl credit "+c);
    }

    public static void main(String[] args) {

        new Moy_BIGDATA();
    }

}
