package hotelmanagement;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Managerinfo extends JFrame implements ActionListener {
    JTable table , CleanStatus;
    JButton  back;
    Managerinfo(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);


        JLabel I1 =new JLabel("Name ");
        I1.setBounds(40 , 10 , 100 , 20);
        add(I1);


        JLabel I2 =new JLabel("Age");
        I2.setBounds(170 , 10 , 100 , 20);
        add(I2);

        JLabel I3 =new JLabel(" Gender");
        I3.setBounds(290 , 10 , 100 , 20);
        add(I3);

        JLabel I4 =new JLabel("JOB");
        I4.setBounds(410 , 10 , 100 , 20);
        add(I4);

        JLabel I5 =new JLabel("Salary");
        I5.setBounds(580 , 10 , 100 , 20);
        add(I5);

        JLabel I6 =new JLabel("Phone");
        I6.setBounds(650 , 10 , 100 , 20);
        add(I6);

        JLabel I7 =new JLabel("E-mail");
        I7.setBounds(720 , 10 , 100 , 20);
        add(I7);

        JLabel I8 =new JLabel("Adhaar");
        I8.setBounds(800 , 10 , 100 , 20);
        add(I8);




        table = new JTable();
        table.setBounds(0,40,1000,400);
        add(table);

        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from employee where job = 'Manager'");
            table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e){
            e.printStackTrace();
        }
        back = new JButton("Back ");
        back.setBounds(200 , 500 , 130 , 30);
        back.setForeground(Color.WHITE);
        back.setBackground(Color.BLACK);
        back.addActionListener(this);
        add(back);

        setBounds(420 , 200 , 1000 ,600);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new AddReception();
    }
    public static void main(String[] args) {
        new Managerinfo();
}}
