package hotelmanagement;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Login extends JFrame implements ActionListener{

    JTextField username , password;
    JButton   cancel , btn ;
    Login(){
        getContentPane().setBackground(Color.WHITE); //background color
        setLayout(null);
        JLabel user = new JLabel("Username");
        user.setBounds(40, 20 , 100 , 50);
        add(user);

        username = new JTextField();
        username.setBounds(150 ,20 , 150 , 30 );
        add(username);

        JLabel pass = new JLabel("Password");
        pass.setBounds(40,70 , 100, 50);
        add(pass);

        password = new JTextField();
        password.setBounds(150 ,70 , 150 , 30 );
        add(password);

        btn = new JButton("Login here ");
        btn.setBounds(40 ,150 , 120 , 30);
        btn.setBackground(Color.BLACK);
        btn.setForeground(Color.WHITE);
        btn.addActionListener(this);
        add(btn);

        cancel = new JButton(" Cancel ");
        cancel.setBounds(180 ,150 , 120 , 30);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        add(cancel);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200 ,200 , Image.SCALE_DEFAULT );
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350 , 10 , 200 , 200);
        add(image);


        setBounds( 500 , 200 , 600 , 300);
        setVisible(true);
    }

     public void actionPerformed(ActionEvent ae){
         // we need to connect database with login username and password
         if(ae.getSource()== btn ) {
            String user =  username.getText();  //to get values by hitting mysql to identify if values are present
            String pass = password.getText();
            try{
                Connection c =  new Connection();
                String query = "select * from btn where username = " + user + " and password = " + pass + "";
            }
            catch (Exception e){
                e.printStackTrace();
            }
         }else if(ae.getSource() == cancel){
             setVisible(false);  //jo cancel click krte hi frame close krdega
         }
     }
    public static void main(String[] args) {
        Login l1 =new Login();
    }
}
