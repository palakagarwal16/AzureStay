package hotelmanagement;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AddEmployee extends JFrame implements ActionListener {

    JTextField tfname , tfage , tfgender  , tfemail , tfsalary , tfphone , tfadhaar;
    JRadioButton rbmale , rbfemale;
    JButton submit ;
    JComboBox cbjob;
    AddEmployee(){
        setLayout(null);
        setBounds( 350 , 200, 850 ,540 );
        getContentPane().setBackground(Color.WHITE);

        JLabel lblname = new JLabel("Name ");     //to give a label
        lblname.setBounds(60 , 30 , 120 , 30);
        lblname.setFont(new Font("Tahoma", Font.PLAIN,17));
        add(lblname);

        tfname = new JTextField();
        tfname.setBounds( 200, 30 , 150 , 30 );
        add(tfname);

        JLabel lblage = new JLabel( "Age ");
        lblage.setBounds( 60 , 80 ,120 , 30  );
        lblage.setFont(new Font("Tahoma", Font.PLAIN,17));
        add(lblage);

        tfage = new JTextField();
        tfage.setBounds( 200, 80 , 150 , 30 );
        add(tfage);

        JLabel lblgender = new JLabel( "GENDER ");
        lblgender.setBounds( 60 , 130 ,120 , 30  );
        lblgender.setFont(new Font("Tahoma", Font.PLAIN,17));
        add(lblgender);

        tfgender = new JTextField();
        tfgender.setBounds( 200, 130 , 150 , 30 );
        add(tfgender);


        rbmale = new JRadioButton("Male");
        rbmale.setBounds(200 , 130 , 70 , 30);
        rbmale.setFont(new Font("Tahoma", Font.PLAIN,14));
        rbmale.setBackground(Color.WHITE);
        add(rbmale);

        rbfemale = new JRadioButton("Female");
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

        JLabel lblsalary = new JLabel( "SALARY ");
        lblsalary.setBounds( 60 , 230 ,120 , 30  );
        lblsalary.setFont(new Font("Tahoma", Font.PLAIN,17));
        add(lblsalary);

        tfsalary = new JTextField();
        tfsalary.setBounds( 200, 230 , 150 , 30 );
        add(tfsalary);


        JLabel lblphone = new JLabel( "PHONE ");
        lblphone.setBounds( 60 , 280 ,120 , 30  );
        lblphone.setFont(new Font("Tahoma", Font.PLAIN,17));
        add(lblphone);

        tfphone = new JTextField();
        tfphone.setBounds( 200, 280 , 150 , 30 );
        add(tfphone);

        JLabel lblemail = new JLabel( "Phone ");
        lblemail.setBounds( 60 , 330 ,120 , 30  );
        lblemail.setFont(new Font("Tahoma", Font.PLAIN,17));
        add(lblemail);

        tfemail = new JTextField();
        tfemail.setBounds( 200, 330 , 150 , 30 );
        add(tfemail);

        JLabel lbladhaar = new JLabel( "ADHAAR ");
        lbladhaar.setBounds( 60 , 380 ,120 , 30  );
        lbladhaar.setFont(new Font("Tahoma", Font.PLAIN,17));
        add(lbladhaar);

        tfadhaar = new JTextField();
        tfadhaar.setBounds( 200, 380 , 150 , 30 );
        add(tfadhaar);

        submit = new JButton("SUBMIT ");
       submit.setBackground(Color.BLACK);
       submit.setForeground(Color.WHITE);
       submit.setBounds( 200 , 430 , 150 , 30);
       add(submit);


       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/tenth.jpg"));
       Image i2 = i1.getImage().getScaledInstance(450 , 450 , Image.SCALE_DEFAULT);
       ImageIcon i3 = new ImageIcon(i2);
       JLabel image = new JLabel(i3);
       image.setBounds(380 , 60 , 450 , 370);
       add(image);

        setVisible(true);

    }

    public void actionPerformed(){
    String name = tfname.getText();
    String age = tfage.getText();
    String salary = tfsalary.getText();
    String phone = tfphone.getText();
    String email = tfemail.getText();
    String adhaar = tfadhaar.getText();

    }

    public static void main(String[] args) {
       new AddEmployee();
    }

}
