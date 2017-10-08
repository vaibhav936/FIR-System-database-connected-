
package onlinefir;

import java.awt.Color;
import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.sql.*;
//import com.sun.org.apache.xml.internal.resolver.helpers.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class firpage extends JFrame  implements ActionListener,FocusListener
{
         PreparedStatement ps;
    dbconnection db=new dbconnection();
        JLabel l0,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17;
        JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16;
        JTextArea a,b;
        ImageIcon img,img2,img3,img4;
        JButton b1,b2,b3,b4;
        JRadioButton r1,r2,r3,r4,r5,r6;
        ButtonGroup bg,bg1,bg2;
        JComboBox c1,c2,c3;
        Font f1,f2,f3,f4,f5,f6,f7;
        String gen,time,was,t;
        Pattern pat,pat1,pat2,pat3;
        JScrollPane j;
     Matcher match;
        //String s;
    firpage()
    {
         setLayout(null);
        setSize(500, 500);
        setTitle("HOME Page");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        //getContentPane().setBackground(Color.yellow);
       l1=new JLabel("FIR(First Information Report)Form");
        Font font1=new Font("Myriad Pro", 1000, 30);
        l1.setFont(font1);
       l1.setForeground(Color.red);
        l1.setBounds(510, 20, 1000, 30);
        add(l1);
         f2=new Font("Arial",Font.BOLD,20);
          
        l2=new JLabel("Name of Applicator");
        f1=new Font("Niagara Solid",Font.PLAIN,25);
          l2.setForeground(Color.white);
        l2.setFont(f1);
        l2.setBounds(200, 50, 250, 200);
        add(l2);
        t1=new JTextField();
        t1.setBounds(430, 140, 200, 30);
        t1.setFont(f2);
        add(t1);
        
        l3=new JLabel("Gender");
        f1=new Font("Niagara Solid",Font.PLAIN,25);
        l3.setFont(f1);
        l3.setForeground(Color.white);
        l3.setBounds(250, 100, 100, 200);
        add(l3);
        r1=new JRadioButton("Male");
        r1.setBounds(430, 190, 60, 20);
        r1.setForeground(Color.white);
         r1.addFocusListener(this);
        add(r1);
        r2=new JRadioButton("female");
        r2.setBounds(500, 190, 80, 20);
        r2.setForeground(Color.white); 
        r2.addFocusListener(this);
        add(r2);
        bg=new ButtonGroup();
         bg.add(r1);
         bg.add(r2);
         r1.setOpaque(false);
         r2.setOpaque(false);
         
        l4=new JLabel("Date Of Birth");
        f1=new Font("Niagara Solid",Font.PLAIN,25);
        l4.setFont(f1);
        l4.setForeground(Color.white);
        l4.setBounds(250, 150, 180, 200);
        add(l4);
          t2=new JTextField("DD");
          t2.setBounds(430, 240, 30, 30);
            t2.setFont(f2);
          add(t2);
          t3=new JTextField("MM");
          t3.setBounds(463, 240, 40, 30);
            t3.setFont(f2);
          add(t3);
          t4=new JTextField("YYYY");
          t4.setBounds(510, 240, 70, 30);
           t4.setFont(f2);
          add(t4);
        
        l5=new JLabel("Applicator Was");
        f1=new Font("Niagara Solid",Font.PLAIN,25);
        l5.setFont(f1);
        l5.setForeground(Color.white);
        l5.setBounds(250, 200, 180, 200);
        add(l5);
        r3=new JRadioButton("Victim");
        r3.setBounds(430, 290, 70, 20);
        r3.setForeground(Color.white); 
        r3.addFocusListener(this);
        add(r3);
        r4=new JRadioButton("Witness");
        r4.setBounds(500, 290, 80, 20);
        r4.setForeground(Color.white); 
        r4.addFocusListener(this);
        add(r4);
        bg1=new ButtonGroup();
         bg1.add(r3);
         bg1.add(r4);
         r3.setOpaque(false);
         r4.setOpaque(false);
        
       
        l6=new JLabel("Phone Number");
        f1=new Font("Niagara Solid",Font.PLAIN,25);
        l6.setFont(f1);
        l6.setForeground(Color.white);
        l6.setBounds(750, 50, 200, 200);
        add(l6);
         t5=new JTextField();
        t5.setBounds(950, 140, 200, 30);
          t5.setFont(f2);
        add(t5);
        l7=new JLabel("Date Of Crime");
        f1=new Font("Niagara Solid",Font.PLAIN,25);
        l7.setFont(f1);
        l7.setForeground(Color.white);
        l7.setBounds(750, 100, 200, 200);
        add(l7);
        t6=new JTextField("DD");
          t6.setBounds(950,190, 30, 30);
            t6.setFont(f2);
          add(t6);
          t7=new JTextField("MM");
          t7.setBounds(985, 190, 40, 30);
            t7.setFont(f2);
          add(t7);
          t8=new JTextField("YYYY");
          t8.setBounds(1030, 190, 70, 30);
            t8.setFont(f2);
          add(t8);
        l8=new JLabel("Time Of Crime");
        f1=new Font("Niagara Solid",Font.PLAIN,25);
        l8.setFont(f1);
        l8.setForeground(Color.white);
        l8.setBounds(750, 150, 200, 200);
        add(l8);
        t9=new JTextField("HH");
          t9.setBounds(950, 240, 25, 30);
            
          add(t9);
          t10=new JTextField("MM");
          t10.setBounds(980, 240, 25, 30);
            
          add(t10);
          r5=new JRadioButton("AM");
          r5.setBounds(1005, 240, 50, 25);
          r5.setForeground(Color.white); 
          r5.addFocusListener(this);
          add(r5);
          r6=new JRadioButton("PM");
          r6.setBounds(1060, 240, 50, 25);
          r6.setForeground(Color.white); 
          r6.addFocusListener(this);
          add(r6);
          bg2=new ButtonGroup();
         bg2.add(r5);
         bg2.add(r6);
         r5.setOpaque(false);
         r6.setOpaque(false);
        l9=new JLabel("Crime Type");
        f1=new Font("Niagara Solid",Font.PLAIN,25);
        l9.setFont(f1);
        l9.setForeground(Color.white);
        l9.setBounds(750, 200, 200, 200);
        add(l9);
        String s[]={"-select-","Murder","Misbheave","Blackmail","Bribery","Burglary","Embezzlement","Extortionn","Fraud"};
        c1=new JComboBox(s);
        c1.setBounds(950, 290, 150, 30);
        add(c1);
         
          l11=new JLabel("");
        l11.setBounds(800, 250, 100, 200);
        add(l11);
          l12=new JLabel("Short Description & Detail Insert Only Sensitive and Informatively Information’s");
        f1=new Font("arial",Font.PLAIN,16);
        l12.setFont(f1);
          l12.setBounds(300, 300, 600, 300);
        l12.setForeground(Color.white);
          add(l12);
        
        l13=new JLabel("And Insert Name of Criminal if Any Or Suspect If Any In Short :- > ");
        f1=new Font("arial",Font.PLAIN,16);
        l13.setFont(f1);
        l13.setBounds(300, 320, 600, 300);
        l13.setForeground(Color.white);
        add(l13);
        
        
        
        a=new JTextArea();
        a.setBounds(300, 480, 600,200);
        a.setBackground(Color.white);
          a.setFont(f2);
        add(a);
          j=new JScrollPane(a);
        j.setBounds(300, 480, 600,200);
        add(j);
        img2=new ImageIcon("src/onlinefir/report.jpg");
        b1=new JButton(img2);
        b1.setBounds(920, 640, 110, 40);
        b1.addActionListener(this);
        add(b1);
         img4=new ImageIcon("src/onlinefir/reset.png");
        b2=new JButton(img4);
        b2.setBounds(1040, 640, 100, 40);
        b2.addActionListener(this);
        add(b2);
        img3=new ImageIcon("src/onlinefir/home.png");
        b3=new JButton(img3);
        b3.setBounds(1170, 640, 100, 40);
        b3.addActionListener(this);
        add(b3);
        
        img=new ImageIcon("src/onlinefir/log3.jpg");
        l0=new JLabel(img);
        l0.setBounds(0, -200, 1920, 1080);
        add(l0);
        setVisible(true);
        
    }
    public static void main(String[] args) {
        
          new  firpage();
            
        
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource()==b3)
        {
            dispose();
           new home();
        }
        if(e.getSource()==b2)
        {
            dispose();
           new firpage();
        }
        if(e.getSource()==b1)
        {
           String s=t1.getText();
            System.out.println(s);
            System.out.println(gen);
           
            String s1=t2.getText();
            String s2=t3.getText();
            String s3=t4.getText();
            String dob=s1+"-"+s2+"-"+s3;
            
            System.out.println(was);
           
            String s4=t5.getText();
            System.out.println(s4);
            
            String s5=t6.getText();
            String s6=t7.getText();
            String s7=t8.getText();
            String doc =s5+"-"+s6+"-"+s7;
            
             String s8=t9.getText();
            String s9=t10.getText();
            String toc=s8+"-"+s9+"-"+time;
            
            String s10=c1.getSelectedItem().toString();
            System.out.println(s10);
            String s11=a.getText();
            System.out.println(s11);
                      String reg="^[a-zA-Z]+$";
    pat=pat.compile(reg);
    String regex="^(.+)@(.+)$";
    pat1=pat1.compile(regex);  
     String regex1="^[0-9]";
    pat2=pat2.compile(regex1);
    String rege="^[0-50]";
    pat3=pat3.compile(rege);
   
          if(s.isEmpty()==true||dob.isEmpty()==true||doc.isEmpty()==true||toc.isEmpty()==true||s4.isEmpty()==true||s10.isEmpty()||s11.isEmpty()==true)
    {
    JOptionPane.showMessageDialog(null,"All Fields are Mandatory");
    }      
       else if (pat.matcher(s).matches()==false)
    {
        JOptionPane.showMessageDialog(null,"Enter valid Name");
    }    
        else if(bg.getSelection()==null)
        {
         JOptionPane.showMessageDialog(null,"Select your Gender");
        }
         else if(bg1.getSelection()==null)
        {
         JOptionPane.showMessageDialog(null,"Applicator Was ");
        }
          else if(bg2.getSelection()==null)
        {
         JOptionPane.showMessageDialog(null,"It's Day Or Night");
        }
     else  if(s4.length()<10||s4.length()>10)
     {
          JOptionPane.showMessageDialog(null,"Fill 10 digit Number");
     }
      else  if(s11.length()<50||s11.length()>300)
     {
          JOptionPane.showMessageDialog(null,"Please Enter Some More Description ");
     }
      else if(pat.matcher(s10).matches()==false)
      {
          JOptionPane.showMessageDialog(null,"Select Crime Type");
      }

     
          else{
          try {
                ps=db.con.prepareStatement("insert into report (name,gender,d_o_b,applicator_was,phone_num,d_o_c,t_o_c,crime_type,text)values('"+s+"','"+gen+"','"+dob+"','"+was+"','"+s4+"','"+doc+"','"+toc+"','"+s10+"','"+s11+"')");
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null,"Sucessfull");
                dispose();
     new home();
            } catch (Exception ex) 
           {
               System.out.println("error"+ex);
               JOptionPane.showMessageDialog(null, "registere was not successfully.");
            }
        }
        }
        
    }

    @Override
    public void focusGained(FocusEvent e) 
    {
          if(e.getSource()==r1)
            gen="Male";
        if(e.getSource()==r2)
            gen="Female";
         if(e.getSource()==r3)
            was="Victim";
        if(e.getSource()==r4)
            was="Witness";
         if(e.getSource()==r5)
            time="AM";
        if(e.getSource()==r6)
            time="PM";
       
    }

    @Override
    public void focusLost(FocusEvent e) {
       
    }
            
    
    
}
