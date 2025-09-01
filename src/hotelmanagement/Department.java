package hotelmanagement;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

    public class Department extends JFrame implements ActionListener {
        JTable table , CleanStatus;
        JButton  back;
        Department(){
            getContentPane().setBackground(Color.WHITE);
            setLayout(null);

//            ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/eight.jpg"));
//            Image i2 = i1.getImage().getScaledInstance(600 , 600 , Image.SCALE_DEFAULT);
//            ImageIcon i3 = new ImageIcon(i2);
//            JLabel image = new JLabel(i3);
//            image.setBounds(500 , 0 , 600 , 600);
//            add(image);

            JLabel I1 =new JLabel("Department");
            I1.setBounds(180 , 10 , 100 , 20);
            add(I1);


            JLabel I2 =new JLabel("Budget");
            I2.setBounds(420 , 10 , 100 , 20);
            add(I2);


            table = new JTable();
            table.setBounds(0,50,700,350);
            add(table);

            try{
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery("select * from department ");
                table.setModel(DbUtils.resultSetToTableModel(rs));

            }
            catch (Exception e){
                e.printStackTrace();
            }
            back = new JButton("Back");
            back.setBounds(280 , 400 , 130 , 30);
            back.setForeground(Color.WHITE);
            back.setBackground(Color.BLACK);
            back.addActionListener(this);
            add(back);

            setBounds(400 , 200 , 700 ,480);
            setVisible(true);

        }

        public void actionPerformed(ActionEvent ae){
            setVisible(false);
            new AddReception();
        }
        public static void main(String[] args) {
            new Department();
        }


    }

