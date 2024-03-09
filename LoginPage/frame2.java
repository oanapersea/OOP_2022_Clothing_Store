package LoginPage;

import javax.swing.*;
import java.awt.*;

public class frame2 extends JFrame{
   private JLabel signup;

   public JTextField textField1;
   public JTextField textField2;
   public JTextField textField3;
   public JTextField textField4;
   public JTextField textField5;
   public JTextField textField6;
   public JTextField textField7;
   public JTextField textField8;


   private JPanel panel1;
   private JLabel email;
   public JLabel userText;
   public JLabel password;
   public JLabel password2;
   private JLabel question;
   public JLabel warning;
   private JPanel panel2;
   public JPasswordField passwordField1;
   public JPasswordField passwordField2;
   public JButton loginBut;
   public JButton gotoframe1;
   public JLabel firstName;
   public JLabel state;
   public JLabel lastName;
   public JLabel city;
   public JLabel street;
   public JLabel number;
   public JFrame frame2;

public frame2() {

   frame2 = new JFrame("frame2");
   frame2.setDefaultCloseOperation(EXIT_ON_CLOSE);
   frame2.setPreferredSize(new Dimension(1000, 800));
   frame2.setResizable(false);

   frame2.add(panel1);
   frame2.pack();
   frame2.setLocationRelativeTo(null);
}


}
