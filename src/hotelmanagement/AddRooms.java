package hotelmanagement;

import com.sun.jdi.PathSearchingVirtualMachine;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class AddRooms extends JFrame implements ActionListener {
    JButton Add , Cancel ;
    JTextField tfroom , tfprice ;
    JComboBox availaiblecombo , Cleancombo , bedcombo;
AddRooms(){

    getContentPane().setBackground(Color.WHITE);

    JLabel heading = new JLabel( "ADD ROOMS");
    heading.setBounds( 150 , 50 , 200 , 20);
    heading.setFont(new Font("Tahoma" , Font.BOLD , 18));
    add(heading);

    JLabel lblroomno = new JLabel( " Room Number" );
    lblroomno.setBounds( 60 , 80 , 120 , 20);
    lblroomno.setFont(new Font("Tahoma" , Font.BOLD , 18));
    add(lblroomno);

    JLabel lblavalaibleroomno = new JLabel( " Availaible" );
    lblavalaibleroomno.setBounds( 60 , 130 , 120 , 20);
    lblavalaibleroomno.setFont(new Font("Tahoma" , Font.BOLD , 18));
    add(lblavalaibleroomno);

    JLabel lblcleanroomno = new JLabel( " Cleaning status" );
    lblcleanroomno.setBounds( 60 , 180 , 120 , 20);
    lblcleanroomno.setFont(new Font("Tahoma" , Font.BOLD , 18));
    add(lblcleanroomno);

    String availaibleOptions[] = {"Available ", " Occupied "};
    availaiblecombo = new JComboBox(availaibleOptions);
    availaiblecombo.setBounds(200 , 130 , 150 , 30);
    availaiblecombo.setBackground(Color.WHITE);
    add(availaiblecombo);


    String CleanOptions[] = {"Clean  ", " Dirty "};
    Cleancombo = new JComboBox(CleanOptions);
    Cleancombo.setBounds(200 , 180 , 150 , 30);
    Cleancombo.setBackground(Color.WHITE);
    add(Cleancombo);


    JLabel lblprice = new JLabel( " Price options" );
    lblprice.setBounds( 60 , 280 , 120 , 20);
    lblprice.setFont(new Font("Tahoma" , Font.BOLD , 18));
    add(lblprice);

    tfprice = new JTextField( );
    tfprice.setBounds(200 , 280 , 150 , 30);
    add(tfprice);

    tfroom = new JTextField( );
    tfroom.setBounds(200 , 80 , 150 , 30);
    add(tfroom);


    JLabel lbltype = new JLabel( " Bed types" );
    lbltype.setBounds( 60 , 230 , 120 , 20);
    lbltype.setFont(new Font("Tahoma" , Font.BOLD , 18));
    add(lbltype);

    String Bedtype[] = {" Single Bed ", " Double Bed "};
    bedcombo = new JComboBox(Bedtype);
    bedcombo.setBounds(200 , 230 , 150 , 30);
    bedcombo.setBackground(Color.WHITE);
    add(bedcombo);


    Add = new JButton("Add room");
    Add.setBounds(60 , 350 , 130 , 30);
    Add.setForeground(Color.WHITE);
    Add.setBackground(Color.BLACK);
    Add.addActionListener(this);
    add(Add);

    Cancel = new JButton("Cancel room");
    Cancel.setBounds(220 , 350 , 130 , 30);
    Cancel.setForeground(Color.WHITE);
    Cancel.setBackground(Color.BLACK);
    Cancel.addActionListener(this);
    add(Cancel);

    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/twelve.jpg"));
    JLabel image = new JLabel(i1);
    image.setBounds(400 , 50 , 500 , 350);
    add(image);


    setBounds( 330 , 200, 940 , 470);
    setLayout(null);
    setVisible(true);

}
public void actionPerformed(ActionEvent ae){
    if( ae.getSource() == Add){
        String roomnumber = tfroom.getText();
        String availaibility= (String)availaiblecombo.getSelectedItem();
        String cleaningstatus = (String) Cleancombo.getSelectedItem();
        String price = tfprice.getText();
        String bed_type = (String) bedcombo.getSelectedItem();

        try{
            Conn conn = new Conn();
            String str = "insert into room values('"+roomnumber+"' , '"+availaibility+"' , '"+cleaningstatus+"', '"+bed_type+"' ,'"+price+"') ";
           conn.s.executeUpdate(str);
            JOptionPane.showMessageDialog(null, "New room Added Sucessfully");



        }catch (Exception e){
            e.printStackTrace();
        }
    }else {
        setVisible(false);
    }
}

    public static void main(String[] args) {
        new AddRooms();
    }


}
