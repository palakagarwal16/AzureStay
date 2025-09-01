package hotelmanagement;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddReception extends JFrame implements ActionListener  {
    JButton newcustomer ,rooms ,department , allemployee , customer , managerinfo , checkout ,searchroom , logout, updatestatus ,roomstatus , pickupstatus;
    AddReception(){
        newcustomer = new JButton("New Customer ");
        newcustomer.setBounds(10 , 30 , 200 , 30);
        newcustomer.setForeground(Color.WHITE);
        newcustomer.setBackground(Color.BLACK);
        newcustomer.addActionListener(this);
        add(newcustomer);


        rooms = new JButton("New Room ");
        rooms.setBounds(10 , 70 , 200 , 30);
        rooms.setForeground(Color.WHITE);
        rooms.setBackground(Color.BLACK);
        rooms.addActionListener(this);
        add(rooms);

        department= new JButton("Department");
        department.setBounds(10 , 110 , 200 , 30);
        department.setForeground(Color.WHITE);
        department.setBackground(Color.BLACK);
        department.addActionListener(this);
        add(department);

        allemployee = new JButton("Employee");
        allemployee.setBounds(10 , 150 , 200 , 30);
        allemployee.setForeground(Color.WHITE);
        allemployee.setBackground(Color.BLACK);
        allemployee.addActionListener(this);
        add(allemployee);

        customer = new JButton("Customer");
        customer.setBounds(10 , 190 , 200 , 30);
        customer.setForeground(Color.WHITE);
        customer.setBackground(Color.BLACK);
        customer.addActionListener(this);
        add(customer);

        managerinfo = new JButton("Manager info");
        managerinfo.setBounds(10 , 230 , 200 , 30);
        managerinfo.setForeground(Color.WHITE);
        managerinfo.setBackground(Color.BLACK);
        managerinfo.addActionListener(this);
        add(managerinfo);

        checkout = new JButton("Checkout");
        checkout.setBounds(10 , 270 , 200 , 30);
        checkout.setForeground(Color.WHITE);
        checkout.setBackground(Color.BLACK);
        checkout.addActionListener(this);
        add(checkout);

        updatestatus = new JButton("Status Updates");
        updatestatus.setBounds(10 , 310 , 200 , 30);
        updatestatus.setForeground(Color.WHITE);
        updatestatus.setBackground(Color.BLACK);
        updatestatus.addActionListener(this);
        add(updatestatus);

        roomstatus = new JButton("Room Updates");
        roomstatus.setBounds(10 , 350 , 200 , 30);
        roomstatus.setForeground(Color.WHITE);
        roomstatus.setBackground(Color.BLACK);
        roomstatus.addActionListener(this);
        add(roomstatus);


        pickupstatus = new JButton("Pickup Updates");
        pickupstatus.setBounds(10 , 390 , 200 , 30);
        pickupstatus.setForeground(Color.WHITE);
        pickupstatus.setBackground(Color.BLACK);
        pickupstatus.addActionListener(this);
        add(pickupstatus);


        searchroom = new JButton("Room Availaible");
        searchroom.setBounds(10 , 430 , 200 , 30);
        searchroom.setForeground(Color.WHITE);
        searchroom.setBackground(Color.BLACK);
        searchroom.addActionListener(this);
        add(searchroom);


        logout = new JButton("Logout");
        logout.setBounds(10 , 470 , 200 , 30);
        logout.setForeground(Color.WHITE);
        logout.setBackground(Color.BLACK);
        logout.addActionListener(this);
        add(logout);

       ImageIcon I1 = new ImageIcon(ClassLoader.getSystemResource("icons/hyg.jpg"));
       JLabel image = new JLabel(I1);
       image.setBounds(250 , 30 , 600 , 470);
       add(image);

        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        setBounds( 350 , 200 , 900 ,570 );
        setVisible(true);
    }


    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == newcustomer) {
            setVisible(false);
            new Addcustomer();
        }
        else if (ae.getSource() == rooms) {
            setVisible(false);
            new AddRooms();
        }
        else if(ae.getSource()== department){
            setVisible(false);
            new  Department();
        }
        else if(ae.getSource()== allemployee){
            setVisible(false);
            new  AllEmployees();
        }

        else if(ae.getSource()== managerinfo){
            setVisible(false);
            new  Managerinfo();
        }
        else if(ae.getSource()== customer){
            setVisible(false);
            new  Customerinfo();
        }else if(ae.getSource()== searchroom){
            setVisible(false);
            new  Searchroom();
        }
    }

    public static void main(String[] args) {
        new AddReception();
    }
}
