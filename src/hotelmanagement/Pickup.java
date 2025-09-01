package hotelmanagement;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;

public class Pickup extends JFrame implements ActionListener {

    Choice ccar;
    JTable table;
    JButton display, back;

    Pickup() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading = new JLabel("PICK UP SERVICE");
        heading.setFont(new Font("Tahoma", Font.BOLD, 20));
        heading.setBounds(300, 30, 200, 30);
        add(heading);

        JLabel lblcar = new JLabel("Type of Car");
        lblcar.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblcar.setBounds(60, 100, 120, 20);
        add(lblcar);

        ccar = new Choice();
        try {
            Conn conn = new Conn();
            ResultSet rs = conn.s.executeQuery("select * from driver");
            while (rs.next()) {
                ccar.add(rs.getString("brand"));   // load car brands
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        ccar.setBounds(180, 100, 150, 25);
        add(ccar);

        table = new JTable();
        table.setBounds(0, 200, 800, 250);
        add(table);

        JLabel l1 = new JLabel("Name");
        l1.setBounds(40, 170, 100, 20);
        add(l1);

        JLabel l2 = new JLabel("Age");
        l2.setBounds(160, 170, 100, 20);
        add(l2);

        JLabel l3 = new JLabel("Gender");
        l3.setBounds(280, 170, 100, 20);
        add(l3);

        JLabel l4 = new JLabel("Company");
        l4.setBounds(390, 170, 100, 20);
        add(l4);

        JLabel l5 = new JLabel("Brand");
        l5.setBounds(500, 170, 100, 20);
        add(l5);

        JLabel l6 = new JLabel("Available");
        l6.setBounds(610, 170, 100, 20);
        add(l6);

        JLabel l7 = new JLabel("Location");
        l7.setBounds(710, 170, 100, 20);
        add(l7);

        display = new JButton("Display");
        display.setBounds(200, 500, 120, 30);
        display.setBackground(Color.BLACK);
        display.setForeground(Color.WHITE);
        display.addActionListener(this);
        add(display);

        back = new JButton("Back");
        back.setBounds(420, 500, 120, 30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        setBounds(300, 200, 850, 600);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == display) {
            try {
                Conn conn = new Conn();
                String query = "select * from driver where brand = '" + ccar.getSelectedItem() + "'";
                ResultSet rs = conn.s.executeQuery(query);
                table.setModel(DbUtils.resultSetToTableModel(rs));
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (ae.getSource() == back) {
            setVisible(false);
            new AddReception();
        }
    }

    public static void main(String[] args) {
        new Pickup();
    }
}
