package hotelmanagement;

import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {
    Login(){
        getContentPane().setBackground(Color.WHITE); //background color
        setLayout(null);
        JLabel user = new JLabel("Username");
        user.setBounds(40, 20 , 100 , 50);
        add(user);

        JTextField username = new JTextField();
        username.setBounds(150 ,20 , 150 , 30 );
        add(username);

        JLabel pass = new JLabel("Password");
        pass.setBounds(40,70 , 100, 50);
        add(pass);

        JTextField password = new JTextField();
        password.setBounds(150 ,70 , 150 , 30 );
        add(password);

        JButton btn = new JButton("click me ");
        btn.setBounds(40 ,120 , 150 , 30);
//        btn.setBackground(Color.BLACK);
//        btn.setBackground(Color.WHITE);
        add(btn);

        setBounds( 500 , 200 , 600 , 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        Login l1 =new Login();
    }
}
