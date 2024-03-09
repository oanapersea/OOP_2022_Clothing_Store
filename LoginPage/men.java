package LoginPage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class men {

    private JPanel panel1;
    private JLabel logo;
    private JLabel myAccount;
    public JButton account;
    public JButton cart;
    private JLabel logo2;
    private JLabel phone;
    public JLabel photo2;
    public JLabel photo1;
    private JLabel text1;
    private JLabel text2;
    public JLabel photo3;
    private JLabel text3;
    public JLabel photo4;
    public JLabel photo5;
    public JLabel photo6;
    private JLabel text4;
    private JLabel text5;
    private JLabel text6;
    public JFrame men;
    public JCheckBox checkBox1;
    public JCheckBox checkBox2;
    private JLabel name;
    public JButton fb;
    public JButton insta;
    public JButton tt;
    public JLabel number;

    public JButton aboutUs;
    private JScrollPane scrollpane;

    public men() {

        men = new JFrame("men");

        men.setDefaultCloseOperation(EXIT_ON_CLOSE);
        men.setPreferredSize(new Dimension(1000, 800));
        men.setResizable(false);

        men.add(panel1);
        men.pack();
        men.setLocationRelativeTo(null);
        logo.setPreferredSize(new Dimension(80, 80));
        name.setPreferredSize(new Dimension(80, 80));
        myAccount.setPreferredSize(new Dimension(80, 80));
        account.setPreferredSize(new Dimension(30, 30));
        scrollpane. getVerticalScrollBar(). setUnitIncrement(10);

        ImageIcon icon = new ImageIcon("/Users/perseaoana/Documents/intellij/incercare/products.png");
        Image img = icon.getImage();
        Image imageScale = img.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        ImageIcon scaleIcon = new ImageIcon(imageScale);
        logo.setIcon(scaleIcon);
        ImageIcon icon2 = new ImageIcon("/Users/perseaoana/Downloads/free-user-icon-3296-thumb.png");
        Image img2 = icon2.getImage();
        Image imageScale2 = img2.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        ImageIcon scaleIcon2 = new ImageIcon(imageScale2);
        account.setIcon(scaleIcon2);


        text1.setText("Slippers - 8.00$");
        ImageIcon iconc1 = new ImageIcon("/Users/perseaoana/Desktop/Captură de ecran din 2023-01-05 la 21.27.57.png");
        Image imgc1 = iconc1.getImage();
        Image imageScalec1 = imgc1.getScaledInstance(220, 350, Image.SCALE_SMOOTH);
        ImageIcon scaleIconc1 = new ImageIcon(imageScalec1);
        photo1.setIcon(scaleIconc1);
        photo1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }
        });

        text2.setText("T-Shirt - 26.00$");
        ImageIcon iconc2 = new ImageIcon("/Users/perseaoana/Desktop/Captură de ecran din 2023-01-05 la 19.34.49.png");
        Image imgc2 = iconc2.getImage();
        Image imageScalec2 = imgc2.getScaledInstance(260, 350, Image.SCALE_SMOOTH);
        ImageIcon scaleIconc2 = new ImageIcon(imageScalec2);
        photo2.setIcon(scaleIconc2);
        photo2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }
        });

        text3.setText("Shoes - 18.00$");
        ImageIcon iconc3 = new ImageIcon("/Users/perseaoana/Desktop/Captură de ecran din 2023-01-05 la 23.07.15.png");
        Image imgc3 = iconc3.getImage();
        Image imageScalec3 = imgc3.getScaledInstance(260, 350, Image.SCALE_SMOOTH);
        ImageIcon scaleIconc3 = new ImageIcon(imageScalec3);
        photo3.setIcon(scaleIconc3);
        photo3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }
        });

        text4.setText("Gloves - 15.00$");
        ImageIcon iconc4 = new ImageIcon("/Users/perseaoana/Desktop/Captură de ecran din 2023-01-06 la 00.47.59.png");
        Image imgc4 = iconc4.getImage();
        Image imageScalec4 = imgc4.getScaledInstance(260, 350, Image.SCALE_SMOOTH);
        ImageIcon scaleIconc4 = new ImageIcon(imageScalec4);
        photo4.setIcon(scaleIconc4);
        photo4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }
        });

        text5.setText("Hoodie - 40.00$");
        ImageIcon iconc5 = new ImageIcon("/Users/perseaoana/Desktop/Captură de ecran din 2023-01-06 la 01.09.18.png");
        Image imgc5 = iconc5.getImage();
        Image imageScalec5 = imgc5.getScaledInstance(260, 350, Image.SCALE_SMOOTH);
        ImageIcon scaleIconc5 = new ImageIcon(imageScalec5);
        photo5.setIcon(scaleIconc5);
        photo5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }
        });

        text6.setText("Shorts - 49.00$");
        ImageIcon iconc6 = new ImageIcon("/Users/perseaoana/Desktop/Captură de ecran din 2023-01-06 la 00.51.40.png");
        Image imgc6 = iconc6.getImage();
        Image imageScalec6 = imgc6.getScaledInstance(260, 350, Image.SCALE_SMOOTH);
        ImageIcon scaleIconc6 = new ImageIcon(imageScalec6);
        photo6.setIcon(scaleIconc6);
        photo6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }
        });


        ImageIcon icon16 = new ImageIcon("/Users/perseaoana/Documents/intellij/incercare/products.png");
        Image img16 = icon16.getImage();
        Image imageScale16 = img16.getScaledInstance(25, 25, Image.SCALE_SMOOTH);
        ImageIcon scaleIcon16 = new ImageIcon(imageScale16);
        logo2.setIcon(scaleIcon16);

        fb.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        fb.setContentAreaFilled(false);
        ImageIcon icon17 = new ImageIcon("/Users/perseaoana/Downloads/facebook-logo-clipart-flat-facebook-logo-png-icon-circle-22.png");
        Image img17 = icon17.getImage();
        Image imageScale17 = img17.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        ImageIcon scaleIcon17 = new ImageIcon(imageScale17);
        fb.setIcon(scaleIcon17);

        insta.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        insta.setContentAreaFilled(false);
        ImageIcon icon18 = new ImageIcon("/Users/perseaoana/Downloads/png-transparent-instagram-icon-computer-icons-logo-instagram-logo-miscellaneous-purple-text.png");
        Image img18 = icon18.getImage();
        Image imageScale18 = img18.getScaledInstance(45, 35, Image.SCALE_SMOOTH);
        ImageIcon scaleIcon18 = new ImageIcon(imageScale18);
        insta.setIcon(scaleIcon18);

        tt.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        tt.setContentAreaFilled(false);
        ImageIcon icon19 = new ImageIcon("/Users/perseaoana/Downloads/png-transparent-tiktok-tiktok-logo-tiktok-icon.png");
        Image img19 = icon19.getImage();
        Image imageScale19 = img19.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        ImageIcon scaleIcon19 = new ImageIcon(imageScale19);
        tt.setIcon(scaleIcon19);

        cart.setPreferredSize(new Dimension(15, 15));
        cart.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        cart.setContentAreaFilled(false);

        ImageIcon icon20 = new ImageIcon("/Users/perseaoana/Downloads/263142.png");
        Image img20 = icon20.getImage();
        Image imageScale20 = img20.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        ImageIcon scaleIcon20 = new ImageIcon(imageScale20);
        cart.setIcon(scaleIcon20);

        fb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openWebPage("https://ro-ro.facebook.com");
            }
        });


        insta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openWebPage("https://www.instagram.com");
            }
        });


        tt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openWebPage("https://www.tiktok.com/en/");
            }
        });


    }

    public void openWebPage(String url){
        try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
        }
        catch (java.io.IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
