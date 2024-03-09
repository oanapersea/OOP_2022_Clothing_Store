package LoginPage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class women extends JFrame {
    private JPanel panel;
    private JLabel logo;
    private JLabel text1;
    private JLabel logo2;
    private JLabel title;
    public JLabel photo10;
    public JLabel photo11;
    private JLabel name;
    private JLabel textp10;
    private JLabel textp11;
    private JLabel textp7;
    private JLabel textp8;
    private JLabel textp9;
    public JLabel photo7;
    public JLabel photo8;
    public JLabel photo9;
    public JLabel photo4;
    public JLabel photo5;
    public JLabel photo6;
    private JLabel textp4;
    private JLabel textp5;
    private JLabel textp6;
    public JLabel photo1;
    public JLabel photo2;
    public JLabel photo3;
    private JLabel textp1;
    private JLabel textp2;
    private JLabel textp3;
    private JScrollPane panelscroll;


    public JButton button1;
    public JButton fb;
    public JButton insta;
    public JButton tt;
    public JButton cart;

    public JFrame women;
    public JCheckBox checkBox1;
    public JCheckBox checkBox2;
    public JButton aboutUs;
    public JLabel number;
    private JScrollPane panelsc;


    public women() {
        women = new JFrame("women");


        women.setDefaultCloseOperation(EXIT_ON_CLOSE);
        women.setPreferredSize(new Dimension(1000, 800));
        women.setResizable(false);

        women.add(panel);
        women.pack();
        women.setLocationRelativeTo(null);
        logo.setPreferredSize(new Dimension(80, 80));
        title.setPreferredSize(new Dimension(80, 80));
        text1.setPreferredSize(new Dimension(80, 80));
        button1.setPreferredSize(new Dimension(30, 30));
        panelscroll.getVerticalScrollBar().setUnitIncrement(10);


        ImageIcon icon = new ImageIcon("/Users/perseaoana/Documents/intellij/incercare/products.png");
        Image img = icon.getImage();
        Image imageScale = img.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        ImageIcon scaleIcon = new ImageIcon(imageScale);
        logo.setIcon(scaleIcon);
        ImageIcon icon2 = new ImageIcon("/Users/perseaoana/Downloads/free-user-icon-3296-thumb.png");
        Image img2 = icon2.getImage();
        Image imageScale2 = img2.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        ImageIcon scaleIcon2 = new ImageIcon(imageScale2);
        button1.setIcon(scaleIcon2);


        textp1.setText("Jeans - 19.00$");
        ImageIcon iconc1 = new ImageIcon("/Users/perseaoana/Downloads/best-affordable-baggy-jeans-292437-1658170499758-main.700x0c.jpg");
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

        textp2.setText("Slippers - 8.00$");
        ImageIcon iconc2 = new ImageIcon("/Users/perseaoana/Desktop/Captură de ecran din 2023-01-05 la 21.27.57.png");
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

        textp3.setText("Dress - 20.00$");
        ImageIcon iconc3 = new ImageIcon("/Users/perseaoana/Desktop/Captură de ecran din 2023-01-06 la 01.06.14.png");
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

        textp4.setText("Skirt - 34.00$");
        ImageIcon iconc4 = new ImageIcon("/Users/perseaoana/Desktop/Captură de ecran din 2023-01-06 la 01.18.28.png");
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

        textp5.setText("Purse - 40.00$");
        ImageIcon iconc5 = new ImageIcon("/Users/perseaoana/Desktop/Captură de ecran din 2023-01-06 la 01.07.19.png");
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

        textp6.setText("Sunglasses - 23.00$");
        ImageIcon iconc6 = new ImageIcon("/Users/perseaoana/Desktop/Captură de ecran din 2023-01-06 la 00.47.38.png");
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

        textp7.setText("Gloves - 15.00$");
        ImageIcon iconc7 = new ImageIcon("/Users/perseaoana/Desktop/Captură de ecran din 2023-01-06 la 00.47.59.png");
        Image imgc7 = iconc7.getImage();
        Image imageScalec7 = imgc7.getScaledInstance(260, 350, Image.SCALE_SMOOTH);
        ImageIcon scaleIconc7 = new ImageIcon(imageScalec7);
        photo7.setIcon(scaleIconc7);
        photo7.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }
        });

        textp8.setText("Crewneck - 32.00$");
        ImageIcon iconc8 = new ImageIcon("/Users/perseaoana/Desktop/Captură de ecran din 2023-01-06 la 01.24.36.png");
        Image imgc8 = iconc8.getImage();
        Image imageScalec8 = imgc8.getScaledInstance(260, 350, Image.SCALE_SMOOTH);
        ImageIcon scaleIconc8 = new ImageIcon(imageScalec8);
        photo8.setIcon(scaleIconc8);
        photo8.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }
        });

        textp9.setText("Hat - 23.00$");
        ImageIcon iconc9 = new ImageIcon("/Users/perseaoana/Desktop/Captură de ecran din 2023-01-06 la 01.12.45.png");
        Image imgc9 = iconc9.getImage();
        Image imageScalec9 = imgc9.getScaledInstance(260, 350, Image.SCALE_SMOOTH);
        ImageIcon scaleIconc9 = new ImageIcon(imageScalec9);
        photo9.setIcon(scaleIconc9);
        photo9.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }
        });

        textp10.setText("Blouse - 28.00$");
        ImageIcon iconc10 = new ImageIcon("/Users/perseaoana/Desktop/Captură de ecran din 2023-01-06 la 00.52.19.png");
        Image imgc10 = iconc10.getImage();
        Image imageScalec10 = imgc10.getScaledInstance(260, 350, Image.SCALE_SMOOTH);
        ImageIcon scaleIconc10 = new ImageIcon(imageScalec10);
        photo10.setIcon(scaleIconc10);
        photo10.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }
        });

        textp11.setText("Swimsuit - 15.00$");
        ImageIcon iconc11 = new ImageIcon("/Users/perseaoana/Desktop/Captură de ecran din 2023-01-06 la 01.14.12.png");
        Image imgc11 = iconc11.getImage();
        Image imageScalec11 = imgc11.getScaledInstance(260, 350, Image.SCALE_SMOOTH);
        ImageIcon scaleIconc11 = new ImageIcon(imageScalec11);
        photo11.setIcon(scaleIconc11);
        photo11.addMouseListener(new MouseAdapter() {
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
        //cart.setBorderPainted(false);
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
