
package onlinefir;

import java.awt.Color;
import java.awt.event.*;
import java.awt.event.*;
import javax.swing.*;
//import com.sun.org.apache.xml.internal.resolver.helpers.*;
import java.awt.Font;
import java.sql.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//import java.util.logging.Level;
//import java.util.logging.Logger;
public class login extends JFrame implements ActionListener
        
{
    dbconnection db=new dbconnection();
    JLabel l1,l2,l3,l4,l5,l6,l7,l8;
    ImageIcon img,img2,img3,img4,img5,img6;
    JTextField t1,t2;
    JPasswordField p1;
    JButton b1,b2,b3,b4,b5,b6;
    Font f1,f2;
    String user;
    String pass;
    Statement us;
    Pattern pat,pat1,pat2,pat3;
     Matcher match;
    private ResultSet ps;
    login()
    {
        setLayout(null);
        setTitle("Login Page");
        setSize(500, 500);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
       // getContentPane().setBackground(Color.LIGHT_GRAY);
         f2=new Font("Arial",Font.BOLD,20);
        l2=new JLabel("User Name");
        l2.setBounds(450, 400, 150, 30);
        f1=new Font("Lucida Fax", Font.CENTER_BASELINE, 18);
         l2.setForeground(Color.white);
        l2.setFont(f1);

        add(l2);
        l3=new JLabel("Password");
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
         l5.setForeground(Color.WHITE);
        l5.setFont(f1);
        add(l5);
        img4=new ImageIcon("src/onlinefir/what.png");
         
       
        b3=new JButton(img4);
         b3.setBounds(1100, 650, 70, 39);
         b3.addActionListener(this);
        add(b3);

                    
       img5=new ImageIcon("src/onlinefir/fb.png");

        b5=new JButton(img5);
         b5.setBounds(1200, 650, 70, 36);
         b5.addActionListener(this);
         add(b5);
          img6=new ImageIcon("src/onlinefir/f.png");
           b6=new JButton(img6);
        b6.setBounds(620,550, 150, 27);
        f1=new Font("Lucida Fax", Font.CENTER_BASELINE, 15);
         b6.setForeground(Color.RED);
        b6.setFont(f1);
        b6.addActionListener(this);
        add(b6);
        

        
        
        
        add(l4);
        t1=new JTextField();
        t1.setBounds(600, 400, 200, 30);
       t1.setFont(f2);
        add(t1);
         p1=new JPasswordField();
        p1.setBounds(600, 450, 200, 30);
        p1.setForeground(Color.red);
        add(p1);
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
        new login();
       
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
         if(e.getSource()==b6)
        {
            dispose();
           new password();
        }
        if(e.getSource()==b1)
        {
   
            user=t1.getText();
            pass=p1.getText();
            System.out.println(user+" "+pass);
              try {
                us=db.con.createStatement();
            ps=us.executeQuery("Select * from register where user_name='"+user+"'and password='"+pass+"'");
            if(ps.next())
            {
                JOptionPane.showMessageDialog(null,"Login Successfully");
                dispose();
                new home();
            }
            else if((user.endsWith(""))&&(pass.equals("")))
            {
                JOptionPane.showMessageDialog(null,"Please Enter Values");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"User Not Register");
            }
            
            } catch (Exception ep) {
                  System.out.println(ep);
            }
                  
              }
           
        }
    
           
        
    }
    

