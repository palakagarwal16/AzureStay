package hotelmanagement;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dashboard extends JFrame implements ActionListener {

    Dashboard(){
        setBounds(0 , 0 , 1550 , 1000);
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1550 , 1000 , Image.SCALE_DEFAULT);
        ImageIcon I3 = new ImageIcon(i2);
        JLabel image = new JLabel(I3);
        image.setBounds(0,0,1550, 1000);
        add(image);

        JLabel Text  = new JLabel("Welcome to the Luxury space in !!");
        Text.setBounds(400,80,1050, 50);
        Text.setFont(new Font("Tahoma" ,Font.PLAIN , 46));
        Text.setForeground(Color.WHITE);
        image.add(Text);


        JMenuBar mb = new JMenuBar();
        mb.setBounds( 0 ,0 , 1550 , 30 );
        image.add(mb);

        JMenu hotel = new JMenu( "Hotel Management");
        hotel.setForeground(Color.BLACK);
        mb.add(hotel);

        JMenu Admin = new JMenu("Admin");
        Admin.setForeground(Color.BLACK);
        mb.add(Admin);

        JMenuItem Reception = new JMenuItem("Reception");
        Reception.addActionListener(this);
        hotel.add(Reception);

        JMenuItem AddROOMS = new JMenuItem("Add Rooms");
        AddROOMS.addActionListener(this);

        Admin.add(AddROOMS);

        JMenuItem AddDRIVERS = new JMenuItem("Add Drivers");
        Admin.add(AddDRIVERS);

        JMenuItem Addemployee = new JMenuItem("Add Employee");
        Addemployee.addActionListener(this);

        Admin.add(Addemployee);

        setVisible(true);
    }

    public void actionPerformed (ActionEvent ae){
        if(ae.getActionCommand().equals("Add Employee")){
            new AddEmployee();
        }
        else if(ae.getActionCommand().equals("Add Rooms")){
            new AddRooms();
        }
    }

    public static void main(String[] args) {
        new Dashboard();
    }

}
