package hotelmanagement;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class adddrivers extends JFrame implements ActionListener {
    JButton Add , Cancel ;
    JTextField tfname , tfage ,tfcar , tfCarcompany , tfLOC , tfcarmodel ;
    JComboBox gendercombo , availaiblecombo;
    adddrivers(){

        getContentPane().setBackground(Color.WHITE);

        JLabel heading = new JLabel( "ADD DRIVERS");
        heading.setBounds( 150 , 30 , 200 , 20);
        heading.setFont(new Font("Tahoma" , Font.BOLD , 18));
        add(heading);

        JLabel lblname= new JLabel( "Name" );
        lblname.setBounds( 60 , 70 , 120 , 20);
        lblname.setFont(new Font("Tahoma" , Font.BOLD , 18));
        add(lblname);
        tfname = new JTextField( );
        tfname.setBounds(200 , 70 , 150 , 30);
        add(tfname);




        JLabel lblage = new JLabel( "Age" );
        lblage.setBounds( 60 , 110 , 120 , 20);
        lblage.setFont(new Font("Tahoma" , Font.BOLD , 18));
        add(lblage);
        tfage = new JTextField( );
        tfage.setBounds(200 , 110 , 120 , 30);
        add(tfage);



        JLabel Gender = new JLabel( "Gender" );
        Gender.setBounds( 60 , 150 , 120 , 20);
        Gender.setFont(new Font("Tahoma" , Font.BOLD , 18));
        add(Gender);
        String availaibleOptions[] = { " Male ", " Female "};
        gendercombo = new JComboBox(availaibleOptions);
        gendercombo.setBounds(200 , 150 , 120 , 20);
        gendercombo.setBackground(Color.WHITE);
        add(gendercombo);


        JLabel carcompany = new JLabel( "Car Company" );
        carcompany.setBounds( 60 , 190 , 120 , 20);
        carcompany.setFont(new Font("Tahoma" , Font.BOLD , 18));
        add(carcompany);
        tfcar = new JTextField( );
        tfcar.setBounds(200 , 190 , 120 , 30);
        add(tfcar);


        JLabel Location = new JLabel( "Location" );
        Location.setBounds( 60 , 230 , 120 , 20);
        Location.setFont(new Font("Tahoma" , Font.BOLD , 18));
        add(Location);
        tfLOC = new JTextField( );
        tfLOC.setBounds(200 , 230 , 120 , 30);
        add(tfLOC);

        JLabel carmodel= new JLabel( "Car Model " );
        carmodel.setBounds( 60 , 270 , 120 , 20);
        carmodel.setFont(new Font("Tahoma" , Font.BOLD , 18));
        add(carmodel);
        tfcarmodel = new JTextField( );
        tfcarmodel.setBounds(200 , 270 , 120 , 30);
        add(tfcarmodel);


        JLabel availaible = new JLabel( "Availaible" );
        availaible.setBounds( 60 , 310 , 120 , 20);
        availaible.setFont(new Font("Tahoma" , Font.BOLD , 18));
        add(availaible);
        String Options[] = { " Availaible ", " Busy "};
        availaiblecombo = new JComboBox(Options);
        availaiblecombo.setBounds(200 , 310 , 120 , 20);
        availaiblecombo.setBackground(Color.WHITE);
        add(availaiblecombo);



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

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/eleven.jpg"));
        Image i2 = i1.getImage().getScaledInstance(500 , 300 , Image.SCALE_DEFAULT);
        ImageIcon I3 = new ImageIcon(i2);
        JLabel image = new JLabel(I3);
        image.setBounds(400 , 50 , 500 , 350);
        add(image);


        setBounds( 400 , 200, 1000 , 470);
        setLayout(null);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent ae){
        if( ae.getSource() == Add){
            String name = tfname.getText();
            String gender= (String)gendercombo.getSelectedItem();
            String carcompany = tfCarcompany.getText();
            String age = tfage.getText();
            String Location = tfLOC.getText();
            String availaiblecombo = (String)gendercombo.getSelectedItem();


            try{
                Conn conn = new Conn();
                String str = "insert into room values('"+name+"' , '"+age+"' , '"+gender+"', '"+Location+"' ,'"+carcompany+"' , '"+availaiblecombo+"') ";
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
        new adddrivers();
    }
}
