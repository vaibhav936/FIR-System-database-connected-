package onlinefir;



import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import jdk.nashorn.internal.parser.TokenType;
//import com.sun.org.apache.xml.internal.resolver.helpers.*;

public class search2 extends JFrame implements ActionListener
{
    PreparedStatement ps;
     ImageIcon img,img1,img2;
    dbconnection db=new dbconnection();
    JLabel l1,l2,l3;
    Font f1;
    int i=0;
    JPanel p1,p2,p3;
    JComboBox c1,c2,c3;
    JButton b1,b2;
    JScrollPane js;
    JTable jt;
    Statement st;
    ResultSet rs,rs1;
    
    search2()
    {
        setLayout(null);
        setTitle("Search");
        setUndecorated(false);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        getContentPane().setBackground(Color.BLACK);
        setLocationRelativeTo(this);
        l1=new JLabel("Search By Crime");
        add(l1);
        f1=new Font(null, Font.CENTER_BASELINE, 40);
        l1.setFont(f1);
        l1.setBounds(550, 15, 600, 100);
        l1.setForeground(Color.white);
       
        String[] s={"-Select-","Murder","Misbheave","Blackmail","Bribery","Burglary","Embezzlement","Extortionn","False pretenses","Fraud"};
        c1=new JComboBox(s);
   
        add(c1);
        c1.setBounds(500,150,130,30);
        c1.setForeground(Color.BLACK);
         String s1=c1.getSelectedItem().toString();
         js=new JScrollPane();
        js.setBounds(450, 200, 500, 300);
        
        jt=new JTable();
        js.setViewportView(jt);
        add(js);
        img2=new ImageIcon("src/onlinefir/serc.png");
        b1=new JButton(img2);
         add(b1);
        b1.setBounds(680,150,100,30);
        b1.setBorderPainted(false);
        b1.addActionListener(this);
         img1=new ImageIcon("src/onlinefir/home.png");
         b2=new JButton(img1);
         add(b2);
        b2.setBounds(800,150,100,30);
        b2.setBorderPainted(false);
        b2.addActionListener(this);

        img=new ImageIcon("src/onlinefir/ser.jpg");
        l3=new JLabel(img);
        l3.setBounds(0, -330, 1920, 1080);
        add(l3);
       
         setVisible(true);
        }
    public static void main(String[] args)
    {
        new search2();
    }

    //@Override
   // public void itemStateChanged(ItemEvent e)
    //{
    
    //}

    @Override
    public void actionPerformed(ActionEvent e) 
    {
         if(e.getSource()==b2)
 {
     dispose();
     new home();
 }
         if(e.getSource()==b1)
 {
         try
        {
         st=db.con.createStatement();
         rs=st.executeQuery("select * from report");
         int i=0;
         while(rs.next())
         {
             i++;
                }
                
                String data[][]=new String[i][8];
                int i1=0;
                 String s1=c1.getSelectedItem().toString();
                 rs1=st.executeQuery("select * from report where name='"+s1+"' ");
                
                while (rs1.next())
                {
                    
                
                    data[i1][0]=String.valueOf(rs1.getInt("id"));
                    data[i1][1]=rs1.getString("name");
                    data[i1][2]=rs1.getString("crime_type");
                    data[i1][3]=rs1.getString("phone_num");
                    i1++;
           }
                    String head[]= {"ID","Applicator Name","Crime","Phone Number"};
                    JTableHeader header = jt.getTableHeader();
                    header.setBackground(Color.BLACK);
                    header.setForeground(Color.white);
                    DefaultTableModel dm=new DefaultTableModel(data,head);
                    jt.setModel(dm);
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
 }  
         if(e.getSource()==rs1){
             JOptionPane.showMessageDialog(null, "Hiii");
         }
    }
    }
    

    
    
    

