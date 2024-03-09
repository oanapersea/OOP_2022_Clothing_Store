package LoginPage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class aboutUs extends JFrame{

    private JPanel panel1;
    private JLabel logo;
    private JPanel nam;
    private JLabel name;
    private JLabel sediu;
    private JLabel contact;
    public JButton fb;
    public JButton insta;
    public JButton tt;
    private JLabel email;
    private JLabel d1;
    private JLabel d2;
    private JLabel d3;
    private JLabel d4;
    private JLabel d5;
    private JLabel d6;
    private JLabel d7;
    private JLabel d8;
    private JLabel d9;
    private JLabel d10;
    private JLabel d11;
    private JLabel d12;
    public JFrame aboutUs;
    public JButton back;

    public aboutUs() {
        aboutUs = new JFrame("clothes");
        aboutUs.setDefaultCloseOperation(EXIT_ON_CLOSE);
        aboutUs.setPreferredSize(new Dimension(1000, 800));
        aboutUs.setResizable(false);


        aboutUs.add(panel1);
        aboutUs.pack();
        aboutUs.setLocationRelativeTo(null);

        ImageIcon icon=new ImageIcon("/Users/perseaoana/Documents/intellij/incercare/products.png");
        Image img=icon.getImage();
        Image imageScale=img.getScaledInstance(50,50, Image.SCALE_SMOOTH);
        ImageIcon scaleIcon=new ImageIcon(imageScale);
        logo.setIcon(scaleIcon);

        d1.setText("The Hanger is more than just an online store.");
        d2.setText("We want to create for you an");
        d3.setText("inexhaustible source of inspiration.");
        d4.setText("Therefore, our company motto became");
        d5.setText("LIFEINSPIRATION STARTS HERE");
        d6.setText("In our online shop you will find");
        d7.setText("over 200.000 products from well known");
        d8.setText("sport brands (Adidas, Nike, New Balance),");
        d9.setText("jeans brands (Levi's, Lee, Wrangler),");
        d10.setText("and also from premium brands (Diesel, Guess Jeans, ");
        d11.setText("Boss, Hugo, Michael Kors, Valentino, DKNY,");
        d12.setText("Tommy Hilfiger), and this is only the beginning.");




        ImageIcon icon2=new ImageIcon("/Users/perseaoana/Downloads/pin.png");
        Image img2=icon2.getImage();
        Image imageScale2=img2.getScaledInstance(20,20, Image.SCALE_SMOOTH);
        ImageIcon scaleIcon2=new ImageIcon(imageScale2);
        sediu.setIcon(scaleIcon2);

        sediu.setText("Strada Papucesti nr.46B," + "\r" + " Cluj-Napoca," + " Romania");

        ImageIcon icon3=new ImageIcon("/Users/perseaoana/Downloads/phone-call-2.png");
        Image img3=icon3.getImage();
        Image imageScale3=img3.getScaledInstance(20,20, Image.SCALE_SMOOTH);
        ImageIcon scaleIcon3=new ImageIcon(imageScale3);
        contact.setIcon(scaleIcon3);

        contact.setText("0757436534");

        ImageIcon icon4=new ImageIcon("/Users/perseaoana/Downloads/email.png");
        Image img4=icon4.getImage();
        Image imageScale4=img4.getScaledInstance(20,20, Image.SCALE_SMOOTH);
        ImageIcon scaleIcon4=new ImageIcon(imageScale4);
        email.setIcon(scaleIcon4);

        email.setText("thehanger@gmail.com");

        fb.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        fb.setContentAreaFilled(false);
        ImageIcon icon17=new ImageIcon("/Users/perseaoana/Downloads/facebook.png");
        Image img17=icon17.getImage();
        Image imageScale17=img17.getScaledInstance(30,30, Image.SCALE_SMOOTH);
        ImageIcon scaleIcon17=new ImageIcon(imageScale17);
        fb.setIcon(scaleIcon17);

        insta.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        insta.setContentAreaFilled(false);
        ImageIcon icon18=new ImageIcon("/Users/perseaoana/Downloads/instagram.png");
        Image img18=icon18.getImage();
        Image imageScale18=img18.getScaledInstance(30,30, Image.SCALE_SMOOTH);
        ImageIcon scaleIcon18=new ImageIcon(imageScale18);
        insta.setIcon(scaleIcon18);

        tt.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        tt.setContentAreaFilled(false);
        ImageIcon icon19=new ImageIcon("/Users/perseaoana/Downloads/tik-tok.png");
        Image img19=icon19.getImage();
        Image imageScale19=img19.getScaledInstance(30,30, Image.SCALE_SMOOTH);
        ImageIcon scaleIcon19=new ImageIcon(imageScale19);
        tt.setIcon(scaleIcon19);

        back.setPreferredSize(new Dimension(10,10));
        back.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        back.setContentAreaFilled(false);

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
