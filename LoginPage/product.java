package LoginPage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class product extends JFrame {
    public JLabel photo;
    public JLabel size;
    public JLabel name;
    public JLabel price;
    public JPanel panel1;

    public JButton buy;

    public JFrame product;
    public JButton back;
    public JToggleButton size1;
    public JToggleButton size2;
    public JToggleButton size3;
    public JToggleButton size4;
    public JToggleButton size5;
    public JToggleButton size7;
    public JToggleButton size6;
    public JButton cart;
    public JLabel unavailable;
    public JLabel number;
    public boolean[] pressed = new boolean[8];
    cart cartFrame = new cart();


    public product() {

        product = new JFrame("product");
        product.setDefaultCloseOperation(EXIT_ON_CLOSE);
        product.setPreferredSize(new Dimension(1100, 800));
        product.setResizable(false);
        product.add(panel1);
        product.pack();
        product.setLocationRelativeTo(null);
        back.setPreferredSize(new Dimension(10, 10));
        back.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        back.setContentAreaFilled(false);
        buy.setPreferredSize(new Dimension(5, 10));
        cart.setPreferredSize(new Dimension(15, 15));
        cart.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        cart.setContentAreaFilled(false);

        ImageIcon icon20 = new ImageIcon("/Users/perseaoana/Downloads/263142.png");
        Image img20 = icon20.getImage();
        Image imageScale20 = img20.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        ImageIcon scaleIcon20 = new ImageIcon(imageScale20);
        cart.setIcon(scaleIcon20);
        photo.setBorder(BorderFactory.createLineBorder(Color.black));
        buy.setEnabled(false);
        buy.setFocusPainted(false);
        for (int i = 0; i < 7; i++) {
            pressed[i] = false;
        }


        buy.setEnabled(false);
        buy.setFocusPainted(false);


    }


}
