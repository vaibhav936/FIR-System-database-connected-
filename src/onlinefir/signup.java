
package onlinefir;

//import com.sun.xml.internal.messaging.saaj.soap.JpegDataContentHandler;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.sql.*;
import javax.swing.JTextArea;
import java.awt.Font;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class signup extends JFrame implements ActionListener,FocusListener
        
{
    PreparedStatement ps;
    dbconnection db=new dbconnection();
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17;
    ImageIcon img,img1,img2;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16;
    JPasswordField p1,p2;
    JButton b1,b2;
    ButtonGroup bg;
    String gen;
    JComboBox c1,c2,c3;
    JRadioButton r1,r2;
    Font f1,f2,f3;
      Pattern pat,pat1,pat2,pat3,date,user;
     Matcher match;
    signup()
    {
        setLayout(null);
        setSize(500, 500);
        setTitle("Sign UP");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        //getContentPane().setBackground(Color.white);
         f2=new Font("Arial",Font.BOLD,18);  //font for text input
                l7=new JLabel("Create A New Acount");
        l7.setBounds(400, 0, 500, 30);
          f1=new Font("Lucida Fax", Font.CENTER_BASELINE, 30);
         l7.setForeground(Color.LIGHT_GRAY);
        l7.setFont(f1);
        add(l7);

        l2=new JLabel("First Name");
        l2.setBounds(250, 100, 150, 30);
          f1=new Font("Lucida Fax", Font.CENTER_BASELINE, 18);
         l2.setForeground(Color.white);
        l2.setFont(f1);
        add(l2);
        l3=new JLabel("City");
        l3.setBounds(580, 100, 150, 30);
        f1=new Font("Lucida Fax", Font.CENTER_BASELINE, 18);
         l3.setForeground(Color.white);
        l3.setFont(f1);
        add(l3);
        l4=new JLabel("Last Name");
        l4.setBounds(250, 150, 150, 30);
        f1=new Font("Lucida Fax", Font.CENTER_BASELINE, 18);
         l4.setForeground(Color.white);
        l4.setFont(f1);
        add(l4);
        l5=new JLabel("D-O-B");
        l5.setBounds(580, 150, 150, 30);
        f1=new Font("Lucida Fax", Font.CENTER_BASELINE, 18);
         l5.setForeground(Color.white);
        l5.setFont(f1);
        add(l5);
        l6=new JLabel("Post");
        l6.setBounds(250, 200, 150, 30);
        f1=new Font("Lucida Fax", Font.CENTER_BASELINE, 18);
         l6.setForeground(Color.white);
        l6.setFont(f1);
        add(l6);
        l7=new JLabel("Mobile Number");
        l7.setBounds(580, 200, 150, 30);
        f1=new Font("Lucida Fax", Font.CENTER_BASELINE, 18);
         l7.setForeground(Color.white);
        l7.setFont(f1);
        add(l7);
        l8=new JLabel("E-mail ID");
        l8.setBounds(250, 250, 150, 30);
        f1=new Font("Lucida Fax", Font.CENTER_BASELINE, 18);
         l8.setForeground(Color.white);
        l8.setFont(f1);
        add(l8);
       /* l9=new JLabel("Qualification");
        l9.setBounds(580, 250, 150, 30);
        f1=new Font("Lucida Fax", Font.CENTER_BASELINE, 18);
         l9.setForeground(Color.white);
        l9.setFont(f1);
        add(l9);*/
       
        l11=new JLabel("Gender");
         l11.setBounds(250, 300, 150, 25);
         f1=new Font("Lucida Fax", Font.CENTER_BASELINE, 18);
         l11.setForeground(Color.white);
        l11.setFont(f1);
         add(l11);
        l12=new JLabel("Male");
         l12.setBounds(370, 295, 150, 25);
         f1=new Font("Lucida Fax", Font.CENTER_BASELINE, 15);
         l12.setForeground(Color.white);
        l12.setFont(f1);
         add(l12);
          l13=new JLabel("Female");
         l13.setBounds(430, 295, 150, 25);
         f1=new Font("Lucida Fax", Font.CENTER_BASELINE, 18);
         l13.setForeground(Color.white);
        l13.setFont(f1);
         add(l13);
          l14=new JLabel("User Name");
         l14.setBounds(250, 350, 150, 25);
         f1=new Font("Lucida Fax", Font.CENTER_BASELINE, 18);
         l14.setForeground(Color.white);
        l14.setFont(f1);
         add(l14);
          l15=new JLabel("Password");
         l15.setBounds(250, 400, 150, 25);
         f1=new Font("Lucida Fax", Font.CENTER_BASELINE, 18);
         l15.setForeground(Color.white);
        l15.setFont(f1);
         add(l15);
              l16=new JLabel("Re-Password");
         l16.setBounds(250, 450, 200, 25);
         f1=new Font("Lucida Fax", Font.CENTER_BASELINE, 18);
         l16.setForeground(Color.white);
        l16.setFont(f1);
         add(l16);
        
        t1=new JTextField();
        t1.setBounds(370, 100, 150, 30);
        t1.setFont(f2);
        add(t1);
        t2=new JTextField();
        t2.setBounds(370, 150, 150, 30);
        t2.setFont(f2);
        add(t2);
        t3=new JTextField();
        t3.setBounds(370, 250, 150, 30);
        t3.setFont(f2);
        add(t3);
        t4=new JTextField();
        t4.setBounds(750, 100, 150, 30);
        t4.setFont(f2);
        add(t4);
        
        
        
        
        
        t5=new JTextField();
        t5.setBounds(750, 150, 150, 30);
        t5.setFont(f2);
        add(t5);
        t6=new JTextField();
        t6.setBounds(750, 200, 150, 30);
        t6.setFont(f2);
        add(t6);
         p1=new JPasswordField();
        p1.setBounds(370, 450, 150, 30);
        add(p1);
       /* String s[]={"-select-","MBA","MSC","BCOM"};
        c1=new JComboBox(s);
         c1.setBounds(750, 250, 150, 30);
         add(c1);*/
         
        t8=new JTextField();
        t8.setBounds(370, 350, 150, 30);
        t8.setFont(f2);
        add(t8);
        p2=new JPasswordField();
        p2.setBounds(370, 400, 150, 30);
        add(p2);
        img1=new ImageIcon("src/onlinefir/cre.png");
         b1=new JButton(img1);
        b1.setBounds(370, 500, 145,30);
        add(b1);
        b1.addActionListener(this);
        img2=new ImageIcon("src/onlinefir/back.png");
        b2=new JButton(img2);
        b2.setBounds(550, 500, 150, 30);
        add(b2);
        b2.addActionListener(this);
        r1=new JRadioButton("male");
        r1.setBounds(410, 300, 17, 15);
        r1.setOpaque(false);
        r1.addFocusListener(this);
        add(r1);
       
        r2=new JRadioButton("Female");
        r2.setBounds(505, 300, 17, 15);
        r2.setOpaque(false);
        r2.addFocusListener(this);
        add(r2);
         
        String h[]={"-select-","Inspecter","Sub Inspecter","IPS","ACP","DCP","Constable"};
        c2=new JComboBox(h);
        c2.setBounds(370, 200, 150, 30);
        add(c2);
         bg=new ButtonGroup();
         bg.add(r1);
         bg.add(r2);
                 
        img=new ImageIcon("src/onlinefir/log1.jpg");
        l1=new JLabel(img);
        l1.setBounds(0, -330, 1920, 1080);
        add(l1);
        
        setVisible(true);
        
        
    }

   
    public static void main(String[] args)
    {
        new signup();
        
       
    }
    
    


    @Override
    public void actionPerformed(ActionEvent e) 
    
    {
         if(e.getSource()==b2)
        {
            dispose();
            new login();
        }

        if(e.getSource()==b1)
        {
           
            String s=t1.getText();
            System.out.println(s);
            String s1=t2.getText();
            System.out.println(s1);
            String s2=t3.getText();
            System.out.println(s2);
            String s7=t8.getText();
            System.out.println(s7);
            String s8=p1.getText();
            System.out.println(s8);
            String s6=p2.getText();
            System.out.println(s6);
            String j=c2.getSelectedItem().toString();
            System.out.println(j);
            String s3=t4.getText();
            System.out.println(s3);
            String s4=t5.getText();
            System.out.println(s4);
            String s5=t6.getText();
            System.out.println(s5);
             
            System.out.println(gen);
    
         
           /*  String i=c1.getSelectedItem().toString();
            System.out.println(i);*/
           /* String u="/^[a-zA-Z0-9]+([_ -]?[a-zA-Z0-9])*$/";
            user=user.compile(u);*/
     String reg2="^(([0-9])|([0-2][0-9])|([3][0-1]))\\-(Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec)\\-\\d{4}$";      // ^\\d{4}-\\d{2}-\\d{2}$
     date=date.compile(reg2);
            String reg="^[a-zA-Z]+$";
    pat=pat.compile(reg);
    String regex="^(.+)@(.+)$";
    pat1=pat1.compile(regex);  
     
    
    if(s.isEmpty()==true||s1.isEmpty()==true||s2.isEmpty()==true||s3.isEmpty()==true||s4.isEmpty()==true||s5.isEmpty()||s6.isEmpty()==true||s7.isEmpty()||s8.isEmpty())
    {
       JOptionPane.showMessageDialog(null,"All Fields are Mandatory");
    }
    else if(pat.matcher(s).matches()==false)
    {
        JOptionPane.showMessageDialog(null,"Enter Valid Name");
    }
   
    else if(pat.matcher(s1).matches()==false)
    {
        JOptionPane.showMessageDialog(null, "Enter Valid Last Name");
    }
     else if(pat1.matcher(s2).matches()==false)
    {
        JOptionPane.showMessageDialog(null, "Enter Valid E-mail");
        JOptionPane.showMessageDialog(null, "Enter Valid Date");
        t3.setText("vp@gmail.com");

    }
      else if(date.matcher(s4).matches()==false)
    {
        JOptionPane.showMessageDialog(null, "Enter Valid Date");
        t5.setText("Ex=25-Jan-1998");
    }
     else if(bg.getSelection()==null)
     {
         JOptionPane.showMessageDialog(null,"Select your gender");
     }
    
     else  if(s5.length()<10||s5.length()>10)
     {
         JOptionPane.showMessageDialog(null,"Fill 10 digit Number");
         JOptionPane.showMessageDialog(null, "Enter Valid Date");
        t6.setText("Ex=9068064102");

    }    
             
    
    
    
    else{
            try {
               
                ps=db.con.prepareStatement("insert into register (name,last_name,email,user_name,password,city,d_o_b,mobile,post,gen)values('"+s+"','"+s1+"','"+s2+"','"+s7+"','"+s6+"','"+s3+"','"+s4+"','"+s5+"','"+j+"','"+gen+"')");
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null,"Sucessfull");
                
            dispose();
            new login();
            } catch (Exception ex) 
           {
               System.out.println("error"+ex);
               JOptionPane.showMessageDialog(null, "Registere was not Successfully.");
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
        
        
    }

    @Override
    public void focusLost(FocusEvent e) 
    {
        
    }
   
    
    
       
   
    
}
