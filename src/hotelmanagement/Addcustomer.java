package hotelmanagement;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.Date;

public class Addcustomer extends JFrame  {
    JComboBox comboid;
    JTextField tfnumber , tfname , tfcountry , tfdeposit;
    JRadioButton rmale , rfemale;
    JLabel checkintime;
    JButton Add , back ;
    Choice croom ;
    Addcustomer(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel text = new JLabel("NEW CUSTOMER FORM");
        text.setBounds(100 , 20 , 600 , 30);
        text.setFont( new Font( "Raleway", Font.PLAIN ,40));
        add(text);

        JLabel lblid = new JLabel("ID");
        lblid.setBounds(35 , 80 , 100 , 20);
        lblid.setFont( new Font( "Raleway", Font.PLAIN ,20));
        add(lblid);

        String options[] = { "Aadhar card" , "Drivng License" , "Passport", "Pancard" , "Voter-ID"};
        comboid = new JComboBox(options);
        comboid.setBounds(200 , 80 , 150 , 25 );
        comboid.setBackground(Color.WHITE);
        add(comboid);


        JLabel lblnumber = new JLabel("Number");
        lblnumber.setBounds(35 , 120 , 100 , 20);
        lblnumber.setFont( new Font("Raleway" , Font.PLAIN,20));
        add(lblnumber);

        tfnumber = new JTextField();
        tfnumber.setBounds( 200 , 120 , 150 , 20);
        add(tfnumber);

        JLabel lblname = new JLabel("Name");
        lblname.setBounds(35 , 160 , 100 , 20);
        lblname.setFont( new Font("Raleway" , Font.PLAIN,20));
        add(lblname);

        tfname = new JTextField();
        tfname.setBounds( 200 , 160 , 150 , 25);
        add(tfname);

        JLabel lblgender = new JLabel("Gender");
        lblgender.setBounds(35 , 200 , 100 , 20);
        lblgender.setFont( new Font("Raleway" , Font.PLAIN,20));
        add(lblgender);

        rmale = new JRadioButton("Male");
        rmale.setBackground(Color.WHITE);
        rmale.setBounds(200 , 200 , 60 , 25);
        add(rmale);


        rfemale = new JRadioButton("Female");
        rfemale.setBackground(Color.WHITE);
        rfemale.setBounds(270 , 200 , 100 , 25);
        add(rfemale);


        JLabel lblcountry = new JLabel("Country");
        lblcountry.setBounds(35 , 240 , 100 , 20);
        lblcountry.setFont( new Font("Raleway" , Font.PLAIN,20));
        add(lblcountry);

        tfcountry = new JTextField();
        tfcountry.setBounds( 200 , 240 , 150 , 20);
        add(tfcountry);


        JLabel lblroom = new JLabel("Room Number");
        lblroom.setBounds(35 , 280 , 150 , 20);
        lblroom.setFont( new Font("Raleway" , Font.PLAIN,20));
        add(lblroom);

        croom = new Choice();

        try{
            Conn conn = new Conn();
            String query = "Select * from room ";
             ResultSet rs = conn.s.executeQuery(query);
             while(rs.next()){
                 croom.add(rs.getString("roomnumber"));
             }
        }catch(Exception e){
            e.printStackTrace();
        }
        croom.setBounds(200 , 280 , 150 , 25);
         add(croom);


        JLabel lbltime = new JLabel("Checkin-time");
        lbltime.setBounds(35 , 320 , 250 , 20);
        lbltime.setFont( new Font("Raleway" , Font.PLAIN,20));
        add(lbltime);

        Date date = new Date();


        checkintime = new JLabel(""+ date);
        checkintime.setBounds(200 , 320 , 150 , 25);
        checkintime.setFont( new Font("Raleway" , Font.PLAIN,12));
        add(checkintime);

        JLabel lbldeposit = new JLabel("Deposit");
        lbldeposit.setBounds(35 , 360 , 250 , 20);
        lbldeposit.setFont( new Font("Raleway" , Font.PLAIN,20));
        add(lbldeposit);

        tfdeposit = new JTextField();
        tfdeposit.setBounds(200 , 360 , 150 , 25);
        add(tfdeposit);



        Add = new JButton("Add room");
        Add.setBounds(30 , 410 , 130 , 30);
        Add.setForeground(Color.WHITE);
        Add.setBackground(Color.BLACK);
//        Add.addActionListener(this);
        add(Add);

        back = new JButton("Cancel room");
        back.setBounds(200 , 410 , 130 , 30);
        back.setForeground(Color.WHITE);
        back.setBackground(Color.BLACK);
//        back.addActionListener(this);
        add(back);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/fifth.png"));
        Image i2 = i1.getImage().getScaledInstance(300 , 400 , Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(400 , 50 , 300 , 400);
        add(image);


        setBounds( 350 , 200 , 800 , 550);
        setVisible(true);



    }

    public static void main(String[] args) {
        new Addcustomer();
    }
}
