package hotelmanagement;
import javax.swing.*;
import java.awt.*;

public class Dashboard extends JFrame{

    Dashboard(){
        setBounds(0 , 0 , 1550 , 1000);
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1550 , 1000 , Image.SCALE_DEFAULT);
        ImageIcon I3 = new ImageIcon(i2);
        JLabel image = new JLabel(I3);
        image.setBounds(0,0,1550, 1000);
        add(image);


        setVisible(true);
    }

    public static void main(String[] args) {
        new Dashboard();
    }

}
