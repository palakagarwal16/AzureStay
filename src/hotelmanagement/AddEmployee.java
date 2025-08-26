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

        JLabel lblage = new JLabel( "Age ");
        lblage.setBounds( 60 , 80 ,120 , 30  );
        lblage.setFont(new Font("Tahoma", Font.PLAIN,17));
        add(lblage);

        JTextField tfage = new JTextField();
        tfage.setBounds( 200, 80 , 150 , 30 );
        add(tfage);

        JLabel lblgender = new JLabel( "Gender ");
        lblgender.setBounds( 60 , 130 ,120 , 30  );
        lblgender.setFont(new Font("Tahoma", Font.PLAIN,17));
        add(lblgender);

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

        JLabel lbljob = new JLabel( "JOB ");
        lbljob.setBounds( 60 , 180 ,120 , 30  );
        rbfemale.setFont(new Font("Tahoma", Font.PLAIN,20));
        add(lbljob);

        String str[] = {" Front Desk Clerks" , " Waiters" , " Accountants", " Porters" , " HouseKeeping" , " KitchenStaff " , " RoomService" , " Cooks" , " Drivers ", " Maids" , "Garderners"};
        JComboBox cbjob = new JComboBox(str);
        cbjob.setBounds(200 , 180 , 150 , 30);
        cbjob.setBackground(Color.WHITE);
        add(cbjob);

        JLabel lblsalary = new JLabel( "Salary ");
        lblsalary.setBounds( 60 , 230 ,120 , 30  );
        lblsalary.setFont(new Font("Tahoma", Font.PLAIN,17));
        add(lblsalary);

        JTextField tfsalary = new JTextField();
        tfsalary.setBounds( 200, 230 , 150 , 30 );
        add(tfsalary);


        JLabel lblphone = new JLabel( "Phone ");
        lblphone.setBounds( 60 , 280 ,120 , 30  );
        lblphone.setFont(new Font("Tahoma", Font.PLAIN,17));
        add(lblphone);

        JTextField tfphone = new JTextField();
        tfphone.setBounds( 200, 280 , 150 , 30 );
        add(tfphone);

        JLabel lblemail = new JLabel( "Phone ");
        lblemail.setBounds( 60 , 330 ,120 , 30  );
        lblemail.setFont(new Font("Tahoma", Font.PLAIN,17));
        add(lblemail);

        JTextField tfemail = new JTextField();
        tfemail.setBounds( 200, 330 , 150 , 30 );
        add(tfemail);




        setVisible(true);

    }

    public static void main(String[] args) {
       new AddEmployee();
    }

}
