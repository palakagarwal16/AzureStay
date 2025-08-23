package hotelmanagement;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.*;

import static java.awt.Color.BLUE;

public class HotelManage extends JFrame implements ActionListener { //helps to catch event
    // when you implement abstract method you need to override them else make class abstract

    HotelManage(){
//        setSize(1366 , 565);
//        setLocation(100,100);
        setBounds(100,100, 1366, 565);
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/columbus.jpg")); //image lagana
        JLabel image = new JLabel(i1); //making label
        image.setBounds(0 , 0 , 1366, 565);
        add(image);

        JLabel text = new JLabel("AZURE STAY");
        text.setBounds( 20 , 430 , 1000 , 90 );
        text.setForeground(Color.WHITE);
        text.setFont( new Font( "serif" , Font.PLAIN , 70));
        image.add(text);

        JButton next = new JButton("Next");
        next.setBounds(1150 , 450 ,150 , 50);
//        next.setBackground(Color.white);
//        next.setForeground(Color.black);
        next.addActionListener(this);
        next.setFont( new Font( "serif" , Font.PLAIN , 30));
        image.add(next);




        setVisible(true);
        while(true){
            text.setVisible(false);
            try {
                Thread.sleep(500);
            }
            catch (Exception e) {
                e.printStackTrace();
            }
            text.setVisible(true);
            try{
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
            }
        }

    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Login();
    }
    public static void main(String[] args) {
        new HotelManage();
    }
}
