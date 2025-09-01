package hotelmanagement;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener ;
import java.awt.event.ActionEvent;
import java.sql.ResultSet;


public class Searchroom extends JFrame implements ActionListener  {
    JTable table , CleanStatus;
    JButton  back , submit;
    JComboBox bedtype;
    JCheckBox availaible;
    Searchroom()
    {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel text = new JLabel("SEARCH FOR ROOM");
        text.setFont(new Font("Tahoma" , Font.PLAIN , 30));
        text.setBounds(400 , 30 , 300 , 40);
        add(text);

        JLabel lblbed =new JLabel("Bedtype");
        lblbed.setBounds(50 , 100 , 100 , 20);
        add(lblbed);

        bedtype = new JComboBox( new String[]{ "SingleBed " , "DoubleBed"});
        bedtype.setBounds(150 , 100 , 150 , 25);
        bedtype.setBackground(Color.WHITE);
        add(bedtype);



        availaible = new JCheckBox( "Only display Availaible");
        availaible.setBounds(650 , 100 , 150 , 25);
        availaible.setBackground(Color.WHITE);
        add(availaible);



        JLabel I1 =new JLabel("Room Number");
        I1.setBounds(10 , 170 , 100 , 20);
        add(I1);

        JLabel I2 =new JLabel("Availaibility");
        I2.setBounds(220 , 170 , 100 , 20);
        add(I2);

        JLabel I3 =new JLabel(" Clean Status");
        I3.setBounds(420 , 170 , 100 , 20);
        add(I3);

        JLabel I4 =new JLabel("BedType");
        I4.setBounds(620 , 170 , 100 , 20);
        add(I4);

        JLabel I5 =new JLabel("Price");
        I5.setBounds(820 , 170 , 100 , 20);
        add(I5);




        table = new JTable();
        table.setBounds(0,200,1000,250);

        add(table);

        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from room ");
            table.setModel(DbUtils.resultSetToTableModel(rs));

        }
        catch (Exception e){
            e.printStackTrace();
        }
        submit= new JButton("Submit");
        submit.setBounds(300 , 520 , 120 , 30);
        submit.setForeground(Color.WHITE);
        submit.setBackground(Color.BLACK);
        submit.addActionListener(this);
        add(submit);

        back = new JButton("Back ");
        back.setBounds(420 , 520 , 120 , 30);
        back.setForeground(Color.WHITE);
        back.setBackground(Color.BLACK);
        back.addActionListener(this);
        add(back);

        setBounds(300 , 200 , 1000 ,600);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == submit) {
            try {
                String query1 = "select * from room where bed_type = '"+bedtype.getSelectedItem()+"'";
                String query2 = "select * from room where availaibility = 'Availaible' AND bed_type = '"+bedtype.getSelectedItem()+"'";

                Conn conn = new Conn();
                ResultSet rs;
                if(availaible.isSelected()){
                    rs = conn.s.executeQuery(query2);
                }else {
                    rs = conn.s.executeQuery(query1);
                }
                table.setModel(DbUtils.resultSetToTableModel(rs));
            } catch (Exception e) {
                e.printStackTrace();

            }
        }else{
        setVisible(false);
        new AddReception();
    }}
    public static void main(String[] args) {
        new Searchroom();
    }


}
