package hotelmanagement;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;


public class UpdateCheck extends JFrame implements ActionListener  {
    Choice ccustomer;
    JTextField tfroom , tfname ,tfcheckintime , tfpaid , tfpending;
    JButton check , update , back;
    UpdateCheck(){

        setLayout(null);
        getContentPane().setBackground(Color.WHITE);



        JLabel text = new JLabel("Update Status");
        text.setFont(new Font("Tahoma", Font.PLAIN , 20));
        text.setBounds(90 , 20 , 200 , 30);
        text.setForeground(Color.blue);
        add(text);


        JLabel lblid = new JLabel(" Customer id ");
        lblid.setBounds(30 , 80 , 100 , 20);
        add(lblid);

        ccustomer = new Choice();
        ccustomer.setBounds(200 , 80 , 150 , 25);
        add(ccustomer);

        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from customer");
            while(rs.next()){
                ccustomer.add(rs.getString("number"));
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }


        JLabel lblroom = new JLabel("Room Number");
        lblroom.setBounds(30 , 120 , 100 , 20);
        add(lblroom);

        tfroom = new JTextField();
        tfroom.setBounds(200,120 ,150 ,25);
        add(tfroom);

        JLabel lblname = new JLabel("Name");
        lblname.setBounds(30 , 160 , 100 , 20);
        add(lblname);

        tfname = new JTextField();
        tfname.setBounds(200,160 ,150 ,25);
        add(tfname);


        JLabel lblcheckintime = new JLabel("Checkin-time");
        lblcheckintime.setBounds(30 , 200 , 100 , 20);
        add(lblcheckintime);

        tfcheckintime= new JTextField();
        tfcheckintime.setBounds(200,200 ,150 ,25);
        add(tfcheckintime);


        JLabel lblpaid = new JLabel("Amount Paid");
        lblpaid.setBounds(30 , 240 , 100 , 20);
        add(lblpaid);

        tfpaid= new JTextField();
        tfpaid.setBounds(200,240 ,150 ,25);
        add(tfpaid);

        JLabel lblpending = new JLabel("Pending Amount");
        lblpending.setBounds(30 , 280 , 100 , 20);
        add(lblpending);

        tfpending= new JTextField();
        tfpending.setBounds(200,280 ,150 ,25);
        add(tfpending);


        check = new JButton("Check");
        check.setBackground(Color.BLACK);
        check.setForeground(Color.WHITE);
        check.setBounds(30 , 340 , 100 , 30);
        check.addActionListener(this);
        add(check);

        update = new JButton("Update");
        update.setBackground(Color.BLACK);
        update.setForeground(Color.WHITE);
        update.setBounds(150 , 340 , 100 , 30);
        update.addActionListener(this);
        add(update);


        back = new JButton("back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(300 , 340 , 100 , 30);
        back.addActionListener(this);
        add(back);


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/nine.jpg"));
        Image i2 = i1.getImage().getScaledInstance(450 , 450 , Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(400 , 60 , 550 , 370);
        add(image);




        setBounds( 300 , 200 , 980 , 500);

        setVisible(true);
    }

    public  void actionPerformed (ActionEvent ae) {
        if( ae.getSource()== check){
            String id = ccustomer.getSelectedItem();
            String query = "select * from customer where number = '"+id+"'";
            try{
                Conn c = new Conn();
                ResultSet rs =c.s.executeQuery(query);
                while(rs.next()){
                    tfroom.setText(rs.getString("room"));
                    tfname.setText(rs.getString("name"));
                    tfcheckintime.setText(rs.getString("Checkintime"));
                    tfpaid.setText(rs.getString("paid"));
                }
                ResultSet rs2 =c.s.executeQuery("select * from room where number = '"+tfroom.getText()+"'");
                while(rs2.next()){
                    String price = rs2.getString("price");
                    int amountpaid = Integer.parseInt(price)-Integer.parseInt(tfpending.getText());
                    tfpending.setText("" +amountpaid);
                }

            }catch (Exception e){
                e.printStackTrace();
            }
        } else if (ae.getSource()== update) {
         String number = ccustomer.getSelectedItem();
         String room = tfroom.getText();
         String name = tfname.getText();
         String checkintime = tfcheckintime.getText();
         String deposit = tfpaid.getText();

         try{
            Conn c = new Conn();
            c.s.executeUpdate("update customer set room = '"+room+"' , name = '"+name+"' , checkintime = '"+checkintime+"', deposit = '"+deposit+"' ");
        JOptionPane.showMessageDialog(null, "Data Updated Sucessfully");
         setVisible(false);
         new AddReception();}
        catch( Exception e){
             e.printStackTrace();
         }
        }
        else {
            setVisible(false);
            new AddReception();
        }
    }

    public static void main(String[] args) {
        new UpdateCheck();
    }
}
