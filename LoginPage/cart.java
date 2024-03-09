package LoginPage;

import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class cart {

    private JPanel panel;
    public JLabel p1t1;
    public JLabel p1t2;
    public JLabel prod2;
    public JLabel p2t1;
    public JLabel p2t2;
    public JLabel prod3;
    public JLabel p3t1;
    public JLabel p3t2;
    public JLabel prod4;
    public JLabel p4t1;
    public JLabel p4t2;
    public JLabel prod5;
    public JLabel p5t1;
    public JLabel p5t2;
    public JLabel prod1;
    public JLabel prod6;
    public JLabel p6t1;
    public JLabel p6t2;
    public JLabel prod7;
    public JLabel p7t1;
    public JLabel p7t2;
    public JLabel prod8;
    public JLabel p8t1;
    public JLabel p8t2;
    public JLabel prod9;
    public JLabel p9t1;
    public JLabel p9t2;
    public JLabel prod10;
    public JLabel p10t1;
    public JLabel p10t2;
    public JLabel prod11;
    public JLabel p11t1;
    public JLabel p11t2;
    public JLabel prod12;
    public JLabel p12t1;
    public JLabel p12t2;
    public JLabel prod13;
    public JLabel p13t1;
    public JLabel p13t2;
    public JLabel prod15;
    public JLabel p15t1;
    public JLabel p15t2;
    public JLabel prod14;
    public JLabel p14t1;
    public JLabel p14t2;

    public JSpinner spinner1;
    public JSpinner spinner2;
    public JSpinner spinner3;
    public JSpinner spinner4;
    public JSpinner spinner5;
    public JSpinner spinner6;
    public JSpinner spinner7;
    public JSpinner spinner8;
    public JSpinner spinner9;
    public JSpinner spinner10;
    public JSpinner spinner11;
    public JSpinner spinner12;
    public JSpinner spinner13;
    public JSpinner spinner14;
    public JSpinner spinner15;
    public JLabel title;
    public JPanel panel1;
    public JPanel panel2;
    public JPanel panel3;
    public JPanel panel4;
    public JPanel panel5;
    public JPanel panel6;
    public JPanel panel7;
    public JPanel panel8;
    public JPanel panel10;
    public JPanel panel9;
    public JPanel panel14;
    public JPanel panel11;
    public JPanel panel12;
    public JPanel panel13;
    public JPanel panel15;
    public JLabel message;
    public JFrame cart;
    public JButton confirm;
    public JButton del1;
    public JButton del2;
    public JButton del3;
    public JButton del4;
    public JButton del5;
    public JButton del6;
    public JButton del7;
    public JButton del8;
    public JButton del9;
    public JButton del10;
    public JButton del11;
    public JButton del12;
    public JButton del13;
    public JButton del14;
    public JButton del15;
    private JScrollPane scrollPane1;
    public JButton back;
    public JToggleButton cash;
    public JToggleButton card;



    public cart() {
        cart = new JFrame("Cart");
        cart.setDefaultCloseOperation(EXIT_ON_CLOSE);
        cart.setPreferredSize(new Dimension(1100, 800));
        cart.setResizable(false);
        cart.add(scrollPane1);
        cart.pack();
        cart.setLocationRelativeTo(null);
        back.setPreferredSize(new Dimension(20,20));
        back.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        back.setContentAreaFilled(false);

        panel1.setVisible(false);
        panel2.setVisible(false);
        panel3.setVisible(false);
        panel4.setVisible(false);
        panel5.setVisible(false);
        panel6.setVisible(false);
        panel7.setVisible(false);
        panel8.setVisible(false);
        panel9.setVisible(false);
        panel10.setVisible(false);
        panel11.setVisible(false);
        panel12.setVisible(false);
        panel13.setVisible(false);
        panel14.setVisible(false);
        panel15.setVisible(false);
        spinner1.setVisible(false);
        spinner2.setVisible(false);
        spinner3.setVisible(false);
        spinner4.setVisible(false);
        spinner5.setVisible(false);
        del1.setVisible(false);
        del2.setVisible(false);
        del3.setVisible(false);
        del4.setVisible(false);
        del5.setVisible(false);
        del6.setVisible(false);
        del7.setVisible(false);
        del8.setVisible(false);
        del9.setVisible(false);
        del10.setVisible(false);
        del11.setVisible(false);
        del12.setVisible(false);
        del13.setVisible(false);
        del14.setVisible(false);
        del15.setVisible(false);
        confirm.setVisible(false);
        message.setText("Your cart is empty");
        cash.setVisible(false);
        card.setVisible(false);

    }


}
