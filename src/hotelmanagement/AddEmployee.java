package hotelmanagement;
import javax.swing.*;
import java.awt.*;

public class AddEmployee extends JFrame {
    AddEmployee(){
        setLayout(null);
        setBounds( 350 , 200, 850 ,540 );
        getContentPane().setBackground(Color.WHITE);

        JLabel lblname = new JLabel("Name ");     //to give a label
        lblname.setBounds(60 , 30 , 120 , 30);
        lblname.setFont(new Font("Tahoma", Font.PLAIN,17));
        add(lblname);

        JTextField tfname = new JTextField();
        tfname.setBounds( 200, 30 , 150 , 30 );
        add(tfname);

        JLabel age = new JLabel( "Age ");
        age.setBounds( 60 , 80 ,120 , 30  );
        add(age);

        JTextField tfage = new JTextField();
        tfage.setBounds( 200, 80 , 150 , 30 );
        add(tfage);

        JLabel gender = new JLabel( "Age ");
        gender.setBounds( 60 , 130 ,120 , 30  );
        add(gender);

        JTextField tfgender = new JTextField();
        tfgender.setBounds( 200, 130 , 150 , 30 );
        add(tfage);


        JRadioButton rbmale = new JRadioButton("Male");
        rbmale.setBounds(200 , 130 , 70 , 30);
        rbmale.setFont(new Font("Tahoma", Font.PLAIN,14));
        rbmale.setBackground(Color.WHITE);
        add(rbmale);
        JRadioButton rbfemale = new JRadioButton("Female");
        rbfemale.setBounds(280 , 130 , 70 , 30);
        rbfemale.setFont(new Font("Tahoma", Font.PLAIN,14));
        rbfemale.setBackground(Color.WHITE);
        add(rbfemale);

        add(rbmale);


        setVisible(true);

    }

    public static void main(String[] args) {
       new AddEmployee();
    }

}
