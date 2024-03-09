package LoginPage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class clothes extends JFrame {
    private JPanel panel1 ;
    private JPanel body;
    private JPanel logo;
    private JLabel label1 ;
    private JLabel label2 ;
    private JLabel label4 ;
    public JButton butt1;
    public JButton butt2;
    public JButton butt3;
    public JButton butt4;
    public JButton butt5;
    public JButton butt6;

    public JLabel clothing1;
    public JLabel clothing2;
    public JLabel clothing3;
    private JLabel name1;
    private JLabel name2;
    private JLabel name3;
    public JLabel clothing4;
    public JLabel clothing5;
    public JLabel clothing6;
    public JLabel clothing7;
    public JLabel clothing8;
    public JLabel clothing9;
    public JLabel clothing10;
    public JLabel clothing11;
    public JLabel clothing12;
    public JLabel clothing13;
    public JLabel clothing14;
    public JLabel clothing15;
    private JLabel name4;
    private JLabel name6;
    private JLabel name5;
    private JLabel name7;
    private JLabel name8;
    private JLabel name9;
    private JLabel name10;
    private JLabel name11;
    private JLabel name12;
    private JLabel name13;
    private JLabel name14;
    private JLabel name15;

    private JLabel sigla;
    private JLabel phone;

    public JCheckBox checkBox1;
    public JCheckBox checkBox2;
    public JLabel number;
    private JScrollPane scrollpane;
    public aboutUs frame=new aboutUs();

    public JFrame clothes;


    public clothes() {
        clothes = new JFrame("clothes");
        clothes.setDefaultCloseOperation(EXIT_ON_CLOSE);
        clothes.setPreferredSize(new Dimension(1000, 800));
        clothes.setResizable(false);

        clothes.add(panel1);
        clothes.pack();
        clothes.setLocationRelativeTo(null);
        label1.setPreferredSize(new Dimension(80, 80));
        label2.setPreferredSize(new Dimension(80, 80));
        label4.setPreferredSize(new Dimension(80, 80));
        butt1.setPreferredSize(new Dimension(30, 30));
        scrollpane. getVerticalScrollBar(). setUnitIncrement(10);

        ImageIcon icon=new ImageIcon("/Users/perseaoana/Documents/intellij/incercare/products.png");
        Image img=icon.getImage();
        Image imageScale=img.getScaledInstance(50,50, Image.SCALE_SMOOTH);
        ImageIcon scaleIcon=new ImageIcon(imageScale);
        label1.setIcon(scaleIcon);
        ImageIcon icon2=new ImageIcon("/Users/perseaoana/Downloads/free-user-icon-3296-thumb.png");
        Image img2=icon2.getImage();
        Image imageScale2=img2.getScaledInstance(50,50, Image.SCALE_SMOOTH);
        ImageIcon scaleIcon2=new ImageIcon(imageScale2);
        butt1.setIcon(scaleIcon2);



        clothing1.setPreferredSize(new Dimension(220, 220));
        clothing2.setPreferredSize(new Dimension(220, 220));
        clothing3.setPreferredSize(new Dimension(220, 220));
        name1.setPreferredSize(new Dimension(80, 80));
        name2.setPreferredSize(new Dimension(80, 80));
        name3.setPreferredSize(new Dimension(80, 80));

        ImageIcon iconc1=new ImageIcon("/Users/perseaoana/Downloads/best-affordable-baggy-jeans-292437-1658170499758-main.700x0c.jpg");
        Image imgc1=iconc1.getImage();
        Image imageScalec1=imgc1.getScaledInstance(220,350, Image.SCALE_SMOOTH);
        ImageIcon scaleIconc1=new ImageIcon(imageScalec1);
        clothing1.setIcon(scaleIconc1);




        ImageIcon iconc2=new ImageIcon("/Users/perseaoana/Desktop/Captură de ecran din 2023-01-05 la 21.27.57.png");
        Image imgc2=iconc2.getImage();
        Image imageScalec2=imgc2.getScaledInstance(260,350, Image.SCALE_SMOOTH);
        ImageIcon scaleIconc2=new ImageIcon(imageScalec2);
        clothing2.setIcon(scaleIconc2);
        clothing2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }
        });



        ImageIcon iconc3=new ImageIcon("/Users/perseaoana/Desktop/Captură de ecran din 2023-01-05 la 19.34.49.png");
        Image imgc3=iconc3.getImage();
        Image imageScalec3=imgc3.getScaledInstance(260,350, Image.SCALE_SMOOTH);
        ImageIcon scaleIconc3=new ImageIcon(imageScalec3);
        clothing3.setIcon(scaleIconc3);
        clothing3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }
        });


        ImageIcon iconc4=new ImageIcon("/Users/perseaoana/Desktop/Captură de ecran din 2023-01-06 la 01.06.14.png");
        Image imgc4=iconc4.getImage();
        Image imageScalec4=imgc4.getScaledInstance(260,350, Image.SCALE_SMOOTH);
        ImageIcon scaleIconc4=new ImageIcon(imageScalec4);
        clothing4.setIcon(scaleIconc4);
        clothing4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }
        });



        ImageIcon iconc5=new ImageIcon("/Users/perseaoana/Desktop/Captură de ecran din 2023-01-06 la 01.18.28.png");
        Image imgc5=iconc5.getImage();
        Image imageScalec5=imgc5.getScaledInstance(260,350, Image.SCALE_SMOOTH);
        ImageIcon scaleIconc5=new ImageIcon(imageScalec5);
        clothing5.setIcon(scaleIconc5);
        clothing5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }
        });



        ImageIcon iconc6=new ImageIcon("/Users/perseaoana/Desktop/Captură de ecran din 2023-01-06 la 01.07.19.png");
        Image imgc6=iconc6.getImage();
        Image imageScalec6=imgc6.getScaledInstance(260,350, Image.SCALE_SMOOTH);
        ImageIcon scaleIconc6=new ImageIcon(imageScalec6);
        clothing6.setIcon(scaleIconc6);
        clothing6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }
        });



        ImageIcon iconc7=new ImageIcon("/Users/perseaoana/Desktop/Captură de ecran din 2023-01-05 la 23.07.15.png");
        Image imgc7=iconc7.getImage();
        Image imageScalec7=imgc7.getScaledInstance(260,350, Image.SCALE_SMOOTH);
        ImageIcon scaleIconc7=new ImageIcon(imageScalec7);
        clothing7.setIcon(scaleIconc7);
        clothing7.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }
        });


        ImageIcon iconc8=new ImageIcon("/Users/perseaoana/Desktop/Captură de ecran din 2023-01-06 la 00.47.38.png");
        Image imgc8=iconc8.getImage();
        Image imageScalec8=imgc8.getScaledInstance(260,350, Image.SCALE_SMOOTH);
        ImageIcon scaleIconc8=new ImageIcon(imageScalec8);
        clothing8.setIcon(scaleIconc8);
        clothing8.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }
        });


        ImageIcon iconc9=new ImageIcon("/Users/perseaoana/Desktop/Captură de ecran din 2023-01-06 la 00.47.59.png");
        Image imgc9=iconc9.getImage();
        Image imageScalec9=imgc9.getScaledInstance(260,350, Image.SCALE_SMOOTH);
        ImageIcon scaleIconc9=new ImageIcon(imageScalec9);
        clothing9.setIcon(scaleIconc9);
        clothing9.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }
        });

        ImageIcon iconc10=new ImageIcon("/Users/perseaoana/Desktop/Captură de ecran din 2023-01-06 la 01.09.18.png");
        Image imgc10=iconc10.getImage();
        Image imageScalec10=imgc10.getScaledInstance(260,350, Image.SCALE_SMOOTH);
        ImageIcon scaleIconc10=new ImageIcon(imageScalec10);
        clothing10.setIcon(scaleIconc10);
        clothing10.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }
        });



        ImageIcon iconc11=new ImageIcon("/Users/perseaoana/Desktop/Captură de ecran din 2023-01-06 la 01.24.36.png");
        Image imgc11=iconc11.getImage();
        Image imageScalec11=imgc11.getScaledInstance(260,350, Image.SCALE_SMOOTH);
        ImageIcon scaleIconc11=new ImageIcon(imageScalec11);
        clothing11.setIcon(scaleIconc11);
        clothing11.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }
        });


        ImageIcon iconc12=new ImageIcon("/Users/perseaoana/Desktop/Captură de ecran din 2023-01-06 la 01.12.45.png");
        Image imgc12=iconc12.getImage();
        Image imageScalec12=imgc12.getScaledInstance(260,350, Image.SCALE_SMOOTH);
        ImageIcon scaleIconc12=new ImageIcon(imageScalec12);
        clothing12.setIcon(scaleIconc12);
        clothing12.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }
        });



        ImageIcon iconc13=new ImageIcon("/Users/perseaoana/Desktop/Captură de ecran din 2023-01-06 la 00.51.40.png");
        Image imgc13=iconc13.getImage();
        Image imageScalec13=imgc13.getScaledInstance(260,350, Image.SCALE_SMOOTH);
        ImageIcon scaleIconc13=new ImageIcon(imageScalec13);
        clothing13.setIcon(scaleIconc13);
        clothing13.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }
        });



        ImageIcon iconc14=new ImageIcon("/Users/perseaoana/Desktop/Captură de ecran din 2023-01-06 la 00.52.19.png");
        Image imgc14=iconc14.getImage();
        Image imageScalec14=imgc14.getScaledInstance(260,350, Image.SCALE_SMOOTH);
        ImageIcon scaleIconc14=new ImageIcon(imageScalec14);
        clothing14.setIcon(scaleIconc14);
        clothing14.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }
        });



        ImageIcon iconc15=new ImageIcon("/Users/perseaoana/Desktop/Captură de ecran din 2023-01-06 la 01.14.12.png");
        Image imgc15=iconc15.getImage();
        Image imageScalec15=imgc15.getScaledInstance(260,350, Image.SCALE_SMOOTH);
        ImageIcon scaleIconc15=new ImageIcon(imageScalec15);
        clothing15.setIcon(scaleIconc15);
        clothing15.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }
        });



        ImageIcon icon16=new ImageIcon("/Users/perseaoana/Documents/intellij/incercare/products.png");
        Image img16=icon16.getImage();
        Image imageScale16=img16.getScaledInstance(25,25, Image.SCALE_SMOOTH);
        ImageIcon scaleIcon16=new ImageIcon(imageScale16);
        sigla.setIcon(scaleIcon16);

        butt2.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        butt2.setContentAreaFilled(false);
        ImageIcon icon17=new ImageIcon("/Users/perseaoana/Downloads/facebook-logo-clipart-flat-facebook-logo-png-icon-circle-22.png");
        Image img17=icon17.getImage();
        Image imageScale17=img17.getScaledInstance(30,30, Image.SCALE_SMOOTH);
        ImageIcon scaleIcon17=new ImageIcon(imageScale17);
        butt2.setIcon(scaleIcon17);

        butt3.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        butt3.setContentAreaFilled(false);
        ImageIcon icon18=new ImageIcon("/Users/perseaoana/Downloads/png-transparent-instagram-icon-computer-icons-logo-instagram-logo-miscellaneous-purple-text.png");
        Image img18=icon18.getImage();
        Image imageScale18=img18.getScaledInstance(45,35, Image.SCALE_SMOOTH);
        ImageIcon scaleIcon18=new ImageIcon(imageScale18);
        butt3.setIcon(scaleIcon18);

        butt4.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        butt4.setContentAreaFilled(false);
        ImageIcon icon19=new ImageIcon("/Users/perseaoana/Downloads/png-transparent-tiktok-tiktok-logo-tiktok-icon.png");
        Image img19=icon19.getImage();
        Image imageScale19=img19.getScaledInstance(30,30, Image.SCALE_SMOOTH);
        ImageIcon scaleIcon19=new ImageIcon(imageScale19);
        butt4.setIcon(scaleIcon19);

        butt6.setPreferredSize(new Dimension(15,15));
        butt6.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        butt6.setContentAreaFilled(false);
        //cart.setBorderPainted(false);
        ImageIcon icon20=new ImageIcon("/Users/perseaoana/Downloads/263142.png");
        Image img20=icon20.getImage();
        Image imageScale20=img20.getScaledInstance(30,30, Image.SCALE_SMOOTH);
        ImageIcon scaleIcon20=new ImageIcon(imageScale20);
        butt6.setIcon(scaleIcon20);

        butt2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openWebPage("https://ro-ro.facebook.com");
            }
        });


        butt3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openWebPage("https://www.instagram.com");
            }
        });


        butt4.addActionListener(new ActionListener() {
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

