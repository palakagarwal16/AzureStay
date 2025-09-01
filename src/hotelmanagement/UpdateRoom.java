package hotelmanagement;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class UpdateRoom extends JFrame implements ActionListener {

    Choice ccustomer;
    JTextField tfavailaible , tfroom , tfcleaning, tfpaid, tfpending , tfcheckintime;
    JButton check, update, back;

    UpdateRoom() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/seventh.jpg"));
        Image i2 = i1.getImage().getScaledInstance(500 , 300 , Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(400 , 50 , 500 , 300);
        add(image);

        JLabel text = new JLabel("Update Room Status");
        text.setFont(new Font("Tahoma", Font.PLAIN, 20));
        text.setBounds(30, 20, 250, 30);
        add(text);

        JLabel lblid = new JLabel("Customer ID");
        lblid.setBounds(30, 80, 100, 20);
        add(lblid);

        ccustomer = new Choice();
        ccustomer.setBounds(200, 80, 150, 25);
        add(ccustomer);

        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from customer");
            while (rs.next()) {
                ccustomer.add(rs.getString("number"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        JLabel lblroom = new JLabel("Room Number");
        lblroom.setBounds(30, 130, 100, 20);
        add(lblroom);
        tfroom = new JTextField();
        tfroom.setBounds(200, 130, 150, 25);
        add(tfroom);


//        Choice croom = new Choice();
        try {
            Conn c = new Conn();
            String query = "select roomnumber from room where availability = 'Available'";
            ResultSet rs = c.s.executeQuery(query);
            while (rs.next()) {
                ccustomer.add(rs.getString("roomnumber"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
//        croom.setBounds(200, 130, 150, 25);
//        add(croom);

        JLabel lblname = new JLabel("Availaibility");
        lblname.setBounds(30, 180, 100, 20);
        add(lblname);

        tfavailaible= new JTextField();
        tfavailaible.setBounds(200, 180, 150, 25);
        add(tfavailaible);

        JLabel lblcleaningstatus = new JLabel("Cleaning Status");
        lblcleaningstatus.setBounds(30, 230, 100, 20);
        add(lblcleaningstatus);

        tfcleaning = new JTextField();
        tfcleaning.setBounds(200, 230, 150, 25);
        add(tfcleaning);

//        JLabel lblpaid = new JLabel("Amount Paid");
//        lblpaid.setBounds(30, 240, 100, 20);
//        add(lblpaid);
//
//        tfpaid = new JTextField();
//        tfpaid.setBounds(200, 240, 150, 25);
//        add(tfpaid);

//        JLabel lblpending = new JLabel("Pending Amount");
//        lblpending.setBounds(30, 280, 120, 20);
//        add(lblpending);
//
//        tfpending = new JTextField();
//        tfpending.setBounds(200, 280, 150, 25);
//        add(tfpending);

        check = new JButton("Check");
        check.setBounds(30, 280, 100, 30);
        check.setForeground(Color.WHITE);
        check.setBackground(Color.BLACK);
        check.addActionListener(this);
        add(check);

        update = new JButton("Update");
        update.setBounds(150, 280, 100, 30);
        update.setForeground(Color.WHITE);
        update.setBackground(Color.BLACK);
        update.addActionListener(this);
        add(update);

        back = new JButton("Back");
        back.setBounds(270, 280, 100, 30);
        back.setForeground(Color.WHITE);
        back.setBackground(Color.BLACK);
        back.addActionListener(this);
        add(back);

        setBounds(300, 200, 900, 400);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == check) {
            String id = ccustomer.getSelectedItem();
            String query = "select * from customer where number = '" + id + "'";
            try {
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery(query);
                while (rs.next()) {
                    tfroom.setText(rs.getString("room"));
                }

                // pending amount = room price - paid
                ResultSet rs2 = c.s.executeQuery("select * from room where roomnumber = '" + id + "'");
                while (rs2.next()) {
                    String price = rs2.getString("price");
                    int pending = Integer.parseInt(price) - Integer.parseInt(tfpaid.getText());
                    tfpending.setText("" + pending);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (ae.getSource() == update) {
            String number = ccustomer.getSelectedItem();
            String name = tfavailaible.getText();
            String checkin = tfcheckintime.getText();
            String deposit = tfpaid.getText();

            try {
                Conn c = new Conn();
                c.s.executeUpdate("update customer set name = '" + name + "', checkintime = '" + checkin + "', deposit = '" + deposit + "' where number = '" + number + "'");
                JOptionPane.showMessageDialog(null, "Data Updated Successfully");
                setVisible(false);
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (ae.getSource() == back) {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new UpdateRoom();
    }
}

