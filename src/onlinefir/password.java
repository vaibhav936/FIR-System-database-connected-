
package onlinefir;

import java.awt.Color;
import java.awt.event.*;
import java.awt.event.*;
import javax.swing.*;
//import com.sun.org.apache.xml.internal.resolver.helpers.*;
import java.awt.Font;
import java.sql.*;
//import com.sun.org.apache.xml.internal.resolver.helpers.*;
//import java.util.logging.Level;
//import java.util.logging.Logger;
public class password extends JFrame implements ActionListener
        
{
    dbconnection db=new dbconnection();
    JLabel l1,l2,l3,l4,l5,l6,l7,l8;
    ImageIcon img,img2,img3,img4,img5,img6,img7;
    JTextField t1,t2,t3;
    JPasswordField p1;
    JButton b1,b2,b3,b4,b5,b6,b7;
    Font f1;
    String user;
    String mobile;
    Statement us;
     ResultSet ps;
    password()
    {
        setLayout(null);
        setTitle("Forgot Password");
        setSize(500, 500);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
       // getContentPane().setBackground(Color.LIGHT_GRAY);
        
        l2=new JLabel("User Name");
        l2.setBounds(450, 400, 150, 30);
        f1=new Font("Lucida Fax", Font.CENTER_BASELINE, 18);
         l2.setForeground(Color.white);
        l2.setFont(f1);

        add(l2);
        l3=new JLabel("Mobile Number");
        l3.setBounds(450, 450, 150, 30);
        f1=new Font("Lucida Fax", Font.CENTER_BASELINE, 18);
         l3.setForeground(Color.white);
        l3.setFont(f1);

        add(l3);
         l4=new JLabel();
        l4.setBounds(630, 550, 250, 30);
        f1=new Font("Lucida Fax", Font.CENTER_BASELINE, 18);
         l4.setForeground(Color.white);
        l4.setFont(f1);

          l5=new JLabel("Contact Us");
        l5.setBounds(1000, 650, 250, 30);
        f1=new Font("Lucida Fax", Font.CENTER_BASELINE, 15);
         l5.setForeground(Color.RED);
        l5.setFont(f1);
        add(l5);
        img6=new ImageIcon("src/onlinefir/f.png");
         b6=new JButton(img6);
        b6.setBounds(620,550, 153, 27);
        f1=new Font("Lucida Fax", Font.CENTER_BASELINE, 15);
         b6.setForeground(Color.RED);
        b6.setFont(f1);
        b6.addActionListener(this);
        add(b6);
        img4=new ImageIcon("src/onlinefir/what.png");
         
       
        b3=new JButton(img4);
         b3.setBounds(1100, 650, 70, 39);
         b3.addActionListener(this);
        add(b3);
        img7=new ImageIcon("src/onlinefir/bac.png");
         b7=new JButton(img7);
         b7.setBounds(620,600, 153, 27);
         b7.addActionListener(this);
        add(b7);


                    
       img5=new ImageIcon("src/onlinefir/fb.png");

        b5=new JButton(img5);
         b5.setBounds(1200, 650, 70, 36);
         b5.addActionListener(this);
         add(b5);
         
        

        
        
        
        add(l4);
        t1=new JTextField();
        t1.setBounds(600, 400, 200, 30);
        add(t1);
         t2=new JTextField();
        t2.setBounds(600, 450, 200, 30);
        add(t2);
         t3=new JTextField();
        t3.setBounds(600, 500, 200, 30);
        add(t3);
          img3=new ImageIcon("src/onlinefir/loginb.png");
        b1=new JButton(img3);
        b1.setBounds(600, 500, 90, 30);
        b1.addActionListener(this);
        add(b1);
        img2=new ImageIcon("src/onlinefir/sign.png");
        b2=new JButton(img2);
        b2.setBounds(710, 500, 90, 30);
        add(b2);
        b2.addActionListener(this);
          img=new ImageIcon("src/onlinefir/police.png");
        l1=new JLabel(img);
        add(l1);
        l1.setBounds(560, 70, 241, 300);
         img2=new ImageIcon("src/onlinefir/lo.jpg");
        l5=new JLabel(img2);
         l5.setBounds(0, -150, 1920, 1080);
        add(l5);
          
        setVisible(true);
    }

   
    public static void main(String[] args) {
        new password();
       
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
         if(e.getSource()==b5)
        {
               JOptionPane.showMessageDialog(null,"vaibhavpandey936@gmail.com"); 
        }
         if(e.getSource()==b3)
        {
               JOptionPane.showMessageDialog(null,"+919068064102"); 
        }
        if(e.getSource()==b2)
        {
            dispose();
           new signup();
        }
         if(e.getSource()==b7)
        {
            dispose();
           new login();
        }
        if(e.getSource()==b6)
        {
         String a1=t1.getText();
         String a2=t2.getText();
         String sql="select * from register where user_name ='"+a1+"'AND mobile='"+a2+"'";
            try {
                   us=db.con.prepareStatement(sql);
            ps=us.executeQuery(sql);
            if(ps.next())
            {
                 JOptionPane.showMessageDialog(null,"Retrieved Successfully");
                t3.setText(ps.getString(6));
                
            }
            else if ((a1.endsWith(""))&&(a2.endsWith("")))
            {
                JOptionPane.showMessageDialog(null,"Incorrect value");
            }
           
            } catch (Exception a) {
            }
            
        }
    
           
    }
    }
    

