package hotelmanagement;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.*;
import net.proteanit.sql.*;

public class Room extends JFrame implements ActionListener  {
    JTable table , CleanStatus;
    JButton  back;
    Room(){
     getContentPane().setBackground(Color.WHITE);
     setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/eight.jpg"));
        Image i2 = i1.getImage().getScaledInstance(600 , 600 , Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(500 , 0 , 600 , 600);
        add(image);

        JLabel I1 =new JLabel("Room Number");
        I1.setBounds(10 , 10 , 100 , 20);
        add(I1);


        JLabel I2 =new JLabel("Availaibility");
        I2.setBounds(120 , 10 , 100 , 20);
        add(I2);

        JLabel I3 =new JLabel(" Clean Status");
        I3.setBounds(220 , 10 , 100 , 20);
        add(I3);

        JLabel I4 =new JLabel("BedType");
        I4.setBounds(320 , 10 , 100 , 20);
        add(I4);

        JLabel I5 =new JLabel("Price");
        I5.setBounds(420 , 10 , 100 , 20);
        add(I5);




        table = new JTable();
        table.setBounds(0,40,500,400);
        add(table);

        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from room ");
            table.setModel(DbUtils.resultSetToTableModel(rs));

        }
        catch (Exception e){
            e.printStackTrace();
        }
        back = new JButton("Back ");
        back.setBounds(200 , 500 , 130 , 30);
        back.setForeground(Color.WHITE);
        back.setBackground(Color.BLACK);
        back.addActionListener(this);
        add(back);

        setBounds(300 , 200 , 1050 ,600);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new AddReception();
    }
    public static void main(String[] args) {
        new Room();
    }


}
