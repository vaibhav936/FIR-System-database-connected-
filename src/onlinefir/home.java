
package onlinefir;

import java.awt.Color;
import java.awt.event.*;
import java.awt.event.*;
import javax.swing.*;
//import com.sun.org.apache.xml.internal.resolver.helpers.*;
import java.awt.Font;
import java.sql.*;
//import java.util.logging.Level;
//import java.util.logging.Logger;
public class home extends JFrame implements ActionListener
        
{
    dbconnection db=new dbconnection();
    JLabel l1,l2,l3,l4,l5;
    ImageIcon img,img2,img3,img4,img5;
    JTextField t1,t2;
    JPasswordField p1;
    JButton b1,b2,b3,b4;
    String user;
    String pass;
    Statement us;
    Font f1;
    private ResultSet ps;
    home()
    {
        setLayout(null);
        setSize(500, 500);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        l1=new JLabel("Welcome To Online FIR");
        l1.setBounds(500, 50, 400, 100);
         f1=new Font("Modern No. 20", Font.CENTER_BASELINE, 30);
         l1.setForeground(Color.white);
        l1.setFont(f1);
        add(l1);
        
        l2=new JLabel("Home Page");
        l2.setBounds(630, 430,200, 30);
          f1=new Font("Modern No. 20", Font.CENTER_BASELINE, 20);
           l2.setForeground(Color.white);
          l2.setFont(f1);
        add(l2);
        
        img3=new ImageIcon("src/onlinefir/serc.png");
        b1=new JButton(img3);
        b1.setBounds(610, 580, 160, 35 );
        
        b1.addActionListener(this);
        add(b1);
        /*b2=new JButton("By City");
        b2.setBounds(600, 550, 200, 30);
        add(b2);
        b2.addActionListener(this);
        */
        img4=new ImageIcon("src/onlinefir/n.png");
        b3=new JButton(img4);
        b3.setBounds(610, 510, 160, 35);
        b3.addActionListener(this);
        add(b3);
        
        img5=new ImageIcon("src/onlinefir/ll.png");  
        b4=new JButton(img5);
        b4.setBounds(615, 640, 150, 50);
        add(b4);
        b4.addActionListener(this);
          img=new ImageIcon("src/onlinefir/police.png");
        
       l3=new JLabel(img);
       l3.setBounds(560, 130, 241, 300);
       add(l3);
        img2=new ImageIcon("src/onlinefir/log3.jpg");
        
       l4=new JLabel(img2);
       l4.setBounds(0, -150, 1920, 1080);
       add(l4);
                 
        setVisible(true);
    }

   
    public static void main(String[] args) {
        new home();
       
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b2)
        {
            dispose();
           new signup();
        }
        if(e.getSource()==b1)
        {
         dispose();
         new search();
                  
              }
         if(e.getSource()==b3)
        {
            dispose();
           new firpage();
        }
        if(e.getSource()==b4)
        {
         dispose();
         new login();
                  
              }
        }
        
        
    }
    

