package LoginPage;

import javax.swing.*;
import java.awt.*;

public class myAccount extends JFrame {
    private JPanel panel1;
    private JLabel title;
    public JLabel name;
    public JLabel username;
    public JLabel email;
    public JLabel street;
    public JLabel city;
    public JLabel country;
    public JLabel order1;
    public JLabel order2;
    public JLabel order3;
    public JLabel order4;
    public JLabel order5;
    public JButton button1;
    public JButton button2;
    public JButton button3;
    public JFrame myAccount;
    public JButton back;
    public JLabel last_name;
    public JLabel street_number;


    public myAccount() {
        myAccount = new JFrame("myAccount");
        myAccount.setDefaultCloseOperation(EXIT_ON_CLOSE);
        myAccount.setPreferredSize(new Dimension(1100, 800));
        myAccount.setResizable(false);
        myAccount.add(panel1);
        myAccount.pack();
        myAccount.setLocationRelativeTo(null);
        button1.setText("My orders");
        button3.setText("Log out");
        order1.setVisible(false);
        order2.setVisible(false);
        order3.setVisible(false);
        order4.setVisible(false);
        order5.setVisible(false);
        button2.setVisible(false);
        button1.setPreferredSize(new Dimension(40,20));
        button2.setPreferredSize(new Dimension(40,20));
        back.setPreferredSize(new Dimension(20,20));
        back.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        back.setContentAreaFilled(false);
        button2.setVisible(false);
        order1.setText("You did not place any order yet");
        button2.setText("No current order");


    }
}
