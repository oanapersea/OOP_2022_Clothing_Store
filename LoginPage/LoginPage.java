package LoginPage;

import javax.swing.*;
import javax.swing.plaf.nimbus.State;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


public class LoginPage extends JFrame {
    private JTextField userText;
    private JPanel panel1;
    private JPasswordField password;
    public JButton loginButton;
    private JFrame frame;
    public JButton signUpButton;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    JFrame aux = new JFrame();
    JFrame aux2 = new JFrame();
    String username = new String();
    String usernameValid = new String();
    int[] count = new int[1];
    int[] nrOfPanels = new int[1];
    int[] nrOfLabels = new int[1];
    int[] nrOfPhotos = new int[1];
    int[] nrOfSpinners = new int[1];
    int[] nrOfButtons = new int[1];
    int[] cartIndexes = new int[1];
    int[] index = new int[16];
    int[] pressed = new int[106];
    cart cartFrame = new cart();
    product prodFrame = new product();

    JPanel[] panelArray = new JPanel[16];
    JLabel[] labelArray = new JLabel[31];
    JLabel[] photoArray = new JLabel[16];
    JSpinner[] spinnerArray = new JSpinner[16];
    JButton[] buttonArray = new JButton[16];
    product[] frameArray = new product[16];

    int[] x = new int[1];

    int nrOfProducts[] = new int[1];
    int[][] productArray = new int[16][8];
    int[] productNumber = new int[1];

    String usernameForOrder = new String();
    int payment = 1;
    int[] prodIndex = new int[1];
    myAccount accountFrame = new myAccount();
    int[] labelInd = new int[1];


    public LoginPage() {

        clothes framee = new clothes();
        aboutUs frameAbout = new aboutUs();
        women frameeee = new women();
        men framemen = new men();
        product frameJeans = new product();
        product frameSlippers = new product();
        product frameTShirt = new product();
        product frameDress = new product();
        product frameSkirt = new product();
        product framePurse = new product();
        product frameShoes = new product();
        product frameSunglasses = new product();
        product frameGloves = new product();
        product frameHoodie = new product();
        product frameCrewneck = new product();
        product frameHat = new product();
        product frameShorts = new product();
        product frameBlouse = new product();
        product frameSwimsuit = new product();


        framee.butt1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                aux2 = framee.clothes;
                framee.clothes.dispose();
                accountFrame.button2.setVisible(false);
                accountFrame.order1.setVisible(false);
                accountFrame.order2.setVisible(false);
                ;
                accountFrame.order3.setVisible(false);
                accountFrame.order4.setVisible(false);
                accountFrame.order5.setVisible(false);
                accountFrame.myAccount.setVisible(true);

                myOrders(accountFrame);
            }
        });


        framemen.account.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                aux2 = framemen.men;
                framemen.men.dispose();
                accountFrame.myAccount.setVisible(true);

                myOrders(accountFrame);
            }
        });

        frameeee.button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                aux2 = frameeee.women;
                frameeee.women.dispose();
                accountFrame.myAccount.setVisible(true);

                myOrders(accountFrame);
            }
        });

        accountFrame.button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                accountFrame.myAccount.dispose();
                frame.setVisible(true);
                userText.setText("");
                password.setText("");
                loginButton.setEnabled(false);
                loginButton.setFocusPainted(false);

            }
        });
        accountFrame.back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                accountFrame.myAccount.dispose();
                aux2.setVisible(true);
            }
        });

        accountFrame.button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                accountFrame.button2.setVisible(true);
            }
        });

        accountFrame.button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                allOrders(accountFrame);
            }
        });

        framee.butt6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                framee.clothes.dispose();
                cartFrame.cart.setVisible(true);
            }
        });

        frameeee.cart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frameeee.women.dispose();
                cartFrame.cart.setVisible(true);
            }
        });


        framemen.cart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                framemen.men.dispose();
                cartFrame.cart.setVisible(true);
            }
        });


        getProduct("Jeans", frameJeans, "32", "34", "36", "38", "40", "42", "44", "/Users/perseaoana/Downloads/best-affordable-baggy-jeans-292437-1658170499758-main.700x0c.jpg");
        getProduct("Slippers", frameSlippers, "36", "37", "38", "39", "40", "41", "42", "/Users/perseaoana/Desktop/Captură de ecran din 2023-01-05 la 21.27.57.png");
        getProduct("T-Shirt", frameTShirt, "XS", "S", "M", "L", "XL", "XXL", "3XL", "/Users/perseaoana/Desktop/Captură de ecran din 2023-01-05 la 19.34.49.png");
        getProduct("Dress", frameDress, "XXS", "XS", "S", "M", "L", "XL", "XXL", "/Users/perseaoana/Desktop/Captură de ecran din 2023-01-06 la 01.06.14.png");
        getProduct("Skirt", frameSkirt, "32", "34", "36", "38", "40", "42", "44", "/Users/perseaoana/Desktop/Captură de ecran din 2023-01-06 la 01.18.28.png");
        getProduct("Purse", framePurse, "one size", "", " ", "", "", "", "", "/Users/perseaoana/Desktop/Captură de ecran din 2023-01-06 la 01.07.19.png");
        framePurse.size2.setBorder(BorderFactory.createEmptyBorder(8, 30, 8, 30));
        framePurse.size3.setBorder(BorderFactory.createEmptyBorder(8, 30, 8, 30));
        framePurse.size4.setBorder(BorderFactory.createEmptyBorder(8, 30, 8, 30));
        framePurse.size5.setBorder(BorderFactory.createEmptyBorder(8, 30, 8, 30));
        framePurse.size6.setBorder(BorderFactory.createEmptyBorder(8, 30, 8, 30));
        framePurse.size7.setBorder(BorderFactory.createEmptyBorder(8, 30, 8, 30));

        getProduct("Shoes", frameShoes, "37", "38", "39", "40", "41", "42", "43", "/Users/perseaoana/Desktop/Captură de ecran din 2023-01-05 la 23.07.15.png");
        getProduct("Sunglasses", frameSunglasses, "one size", "", "", "", "", "", "", "/Users/perseaoana/Desktop/Captură de ecran din 2023-01-06 la 00.47.38.png");
        frameSunglasses.size2.setBorder(BorderFactory.createEmptyBorder(4, 30, 4, 30));
        frameSunglasses.size3.setBorder(BorderFactory.createEmptyBorder(4, 30, 4, 30));
        frameSunglasses.size4.setBorder(BorderFactory.createEmptyBorder(4, 30, 4, 30));
        frameSunglasses.size5.setBorder(BorderFactory.createEmptyBorder(4, 30, 4, 30));
        frameSunglasses.size6.setBorder(BorderFactory.createEmptyBorder(4, 30, 4, 30));
        frameSunglasses.size7.setBorder(BorderFactory.createEmptyBorder(4, 30, 4, 30));

        getProduct("Gloves", frameGloves, "XXS", "XS", "S", "M", "L", "XL", "XXL", "/Users/perseaoana/Desktop/Captură de ecran din 2023-01-06 la 00.47.59.png");
        getProduct("Hoodie", frameHoodie, "XS", "S", "M", "L", "XL", "XXL", "3XL", "/Users/perseaoana/Desktop/Captură de ecran din 2023-01-06 la 01.09.18.png");
        getProduct("Crewneck", frameCrewneck, "XXS", "XS", "S", "M", "L", "XL", "XXL", "/Users/perseaoana/Desktop/Captură de ecran din 2023-01-06 la 01.24.36.png");
        getProduct("Hat", frameHat, "one size", "", "", "", "", "", "", "/Users/perseaoana/Desktop/Captură de ecran din 2023-01-06 la 01.12.45.png");
        frameHat.size2.setBorder(BorderFactory.createEmptyBorder(4, 30, 4, 30));
        frameHat.size3.setBorder(BorderFactory.createEmptyBorder(4, 30, 4, 30));
        frameHat.size4.setBorder(BorderFactory.createEmptyBorder(4, 30, 4, 30));
        frameHat.size5.setBorder(BorderFactory.createEmptyBorder(4, 30, 4, 30));
        frameHat.size6.setBorder(BorderFactory.createEmptyBorder(4, 30, 4, 30));
        frameHat.size7.setBorder(BorderFactory.createEmptyBorder(4, 30, 4, 30));

        getProduct("Shorts", frameShorts, "32", "34", "36", "38", "40", "42", "44", "/Users/perseaoana/Desktop/Captură de ecran din 2023-01-06 la 00.51.40.png");
        getProduct("Blouse", frameBlouse, "XXS", "XS", "S", "M", "L", "XL", "XXL", "/Users/perseaoana/Desktop/Captură de ecran din 2023-01-06 la 00.52.19.png");
        getProduct("Swimsuit", frameSwimsuit, "XXS", "XS", "S", "M", "L", "XL", "XXL", "/Users/perseaoana/Desktop/Captură de ecran din 2023-01-06 la 01.14.12.png");


        panelArray[0] = cartFrame.panel1;
        panelArray[1] = cartFrame.panel2;
        panelArray[2] = cartFrame.panel3;
        panelArray[3] = cartFrame.panel4;
        panelArray[4] = cartFrame.panel5;
        panelArray[5] = cartFrame.panel6;
        panelArray[6] = cartFrame.panel7;
        panelArray[7] = cartFrame.panel8;
        panelArray[8] = cartFrame.panel9;
        panelArray[9] = cartFrame.panel10;
        panelArray[10] = cartFrame.panel11;
        panelArray[11] = cartFrame.panel12;
        panelArray[12] = cartFrame.panel13;
        panelArray[13] = cartFrame.panel14;
        panelArray[14] = cartFrame.panel15;

        labelArray[0] = cartFrame.p1t1;
        labelArray[1] = cartFrame.p1t2;
        labelArray[2] = cartFrame.p2t1;
        labelArray[3] = cartFrame.p2t2;
        labelArray[4] = cartFrame.p3t1;
        labelArray[5] = cartFrame.p3t2;
        labelArray[6] = cartFrame.p4t1;
        labelArray[7] = cartFrame.p4t2;
        labelArray[8] = cartFrame.p5t1;
        labelArray[9] = cartFrame.p5t2;
        labelArray[10] = cartFrame.p6t1;
        labelArray[11] = cartFrame.p6t2;
        labelArray[12] = cartFrame.p7t1;
        labelArray[13] = cartFrame.p7t2;
        labelArray[14] = cartFrame.p8t1;
        labelArray[15] = cartFrame.p8t2;
        labelArray[16] = cartFrame.p9t1;
        labelArray[17] = cartFrame.p9t2;
        labelArray[18] = cartFrame.p10t1;
        labelArray[19] = cartFrame.p10t2;
        labelArray[20] = cartFrame.p11t1;
        labelArray[21] = cartFrame.p11t2;
        labelArray[22] = cartFrame.p12t1;
        labelArray[23] = cartFrame.p12t2;
        labelArray[24] = cartFrame.p13t1;
        labelArray[25] = cartFrame.p13t2;
        labelArray[26] = cartFrame.p14t1;
        labelArray[27] = cartFrame.p14t2;
        labelArray[28] = cartFrame.p15t1;
        labelArray[29] = cartFrame.p15t2;

        photoArray[0] = cartFrame.prod1;
        photoArray[1] = cartFrame.prod2;
        photoArray[2] = cartFrame.prod3;
        photoArray[3] = cartFrame.prod4;
        photoArray[4] = cartFrame.prod5;
        photoArray[5] = cartFrame.prod6;
        photoArray[6] = cartFrame.prod7;
        photoArray[7] = cartFrame.prod8;
        photoArray[8] = cartFrame.prod9;
        photoArray[9] = cartFrame.prod10;
        photoArray[10] = cartFrame.prod11;
        photoArray[11] = cartFrame.prod12;
        photoArray[12] = cartFrame.prod13;
        photoArray[13] = cartFrame.prod14;
        photoArray[14] = cartFrame.prod15;

        spinnerArray[0] = cartFrame.spinner1;
        spinnerArray[1] = cartFrame.spinner2;
        spinnerArray[2] = cartFrame.spinner3;
        spinnerArray[3] = cartFrame.spinner4;
        spinnerArray[4] = cartFrame.spinner5;
        spinnerArray[5] = cartFrame.spinner6;
        spinnerArray[6] = cartFrame.spinner7;
        spinnerArray[7] = cartFrame.spinner8;
        spinnerArray[8] = cartFrame.spinner9;
        spinnerArray[9] = cartFrame.spinner10;
        spinnerArray[10] = cartFrame.spinner11;
        spinnerArray[11] = cartFrame.spinner12;
        spinnerArray[12] = cartFrame.spinner13;
        spinnerArray[13] = cartFrame.spinner14;
        spinnerArray[14] = cartFrame.spinner15;


        buttonArray[0] = cartFrame.del1;
        buttonArray[1] = cartFrame.del2;
        buttonArray[2] = cartFrame.del3;
        buttonArray[3] = cartFrame.del4;
        buttonArray[4] = cartFrame.del5;
        buttonArray[5] = cartFrame.del6;
        buttonArray[6] = cartFrame.del7;
        buttonArray[7] = cartFrame.del8;
        buttonArray[8] = cartFrame.del9;
        buttonArray[9] = cartFrame.del10;
        buttonArray[10] = cartFrame.del11;
        buttonArray[11] = cartFrame.del12;
        buttonArray[12] = cartFrame.del13;
        buttonArray[13] = cartFrame.del14;
        buttonArray[14] = cartFrame.del15;

        cartFrame.confirm.setEnabled(false);
        cartFrame.confirm.setFocusPainted(false);


        cartFrame.confirm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getOrder();
                for (int k = 0; k < 15; k++)
                    for (int j = 0; j < 7; j++)
                        productArray[k][j] = 0;
                nrOfProducts[0] = 0;
                nrOfLabels[0] = 0;
                nrOfSpinners[0] = 0;
                nrOfButtons[0] = 0;
                nrOfPanels[0] = 0;
                if (cartFrame.card.isSelected()) {
                    cartFrame.message.setText("Please continue the payment using the link from the email we've just sent you to finish placing your order.");
                }
                if (cartFrame.cash.isSelected()) {
                    cartFrame.message.setText("Order placed succesfully. Please check your email for status updates.");
                }
                int delay = 3000;
                Timer timer = new Timer(delay, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        int p = 0;
                        for (int i = 0; i < 15; i++) {
                            panelArray[i].setVisible(false);
                            spinnerArray[i].setVisible(false);
                            buttonArray[i].setVisible(false);
                            labelArray[p].setVisible(false);
                            p++;
                            labelArray[p].setVisible(false);
                            p++;
                            cartFrame.confirm.setVisible(false);
                            cartFrame.cash.setVisible(false);
                            cartFrame.card.setVisible(false);
                            cartFrame.message.setText("Your cart is empty");

                        }
                    }
                });

                timer.setRepeats(false);
                timer.start();
            }

        });


        cartFrame.back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cartFrame.cart.dispose();
                framee.clothes.setVisible(true);

            }
        });


        framee.butt5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                framee.clothes.dispose();
                frameAbout.aboutUs.setVisible(true);

            }
        });

        framemen.aboutUs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                framemen.men.dispose();
                frameAbout.aboutUs.setVisible(true);

            }
        }
        );

        frameeee.aboutUs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                frameeee.women.dispose();
                frameAbout.aboutUs.setVisible(true);

            }
        }
        );

        frameAbout.back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frameAbout.aboutUs.dispose();
                framee.clothes.setVisible(true);

            }
        });


        framee.clothing1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                framee.clothes.dispose();
                frameJeans.product.setVisible(true);
                aux = framee.clothes;
            }
        });


        frameJeans.back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frameJeans.product.dispose();
                aux.setVisible(true);
            }
        });

        framee.clothing2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                aux = framee.clothes;
                framee.clothes.dispose();
                frameSlippers.product.setVisible(true);
            }
        });

        frameSlippers.back.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                frameSlippers.product.dispose();
                aux.setVisible(true);
            }
        });

        framee.clothing3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                aux = framee.clothes;
                framee.clothes.dispose();
                frameTShirt.product.setVisible(true);
            }
        });
        frameTShirt.back.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                frameTShirt.product.dispose();
                aux.setVisible(true);
            }
        });
        framee.clothing4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                aux = framee.clothes;
                framee.clothes.dispose();
                frameDress.product.setVisible(true);
            }
        });

        frameDress.back.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                frameDress.product.dispose();
                aux.setVisible(true);
            }
        });
        framee.clothing5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                aux = framee.clothes;
                framee.clothes.dispose();
                frameSkirt.product.setVisible(true);
            }
        });
        frameSkirt.back.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                frameSkirt.product.dispose();
                aux.setVisible(true);
            }
        });

        framee.clothing6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                aux = framee.clothes;
                framee.clothes.dispose();
                framePurse.product.setVisible(true);
            }
        });
        framePurse.back.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                framePurse.product.dispose();
                aux.setVisible(true);
            }
        });

        framee.clothing7.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                aux = framee.clothes;
                framee.clothes.dispose();
                frameShoes.product.setVisible(true);
            }
        });
        frameShoes.back.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                frameShoes.product.dispose();
                aux.setVisible(true);
            }
        });

        framee.clothing8.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                aux = framee.clothes;
                framee.clothes.dispose();
                frameSunglasses.product.setVisible(true);
            }
        });
        frameSunglasses.back.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                frameSunglasses.product.dispose();
                aux.setVisible(true);
            }
        });

        framee.clothing9.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                aux = framee.clothes;
                framee.clothes.dispose();
                frameGloves.product.setVisible(true);
            }
        });
        frameGloves.back.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                frameGloves.product.dispose();
                aux.setVisible(true);
            }
        });

        framee.clothing10.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                aux = framee.clothes;
                framee.clothes.dispose();
                frameHoodie.product.setVisible(true);
            }
        });
        frameHoodie.back.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                frameHoodie.product.dispose();
                aux.setVisible(true);
            }
        });

        framee.clothing11.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                aux = framee.clothes;
                framee.clothes.dispose();
                frameCrewneck.product.setVisible(true);
            }
        });
        frameCrewneck.back.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                frameCrewneck.product.dispose();
                aux.setVisible(true);
            }
        });

        framee.clothing12.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                aux = framee.clothes;
                framee.clothes.dispose();
                frameHat.product.setVisible(true);
            }
        });
        frameHat.back.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                frameHat.product.dispose();
                aux.setVisible(true);
            }
        });

        framee.clothing13.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                aux = framee.clothes;
                framee.clothes.dispose();
                frameShorts.product.setVisible(true);
            }
        });
        frameShorts.back.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                frameShorts.product.dispose();
                aux.setVisible(true);
            }
        });

        framee.clothing14.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                aux = framee.clothes;
                framee.clothes.dispose();
                frameBlouse.product.setVisible(true);
            }
        });
        frameBlouse.back.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                frameBlouse.product.dispose();
                aux.setVisible(true);
            }
        });

        framee.clothing15.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                aux = framee.clothes;
                framee.clothes.dispose();
                frameSwimsuit.product.setVisible(true);
            }
        });
        frameSwimsuit.back.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                frameSwimsuit.product.dispose();
                aux.setVisible(true);
            }
        });



        framee.checkBox1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                framee.clothes.dispose();
                frameeee.checkBox2.setSelected(true);
                frameeee.checkBox1.setSelected(false);
                frameeee.women.setVisible(true);

            }

        });

        frameeee.checkBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frameeee.women.dispose();
                framee.clothes.setVisible(true);
                framee.checkBox1.setSelected(false);
                framee.checkBox2.setSelected(false);

            }
        });

        frameeee.checkBox2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frameeee.women.dispose();
                framee.clothes.setVisible(true);
                framee.checkBox1.setSelected(false);
                framee.checkBox2.setSelected(false);

            }
        });

        framee.checkBox2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                framee.clothes.dispose();
                framemen.checkBox1.setSelected(true);
                framemen.checkBox2.setSelected(false);
                framemen.men.setVisible(true);

            }

        });

        framemen.checkBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                framemen.men.dispose();
                framee.clothes.setVisible(true);
                framee.checkBox1.setSelected(false);
                framee.checkBox2.setSelected(false);

            }
        });

        framemen.checkBox2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                framemen.men.dispose();
                framee.clothes.setVisible(true);
                framee.checkBox1.setSelected(false);
                framee.checkBox2.setSelected(false);

            }
        });


        framemen.photo1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                aux = framemen.men;
                framemen.men.dispose();
                frameSlippers.product.setVisible(true);
            }
        });

        frameSlippers.back.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                frameSlippers.product.dispose();
                aux.setVisible(true);
            }
        });

        framemen.photo2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                aux = framemen.men;
                framemen.men.dispose();
                frameTShirt.product.setVisible(true);
            }
        });
        frameTShirt.back.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                frameTShirt.product.dispose();
                aux.setVisible(true);
            }
        });

        framemen.photo3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                aux = framemen.men;
                framemen.men.dispose();
                frameShoes.product.setVisible(true);
            }
        });
        frameShoes.back.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                frameShoes.product.dispose();
                aux.setVisible(true);
            }
        });

        framemen.photo4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                aux = framemen.men;
                framemen.men.dispose();
                frameGloves.product.setVisible(true);
            }
        });
        frameGloves.back.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                frameGloves.product.dispose();
                aux.setVisible(true);
            }
        });

        framemen.photo5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                aux = framemen.men;
                framemen.men.dispose();
                frameHoodie.product.setVisible(true);
            }
        });
        frameHoodie.back.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                frameHoodie.product.dispose();
                aux.setVisible(true);
            }
        });

        framemen.photo6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                aux = framemen.men;
                framemen.men.dispose();
                frameShorts.product.setVisible(true);
            }
        });
        frameShorts.back.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                frameShorts.product.dispose();
                aux.setVisible(true);
            }
        });

        frameeee.photo1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                aux = frameeee.women;
                frameeee.women.dispose();
                frameJeans.product.setVisible(true);
            }
        });
        frameJeans.back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frameJeans.product.dispose();
                aux.setVisible(true);
            }
        });

        frameeee.photo2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                aux = frameeee.women;
                frameeee.women.dispose();
                frameSlippers.product.setVisible(true);
            }
        });

        frameSlippers.back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frameSlippers.product.dispose();
                aux.setVisible(true);
            }
        });

        frameeee.photo3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                aux = frameeee.women;
                frameeee.women.dispose();
                frameDress.product.setVisible(true);
            }
        });
        frameDress.back.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                frameDress.product.dispose();
                aux.setVisible(true);
            }
        });


        frameeee.photo4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                aux = frameeee.women;
                frameeee.women.dispose();
                frameSkirt.product.setVisible(true);
            }
        });
        frameSkirt.back.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                frameSkirt.product.dispose();
                aux.setVisible(true);
            }
        });

        frameeee.photo5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                aux = frameeee.women;
                frameeee.women.dispose();
                framePurse.product.setVisible(true);
            }
        });
        framePurse.back.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                framePurse.product.dispose();
                aux.setVisible(true);
            }
        });

        frameeee.photo6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                aux = frameeee.women;
                frameeee.women.dispose();
                frameSunglasses.product.setVisible(true);
            }
        });
        frameSunglasses.back.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                frameSunglasses.product.dispose();
                aux.setVisible(true);
            }
        });

        frameeee.photo7.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                aux = frameeee.women;
                frameeee.women.dispose();
                frameGloves.product.setVisible(true);
            }
        });
        frameGloves.back.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                frameGloves.product.dispose();
                aux.setVisible(true);
            }
        });


        frameeee.photo8.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                aux = frameeee.women;
                frameeee.women.dispose();
                frameCrewneck.product.setVisible(true);
            }
        });
        frameCrewneck.back.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                frameCrewneck.product.dispose();
                aux.setVisible(true);
            }
        });

        frameeee.photo9.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                aux = frameeee.women;
                frameeee.women.dispose();
                frameHat.product.setVisible(true);
            }
        });
        frameHat.back.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                frameHat.product.dispose();
                aux.setVisible(true);
            }
        });


        frameeee.photo10.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                aux = frameeee.women;
                frameeee.women.dispose();
                frameBlouse.product.setVisible(true);
            }
        });
        frameBlouse.back.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                frameBlouse.product.dispose();
                aux.setVisible(true);
            }
        });

        frameeee.photo11.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                aux = frameeee.women;
                frameeee.women.dispose();
                frameSwimsuit.product.setVisible(true);
            }
        });
        frameSwimsuit.back.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                frameSwimsuit.product.dispose();
                aux.setVisible(true);
            }
        });

        cartFrame.del1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                delete(0);
            }
        });
        cartFrame.del2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                delete(1);
            }
        });
        cartFrame.del3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                delete(2);
            }
        });
        cartFrame.del4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                delete(3);
            }
        });
        cartFrame.del5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                delete(4);
            }
        });
        cartFrame.del6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                delete(5);
            }
        });
        cartFrame.del7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                delete(6);
            }
        });
        cartFrame.del8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                delete(7);
            }
        });
        cartFrame.del9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                delete(8);
            }
        });
        cartFrame.del10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                delete(9);
            }
        });
        cartFrame.del11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                delete(10);
            }
        });
        cartFrame.del12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                delete(11);
            }
        });
        cartFrame.del13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                delete(12);
            }
        });
        cartFrame.del14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                delete(13);
            }
        });
        cartFrame.del15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                delete(14);
            }
        });


        frame = new JFrame("Login Frame");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(800, 600));
        frame.setResizable(false);

        frame.add(panel1);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        loginButton.setEnabled(false);
        loginButton.setFocusPainted(false);

        int check = 1;
        userText.addKeyListener((new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                int update = fieldFunc(check);
                if (update == 1) {
                    loginButton.setEnabled(true);
                    loginButton.setFocusPainted(true);
                } else {
                    loginButton.setEnabled(false);
                    loginButton.setFocusPainted(false);
                }
            }

        }));

        password.addKeyListener((new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                int update = fieldFunc(check);
                if (update == 1) {
                    loginButton.setEnabled(true);
                    loginButton.setFocusPainted(true);
                } else {
                    loginButton.setEnabled(false);
                    loginButton.setFocusPainted(false);
                }
            }

        }));

        password.addKeyListener((new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                int update = fieldFunc(check);
                if (update == 1) {
                    loginButton.setEnabled(true);
                    loginButton.setFocusPainted(true);
                } else {
                    loginButton.setEnabled(false);
                    loginButton.setFocusPainted(false);
                }
            }

        }));


        /**
         public void keyReleased(KeyEvent e) {
         if(u)
         {
         loginButton.setEnabled(false);
         loginButton.setFocusPainted(false);
         } else {
         loginButton.setEnabled(true);
         loginButton.setFocusPainted(true);
         }
         }

         }));
         /**
         userText.addKeyListener((new KeyAdapter() {
        @Override public void keyReleased(KeyEvent e) {
        JTextField textField = userText;
        JPasswordField passwordField=password;
        String text = textField.getText();
        String password2=passwordField.getText();
        if (!textField.getText().isEmpty() && !passwordField.getText().isEmpty()) {
        loginButton.setEnabled(true);
        loginButton.setFocusPainted(true);
        } else {
        loginButton.setEnabled(false);
        loginButton.setFocusPainted(false);
        }
        }

        }));
         */

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userName = userText.getText();
                usernameForOrder = userName;
                String username = userName;
                String Password = password.getText();
                getAuthenticatedUser(userName, Password, framee);

            }
        });


        frame2 login = new frame2();
        clothes clothing = new clothes();

        login.loginBut.setEnabled(false);
        login.loginBut.setFocusPainted(false);

        int check2 = 1;

        login.textField1.addKeyListener((new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                int update = fieldFunc2(check2, login);
                if (update == 1) {
                    login.loginBut.setEnabled(true);
                    login.loginBut.setFocusPainted(true);
                } else {
                    login.loginBut.setEnabled(false);
                    login.loginBut.setFocusPainted(false);
                }
            }

        }));

        login.textField2.addKeyListener((new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                int update = fieldFunc2(check2, login);
                if (update == 1) {
                    login.loginBut.setEnabled(true);
                    login.loginBut.setFocusPainted(true);
                } else {
                    login.loginBut.setEnabled(false);
                    login.loginBut.setFocusPainted(false);
                }
            }

        }));
        login.passwordField1.addKeyListener((new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                int update = fieldFunc2(check2, login);
                if (update == 1) {
                    login.loginBut.setEnabled(true);
                    login.loginBut.setFocusPainted(true);
                } else {
                    login.loginBut.setEnabled(false);
                    login.loginBut.setFocusPainted(false);
                }
            }

        }));
        login.passwordField2.addKeyListener((new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                int update = fieldFunc2(check2, login);
                if (update == 1) {
                    login.loginBut.setEnabled(true);
                    login.loginBut.setFocusPainted(true);
                } else {
                    login.loginBut.setEnabled(false);
                    login.loginBut.setFocusPainted(false);
                }
            }

        }));
        login.textField3.addKeyListener((new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                int update = fieldFunc2(check2, login);
                if (update == 1) {
                    login.loginBut.setEnabled(true);
                    login.loginBut.setFocusPainted(true);
                } else {
                    login.loginBut.setEnabled(false);
                    login.loginBut.setFocusPainted(false);
                }
            }

        }));

        login.textField4.addKeyListener((new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                int update = fieldFunc2(check2, login);
                if (update == 1) {
                    login.loginBut.setEnabled(true);
                    login.loginBut.setFocusPainted(true);
                } else {
                    login.loginBut.setEnabled(false);
                    login.loginBut.setFocusPainted(false);
                }
            }

        }));

        login.textField5.addKeyListener((new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                int update = fieldFunc2(check2, login);
                if (update == 1) {
                    login.loginBut.setEnabled(true);
                    login.loginBut.setFocusPainted(true);
                } else {
                    login.loginBut.setEnabled(false);
                    login.loginBut.setFocusPainted(false);
                }
            }

        }));

        login.textField6.addKeyListener((new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                int update = fieldFunc2(check2, login);
                if (update == 1) {
                    login.loginBut.setEnabled(true);
                    login.loginBut.setFocusPainted(true);
                } else {
                    login.loginBut.setEnabled(false);
                    login.loginBut.setFocusPainted(false);
                }
            }

        }));

        login.textField7.addKeyListener((new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                int update = fieldFunc2(check2, login);
                if (update == 1) {
                    login.loginBut.setEnabled(true);
                    login.loginBut.setFocusPainted(true);
                } else {
                    login.loginBut.setEnabled(false);
                    login.loginBut.setFocusPainted(false);
                }
            }

        }));

        login.textField8.addKeyListener((new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                int update = fieldFunc2(check2, login);
                if (update == 1) {
                    login.loginBut.setEnabled(true);
                    login.loginBut.setFocusPainted(true);
                } else {
                    login.loginBut.setEnabled(false);
                    login.loginBut.setFocusPainted(false);
                }
            }

        }));
        /**
         login.loginBut.addActionListener(new ActionListener() {
        @Override public void actionPerformed(ActionEvent e) {
        String password1 = login.passwordField1.getText();
        String password2 =   login.passwordField2.getText();
        while(!password1.equals(password2)) {
        login.warning.setText("Passwords do not match");
        }

        }
        });
         */

        signUpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                login.frame2.setVisible(true);


            }
        });


        login.gotoframe1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                login.frame2.dispose();
                frame.setVisible(true);


            }
        });
        product[] frame_prod = new product[16];
        frame_prod[0] = frameJeans;
        frame_prod[1] = frameSlippers;
        frame_prod[2] = frameTShirt;
        frame_prod[3] = frameDress;
        frame_prod[4] = frameSkirt;
        frame_prod[5] = framePurse;
        frame_prod[6] = frameSunglasses;
        frame_prod[7] = frameGloves;
        frame_prod[8] = frameHat;
        frame_prod[9] = frameShoes;
        frame_prod[10] = frameHoodie;
        frame_prod[11] = frameCrewneck;
        frame_prod[12] = frameShorts;
        frame_prod[13] = frameBlouse;
        frame_prod[14] = frameSwimsuit;

/**
 * daca nu e selectata nicio marime, butonul nu e functional --facut
 * daca marimea a mai fost adaugata in cos, doar creste spinnerul
 * daca se atinge limita de 15 produse => mesaj  --facut
 * daca se sterge un produs, poate fi adaugat din nou normal iar numarul de produse adaugate scade
 */



        frameJeans.size1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                if (frameJeans.size1.isSelected()) {
                    frameJeans.buy.setEnabled(false);
                    frameJeans.buy.setFocusPainted(false);
                }
//                  pressed[index[0]]++;
//                  index[0]++;
                frameJeans.size2.setSelected(false);
                frameJeans.size3.setSelected(false);
                frameJeans.size4.setSelected(false);
                frameJeans.size5.setSelected(false);
                frameJeans.size6.setSelected(false);
                frameJeans.size7.setSelected(false);
                frameJeans.buy.setEnabled(true);
                frameJeans.buy.setFocusPainted(true);

                                               }

                                           }

        );


        frameJeans.size2.addActionListener(new ActionListener() {
                                               @Override
                                               public void actionPerformed(ActionEvent e) {

                                                   if (frameJeans.size2.isSelected()) {
                                                       frameJeans.buy.setEnabled(false);
                                                       frameJeans.buy.setFocusPainted(false);
                                                   }
                                                   pressed[index[0]]++;
                                                   index[0]++;
                                                   frameJeans.size1.setSelected(false);
                                                   frameJeans.size3.setSelected(false);
                                                   frameJeans.size4.setSelected(false);
                                                   frameJeans.size5.setSelected(false);
                                                   frameJeans.size6.setSelected(false);
                                                   frameJeans.size7.setSelected(false);
                                                   frameJeans.buy.setEnabled(true);
                                                   frameJeans.buy.setFocusPainted(true);

                                               }

                                           }

        );
        frameJeans.size3.addActionListener(new ActionListener() {
                                               @Override
                                               public void actionPerformed(ActionEvent e) {

                                                   if (frameJeans.size3.isSelected()) {
                                                       frameJeans.buy.setEnabled(false);
                                                       frameJeans.buy.setFocusPainted(false);
                                                   }
                                                   pressed[index[0]]++;
                                                   index[0]++;
                                                   frameJeans.size2.setSelected(false);
                                                   frameJeans.size1.setSelected(false);
                                                   frameJeans.size4.setSelected(false);
                                                   frameJeans.size5.setSelected(false);
                                                   frameJeans.size6.setSelected(false);
                                                   frameJeans.size7.setSelected(false);
                                                   frameJeans.buy.setEnabled(true);
                                                   frameJeans.buy.setFocusPainted(true);

                                               }

                                           }

        );
        frameJeans.size4.addActionListener(new ActionListener() {
                                               @Override
                                               public void actionPerformed(ActionEvent e) {

                                                   if (frameJeans.size4.isSelected()) {
                                                       frameJeans.buy.setEnabled(false);
                                                       frameJeans.buy.setFocusPainted(false);
                                                   }
                                                   pressed[index[0]]++;
                                                   index[0]++;
                                                   frameJeans.size2.setSelected(false);
                                                   frameJeans.size3.setSelected(false);
                                                   frameJeans.size1.setSelected(false);
                                                   frameJeans.size5.setSelected(false);
                                                   frameJeans.size6.setSelected(false);
                                                   frameJeans.size7.setSelected(false);
                                                   frameJeans.buy.setEnabled(true);
                                                   frameJeans.buy.setFocusPainted(true);

                                               }

                                           }

        );
        frameJeans.size5.addActionListener(new ActionListener() {
                                               @Override
                                               public void actionPerformed(ActionEvent e) {

                                                   if (frameJeans.size5.isSelected()) {
                                                       frameJeans.buy.setEnabled(false);
                                                       frameJeans.buy.setFocusPainted(false);
                                                   }
                                                   pressed[index[0]]++;
                                                   index[0]++;
                                                   frameJeans.size2.setSelected(false);
                                                   frameJeans.size3.setSelected(false);
                                                   frameJeans.size4.setSelected(false);
                                                   frameJeans.size1.setSelected(false);
                                                   frameJeans.size6.setSelected(false);
                                                   frameJeans.size7.setSelected(false);
                                                   frameJeans.buy.setEnabled(true);
                                                   frameJeans.buy.setFocusPainted(true);

                                               }

                                           }

        );
        frameJeans.size6.addActionListener(new ActionListener() {
                                               @Override
                                               public void actionPerformed(ActionEvent e) {

                                                   if (frameJeans.size6.isSelected()) {
                                                       frameJeans.buy.setEnabled(false);
                                                       frameJeans.buy.setFocusPainted(false);
                                                   }
                                                   pressed[index[0]]++;
                                                   index[0]++;
                                                   frameJeans.size2.setSelected(false);
                                                   frameJeans.size3.setSelected(false);
                                                   frameJeans.size4.setSelected(false);
                                                   frameJeans.size5.setSelected(false);
                                                   frameJeans.size1.setSelected(false);
                                                   frameJeans.size7.setSelected(false);
                                                   frameJeans.buy.setEnabled(true);
                                                   frameJeans.buy.setFocusPainted(true);

                                               }

                                           }

        );

        frameJeans.size7.addActionListener(new ActionListener() {
                                               @Override
                                               public void actionPerformed(ActionEvent e) {

                                                   if (frameJeans.size1.isSelected()) {
                                                       frameJeans.buy.setEnabled(false);
                                                       frameJeans.buy.setFocusPainted(false);
                                                   }
                                                   pressed[index[0]]++;
                                                   index[0]++;
                                                   frameJeans.size2.setSelected(false);
                                                   frameJeans.size3.setSelected(false);
                                                   frameJeans.size4.setSelected(false);
                                                   frameJeans.size5.setSelected(false);
                                                   frameJeans.size6.setSelected(false);
                                                   frameJeans.size7.setSelected(false);
                                                   frameJeans.buy.setEnabled(true);
                                                   frameJeans.buy.setFocusPainted(true);

                                               }

                                           }

        );

        frameSlippers.size1.addActionListener(new ActionListener() {
                                                  @Override
                                                  public void actionPerformed(ActionEvent e) {

                                                      if (frameSlippers.size1.isSelected()) {
                                                          frameSlippers.buy.setEnabled(false);
                                                          frameSlippers.buy.setFocusPainted(false);
                                                      }
                                                      pressed[index[0]]++;
                                                      index[0]++;
                                                      frameSlippers.size2.setSelected(false);
                                                      frameSlippers.size3.setSelected(false);
                                                      frameSlippers.size4.setSelected(false);
                                                      frameSlippers.size5.setSelected(false);
                                                      frameSlippers.size6.setSelected(false);
                                                      frameSlippers.size7.setSelected(false);
                                                      frameSlippers.buy.setEnabled(true);
                                                      frameSlippers.buy.setFocusPainted(true);

                                                  }

                                              }

        );


        frameSlippers.size2.addActionListener(new ActionListener() {
                                                  @Override
                                                  public void actionPerformed(ActionEvent e) {

                                                      if (frameSlippers.size2.isSelected()) {
                                                          frameSlippers.buy.setEnabled(false);
                                                          frameSlippers.buy.setFocusPainted(false);
                                                      }
                                                      pressed[index[0]]++;
                                                      index[0]++;
                                                      frameSlippers.size1.setSelected(false);
                                                      frameSlippers.size3.setSelected(false);
                                                      frameSlippers.size4.setSelected(false);
                                                      frameSlippers.size5.setSelected(false);
                                                      frameSlippers.size6.setSelected(false);
                                                      frameSlippers.size7.setSelected(false);
                                                      frameSlippers.buy.setEnabled(true);
                                                      frameSlippers.buy.setFocusPainted(true);

                                                  }

                                              }

        );
        frameSlippers.size3.addActionListener(new ActionListener() {
                                                  @Override
                                                  public void actionPerformed(ActionEvent e) {

                                                      if (frameSlippers.size3.isSelected()) {
                                                          frameSlippers.buy.setEnabled(false);
                                                          frameSlippers.buy.setFocusPainted(false);
                                                      }
                                                      pressed[index[0]]++;
                                                      index[0]++;
                                                      frameSlippers.size2.setSelected(false);
                                                      frameSlippers.size1.setSelected(false);
                                                      frameSlippers.size4.setSelected(false);
                                                      frameSlippers.size5.setSelected(false);
                                                      frameSlippers.size6.setSelected(false);
                                                      frameSlippers.size7.setSelected(false);
                                                      frameSlippers.buy.setEnabled(true);
                                                      frameSlippers.buy.setFocusPainted(true);

                                                  }

                                              }

        );
        frameSlippers.size4.addActionListener(new ActionListener() {
                                                  @Override
                                                  public void actionPerformed(ActionEvent e) {

                                                      if (frameSlippers.size4.isSelected()) {
                                                          frameSlippers.buy.setEnabled(false);
                                                          frameSlippers.buy.setFocusPainted(false);
                                                      }
                                                      pressed[index[0]]++;
                                                      index[0]++;
                                                      frameSlippers.size2.setSelected(false);
                                                      frameSlippers.size3.setSelected(false);
                                                      frameSlippers.size1.setSelected(false);
                                                      frameSlippers.size5.setSelected(false);
                                                      frameSlippers.size6.setSelected(false);
                                                      frameSlippers.size7.setSelected(false);
                                                      frameSlippers.buy.setEnabled(true);
                                                      frameSlippers.buy.setFocusPainted(true);

                                                  }

                                              }

        );
        frameSlippers.size5.addActionListener(new ActionListener() {
                                                  @Override
                                                  public void actionPerformed(ActionEvent e) {

                                                      if (frameSlippers.size5.isSelected()) {
                                                          frameSlippers.buy.setEnabled(false);
                                                          frameSlippers.buy.setFocusPainted(false);
                                                      }
                                                      pressed[index[0]]++;
                                                      index[0]++;
                                                      frameSlippers.size2.setSelected(false);
                                                      frameSlippers.size3.setSelected(false);
                                                      frameSlippers.size4.setSelected(false);
                                                      frameSlippers.size1.setSelected(false);
                                                      frameSlippers.size6.setSelected(false);
                                                      frameSlippers.size7.setSelected(false);
                                                      frameSlippers.buy.setEnabled(true);
                                                      frameSlippers.buy.setFocusPainted(true);

                                                  }

                                              }

        );
        frameSlippers.size6.addActionListener(new ActionListener() {
                                                  @Override
                                                  public void actionPerformed(ActionEvent e) {

                                                      if (frameSlippers.size6.isSelected()) {
                                                          frameSlippers.buy.setEnabled(false);
                                                          frameSlippers.buy.setFocusPainted(false);
                                                      }
                                                      pressed[index[0]]++;
                                                      index[0]++;
                                                      frameSlippers.size2.setSelected(false);
                                                      frameSlippers.size3.setSelected(false);
                                                      frameSlippers.size4.setSelected(false);
                                                      frameSlippers.size5.setSelected(false);
                                                      frameSlippers.size1.setSelected(false);
                                                      frameSlippers.size7.setSelected(false);
                                                      frameSlippers.buy.setEnabled(true);
                                                      frameSlippers.buy.setFocusPainted(true);

                                                  }

                                              }

        );

        frameSlippers.size7.addActionListener(new ActionListener() {
                                                  @Override
                                                  public void actionPerformed(ActionEvent e) {

                                                      if (frameSlippers.size1.isSelected()) {
                                                          frameSlippers.buy.setEnabled(false);
                                                          frameSlippers.buy.setFocusPainted(false);
                                                      }
                                                      pressed[index[0]]++;
                                                      index[0]++;
                                                      frameSlippers.size2.setSelected(false);
                                                      frameSlippers.size3.setSelected(false);
                                                      frameSlippers.size4.setSelected(false);
                                                      frameSlippers.size5.setSelected(false);
                                                      frameSlippers.size6.setSelected(false);
                                                      frameSlippers.size7.setSelected(false);
                                                      frameSlippers.buy.setEnabled(true);
                                                      frameSlippers.buy.setFocusPainted(true);

                                                  }

                                              }

        );


        frameTShirt.size7.addActionListener(new ActionListener() {
                                                @Override
                                                public void actionPerformed(ActionEvent e) {

                                                    if (frameTShirt.size1.isSelected()) {
                                                        frameTShirt.buy.setEnabled(false);
                                                        frameTShirt.buy.setFocusPainted(false);
                                                    }
                                                    pressed[index[0]]++;
                                                    index[0]++;
                                                    frameTShirt.size2.setSelected(false);
                                                    frameTShirt.size3.setSelected(false);
                                                    frameTShirt.size4.setSelected(false);
                                                    frameTShirt.size5.setSelected(false);
                                                    frameTShirt.size6.setSelected(false);
                                                    frameTShirt.size7.setSelected(false);
                                                    frameTShirt.buy.setEnabled(true);
                                                    frameTShirt.buy.setFocusPainted(true);

                                                }

                                            }

        );

        frameTShirt.size1.addActionListener(new ActionListener() {
                                                @Override
                                                public void actionPerformed(ActionEvent e) {

                                                    if (frameTShirt.size1.isSelected()) {
                                                        frameTShirt.buy.setEnabled(false);
                                                        frameTShirt.buy.setFocusPainted(false);
                                                    }
                                                    pressed[index[0]]++;
                                                    index[0]++;
                                                    frameTShirt.size2.setSelected(false);
                                                    frameTShirt.size3.setSelected(false);
                                                    frameTShirt.size4.setSelected(false);
                                                    frameTShirt.size5.setSelected(false);
                                                    frameTShirt.size6.setSelected(false);
                                                    frameTShirt.size7.setSelected(false);
                                                    frameTShirt.buy.setEnabled(true);
                                                    frameTShirt.buy.setFocusPainted(true);

                                                }

                                            }

        );


        frameTShirt.size2.addActionListener(new ActionListener() {
                                                @Override
                                                public void actionPerformed(ActionEvent e) {

                                                    if (frameTShirt.size2.isSelected()) {
                                                        frameTShirt.buy.setEnabled(false);
                                                        frameTShirt.buy.setFocusPainted(false);
                                                    }
                                                    pressed[index[0]]++;
                                                    index[0]++;
                                                    frameTShirt.size1.setSelected(false);
                                                    frameTShirt.size3.setSelected(false);
                                                    frameTShirt.size4.setSelected(false);
                                                    frameTShirt.size5.setSelected(false);
                                                    frameTShirt.size6.setSelected(false);
                                                    frameTShirt.size7.setSelected(false);
                                                    frameTShirt.buy.setEnabled(true);
                                                    frameTShirt.buy.setFocusPainted(true);

                                                }

                                            }

        );
        frameTShirt.size3.addActionListener(new ActionListener() {
                                                @Override
                                                public void actionPerformed(ActionEvent e) {

                                                    if (frameTShirt.size3.isSelected()) {
                                                        frameTShirt.buy.setEnabled(false);
                                                        frameTShirt.buy.setFocusPainted(false);
                                                    }
                                                    pressed[index[0]]++;
                                                    index[0]++;
                                                    frameTShirt.size2.setSelected(false);
                                                    frameTShirt.size1.setSelected(false);
                                                    frameTShirt.size4.setSelected(false);
                                                    frameTShirt.size5.setSelected(false);
                                                    frameTShirt.size6.setSelected(false);
                                                    frameTShirt.size7.setSelected(false);
                                                    frameTShirt.buy.setEnabled(true);
                                                    frameTShirt.buy.setFocusPainted(true);

                                                }

                                            }

        );
        frameTShirt.size4.addActionListener(new ActionListener() {
                                                @Override
                                                public void actionPerformed(ActionEvent e) {

                                                    if (frameTShirt.size4.isSelected()) {
                                                        frameTShirt.buy.setEnabled(false);
                                                        frameTShirt.buy.setFocusPainted(false);
                                                    }
                                                    pressed[index[0]]++;
                                                    index[0]++;
                                                    frameTShirt.size2.setSelected(false);
                                                    frameTShirt.size3.setSelected(false);
                                                    frameTShirt.size1.setSelected(false);
                                                    frameTShirt.size5.setSelected(false);
                                                    frameTShirt.size6.setSelected(false);
                                                    frameTShirt.size7.setSelected(false);
                                                    frameTShirt.buy.setEnabled(true);
                                                    frameTShirt.buy.setFocusPainted(true);

                                                }

                                            }

        );
        frameTShirt.size5.addActionListener(new ActionListener() {
                                                @Override
                                                public void actionPerformed(ActionEvent e) {

                                                    if (frameTShirt.size5.isSelected()) {
                                                        frameTShirt.buy.setEnabled(false);
                                                        frameTShirt.buy.setFocusPainted(false);
                                                    }
                                                    pressed[index[0]]++;
                                                    index[0]++;
                                                    frameTShirt.size2.setSelected(false);
                                                    frameTShirt.size3.setSelected(false);
                                                    frameTShirt.size4.setSelected(false);
                                                    frameTShirt.size1.setSelected(false);
                                                    frameTShirt.size6.setSelected(false);
                                                    frameTShirt.size7.setSelected(false);
                                                    frameTShirt.buy.setEnabled(true);
                                                    frameTShirt.buy.setFocusPainted(true);

                                                }

                                            }

        );
        frameTShirt.size6.addActionListener(new ActionListener() {
                                                @Override
                                                public void actionPerformed(ActionEvent e) {

                                                    if (frameTShirt.size6.isSelected()) {
                                                        frameTShirt.buy.setEnabled(false);
                                                        frameTShirt.buy.setFocusPainted(false);
                                                    }
                                                    pressed[index[0]]++;
                                                    index[0]++;
                                                    frameTShirt.size2.setSelected(false);
                                                    frameTShirt.size3.setSelected(false);
                                                    frameTShirt.size4.setSelected(false);
                                                    frameTShirt.size5.setSelected(false);
                                                    frameTShirt.size1.setSelected(false);
                                                    frameTShirt.size7.setSelected(false);
                                                    frameTShirt.buy.setEnabled(true);
                                                    frameTShirt.buy.setFocusPainted(true);

                                                }

                                            }

        );

        frameTShirt.size7.addActionListener(new ActionListener() {
                                                @Override
                                                public void actionPerformed(ActionEvent e) {

                                                    if (frameTShirt.size1.isSelected()) {
                                                        frameTShirt.buy.setEnabled(false);
                                                        frameTShirt.buy.setFocusPainted(false);
                                                    }
                                                    pressed[index[0]]++;
                                                    index[0]++;
                                                    frameTShirt.size2.setSelected(false);
                                                    frameTShirt.size3.setSelected(false);
                                                    frameTShirt.size4.setSelected(false);
                                                    frameTShirt.size5.setSelected(false);
                                                    frameTShirt.size6.setSelected(false);
                                                    frameTShirt.size7.setSelected(false);
                                                    frameTShirt.buy.setEnabled(true);
                                                    frameTShirt.buy.setFocusPainted(true);

                                                }

                                            }

        );

        frameDress.size1.addActionListener(new ActionListener() {
                                               @Override
                                               public void actionPerformed(ActionEvent e) {

                                                   if (frameDress.size1.isSelected()) {
                                                       frameDress.buy.setEnabled(false);
                                                       frameDress.buy.setFocusPainted(false);
                                                   }
                                                   pressed[index[0]]++;
                                                   index[0]++;
                                                   frameDress.size2.setSelected(false);
                                                   frameDress.size3.setSelected(false);
                                                   frameDress.size4.setSelected(false);
                                                   frameDress.size5.setSelected(false);
                                                   frameDress.size6.setSelected(false);
                                                   frameDress.size7.setSelected(false);
                                                   frameDress.buy.setEnabled(true);
                                                   frameDress.buy.setFocusPainted(true);

                                               }

                                           }

        );


        frameDress.size2.addActionListener(new ActionListener() {
                                               @Override
                                               public void actionPerformed(ActionEvent e) {

                                                   if (frameDress.size2.isSelected()) {
                                                       frameDress.buy.setEnabled(false);
                                                       frameDress.buy.setFocusPainted(false);
                                                   }
                                                   pressed[index[0]]++;
                                                   index[0]++;
                                                   frameDress.size1.setSelected(false);
                                                   frameDress.size3.setSelected(false);
                                                   frameDress.size4.setSelected(false);
                                                   frameDress.size5.setSelected(false);
                                                   frameDress.size6.setSelected(false);
                                                   frameDress.size7.setSelected(false);
                                                   frameDress.buy.setEnabled(true);
                                                   frameDress.buy.setFocusPainted(true);

                                               }

                                           }

        );
        frameDress.size3.addActionListener(new ActionListener() {
                                               @Override
                                               public void actionPerformed(ActionEvent e) {

                                                   if (frameDress.size3.isSelected()) {
                                                       frameDress.buy.setEnabled(false);
                                                       frameDress.buy.setFocusPainted(false);
                                                   }
                                                   pressed[index[0]]++;
                                                   index[0]++;
                                                   frameDress.size2.setSelected(false);
                                                   frameDress.size1.setSelected(false);
                                                   frameDress.size4.setSelected(false);
                                                   frameDress.size5.setSelected(false);
                                                   frameDress.size6.setSelected(false);
                                                   frameDress.size7.setSelected(false);
                                                   frameDress.buy.setEnabled(true);
                                                   frameDress.buy.setFocusPainted(true);

                                               }

                                           }

        );
        frameDress.size4.addActionListener(new ActionListener() {
                                               @Override
                                               public void actionPerformed(ActionEvent e) {

                                                   if (frameDress.size4.isSelected()) {
                                                       frameDress.buy.setEnabled(false);
                                                       frameDress.buy.setFocusPainted(false);
                                                   }
                                                   pressed[index[0]]++;
                                                   index[0]++;
                                                   frameDress.size2.setSelected(false);
                                                   frameDress.size3.setSelected(false);
                                                   frameDress.size1.setSelected(false);
                                                   frameDress.size5.setSelected(false);
                                                   frameDress.size6.setSelected(false);
                                                   frameDress.size7.setSelected(false);
                                                   frameDress.buy.setEnabled(true);
                                                   frameDress.buy.setFocusPainted(true);

                                               }

                                           }

        );
        frameDress.size5.addActionListener(new ActionListener() {
                                               @Override
                                               public void actionPerformed(ActionEvent e) {

                                                   if (frameDress.size5.isSelected()) {
                                                       frameDress.buy.setEnabled(false);
                                                       frameDress.buy.setFocusPainted(false);
                                                   }
                                                   pressed[index[0]]++;
                                                   index[0]++;
                                                   frameDress.size2.setSelected(false);
                                                   frameDress.size3.setSelected(false);
                                                   frameDress.size4.setSelected(false);
                                                   frameDress.size1.setSelected(false);
                                                   frameDress.size6.setSelected(false);
                                                   frameDress.size7.setSelected(false);
                                                   frameDress.buy.setEnabled(true);
                                                   frameDress.buy.setFocusPainted(true);

                                               }

                                           }

        );
        frameDress.size6.addActionListener(new ActionListener() {
                                               @Override
                                               public void actionPerformed(ActionEvent e) {

                                                   if (frameDress.size6.isSelected()) {
                                                       frameDress.buy.setEnabled(false);
                                                       frameDress.buy.setFocusPainted(false);
                                                   }
                                                   pressed[index[0]]++;
                                                   index[0]++;
                                                   frameDress.size2.setSelected(false);
                                                   frameDress.size3.setSelected(false);
                                                   frameDress.size4.setSelected(false);
                                                   frameDress.size5.setSelected(false);
                                                   frameDress.size1.setSelected(false);
                                                   frameDress.size7.setSelected(false);
                                                   frameDress.buy.setEnabled(true);
                                                   frameDress.buy.setFocusPainted(true);

                                               }

                                           }

        );

        frameDress.size7.addActionListener(new ActionListener() {
                                               @Override
                                               public void actionPerformed(ActionEvent e) {

                                                   if (frameDress.size1.isSelected()) {
                                                       frameDress.buy.setEnabled(false);
                                                       frameDress.buy.setFocusPainted(false);
                                                   }
                                                   pressed[index[0]]++;
                                                   index[0]++;
                                                   frameDress.size2.setSelected(false);
                                                   frameDress.size3.setSelected(false);
                                                   frameDress.size4.setSelected(false);
                                                   frameDress.size5.setSelected(false);
                                                   frameDress.size6.setSelected(false);
                                                   frameDress.size7.setSelected(false);
                                                   frameDress.buy.setEnabled(true);
                                                   frameDress.buy.setFocusPainted(true);

                                               }

                                           }

        );


        frameSkirt.size1.addActionListener(new ActionListener() {
                                               @Override
                                               public void actionPerformed(ActionEvent e) {

                                                   if (frameSkirt.size1.isSelected()) {
                                                       frameSkirt.buy.setEnabled(false);
                                                       frameSkirt.buy.setFocusPainted(false);
                                                   }
                                                   pressed[index[0]]++;
                                                   index[0]++;
                                                   frameSkirt.size2.setSelected(false);
                                                   frameSkirt.size3.setSelected(false);
                                                   frameSkirt.size4.setSelected(false);
                                                   frameSkirt.size5.setSelected(false);
                                                   frameSkirt.size6.setSelected(false);
                                                   frameSkirt.size7.setSelected(false);
                                                   frameSkirt.buy.setEnabled(true);
                                                   frameSkirt.buy.setFocusPainted(true);

                                               }

                                           }

        );


        frameSkirt.size2.addActionListener(new ActionListener() {
                                               @Override
                                               public void actionPerformed(ActionEvent e) {

                                                   if (frameSkirt.size2.isSelected()) {
                                                       frameSkirt.buy.setEnabled(false);
                                                       frameSkirt.buy.setFocusPainted(false);
                                                   }
                                                   pressed[index[0]]++;
                                                   index[0]++;
                                                   frameSkirt.size1.setSelected(false);
                                                   frameSkirt.size3.setSelected(false);
                                                   frameSkirt.size4.setSelected(false);
                                                   frameSkirt.size5.setSelected(false);
                                                   frameSkirt.size6.setSelected(false);
                                                   frameSkirt.size7.setSelected(false);
                                                   frameSkirt.buy.setEnabled(true);
                                                   frameSkirt.buy.setFocusPainted(true);

                                               }

                                           }

        );
        frameSkirt.size3.addActionListener(new ActionListener() {
                                               @Override
                                               public void actionPerformed(ActionEvent e) {

                                                   if (frameSkirt.size3.isSelected()) {
                                                       frameSkirt.buy.setEnabled(false);
                                                       frameSkirt.buy.setFocusPainted(false);
                                                   }
                                                   pressed[index[0]]++;
                                                   index[0]++;
                                                   frameSkirt.size2.setSelected(false);
                                                   frameSkirt.size1.setSelected(false);
                                                   frameSkirt.size4.setSelected(false);
                                                   frameSkirt.size5.setSelected(false);
                                                   frameSkirt.size6.setSelected(false);
                                                   frameSkirt.size7.setSelected(false);
                                                   frameSkirt.buy.setEnabled(true);
                                                   frameSkirt.buy.setFocusPainted(true);

                                               }

                                           }

        );
        frameSkirt.size4.addActionListener(new ActionListener() {
                                               @Override
                                               public void actionPerformed(ActionEvent e) {

                                                   if (frameSkirt.size4.isSelected()) {
                                                       frameSkirt.buy.setEnabled(false);
                                                       frameSkirt.buy.setFocusPainted(false);
                                                   }
                                                   pressed[index[0]]++;
                                                   index[0]++;
                                                   frameSkirt.size2.setSelected(false);
                                                   frameSkirt.size3.setSelected(false);
                                                   frameSkirt.size1.setSelected(false);
                                                   frameSkirt.size5.setSelected(false);
                                                   frameSkirt.size6.setSelected(false);
                                                   frameSkirt.size7.setSelected(false);
                                                   frameSkirt.buy.setEnabled(true);
                                                   frameSkirt.buy.setFocusPainted(true);

                                               }

                                           }

        );
        frameSkirt.size5.addActionListener(new ActionListener() {
                                               @Override
                                               public void actionPerformed(ActionEvent e) {

                                                   if (frameSkirt.size5.isSelected()) {
                                                       frameSkirt.buy.setEnabled(false);
                                                       frameSkirt.buy.setFocusPainted(false);
                                                   }
                                                   pressed[index[0]]++;
                                                   index[0]++;
                                                   frameSkirt.size2.setSelected(false);
                                                   frameSkirt.size3.setSelected(false);
                                                   frameSkirt.size4.setSelected(false);
                                                   frameSkirt.size1.setSelected(false);
                                                   frameSkirt.size6.setSelected(false);
                                                   frameSkirt.size7.setSelected(false);
                                                   frameSkirt.buy.setEnabled(true);
                                                   frameSkirt.buy.setFocusPainted(true);

                                               }

                                           }

        );
        frameSkirt.size6.addActionListener(new ActionListener() {
                                               @Override
                                               public void actionPerformed(ActionEvent e) {

                                                   if (frameSkirt.size6.isSelected()) {
                                                       frameSkirt.buy.setEnabled(false);
                                                       frameSkirt.buy.setFocusPainted(false);
                                                   }
                                                   pressed[index[0]]++;
                                                   index[0]++;
                                                   frameSkirt.size2.setSelected(false);
                                                   frameSkirt.size3.setSelected(false);
                                                   frameSkirt.size4.setSelected(false);
                                                   frameSkirt.size5.setSelected(false);
                                                   frameSkirt.size1.setSelected(false);
                                                   frameSkirt.size7.setSelected(false);
                                                   frameSkirt.buy.setEnabled(true);
                                                   frameSkirt.buy.setFocusPainted(true);

                                               }

                                           }

        );

        frameSkirt.size7.addActionListener(new ActionListener() {
                                               @Override
                                               public void actionPerformed(ActionEvent e) {

                                                   if (frameSkirt.size1.isSelected()) {
                                                       frameSkirt.buy.setEnabled(false);
                                                       frameSkirt.buy.setFocusPainted(false);
                                                   }
                                                   pressed[index[0]]++;
                                                   index[0]++;
                                                   frameSkirt.size2.setSelected(false);
                                                   frameSkirt.size3.setSelected(false);
                                                   frameSkirt.size4.setSelected(false);
                                                   frameSkirt.size5.setSelected(false);
                                                   frameSkirt.size6.setSelected(false);
                                                   frameSkirt.size7.setSelected(false);
                                                   frameSkirt.buy.setEnabled(true);
                                                   frameSkirt.buy.setFocusPainted(true);

                                               }

                                           }

        );


        framePurse.size1.addActionListener(new ActionListener() {
                                               @Override
                                               public void actionPerformed(ActionEvent e) {

                                                   if (framePurse.size1.isSelected()) {
                                                       framePurse.buy.setEnabled(false);
                                                       framePurse.buy.setFocusPainted(false);
                                                   }
                                                   pressed[index[0]]++;
                                                   index[0]++;
                                                   framePurse.size2.setSelected(false);
                                                   framePurse.size3.setSelected(false);
                                                   framePurse.size4.setSelected(false);
                                                   framePurse.size5.setSelected(false);
                                                   framePurse.size6.setSelected(false);
                                                   framePurse.size7.setSelected(false);
                                                   framePurse.buy.setEnabled(true);
                                                   framePurse.buy.setFocusPainted(true);

                                               }

                                           }

        );


        framePurse.size2.addActionListener(new ActionListener() {
                                               @Override
                                               public void actionPerformed(ActionEvent e) {

                                                   if (framePurse.size2.isSelected()) {
                                                       framePurse.buy.setEnabled(false);
                                                       framePurse.buy.setFocusPainted(false);
                                                   }
                                                   pressed[index[0]]++;
                                                   index[0]++;
                                                   framePurse.size1.setSelected(false);
                                                   framePurse.size3.setSelected(false);
                                                   framePurse.size4.setSelected(false);
                                                   framePurse.size5.setSelected(false);
                                                   framePurse.size6.setSelected(false);
                                                   framePurse.size7.setSelected(false);
                                                   framePurse.buy.setEnabled(true);
                                                   framePurse.buy.setFocusPainted(true);

                                               }

                                           }

        );
        framePurse.size3.addActionListener(new ActionListener() {
                                               @Override
                                               public void actionPerformed(ActionEvent e) {

                                                   if (framePurse.size3.isSelected()) {
                                                       framePurse.buy.setEnabled(false);
                                                       framePurse.buy.setFocusPainted(false);
                                                   }
                                                   pressed[index[0]]++;
                                                   index[0]++;
                                                   framePurse.size2.setSelected(false);
                                                   framePurse.size1.setSelected(false);
                                                   framePurse.size4.setSelected(false);
                                                   framePurse.size5.setSelected(false);
                                                   framePurse.size6.setSelected(false);
                                                   framePurse.size7.setSelected(false);
                                                   framePurse.buy.setEnabled(true);
                                                   framePurse.buy.setFocusPainted(true);

                                               }

                                           }

        );
        framePurse.size4.addActionListener(new ActionListener() {
                                               @Override
                                               public void actionPerformed(ActionEvent e) {

                                                   if (framePurse.size4.isSelected()) {
                                                       framePurse.buy.setEnabled(false);
                                                       framePurse.buy.setFocusPainted(false);
                                                   }
                                                   pressed[index[0]]++;
                                                   index[0]++;
                                                   framePurse.size2.setSelected(false);
                                                   framePurse.size3.setSelected(false);
                                                   framePurse.size1.setSelected(false);
                                                   framePurse.size5.setSelected(false);
                                                   framePurse.size6.setSelected(false);
                                                   framePurse.size7.setSelected(false);
                                                   framePurse.buy.setEnabled(true);
                                                   framePurse.buy.setFocusPainted(true);

                                               }

                                           }

        );
        framePurse.size5.addActionListener(new ActionListener() {
                                               @Override
                                               public void actionPerformed(ActionEvent e) {

                                                   if (framePurse.size5.isSelected()) {
                                                       framePurse.buy.setEnabled(false);
                                                       framePurse.buy.setFocusPainted(false);
                                                   }
                                                   pressed[index[0]]++;
                                                   index[0]++;
                                                   framePurse.size2.setSelected(false);
                                                   framePurse.size3.setSelected(false);
                                                   framePurse.size4.setSelected(false);
                                                   framePurse.size1.setSelected(false);
                                                   framePurse.size6.setSelected(false);
                                                   framePurse.size7.setSelected(false);
                                                   framePurse.buy.setEnabled(true);
                                                   framePurse.buy.setFocusPainted(true);

                                               }

                                           }

        );
        framePurse.size6.addActionListener(new ActionListener() {
                                               @Override
                                               public void actionPerformed(ActionEvent e) {

                                                   if (framePurse.size6.isSelected()) {
                                                       framePurse.buy.setEnabled(false);
                                                       framePurse.buy.setFocusPainted(false);
                                                   }
                                                   pressed[index[0]]++;
                                                   index[0]++;
                                                   framePurse.size2.setSelected(false);
                                                   framePurse.size3.setSelected(false);
                                                   framePurse.size4.setSelected(false);
                                                   framePurse.size5.setSelected(false);
                                                   framePurse.size1.setSelected(false);
                                                   framePurse.size7.setSelected(false);
                                                   framePurse.buy.setEnabled(true);
                                                   framePurse.buy.setFocusPainted(true);

                                               }

                                           }

        );

        framePurse.size7.addActionListener(new ActionListener() {
                                               @Override
                                               public void actionPerformed(ActionEvent e) {

                                                   if (framePurse.size1.isSelected()) {
                                                       framePurse.buy.setEnabled(false);
                                                       framePurse.buy.setFocusPainted(false);
                                                   }
                                                   pressed[index[0]]++;
                                                   index[0]++;
                                                   framePurse.size2.setSelected(false);
                                                   framePurse.size3.setSelected(false);
                                                   framePurse.size4.setSelected(false);
                                                   framePurse.size5.setSelected(false);
                                                   framePurse.size6.setSelected(false);
                                                   framePurse.size7.setSelected(false);
                                                   framePurse.buy.setEnabled(true);
                                                   framePurse.buy.setFocusPainted(true);

                                               }

                                           }

        );

        frameShoes.size1.addActionListener(new ActionListener() {
                                               @Override
                                               public void actionPerformed(ActionEvent e) {

                                                   if (frameShoes.size1.isSelected()) {
                                                       frameShoes.buy.setEnabled(false);
                                                       frameShoes.buy.setFocusPainted(false);
                                                   }
                                                   pressed[index[0]]++;
                                                   index[0]++;
                                                   frameShoes.size2.setSelected(false);
                                                   frameShoes.size3.setSelected(false);
                                                   frameShoes.size4.setSelected(false);
                                                   frameShoes.size5.setSelected(false);
                                                   frameShoes.size6.setSelected(false);
                                                   frameShoes.size7.setSelected(false);
                                                   frameShoes.buy.setEnabled(true);
                                                   frameShoes.buy.setFocusPainted(true);

                                               }

                                           }

        );


        frameShoes.size2.addActionListener(new ActionListener() {
                                               @Override
                                               public void actionPerformed(ActionEvent e) {

                                                   if (frameShoes.size2.isSelected()) {
                                                       frameShoes.buy.setEnabled(false);
                                                       frameShoes.buy.setFocusPainted(false);
                                                   }
                                                   pressed[index[0]]++;
                                                   index[0]++;
                                                   frameShoes.size1.setSelected(false);
                                                   frameShoes.size3.setSelected(false);
                                                   frameShoes.size4.setSelected(false);
                                                   frameShoes.size5.setSelected(false);
                                                   frameShoes.size6.setSelected(false);
                                                   frameShoes.size7.setSelected(false);
                                                   frameShoes.buy.setEnabled(true);
                                                   frameShoes.buy.setFocusPainted(true);

                                               }

                                           }

        );
        frameShoes.size3.addActionListener(new ActionListener() {
                                               @Override
                                               public void actionPerformed(ActionEvent e) {

                                                   if (frameShoes.size3.isSelected()) {
                                                       frameShoes.buy.setEnabled(false);
                                                       frameShoes.buy.setFocusPainted(false);
                                                   }
                                                   pressed[index[0]]++;
                                                   index[0]++;
                                                   frameShoes.size2.setSelected(false);
                                                   frameShoes.size1.setSelected(false);
                                                   frameShoes.size4.setSelected(false);
                                                   frameShoes.size5.setSelected(false);
                                                   frameShoes.size6.setSelected(false);
                                                   frameShoes.size7.setSelected(false);
                                                   frameShoes.buy.setEnabled(true);
                                                   frameShoes.buy.setFocusPainted(true);

                                               }

                                           }

        );
        frameShoes.size4.addActionListener(new ActionListener() {
                                               @Override
                                               public void actionPerformed(ActionEvent e) {

                                                   if (frameShoes.size4.isSelected()) {
                                                       frameShoes.buy.setEnabled(false);
                                                       frameShoes.buy.setFocusPainted(false);
                                                   }
                                                   pressed[index[0]]++;
                                                   index[0]++;
                                                   frameShoes.size2.setSelected(false);
                                                   frameShoes.size3.setSelected(false);
                                                   frameShoes.size1.setSelected(false);
                                                   frameShoes.size5.setSelected(false);
                                                   frameShoes.size6.setSelected(false);
                                                   frameShoes.size7.setSelected(false);
                                                   frameShoes.buy.setEnabled(true);
                                                   frameShoes.buy.setFocusPainted(true);

                                               }

                                           }

        );
        frameShoes.size5.addActionListener(new ActionListener() {
                                               @Override
                                               public void actionPerformed(ActionEvent e) {

                                                   if (frameShoes.size5.isSelected()) {
                                                       frameShoes.buy.setEnabled(false);
                                                       frameShoes.buy.setFocusPainted(false);
                                                   }
                                                   pressed[index[0]]++;
                                                   index[0]++;
                                                   frameShoes.size2.setSelected(false);
                                                   frameShoes.size3.setSelected(false);
                                                   frameShoes.size4.setSelected(false);
                                                   frameShoes.size1.setSelected(false);
                                                   frameShoes.size6.setSelected(false);
                                                   frameShoes.size7.setSelected(false);
                                                   frameShoes.buy.setEnabled(true);
                                                   frameShoes.buy.setFocusPainted(true);

                                               }

                                           }

        );
        frameShoes.size6.addActionListener(new ActionListener() {
                                               @Override
                                               public void actionPerformed(ActionEvent e) {

                                                   if (frameShoes.size6.isSelected()) {
                                                       frameShoes.buy.setEnabled(false);
                                                       frameShoes.buy.setFocusPainted(false);
                                                   }
                                                   pressed[index[0]]++;
                                                   index[0]++;
                                                   frameShoes.size2.setSelected(false);
                                                   frameShoes.size3.setSelected(false);
                                                   frameShoes.size4.setSelected(false);
                                                   frameShoes.size5.setSelected(false);
                                                   frameShoes.size1.setSelected(false);
                                                   frameShoes.size7.setSelected(false);
                                                   frameShoes.buy.setEnabled(true);
                                                   frameShoes.buy.setFocusPainted(true);

                                               }

                                           }

        );

        frameShoes.size7.addActionListener(new ActionListener() {
                                               @Override
                                               public void actionPerformed(ActionEvent e) {

                                                   if (frameShoes.size1.isSelected()) {
                                                       frameShoes.buy.setEnabled(false);
                                                       frameShoes.buy.setFocusPainted(false);
                                                   }
                                                   pressed[index[0]]++;
                                                   index[0]++;
                                                   frameShoes.size2.setSelected(false);
                                                   frameShoes.size3.setSelected(false);
                                                   frameShoes.size4.setSelected(false);
                                                   frameShoes.size5.setSelected(false);
                                                   frameShoes.size6.setSelected(false);
                                                   frameShoes.size7.setSelected(false);
                                                   frameShoes.buy.setEnabled(true);
                                                   frameShoes.buy.setFocusPainted(true);

                                               }

                                           }

        );


        frameSunglasses.size1.addActionListener(new ActionListener() {
                                                    @Override
                                                    public void actionPerformed(ActionEvent e) {

                                                        if (frameSunglasses.size1.isSelected()) {
                                                            frameSunglasses.buy.setEnabled(false);
                                                            frameSunglasses.buy.setFocusPainted(false);
                                                        }
                                                        pressed[index[0]]++;
                                                        index[0]++;
                                                        frameSunglasses.size2.setSelected(false);
                                                        frameSunglasses.size3.setSelected(false);
                                                        frameSunglasses.size4.setSelected(false);
                                                        frameSunglasses.size5.setSelected(false);
                                                        frameSunglasses.size6.setSelected(false);
                                                        frameSunglasses.size7.setSelected(false);
                                                        frameSunglasses.buy.setEnabled(true);
                                                        frameSunglasses.buy.setFocusPainted(true);

                                                    }

                                                }

        );


        frameSunglasses.size2.addActionListener(new ActionListener() {
                                                    @Override
                                                    public void actionPerformed(ActionEvent e) {

                                                        if (frameSunglasses.size2.isSelected()) {
                                                            frameSunglasses.buy.setEnabled(false);
                                                            frameSunglasses.buy.setFocusPainted(false);
                                                        }
                                                        pressed[index[0]]++;
                                                        index[0]++;
                                                        frameSunglasses.size1.setSelected(false);
                                                        frameSunglasses.size3.setSelected(false);
                                                        frameSunglasses.size4.setSelected(false);
                                                        frameSunglasses.size5.setSelected(false);
                                                        frameSunglasses.size6.setSelected(false);
                                                        frameSunglasses.size7.setSelected(false);
                                                        frameSunglasses.buy.setEnabled(true);
                                                        frameSunglasses.buy.setFocusPainted(true);

                                                    }

                                                }

        );
        frameSunglasses.size3.addActionListener(new ActionListener() {
                                                    @Override
                                                    public void actionPerformed(ActionEvent e) {

                                                        if (frameSunglasses.size3.isSelected()) {
                                                            frameSunglasses.buy.setEnabled(false);
                                                            frameSunglasses.buy.setFocusPainted(false);
                                                        }
                                                        pressed[index[0]]++;
                                                        index[0]++;
                                                        frameSunglasses.size2.setSelected(false);
                                                        frameSunglasses.size1.setSelected(false);
                                                        frameSunglasses.size4.setSelected(false);
                                                        frameSunglasses.size5.setSelected(false);
                                                        frameSunglasses.size6.setSelected(false);
                                                        frameSunglasses.size7.setSelected(false);
                                                        frameSunglasses.buy.setEnabled(true);
                                                        frameSunglasses.buy.setFocusPainted(true);

                                                    }

                                                }

        );
        frameSunglasses.size4.addActionListener(new ActionListener() {
                                                    @Override
                                                    public void actionPerformed(ActionEvent e) {

                                                        if (frameSunglasses.size4.isSelected()) {
                                                            frameSunglasses.buy.setEnabled(false);
                                                            frameSunglasses.buy.setFocusPainted(false);
                                                        }
                                                        pressed[index[0]]++;
                                                        index[0]++;
                                                        frameSunglasses.size2.setSelected(false);
                                                        frameSunglasses.size3.setSelected(false);
                                                        frameSunglasses.size1.setSelected(false);
                                                        frameSunglasses.size5.setSelected(false);
                                                        frameSunglasses.size6.setSelected(false);
                                                        frameSunglasses.size7.setSelected(false);
                                                        frameSunglasses.buy.setEnabled(true);
                                                        frameSunglasses.buy.setFocusPainted(true);

                                                    }

                                                }

        );
        frameSunglasses.size5.addActionListener(new ActionListener() {
                                                    @Override
                                                    public void actionPerformed(ActionEvent e) {

                                                        if (frameSunglasses.size5.isSelected()) {
                                                            frameSunglasses.buy.setEnabled(false);
                                                            frameSunglasses.buy.setFocusPainted(false);
                                                        }
                                                        pressed[index[0]]++;
                                                        index[0]++;
                                                        frameSunglasses.size2.setSelected(false);
                                                        frameSunglasses.size3.setSelected(false);
                                                        frameSunglasses.size4.setSelected(false);
                                                        frameSunglasses.size1.setSelected(false);
                                                        frameSunglasses.size6.setSelected(false);
                                                        frameSunglasses.size7.setSelected(false);
                                                        frameSunglasses.buy.setEnabled(true);
                                                        frameSunglasses.buy.setFocusPainted(true);

                                                    }

                                                }

        );
        frameSunglasses.size6.addActionListener(new ActionListener() {
                                                    @Override
                                                    public void actionPerformed(ActionEvent e) {

                                                        if (frameSunglasses.size6.isSelected()) {
                                                            frameSunglasses.buy.setEnabled(false);
                                                            frameSunglasses.buy.setFocusPainted(false);
                                                        }
                                                        pressed[index[0]]++;
                                                        index[0]++;
                                                        frameSunglasses.size2.setSelected(false);
                                                        frameSunglasses.size3.setSelected(false);
                                                        frameSunglasses.size4.setSelected(false);
                                                        frameSunglasses.size5.setSelected(false);
                                                        frameSunglasses.size1.setSelected(false);
                                                        frameSunglasses.size7.setSelected(false);
                                                        frameSunglasses.buy.setEnabled(true);
                                                        frameSunglasses.buy.setFocusPainted(true);

                                                    }

                                                }

        );

        frameSunglasses.size7.addActionListener(new ActionListener() {
                                                    @Override
                                                    public void actionPerformed(ActionEvent e) {

                                                        if (frameSunglasses.size1.isSelected()) {
                                                            frameSunglasses.buy.setEnabled(false);
                                                            frameSunglasses.buy.setFocusPainted(false);
                                                        }
                                                        pressed[index[0]]++;
                                                        index[0]++;
                                                        frameSunglasses.size2.setSelected(false);
                                                        frameSunglasses.size3.setSelected(false);
                                                        frameSunglasses.size4.setSelected(false);
                                                        frameSunglasses.size5.setSelected(false);
                                                        frameSunglasses.size6.setSelected(false);
                                                        frameSunglasses.size7.setSelected(false);
                                                        frameSunglasses.buy.setEnabled(true);
                                                        frameSunglasses.buy.setFocusPainted(true);

                                                    }

                                                }

        );


        frameGloves.size1.addActionListener(new ActionListener() {
                                                @Override
                                                public void actionPerformed(ActionEvent e) {

                                                    if (frameGloves.size1.isSelected()) {
                                                        frameGloves.buy.setEnabled(false);
                                                        frameGloves.buy.setFocusPainted(false);
                                                    }
                                                    pressed[index[0]]++;
                                                    index[0]++;
                                                    frameGloves.size2.setSelected(false);
                                                    frameGloves.size3.setSelected(false);
                                                    frameGloves.size4.setSelected(false);
                                                    frameGloves.size5.setSelected(false);
                                                    frameGloves.size6.setSelected(false);
                                                    frameGloves.size7.setSelected(false);
                                                    frameGloves.buy.setEnabled(true);
                                                    frameGloves.buy.setFocusPainted(true);

                                                }

                                            }

        );


        frameGloves.size2.addActionListener(new ActionListener() {
                                                @Override
                                                public void actionPerformed(ActionEvent e) {

                                                    if (frameGloves.size2.isSelected()) {
                                                        frameGloves.buy.setEnabled(false);
                                                        frameGloves.buy.setFocusPainted(false);
                                                    }
                                                    pressed[index[0]]++;
                                                    index[0]++;
                                                    frameGloves.size1.setSelected(false);
                                                    frameGloves.size3.setSelected(false);
                                                    frameGloves.size4.setSelected(false);
                                                    frameGloves.size5.setSelected(false);
                                                    frameGloves.size6.setSelected(false);
                                                    frameGloves.size7.setSelected(false);
                                                    frameGloves.buy.setEnabled(true);
                                                    frameGloves.buy.setFocusPainted(true);

                                                }

                                            }

        );
        frameGloves.size3.addActionListener(new ActionListener() {
                                                @Override
                                                public void actionPerformed(ActionEvent e) {

                                                    if (frameGloves.size3.isSelected()) {
                                                        frameGloves.buy.setEnabled(false);
                                                        frameGloves.buy.setFocusPainted(false);
                                                    }
                                                    pressed[index[0]]++;
                                                    index[0]++;
                                                    frameGloves.size2.setSelected(false);
                                                    frameGloves.size1.setSelected(false);
                                                    frameGloves.size4.setSelected(false);
                                                    frameGloves.size5.setSelected(false);
                                                    frameGloves.size6.setSelected(false);
                                                    frameGloves.size7.setSelected(false);
                                                    frameGloves.buy.setEnabled(true);
                                                    frameGloves.buy.setFocusPainted(true);

                                                }

                                            }

        );
        frameGloves.size4.addActionListener(new ActionListener() {
                                                @Override
                                                public void actionPerformed(ActionEvent e) {

                                                    if (frameGloves.size4.isSelected()) {
                                                        frameGloves.buy.setEnabled(false);
                                                        frameGloves.buy.setFocusPainted(false);
                                                    }
                                                    pressed[index[0]]++;
                                                    index[0]++;
                                                    frameGloves.size2.setSelected(false);
                                                    frameGloves.size3.setSelected(false);
                                                    frameGloves.size1.setSelected(false);
                                                    frameGloves.size5.setSelected(false);
                                                    frameGloves.size6.setSelected(false);
                                                    frameGloves.size7.setSelected(false);
                                                    frameGloves.buy.setEnabled(true);
                                                    frameGloves.buy.setFocusPainted(true);

                                                }

                                            }

        );
        frameGloves.size5.addActionListener(new ActionListener() {
                                                @Override
                                                public void actionPerformed(ActionEvent e) {

                                                    if (frameGloves.size5.isSelected()) {
                                                        frameGloves.buy.setEnabled(false);
                                                        frameGloves.buy.setFocusPainted(false);
                                                    }
                                                    pressed[index[0]]++;
                                                    index[0]++;
                                                    frameGloves.size2.setSelected(false);
                                                    frameGloves.size3.setSelected(false);
                                                    frameGloves.size4.setSelected(false);
                                                    frameGloves.size1.setSelected(false);
                                                    frameGloves.size6.setSelected(false);
                                                    frameGloves.size7.setSelected(false);
                                                    frameGloves.buy.setEnabled(true);
                                                    frameGloves.buy.setFocusPainted(true);

                                                }

                                            }

        );
        frameGloves.size6.addActionListener(new ActionListener() {
                                                @Override
                                                public void actionPerformed(ActionEvent e) {

                                                    if (frameGloves.size6.isSelected()) {
                                                        frameGloves.buy.setEnabled(false);
                                                        frameGloves.buy.setFocusPainted(false);
                                                    }
                                                    pressed[index[0]]++;
                                                    index[0]++;
                                                    frameGloves.size2.setSelected(false);
                                                    frameGloves.size3.setSelected(false);
                                                    frameGloves.size4.setSelected(false);
                                                    frameGloves.size5.setSelected(false);
                                                    frameGloves.size1.setSelected(false);
                                                    frameGloves.size7.setSelected(false);
                                                    frameGloves.buy.setEnabled(true);
                                                    frameGloves.buy.setFocusPainted(true);

                                                }

                                            }

        );

        frameGloves.size7.addActionListener(new ActionListener() {
                                                @Override
                                                public void actionPerformed(ActionEvent e) {

                                                    if (frameGloves.size1.isSelected()) {
                                                        frameGloves.buy.setEnabled(false);
                                                        frameGloves.buy.setFocusPainted(false);
                                                    }
                                                    pressed[index[0]]++;
                                                    index[0]++;
                                                    frameGloves.size2.setSelected(false);
                                                    frameGloves.size3.setSelected(false);
                                                    frameGloves.size4.setSelected(false);
                                                    frameGloves.size5.setSelected(false);
                                                    frameGloves.size6.setSelected(false);
                                                    frameGloves.size7.setSelected(false);
                                                    frameGloves.buy.setEnabled(true);
                                                    frameGloves.buy.setFocusPainted(true);

                                                }

                                            }

        );

        frameHoodie.size1.addActionListener(new ActionListener() {
                                                @Override
                                                public void actionPerformed(ActionEvent e) {

                                                    if (frameHoodie.size1.isSelected()) {
                                                        frameHoodie.buy.setEnabled(false);
                                                        frameHoodie.buy.setFocusPainted(false);
                                                    }
                                                    pressed[index[0]]++;
                                                    index[0]++;
                                                    frameHoodie.size2.setSelected(false);
                                                    frameHoodie.size3.setSelected(false);
                                                    frameHoodie.size4.setSelected(false);
                                                    frameHoodie.size5.setSelected(false);
                                                    frameHoodie.size6.setSelected(false);
                                                    frameHoodie.size7.setSelected(false);
                                                    frameHoodie.buy.setEnabled(true);
                                                    frameHoodie.buy.setFocusPainted(true);

                                                }

                                            }

        );


        frameHoodie.size2.addActionListener(new ActionListener() {
                                                @Override
                                                public void actionPerformed(ActionEvent e) {

                                                    if (frameHoodie.size2.isSelected()) {
                                                        frameHoodie.buy.setEnabled(false);
                                                        frameHoodie.buy.setFocusPainted(false);
                                                    }
                                                    pressed[index[0]]++;
                                                    index[0]++;
                                                    frameHoodie.size1.setSelected(false);
                                                    frameHoodie.size3.setSelected(false);
                                                    frameHoodie.size4.setSelected(false);
                                                    frameHoodie.size5.setSelected(false);
                                                    frameHoodie.size6.setSelected(false);
                                                    frameHoodie.size7.setSelected(false);
                                                    frameHoodie.buy.setEnabled(true);
                                                    frameHoodie.buy.setFocusPainted(true);

                                                }

                                            }

        );
        frameHoodie.size3.addActionListener(new ActionListener() {
                                                @Override
                                                public void actionPerformed(ActionEvent e) {

                                                    if (frameHoodie.size3.isSelected()) {
                                                        frameHoodie.buy.setEnabled(false);
                                                        frameHoodie.buy.setFocusPainted(false);
                                                    }
                                                    pressed[index[0]]++;
                                                    index[0]++;
                                                    frameHoodie.size2.setSelected(false);
                                                    frameHoodie.size1.setSelected(false);
                                                    frameHoodie.size4.setSelected(false);
                                                    frameHoodie.size5.setSelected(false);
                                                    frameHoodie.size6.setSelected(false);
                                                    frameHoodie.size7.setSelected(false);
                                                    frameHoodie.buy.setEnabled(true);
                                                    frameHoodie.buy.setFocusPainted(true);

                                                }

                                            }

        );
        frameHoodie.size4.addActionListener(new ActionListener() {
                                                @Override
                                                public void actionPerformed(ActionEvent e) {

                                                    if (frameHoodie.size4.isSelected()) {
                                                        frameHoodie.buy.setEnabled(false);
                                                        frameHoodie.buy.setFocusPainted(false);
                                                    }
                                                    pressed[index[0]]++;
                                                    index[0]++;
                                                    frameHoodie.size2.setSelected(false);
                                                    frameHoodie.size3.setSelected(false);
                                                    frameHoodie.size1.setSelected(false);
                                                    frameHoodie.size5.setSelected(false);
                                                    frameHoodie.size6.setSelected(false);
                                                    frameHoodie.size7.setSelected(false);
                                                    frameHoodie.buy.setEnabled(true);
                                                    frameHoodie.buy.setFocusPainted(true);

                                                }

                                            }

        );
        frameHoodie.size5.addActionListener(new ActionListener() {
                                                @Override
                                                public void actionPerformed(ActionEvent e) {

                                                    if (frameHoodie.size5.isSelected()) {
                                                        frameHoodie.buy.setEnabled(false);
                                                        frameHoodie.buy.setFocusPainted(false);
                                                    }
                                                    pressed[index[0]]++;
                                                    index[0]++;
                                                    frameHoodie.size2.setSelected(false);
                                                    frameHoodie.size3.setSelected(false);
                                                    frameHoodie.size4.setSelected(false);
                                                    frameHoodie.size1.setSelected(false);
                                                    frameHoodie.size6.setSelected(false);
                                                    frameHoodie.size7.setSelected(false);
                                                    frameHoodie.buy.setEnabled(true);
                                                    frameHoodie.buy.setFocusPainted(true);

                                                }

                                            }

        );
        frameHoodie.size6.addActionListener(new ActionListener() {
                                                @Override
                                                public void actionPerformed(ActionEvent e) {

                                                    if (frameHoodie.size6.isSelected()) {
                                                        frameHoodie.buy.setEnabled(false);
                                                        frameHoodie.buy.setFocusPainted(false);
                                                    }
                                                    pressed[index[0]]++;
                                                    index[0]++;
                                                    frameHoodie.size2.setSelected(false);
                                                    frameHoodie.size3.setSelected(false);
                                                    frameHoodie.size4.setSelected(false);
                                                    frameHoodie.size5.setSelected(false);
                                                    frameHoodie.size1.setSelected(false);
                                                    frameHoodie.size7.setSelected(false);
                                                    frameHoodie.buy.setEnabled(true);
                                                    frameHoodie.buy.setFocusPainted(true);

                                                }

                                            }

        );

        frameHoodie.size7.addActionListener(new ActionListener() {
                                                @Override
                                                public void actionPerformed(ActionEvent e) {

                                                    if (frameHoodie.size1.isSelected()) {
                                                        frameHoodie.buy.setEnabled(false);
                                                        frameHoodie.buy.setFocusPainted(false);
                                                    }
                                                    pressed[index[0]]++;
                                                    index[0]++;
                                                    frameHoodie.size2.setSelected(false);
                                                    frameHoodie.size3.setSelected(false);
                                                    frameHoodie.size4.setSelected(false);
                                                    frameHoodie.size5.setSelected(false);
                                                    frameHoodie.size6.setSelected(false);
                                                    frameHoodie.size7.setSelected(false);
                                                    frameHoodie.buy.setEnabled(true);
                                                    frameHoodie.buy.setFocusPainted(true);

                                                }

                                            }

        );


        frameCrewneck.size1.addActionListener(new ActionListener() {
                                                  @Override
                                                  public void actionPerformed(ActionEvent e) {

                                                      if (frameCrewneck.size1.isSelected()) {
                                                          frameCrewneck.buy.setEnabled(false);
                                                          frameCrewneck.buy.setFocusPainted(false);
                                                      }
                                                      pressed[index[0]]++;
                                                      index[0]++;
                                                      frameCrewneck.size2.setSelected(false);
                                                      frameCrewneck.size3.setSelected(false);
                                                      frameCrewneck.size4.setSelected(false);
                                                      frameCrewneck.size5.setSelected(false);
                                                      frameCrewneck.size6.setSelected(false);
                                                      frameCrewneck.size7.setSelected(false);
                                                      frameCrewneck.buy.setEnabled(true);
                                                      frameCrewneck.buy.setFocusPainted(true);

                                                  }

                                              }

        );


        frameCrewneck.size2.addActionListener(new ActionListener() {
                                                  @Override
                                                  public void actionPerformed(ActionEvent e) {

                                                      if (frameCrewneck.size2.isSelected()) {
                                                          frameCrewneck.buy.setEnabled(false);
                                                          frameCrewneck.buy.setFocusPainted(false);
                                                      }
                                                      pressed[index[0]]++;
                                                      index[0]++;
                                                      frameCrewneck.size1.setSelected(false);
                                                      frameCrewneck.size3.setSelected(false);
                                                      frameCrewneck.size4.setSelected(false);
                                                      frameCrewneck.size5.setSelected(false);
                                                      frameCrewneck.size6.setSelected(false);
                                                      frameCrewneck.size7.setSelected(false);
                                                      frameCrewneck.buy.setEnabled(true);
                                                      frameCrewneck.buy.setFocusPainted(true);

                                                  }

                                              }

        );
        frameCrewneck.size3.addActionListener(new ActionListener() {
                                                  @Override
                                                  public void actionPerformed(ActionEvent e) {

                                                      if (frameCrewneck.size3.isSelected()) {
                                                          frameCrewneck.buy.setEnabled(false);
                                                          frameCrewneck.buy.setFocusPainted(false);
                                                      }
                                                      pressed[index[0]]++;
                                                      index[0]++;
                                                      frameCrewneck.size2.setSelected(false);
                                                      frameCrewneck.size1.setSelected(false);
                                                      frameCrewneck.size4.setSelected(false);
                                                      frameCrewneck.size5.setSelected(false);
                                                      frameCrewneck.size6.setSelected(false);
                                                      frameCrewneck.size7.setSelected(false);
                                                      frameCrewneck.buy.setEnabled(true);
                                                      frameCrewneck.buy.setFocusPainted(true);

                                                  }

                                              }

        );
        frameCrewneck.size4.addActionListener(new ActionListener() {
                                                  @Override
                                                  public void actionPerformed(ActionEvent e) {

                                                      if (frameCrewneck.size4.isSelected()) {
                                                          frameCrewneck.buy.setEnabled(false);
                                                          frameCrewneck.buy.setFocusPainted(false);
                                                      }
                                                      pressed[index[0]]++;
                                                      index[0]++;
                                                      frameCrewneck.size2.setSelected(false);
                                                      frameCrewneck.size3.setSelected(false);
                                                      frameCrewneck.size1.setSelected(false);
                                                      frameCrewneck.size5.setSelected(false);
                                                      frameCrewneck.size6.setSelected(false);
                                                      frameCrewneck.size7.setSelected(false);
                                                      frameCrewneck.buy.setEnabled(true);
                                                      frameCrewneck.buy.setFocusPainted(true);

                                                  }

                                              }

        );
        frameCrewneck.size5.addActionListener(new ActionListener() {
                                                  @Override
                                                  public void actionPerformed(ActionEvent e) {

                                                      if (frameCrewneck.size5.isSelected()) {
                                                          frameCrewneck.buy.setEnabled(false);
                                                          frameCrewneck.buy.setFocusPainted(false);
                                                      }
                                                      pressed[index[0]]++;
                                                      index[0]++;
                                                      frameCrewneck.size2.setSelected(false);
                                                      frameCrewneck.size3.setSelected(false);
                                                      frameCrewneck.size4.setSelected(false);
                                                      frameCrewneck.size1.setSelected(false);
                                                      frameCrewneck.size6.setSelected(false);
                                                      frameCrewneck.size7.setSelected(false);
                                                      frameCrewneck.buy.setEnabled(true);
                                                      frameCrewneck.buy.setFocusPainted(true);

                                                  }

                                              }

        );
        frameCrewneck.size6.addActionListener(new ActionListener() {
                                                  @Override
                                                  public void actionPerformed(ActionEvent e) {

                                                      if (frameCrewneck.size6.isSelected()) {
                                                          frameCrewneck.buy.setEnabled(false);
                                                          frameCrewneck.buy.setFocusPainted(false);
                                                      }
                                                      pressed[index[0]]++;
                                                      index[0]++;
                                                      frameCrewneck.size2.setSelected(false);
                                                      frameCrewneck.size3.setSelected(false);
                                                      frameCrewneck.size4.setSelected(false);
                                                      frameCrewneck.size5.setSelected(false);
                                                      frameCrewneck.size1.setSelected(false);
                                                      frameCrewneck.size7.setSelected(false);
                                                      frameCrewneck.buy.setEnabled(true);
                                                      frameCrewneck.buy.setFocusPainted(true);

                                                  }

                                              }

        );

        frameCrewneck.size7.addActionListener(new ActionListener() {
                                                  @Override
                                                  public void actionPerformed(ActionEvent e) {

                                                      if (frameCrewneck.size1.isSelected()) {
                                                          frameCrewneck.buy.setEnabled(false);
                                                          frameCrewneck.buy.setFocusPainted(false);
                                                      }
                                                      pressed[index[0]]++;
                                                      index[0]++;
                                                      frameCrewneck.size2.setSelected(false);
                                                      frameCrewneck.size3.setSelected(false);
                                                      frameCrewneck.size4.setSelected(false);
                                                      frameCrewneck.size5.setSelected(false);
                                                      frameCrewneck.size6.setSelected(false);
                                                      frameCrewneck.size7.setSelected(false);
                                                      frameCrewneck.buy.setEnabled(true);
                                                      frameCrewneck.buy.setFocusPainted(true);

                                                  }

                                              }

        );


        frameHat.size1.addActionListener(new ActionListener() {
                                             @Override
                                             public void actionPerformed(ActionEvent e) {

                                                 if (frameHat.size1.isSelected()) {
                                                     frameHat.buy.setEnabled(false);
                                                     frameHat.buy.setFocusPainted(false);
                                                 }
                                                 pressed[index[0]]++;
                                                 index[0]++;
                                                 frameHat.size2.setSelected(false);
                                                 frameHat.size3.setSelected(false);
                                                 frameHat.size4.setSelected(false);
                                                 frameHat.size5.setSelected(false);
                                                 frameHat.size6.setSelected(false);
                                                 frameHat.size7.setSelected(false);
                                                 frameHat.buy.setEnabled(true);
                                                 frameHat.buy.setFocusPainted(true);

                                             }

                                         }

        );


        frameHat.size2.addActionListener(new ActionListener() {
                                             @Override
                                             public void actionPerformed(ActionEvent e) {

                                                 if (frameHat.size2.isSelected()) {
                                                     frameHat.buy.setEnabled(false);
                                                     frameHat.buy.setFocusPainted(false);
                                                 }
                                                 pressed[index[0]]++;
                                                 index[0]++;
                                                 frameHat.size1.setSelected(false);
                                                 frameHat.size3.setSelected(false);
                                                 frameHat.size4.setSelected(false);
                                                 frameHat.size5.setSelected(false);
                                                 frameHat.size6.setSelected(false);
                                                 frameHat.size7.setSelected(false);
                                                 frameHat.buy.setEnabled(true);
                                                 frameHat.buy.setFocusPainted(true);

                                             }

                                         }

        );
        frameHat.size3.addActionListener(new ActionListener() {
                                             @Override
                                             public void actionPerformed(ActionEvent e) {

                                                 if (frameHat.size3.isSelected()) {
                                                     frameHat.buy.setEnabled(false);
                                                     frameHat.buy.setFocusPainted(false);
                                                 }
                                                 pressed[index[0]]++;
                                                 index[0]++;
                                                 frameHat.size2.setSelected(false);
                                                 frameHat.size1.setSelected(false);
                                                 frameHat.size4.setSelected(false);
                                                 frameHat.size5.setSelected(false);
                                                 frameHat.size6.setSelected(false);
                                                 frameHat.size7.setSelected(false);
                                                 frameHat.buy.setEnabled(true);
                                                 frameHat.buy.setFocusPainted(true);

                                             }

                                         }

        );
        frameHat.size4.addActionListener(new ActionListener() {
                                             @Override
                                             public void actionPerformed(ActionEvent e) {

                                                 if (frameHat.size4.isSelected()) {
                                                     frameHat.buy.setEnabled(false);
                                                     frameHat.buy.setFocusPainted(false);
                                                 }
                                                 pressed[index[0]]++;
                                                 index[0]++;
                                                 frameHat.size2.setSelected(false);
                                                 frameHat.size3.setSelected(false);
                                                 frameHat.size1.setSelected(false);
                                                 frameHat.size5.setSelected(false);
                                                 frameHat.size6.setSelected(false);
                                                 frameHat.size7.setSelected(false);
                                                 frameHat.buy.setEnabled(true);
                                                 frameHat.buy.setFocusPainted(true);

                                             }

                                         }

        );
        frameHat.size5.addActionListener(new ActionListener() {
                                             @Override
                                             public void actionPerformed(ActionEvent e) {

                                                 if (frameHat.size5.isSelected()) {
                                                     frameHat.buy.setEnabled(false);
                                                     frameHat.buy.setFocusPainted(false);
                                                 }
                                                 pressed[index[0]]++;
                                                 index[0]++;
                                                 frameHat.size2.setSelected(false);
                                                 frameHat.size3.setSelected(false);
                                                 frameHat.size4.setSelected(false);
                                                 frameHat.size1.setSelected(false);
                                                 frameHat.size6.setSelected(false);
                                                 frameHat.size7.setSelected(false);
                                                 frameHat.buy.setEnabled(true);
                                                 frameHat.buy.setFocusPainted(true);

                                             }

                                         }

        );
        frameHat.size6.addActionListener(new ActionListener() {
                                             @Override
                                             public void actionPerformed(ActionEvent e) {

                                                 if (frameHat.size6.isSelected()) {
                                                     frameHat.buy.setEnabled(false);
                                                     frameHat.buy.setFocusPainted(false);
                                                 }
                                                 pressed[index[0]]++;
                                                 index[0]++;
                                                 frameHat.size2.setSelected(false);
                                                 frameHat.size3.setSelected(false);
                                                 frameHat.size4.setSelected(false);
                                                 frameHat.size5.setSelected(false);
                                                 frameHat.size1.setSelected(false);
                                                 frameHat.size7.setSelected(false);
                                                 frameHat.buy.setEnabled(true);
                                                 frameHat.buy.setFocusPainted(true);

                                             }

                                         }

        );

        frameHat.size7.addActionListener(new ActionListener() {
                                             @Override
                                             public void actionPerformed(ActionEvent e) {

                                                 if (frameHat.size1.isSelected()) {
                                                     frameHat.buy.setEnabled(false);
                                                     frameHat.buy.setFocusPainted(false);
                                                 }
                                                 pressed[index[0]]++;
                                                 index[0]++;
                                                 frameHat.size2.setSelected(false);
                                                 frameHat.size3.setSelected(false);
                                                 frameHat.size4.setSelected(false);
                                                 frameHat.size5.setSelected(false);
                                                 frameHat.size6.setSelected(false);
                                                 frameHat.size7.setSelected(false);
                                                 frameHat.buy.setEnabled(true);
                                                 frameHat.buy.setFocusPainted(true);

                                             }

                                         }

        );


        frameShorts.size1.addActionListener(new ActionListener() {
                                                @Override
                                                public void actionPerformed(ActionEvent e) {

                                                    if (frameShorts.size1.isSelected()) {
                                                        frameShorts.buy.setEnabled(false);
                                                        frameShorts.buy.setFocusPainted(false);
                                                    }
                                                    pressed[index[0]]++;
                                                    index[0]++;
                                                    frameShorts.size2.setSelected(false);
                                                    frameShorts.size3.setSelected(false);
                                                    frameShorts.size4.setSelected(false);
                                                    frameShorts.size5.setSelected(false);
                                                    frameShorts.size6.setSelected(false);
                                                    frameShorts.size7.setSelected(false);
                                                    frameShorts.buy.setEnabled(true);
                                                    frameShorts.buy.setFocusPainted(true);

                                                }

                                            }

        );


        frameShorts.size2.addActionListener(new ActionListener() {
                                                @Override
                                                public void actionPerformed(ActionEvent e) {

                                                    if (frameShorts.size2.isSelected()) {
                                                        frameShorts.buy.setEnabled(false);
                                                        frameShorts.buy.setFocusPainted(false);
                                                    }
                                                    pressed[index[0]]++;
                                                    index[0]++;
                                                    frameShorts.size1.setSelected(false);
                                                    frameShorts.size3.setSelected(false);
                                                    frameShorts.size4.setSelected(false);
                                                    frameShorts.size5.setSelected(false);
                                                    frameShorts.size6.setSelected(false);
                                                    frameShorts.size7.setSelected(false);
                                                    frameShorts.buy.setEnabled(true);
                                                    frameShorts.buy.setFocusPainted(true);

                                                }

                                            }

        );


        frameShorts.size3.addActionListener(new ActionListener() {
                                                @Override
                                                public void actionPerformed(ActionEvent e) {

                                                    if (frameShorts.size3.isSelected()) {
                                                        frameShorts.buy.setEnabled(false);
                                                        frameShorts.buy.setFocusPainted(false);
                                                    }
                                                    pressed[index[0]]++;
                                                    index[0]++;
                                                    frameShorts.size2.setSelected(false);
                                                    frameShorts.size1.setSelected(false);
                                                    frameShorts.size4.setSelected(false);
                                                    frameShorts.size5.setSelected(false);
                                                    frameShorts.size6.setSelected(false);
                                                    frameShorts.size7.setSelected(false);
                                                    frameShorts.buy.setEnabled(true);
                                                    frameShorts.buy.setFocusPainted(true);

                                                }

                                            }

        );
        frameShorts.size4.addActionListener(new ActionListener() {
                                                @Override
                                                public void actionPerformed(ActionEvent e) {

                                                    if (frameShorts.size4.isSelected()) {
                                                        frameShorts.buy.setEnabled(false);
                                                        frameShorts.buy.setFocusPainted(false);
                                                    }
                                                    pressed[index[0]]++;
                                                    index[0]++;
                                                    frameShorts.size2.setSelected(false);
                                                    frameShorts.size3.setSelected(false);
                                                    frameShorts.size1.setSelected(false);
                                                    frameShorts.size5.setSelected(false);
                                                    frameShorts.size6.setSelected(false);
                                                    frameShorts.size7.setSelected(false);
                                                    frameShorts.buy.setEnabled(true);
                                                    frameShorts.buy.setFocusPainted(true);

                                                }

                                            }

        );

        frameShorts.size5.addActionListener(new ActionListener() {
                                                @Override
                                                public void actionPerformed(ActionEvent e) {

                                                    if (frameShorts.size5.isSelected()) {
                                                        frameShorts.buy.setEnabled(false);
                                                        frameShorts.buy.setFocusPainted(false);
                                                    }
                                                    pressed[index[0]]++;
                                                    index[0]++;
                                                    frameShorts.size2.setSelected(false);
                                                    frameShorts.size3.setSelected(false);
                                                    frameShorts.size4.setSelected(false);
                                                    frameShorts.size1.setSelected(false);
                                                    frameShorts.size6.setSelected(false);
                                                    frameShorts.size7.setSelected(false);
                                                    frameShorts.buy.setEnabled(true);
                                                    frameShorts.buy.setFocusPainted(true);

                                                }

                                            }

        );
        frameShorts.size6.addActionListener(new ActionListener() {
                                                @Override
                                                public void actionPerformed(ActionEvent e) {

                                                    if (frameShorts.size6.isSelected()) {
                                                        frameShorts.buy.setEnabled(false);
                                                        frameShorts.buy.setFocusPainted(false);
                                                    }
                                                    pressed[index[0]]++;
                                                    index[0]++;
                                                    frameShorts.size2.setSelected(false);
                                                    frameShorts.size3.setSelected(false);
                                                    frameShorts.size4.setSelected(false);
                                                    frameShorts.size5.setSelected(false);
                                                    frameShorts.size1.setSelected(false);
                                                    frameShorts.size7.setSelected(false);
                                                    frameShorts.buy.setEnabled(true);
                                                    frameShorts.buy.setFocusPainted(true);

                                                }

                                            }

        );

        frameShorts.size7.addActionListener(new ActionListener() {
                                                @Override
                                                public void actionPerformed(ActionEvent e) {

                                                    if (frameShorts.size1.isSelected()) {
                                                        frameShorts.buy.setEnabled(false);
                                                        frameShorts.buy.setFocusPainted(false);
                                                    }
                                                    pressed[index[0]]++;
                                                    index[0]++;
                                                    frameShorts.size2.setSelected(false);
                                                    frameShorts.size3.setSelected(false);
                                                    frameShorts.size4.setSelected(false);
                                                    frameShorts.size5.setSelected(false);
                                                    frameShorts.size6.setSelected(false);
                                                    frameShorts.size7.setSelected(false);
                                                    frameShorts.buy.setEnabled(true);
                                                    frameShorts.buy.setFocusPainted(true);

                                                }

                                            }

        );

        frameBlouse.size1.addActionListener(new ActionListener() {
                                                @Override
                                                public void actionPerformed(ActionEvent e) {

                                                    if (frameBlouse.size1.isSelected()) {
                                                        frameBlouse.buy.setEnabled(false);
                                                        frameBlouse.buy.setFocusPainted(false);
                                                    }
                                                    pressed[index[0]]++;
                                                    index[0]++;
                                                    frameBlouse.size2.setSelected(false);
                                                    frameBlouse.size3.setSelected(false);
                                                    frameBlouse.size4.setSelected(false);
                                                    frameBlouse.size5.setSelected(false);
                                                    frameBlouse.size6.setSelected(false);
                                                    frameBlouse.size7.setSelected(false);
                                                    frameBlouse.buy.setEnabled(true);
                                                    frameBlouse.buy.setFocusPainted(true);

                                                }

                                            }

        );


        frameBlouse.size2.addActionListener(new ActionListener() {
                                                @Override
                                                public void actionPerformed(ActionEvent e) {

                                                    if (frameBlouse.size2.isSelected()) {
                                                        frameBlouse.buy.setEnabled(false);
                                                        frameBlouse.buy.setFocusPainted(false);
                                                    }
                                                    pressed[index[0]]++;
                                                    index[0]++;
                                                    frameBlouse.size1.setSelected(false);
                                                    frameBlouse.size3.setSelected(false);
                                                    frameBlouse.size4.setSelected(false);
                                                    frameBlouse.size5.setSelected(false);
                                                    frameBlouse.size6.setSelected(false);
                                                    frameBlouse.size7.setSelected(false);
                                                    frameBlouse.buy.setEnabled(true);
                                                    frameBlouse.buy.setFocusPainted(true);

                                                }

                                            }

        );


        frameBlouse.size3.addActionListener(new ActionListener() {
                                                @Override
                                                public void actionPerformed(ActionEvent e) {

                                                    if (frameBlouse.size3.isSelected()) {
                                                        frameBlouse.buy.setEnabled(false);
                                                        frameBlouse.buy.setFocusPainted(false);
                                                    }
                                                    pressed[index[0]]++;
                                                    index[0]++;
                                                    frameBlouse.size2.setSelected(false);
                                                    frameBlouse.size1.setSelected(false);
                                                    frameBlouse.size4.setSelected(false);
                                                    frameBlouse.size5.setSelected(false);
                                                    frameBlouse.size6.setSelected(false);
                                                    frameBlouse.size7.setSelected(false);
                                                    frameBlouse.buy.setEnabled(true);
                                                    frameBlouse.buy.setFocusPainted(true);

                                                }

                                            }

        );
        frameBlouse.size4.addActionListener(new ActionListener() {
                                                @Override
                                                public void actionPerformed(ActionEvent e) {

                                                    if (frameBlouse.size4.isSelected()) {
                                                        frameBlouse.buy.setEnabled(false);
                                                        frameBlouse.buy.setFocusPainted(false);
                                                    }
                                                    pressed[index[0]]++;
                                                    index[0]++;
                                                    frameBlouse.size2.setSelected(false);
                                                    frameBlouse.size3.setSelected(false);
                                                    frameBlouse.size1.setSelected(false);
                                                    frameBlouse.size5.setSelected(false);
                                                    frameBlouse.size6.setSelected(false);
                                                    frameBlouse.size7.setSelected(false);
                                                    frameBlouse.buy.setEnabled(true);
                                                    frameBlouse.buy.setFocusPainted(true);

                                                }

                                            }

        );

        frameBlouse.size5.addActionListener(new ActionListener() {
                                                @Override
                                                public void actionPerformed(ActionEvent e) {

                                                    if (frameBlouse.size5.isSelected()) {
                                                        frameBlouse.buy.setEnabled(false);
                                                        frameBlouse.buy.setFocusPainted(false);
                                                    }
                                                    pressed[index[0]]++;
                                                    index[0]++;
                                                    frameBlouse.size2.setSelected(false);
                                                    frameBlouse.size3.setSelected(false);
                                                    frameBlouse.size4.setSelected(false);
                                                    frameBlouse.size1.setSelected(false);
                                                    frameBlouse.size6.setSelected(false);
                                                    frameBlouse.size7.setSelected(false);
                                                    frameBlouse.buy.setEnabled(true);
                                                    frameBlouse.buy.setFocusPainted(true);

                                                }

                                            }

        );
        frameBlouse.size6.addActionListener(new ActionListener() {
                                                @Override
                                                public void actionPerformed(ActionEvent e) {

                                                    if (frameBlouse.size6.isSelected()) {
                                                        frameBlouse.buy.setEnabled(false);
                                                        frameBlouse.buy.setFocusPainted(false);
                                                    }
                                                    pressed[index[0]]++;
                                                    index[0]++;
                                                    frameBlouse.size2.setSelected(false);
                                                    frameBlouse.size3.setSelected(false);
                                                    frameBlouse.size4.setSelected(false);
                                                    frameBlouse.size5.setSelected(false);
                                                    frameBlouse.size1.setSelected(false);
                                                    frameBlouse.size7.setSelected(false);
                                                    frameBlouse.buy.setEnabled(true);
                                                    frameBlouse.buy.setFocusPainted(true);

                                                }

                                            }

        );

        frameBlouse.size7.addActionListener(new ActionListener() {
                                                @Override
                                                public void actionPerformed(ActionEvent e) {

                                                    if (frameBlouse.size1.isSelected()) {
                                                        frameBlouse.buy.setEnabled(false);
                                                        frameBlouse.buy.setFocusPainted(false);
                                                    }
                                                    pressed[index[0]]++;
                                                    index[0]++;
                                                    frameBlouse.size2.setSelected(false);
                                                    frameBlouse.size3.setSelected(false);
                                                    frameBlouse.size4.setSelected(false);
                                                    frameBlouse.size5.setSelected(false);
                                                    frameBlouse.size6.setSelected(false);
                                                    frameBlouse.size7.setSelected(false);
                                                    frameBlouse.buy.setEnabled(true);
                                                    frameBlouse.buy.setFocusPainted(true);

                                                }

                                            }

        );


        frameSwimsuit.size1.addActionListener(new ActionListener() {
                                                  @Override
                                                  public void actionPerformed(ActionEvent e) {

                                                      if (frameSwimsuit.size1.isSelected()) {
                                                          frameSwimsuit.buy.setEnabled(false);
                                                          frameSwimsuit.buy.setFocusPainted(false);
                                                      }
                                                      pressed[index[0]]++;
                                                      index[0]++;
                                                      frameSwimsuit.size2.setSelected(false);
                                                      frameSwimsuit.size3.setSelected(false);
                                                      frameSwimsuit.size4.setSelected(false);
                                                      frameSwimsuit.size5.setSelected(false);
                                                      frameSwimsuit.size6.setSelected(false);
                                                      frameSwimsuit.size7.setSelected(false);
                                                      frameSwimsuit.buy.setEnabled(true);
                                                      frameSwimsuit.buy.setFocusPainted(true);

                                                  }

                                              }

        );


        frameSwimsuit.size2.addActionListener(new ActionListener() {
                                                  @Override
                                                  public void actionPerformed(ActionEvent e) {

                                                      if (frameSwimsuit.size2.isSelected()) {
                                                          frameSwimsuit.buy.setEnabled(false);
                                                          frameSwimsuit.buy.setFocusPainted(false);
                                                      }
                                                      pressed[index[0]]++;
                                                      index[0]++;
                                                      frameSwimsuit.size1.setSelected(false);
                                                      frameSwimsuit.size3.setSelected(false);
                                                      frameSwimsuit.size4.setSelected(false);
                                                      frameSwimsuit.size5.setSelected(false);
                                                      frameSwimsuit.size6.setSelected(false);
                                                      frameSwimsuit.size7.setSelected(false);
                                                      frameSwimsuit.buy.setEnabled(true);
                                                      frameSwimsuit.buy.setFocusPainted(true);

                                                  }

                                              }

        );


        frameSwimsuit.size3.addActionListener(new ActionListener() {
                                                  @Override
                                                  public void actionPerformed(ActionEvent e) {

                                                      if (frameSwimsuit.size3.isSelected()) {
                                                          frameSwimsuit.buy.setEnabled(false);
                                                          frameSwimsuit.buy.setFocusPainted(false);
                                                      }
                                                      pressed[index[0]]++;
                                                      index[0]++;
                                                      frameSwimsuit.size2.setSelected(false);
                                                      frameSwimsuit.size1.setSelected(false);
                                                      frameSwimsuit.size4.setSelected(false);
                                                      frameSwimsuit.size5.setSelected(false);
                                                      frameSwimsuit.size6.setSelected(false);
                                                      frameSwimsuit.size7.setSelected(false);
                                                      frameSwimsuit.buy.setEnabled(true);
                                                      frameSwimsuit.buy.setFocusPainted(true);

                                                  }

                                              }

        );
        frameSwimsuit.size4.addActionListener(new ActionListener() {
                                                  @Override
                                                  public void actionPerformed(ActionEvent e) {

                                                      if (frameSwimsuit.size4.isSelected()) {
                                                          frameSwimsuit.buy.setEnabled(false);
                                                          frameSwimsuit.buy.setFocusPainted(false);
                                                      }
                                                      pressed[index[0]]++;
                                                      index[0]++;
                                                      frameSwimsuit.size2.setSelected(false);
                                                      frameSwimsuit.size3.setSelected(false);
                                                      frameSwimsuit.size1.setSelected(false);
                                                      frameSwimsuit.size5.setSelected(false);
                                                      frameSwimsuit.size6.setSelected(false);
                                                      frameSwimsuit.size7.setSelected(false);
                                                      frameSwimsuit.buy.setEnabled(true);
                                                      frameSwimsuit.buy.setFocusPainted(true);

                                                  }

                                              }

        );

        frameSwimsuit.size5.addActionListener(new ActionListener() {
                                                  @Override
                                                  public void actionPerformed(ActionEvent e) {

                                                      if (frameSwimsuit.size5.isSelected()) {
                                                          frameSwimsuit.buy.setEnabled(false);
                                                          frameSwimsuit.buy.setFocusPainted(false);
                                                      }
                                                      pressed[index[0]]++;
                                                      index[0]++;
                                                      frameSwimsuit.size2.setSelected(false);
                                                      frameSwimsuit.size3.setSelected(false);
                                                      frameSwimsuit.size4.setSelected(false);
                                                      frameSwimsuit.size1.setSelected(false);
                                                      frameSwimsuit.size6.setSelected(false);
                                                      frameSwimsuit.size7.setSelected(false);
                                                      frameSwimsuit.buy.setEnabled(true);
                                                      frameSwimsuit.buy.setFocusPainted(true);

                                                  }

                                              }

        );
        frameSwimsuit.size6.addActionListener(new ActionListener() {
                                                  @Override
                                                  public void actionPerformed(ActionEvent e) {

                                                      if (frameSwimsuit.size6.isSelected()) {
                                                          frameSwimsuit.buy.setEnabled(false);
                                                          frameSwimsuit.buy.setFocusPainted(false);
                                                      }
                                                      pressed[index[0]]++;
                                                      index[0]++;
                                                      frameSwimsuit.size2.setSelected(false);
                                                      frameSwimsuit.size3.setSelected(false);
                                                      frameSwimsuit.size4.setSelected(false);
                                                      frameSwimsuit.size5.setSelected(false);
                                                      frameSwimsuit.size1.setSelected(false);
                                                      frameSwimsuit.size7.setSelected(false);
                                                      frameSwimsuit.buy.setEnabled(true);
                                                      frameSwimsuit.buy.setFocusPainted(true);

                                                  }

                                              }

        );

        frameSwimsuit.size7.addActionListener(new ActionListener() {
                                                  @Override
                                                  public void actionPerformed(ActionEvent e) {

                                                      if (frameSwimsuit.size1.isSelected()) {
                                                          frameSwimsuit.buy.setEnabled(false);
                                                          frameSwimsuit.buy.setFocusPainted(false);
                                                      }
                                                      pressed[index[0]]++;
                                                      index[0]++;
                                                      frameSwimsuit.size2.setSelected(false);
                                                      frameSwimsuit.size3.setSelected(false);
                                                      frameSwimsuit.size4.setSelected(false);
                                                      frameSwimsuit.size5.setSelected(false);
                                                      frameSwimsuit.size6.setSelected(false);
                                                      frameSwimsuit.size7.setSelected(false);
                                                      frameSwimsuit.buy.setEnabled(true);
                                                      frameSwimsuit.buy.setFocusPainted(true);

                                                  }

                                              }

        );

        cartFrame.cash.addActionListener(new ActionListener() {
                                             @Override
                                             public void actionPerformed(ActionEvent e) {

                                                 if (cartFrame.cash.isSelected()) {
                                                     cartFrame.card.setSelected(false);
                                                     cartFrame.confirm.setEnabled(true);
                                                     cartFrame.confirm.setFocusPainted(true);
                                                 }


                                             }

                                         }

        );

        cartFrame.card.addActionListener(new ActionListener() {
                                             @Override
                                             public void actionPerformed(ActionEvent e) {

                                                 if (cartFrame.card.isSelected()) {
                                                     cartFrame.cash.setSelected(false);
                                                     cartFrame.confirm.setEnabled(true);
                                                     cartFrame.confirm.setFocusPainted(true);
                                                 }


                                             }

                                         }

        );



        frame_prod[0].buy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //pressed[index[0]]++;

                adCart(frame_prod[0], "/Users/perseaoana/Downloads/best-affordable-baggy-jeans-292437-1658170499758-main.700x0c.jpg", 0);
            }
        });


        frame_prod[0].cart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame_prod[0].product.dispose();
                cartFrame.cart.setVisible(true);

            }
        });


        frame_prod[1].buy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //pressed[index[1]]++;

                adCart(frame_prod[1], "/Users/perseaoana/Desktop/Captură de ecran din 2023-01-05 la 21.27.57.png", 1);
            }
        });


        frame_prod[1].cart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame_prod[1].product.dispose();
                cartFrame.cart.setVisible(true);

            }
        });


        frame_prod[2].buy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adCart(frame_prod[2], "/Users/perseaoana/Desktop/Captură de ecran din 2023-01-05 la 19.34.49.png", 2);
            }
        });


        frame_prod[2].cart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame_prod[2].product.dispose();
                cartFrame.cart.setVisible(true);

            }
        });


        frame_prod[3].buy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adCart(frame_prod[3], "/Users/perseaoana/Desktop/Captură de ecran din 2023-01-06 la 01.06.14.png", 3);
            }
        });


        frame_prod[3].cart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame_prod[3].product.dispose();
                cartFrame.cart.setVisible(true);

            }
        });



        frame_prod[4].buy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adCart(frame_prod[4], "/Users/perseaoana/Desktop/Captură de ecran din 2023-01-06 la 01.18.28.png", 4);
            }
        });


        frame_prod[4].cart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame_prod[4].product.dispose();
                cartFrame.cart.setVisible(true);

            }
        });


        frame_prod[5].buy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adCart(frame_prod[5], "/Users/perseaoana/Desktop/Captură de ecran din 2023-01-06 la 01.07.19.png", 5);
            }
        });


        frame_prod[5].cart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame_prod[5].product.dispose();
                cartFrame.cart.setVisible(true);

            }
        });


        frame_prod[6].buy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adCart(frame_prod[6], "/Users/perseaoana/Desktop/Captură de ecran din 2023-01-06 la 00.47.38.png", 6);
            }
        });


        frame_prod[6].cart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame_prod[6].product.dispose();
                cartFrame.cart.setVisible(true);

            }
        });


        frame_prod[7].buy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adCart(frame_prod[7], "/Users/perseaoana/Desktop/Captură de ecran din 2023-01-06 la 00.47.59.png", 6);
            }
        });


        frame_prod[7].cart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame_prod[7].product.dispose();
                cartFrame.cart.setVisible(true);

            }
        });

//
        frame_prod[8].buy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adCart(frame_prod[8], "/Users/perseaoana/Desktop/Captură de ecran din 2023-01-06 la 01.12.45.png", 8);
            }
        });


        frame_prod[8].cart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame_prod[8].product.dispose();
                cartFrame.cart.setVisible(true);

            }
        });


        frame_prod[9].buy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adCart(frame_prod[9], "/Users/perseaoana/Desktop/Captură de ecran din 2023-01-05 la 23.07.15.png", 9);
            }
        });


        frame_prod[9].cart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame_prod[9].product.dispose();
                cartFrame.cart.setVisible(true);

            }
        });



        frame_prod[10].buy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adCart(frame_prod[10], "/Users/perseaoana/Desktop/Captură de ecran din 2023-01-06 la 01.09.18.png", 10);
            }
        });


        frame_prod[10].cart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame_prod[10].product.dispose();
                cartFrame.cart.setVisible(true);

            }
        });


        frame_prod[11].buy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adCart(frame_prod[11], "/Users/perseaoana/Desktop/Captură de ecran din 2023-01-06 la 01.24.36.png", 11);
            }
        });


        frame_prod[11].cart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame_prod[11].product.dispose();
                cartFrame.cart.setVisible(true);

            }
        });


        frame_prod[12].buy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adCart(frame_prod[12], "/Users/perseaoana/Desktop/Captură de ecran din 2023-01-06 la 00.51.40.png", 12);
            }
        });


        frame_prod[12].cart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame_prod[12].product.dispose();
                cartFrame.cart.setVisible(true);

            }
        });


        frame_prod[13].buy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adCart(frame_prod[13], "/Users/perseaoana/Desktop/Captură de ecran din 2023-01-06 la 00.52.19.png", 13);
            }
        });


        frame_prod[13].cart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame_prod[13].product.dispose();
                cartFrame.cart.setVisible(true);

            }
        });


        frame_prod[14].buy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adCart(frame_prod[14], "/Users/perseaoana/Desktop/Captură de ecran din 2023-01-06 la 01.14.12.png", 14);
            }
        });


        frame_prod[14].cart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame_prod[14].product.dispose();
                cartFrame.cart.setVisible(true);

            }
        });

        buttonArray[0].addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                panelArray[0].setVisible(false);
                labelArray[0].setVisible(false);
                labelArray[1].setVisible(false);
                spinnerArray[0].setVisible(false);
                buttonArray[0].setVisible(false);
                frameArray[0].buy.setEnabled(true);
                frameArray[0].buy.setFocusPainted(true);


            }
        });


        /**
         login.loginBut.addActionListener(new ActionListener() {
        @Override public void actionPerformed(ActionEvent e) {
        boolean email=false, username=false;
        email=isEmailUnique(login.textField1.getText(),email);
        username=isUsernameUnique(login.textField2.getText(),username);
        String pass1=new String();
        String pass2=new String();
        pass1=login.passwordField1.getText();
        pass2=login.passwordField2.getText();
        System.out.println(pass1.equals(pass2));
        //if(email==true && username==true)
        //{
        insertAddress(login, login.textField8.getText(), login.textField5.getText(), login.textField7.getText(), login.textField6.getText());
        insertCustomer(login, login.textField3.getText(), login.textField4.getText(), login.textField1.getText(), login.textField2.getText(), login.passwordField1.getText(), login.textField8.getText(), login.textField5.getText(), login.textField6.getText(), login.textField7.getText());
        //}
        //else frame.setVisible(true);
        }
        });
         */


        boolean isUsernameUnique = true;
        boolean isEmailUnique = true;
        String aux = new String();
        login.loginBut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String usernameeee = login.textField2.getText();
                username = usernameeee;
                String emaileee = login.textField1.getText();
                String password1 = login.passwordField1.getText();
                String password2 = login.passwordField2.getText();


                if (!isEmailUnique(emaileee, isEmailUnique)) {
                    login.warning.setText("There already exists an account with this email address");
                }

                if (!isUsernameUnique(usernameeee, isUsernameUnique)) {
                    login.warning.setText("Username already taken");

                }

                if (!password1.equals(password2)) {
                    login.warning.setText("Passwords do not match");
                }

                if (isUsernameUnique == true && isEmailUnique == true && password1.equals(password2)) {
                    insertAddress(login, login.textField8.getText(), login.textField5.getText(), login.textField7.getText(), login.textField6.getText());
                    insertCustomer(login, login.textField3.getText(), login.textField4.getText(), login.textField1.getText(), login.textField2.getText(), login.passwordField1.getText(), login.textField8.getText(), login.textField5.getText(), login.textField6.getText(), login.textField7.getText());
                    usernameValid = username;
                    login.frame2.dispose();
                    frame.setVisible(true);


                }


            }
        });
    }


    public void getAuthenticatedUser(String userText, String password, clothes Cframe) {

        frame2 login = new frame2();

        //this.frame2=new JFrame();
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "premianta");
            Statement st = con.createStatement();
            String sql = "SELECT * FROM customer WHERE username=? AND password=?";
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, userText);
            preparedStatement.setString(2, password);
            Statement stmt = con.createStatement();
            ResultSet resultSet = preparedStatement.executeQuery();


            if (!resultSet.next()) {
                label3.setText("Wrong username or password");
            } else {
                usernameValid = userText;
                frame.dispose();
                Cframe.clothes.setVisible(true);
            }


            st.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void insertAddress(frame2 login, String stateName, String cityName, String numberStreet, String streetName) {


        //this.frame2=new JFrame();
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "premianta");
            Statement st = con.createStatement();
            String sql = "INSERT INTO address (state, city, street, street_number) VALUES (?, ?, ?, ?)";
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, stateName);
            preparedStatement.setString(2, cityName);
            preparedStatement.setString(3, streetName);
            preparedStatement.setString(4, numberStreet);
            Statement stmt = con.createStatement();
            int resultSet = preparedStatement.executeUpdate();

            st.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void insertCustomer(frame2 login, String first_name, String last_name, String email, String username, String password, String state, String city, String street, String street_number) {


        //this.frame2=new JFrame();
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "premianta");
            Statement st = con.createStatement();
            String sql1 = "SELECT adress_id FROM address where state=? AND city=? AND street=? AND street_number=?";
            //String sql = "INSERT INTO address (state, city, street, street_number) VALUES (?, ?, ?, ?)";
            PreparedStatement preparedStatement = con.prepareStatement(sql1);
            preparedStatement.setString(1, state);
            preparedStatement.setString(2, city);
            preparedStatement.setString(3, street);
            preparedStatement.setString(4, street_number);
            Statement stmt = con.createStatement();
            ResultSet resultSet = preparedStatement.executeQuery();
            String address_id = new String();
            if (resultSet.next()) {
                address_id = resultSet.getString("adress_id");

            }

            String sql = "INSERT INTO customer (first_name, last_name, email, username, password, adress_id) VALUES (?, ?, ?, ?,?,?)";
            PreparedStatement preparedStatement1 = con.prepareStatement(sql);
            preparedStatement1.setString(1, first_name);
            preparedStatement1.setString(2, last_name);
            preparedStatement1.setString(3, email);
            preparedStatement1.setString(4, username);
            preparedStatement1.setString(5, password);
            preparedStatement1.setString(6, address_id);
            Statement stmt1 = con.createStatement();
            int resultSet1 = preparedStatement1.executeUpdate();


            st.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public boolean isEmailUnique(String emailee, boolean email_unique) {

        frame2 login = new frame2();

        //this.frame2=new JFrame();
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "premianta");
            Statement st = con.createStatement();
            String sql2 = "SELECT * FROM customer WHERE email=?";
            PreparedStatement preparedStatement2 = con.prepareStatement(sql2);
            preparedStatement2.setString(1, emailee);
            Statement stmtt = con.createStatement();
            ResultSet resultSet2 = preparedStatement2.executeQuery();

            if (resultSet2.next()) {
                email_unique = false;

            } else {
                email_unique = true;
            }

            st.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return email_unique;
    }

    public boolean isUsernameUnique(String usernameee, boolean username_unique) {

        frame2 login = new frame2();

        //this.frame2=new JFrame();
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "premianta");
            Statement st = con.createStatement();
            String sqll = "SELECT * FROM customer WHERE username=?";
            PreparedStatement preparedStatementt = con.prepareStatement(sqll);
            preparedStatementt.setString(1, usernameee);
            Statement stmtt = con.createStatement();
            ResultSet resultSett = preparedStatementt.executeQuery();

            if (resultSett.next()) {
                username_unique = false;


            } else {
                username_unique = true;

            }

            st.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return username_unique;
    }

    public int fieldFunc(int check) {
        if (userText.getText().isEmpty() || password.getText().isEmpty())
            check = 0;
        else check = 1;
        return check;
    }

    public int fieldFunc2(int check, frame2 login) {

        if (login.textField1.getText().isEmpty() || login.textField2.getText().isEmpty() || login.passwordField1.getText().isEmpty() || login.passwordField2.getText().isEmpty()
                || login.textField3.getText().isEmpty() || login.textField4.getText().isEmpty() || login.textField5.getText().isEmpty() || login.textField6.getText().isEmpty() || login.textField7.getText().isEmpty()
                || login.textField8.getText().isEmpty())
            check = 0;
        else check = 1;
        return check;
    }


    void getProduct(String productName, product frameName, String size1, String size2, String size3, String size4, String size5, String size6, String size7, String url) {
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "premianta");
            Statement st = con.createStatement();
            String sql = "SELECT price FROM clothes WHERE name=?";
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, productName);
            Statement stmt = con.createStatement();
            ResultSet resultSet = preparedStatement.executeQuery();
            String result = new String();
            if (resultSet.next()) {
                result = resultSet.getString("price");
                frameName.price.setText(result + ".00$");
            }
            frameName.name.setText(productName);
            frameName.size1.setText(size1);
            frameName.size2.setText(size2);
            frameName.size3.setText(size3);
            frameName.size4.setText(size4);
            frameName.size5.setText(size5);
            frameName.size6.setText(size6);
            frameName.size7.setText(size7);
            ImageIcon icon = new ImageIcon(url);
            Image img = icon.getImage();
            Image imageScale = img.getScaledInstance(250, 400, Image.SCALE_SMOOTH);
            ImageIcon scaleIcon = new ImageIcon(imageScale);
            frameName.photo.setIcon(scaleIcon);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }


    void updateCartNumber(product frame_prod[], women frame_women, men frame_men, clothes frame_clothes, int count[]) {


        count[0]++;

        String nr = Integer.toString(count[0]);
        for (int i = 0; i < 15; i++) {
            frame_prod[i].number.setText(nr);
        }
        frame_men.number.setText(nr);
        frame_clothes.number.setText(nr);
        frame_women.number.setText(nr);
    }

    void addToCart(product frameProd, String url, String array[]) {
        JToggleButton buttonSize = new JToggleButton();
        String size = new String();
        int choice = 0;
        if (frameProd.size1.isSelected()) {
            size = frameProd.size1.getText();
            buttonSize = frameProd.size1;
            choice = 0;
        }
        if (frameProd.size2.isSelected()) {
            size = frameProd.size2.getText();
            buttonSize = frameProd.size2;
            choice = 1;
        }
        if (frameProd.size3.isSelected()) {
            size = frameProd.size3.getText();
            buttonSize = frameProd.size3;
            choice = 2;
        }
        if (frameProd.size4.isSelected()) {
            size = frameProd.size4.getText();
            buttonSize = frameProd.size5;
            choice = 3;
        }
        if (frameProd.size5.isSelected()) {
            size = frameProd.size5.getText();
            buttonSize = frameProd.size6;
            choice = 4;
        }
        if (frameProd.size6.isSelected()) {
            size = frameProd.size6.getText();
            buttonSize = frameProd.size6;
            choice = 5;
        }
        if (frameProd.size7.isSelected()) {
            size = frameProd.size7.getText();
            buttonSize = frameProd.size7;
            choice = 6;
        }

        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "premianta");
            Statement st = con.createStatement();
            String sql = "SELECT stock FROM clothes where name=?";
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            String nrAvailable = frameProd.name.getText();
            array[cartIndexes[0]] = frameProd.name.getText();
            cartIndexes[0]++;
            preparedStatement.setString(1, nrAvailable);
            Statement stmt = con.createStatement();
            ResultSet resultSet = preparedStatement.executeQuery();
            String result_stock = new String();
            String result_name = new String();
            if (resultSet.next()) {
                result_stock = resultSet.getString("stock");
            }
            if (result_stock.equals("0")) {
                frameProd.unavailable.setText("Currently out of stock");
            } else {
                if (nrOfProducts[0] == 15) {
                    cartFrame.message.setText("You reached the maximum number of products for one order. If you want to place a larger order please contact us.");
                    frameProd.size1.setEnabled(false);
                    frameProd.size1.setFocusPainted(false);
                    frameProd.size2.setEnabled(false);
                    frameProd.size2.setFocusPainted(false);
                    frameProd.size3.setEnabled(false);
                    frameProd.size3.setFocusPainted(false);
                    frameProd.size4.setEnabled(false);
                    frameProd.size4.setFocusPainted(false);
                    frameProd.size5.setEnabled(false);
                    frameProd.size5.setFocusPainted(false);
                    frameProd.size6.setEnabled(false);
                    frameProd.size6.setFocusPainted(false);
                    frameProd.size7.setEnabled(false);
                    frameProd.size7.setFocusPainted(false);
                } else {

                    cartFrame.message.setText("");
                    cartFrame.confirm.setVisible(true);
                    frameProd.buy.setEnabled(false);
                    frameProd.buy.setFocusPainted(false);

                    if (pressed[choice] > 1) {
                        spinnerArray[nrOfSpinners[0] - 1].setValue(Integer.valueOf(pressed[choice]));
                        pressed[choice]++;
                        nrOfProducts[0]++;
                    } else {
                        panelArray[nrOfPanels[0]].setVisible(true);
                        nrOfPanels[0]++;

                        ImageIcon icon = new ImageIcon(url);
                        Image img = icon.getImage();
                        Image imageScale = img.getScaledInstance(60, 80, Image.SCALE_SMOOTH);
                        ImageIcon scaleIcon = new ImageIcon(imageScale);
                        photoArray[nrOfPhotos[0]].setIcon(scaleIcon);
                        frameArray[nrOfPhotos[0]] = frameProd;
                        nrOfPhotos[0]++;

                        labelArray[nrOfLabels[0]].setText(frameProd.name.getText());
                        nrOfLabels[0]++;
                        labelArray[nrOfLabels[0]].setText(size);
                        nrOfLabels[0]++;
                        spinnerArray[nrOfSpinners[0]].setVisible(true);
                        spinnerArray[nrOfSpinners[0]].setValue(Integer.valueOf(1));
                        nrOfSpinners[0]++;
                        buttonArray[nrOfButtons[0]].setVisible(true);
                        buttonArray[nrOfButtons[0]].setFocusPainted(true);
                        nrOfButtons[0]++;

                        pressed[choice]++;
                        nrOfProducts[0]++;


                    }


                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void delete(int ind) {
        boolean check = false;
        for (int i = 0; i < 15; i++) {

            panelArray[ind].setVisible(false);
            buttonArray[ind].setVisible(false);
            labelArray[2 * ind].setVisible(false);
            labelArray[2 * ind + 1].setVisible(false);
            int m = (int) spinnerArray[ind].getValue();
            spinnerArray[ind].setVisible(false);
            nrOfProducts[0] = nrOfProducts[0] - m;
            if (nrOfProducts[0] < 15) {
                prodFrame.buy.setVisible(true);
                prodFrame.buy.setFocusPainted(true);
            }
            for (i = 0; i < 15; i++) {
                if (panelArray[i].isVisible()) {
                    check = true;
                }
            }
            if (check == false) {
                cartFrame.message.setText("Your cart is empty");
                cartFrame.confirm.setVisible(false);
                cartFrame.cash.setVisible(false);
                cartFrame.card.setVisible(false);
            }


        }
    }

    void adCart(product frame_prod, String url, int nr) {
        int i;
        int j;
        i = nr;
        j = 0;
        cartFrame.cash.setVisible(true);
        cartFrame.cash.setEnabled(true);
        cartFrame.card.setEnabled(true);
        cartFrame.card.setVisible(true);
        String size = new String();
        String nrAvailable = new String();
        nrAvailable = frame_prod.name.getText();

        if (frame_prod.size1.isSelected()) {
            size = frame_prod.size1.getText();
            j = 0;
        }
        if (frame_prod.size2.isSelected()) {
            size = frame_prod.size2.getText();
            j = 1;
        }
        if (frame_prod.size3.isSelected()) {
            size = frame_prod.size3.getText();
            j = 2;
        }
        if (frame_prod.size4.isSelected()) {
            size = frame_prod.size4.getText();
            j = 3;
        }
        if (frame_prod.size5.isSelected()) {
            size = frame_prod.size5.getText();
            j = 4;
        }
        if (frame_prod.size6.isSelected()) {
            size = frame_prod.size6.getText();
            j = 5;
        }
        if (frame_prod.size7.isSelected()) {
            size = frame_prod.size7.getText();
            j = 6;
        }
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "premianta");
            Statement st = con.createStatement();
            String sql = "SELECT stock FROM clothes where name=?";
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, nrAvailable);
            Statement stmt = con.createStatement();
            ResultSet resultSet = preparedStatement.executeQuery();
            String result_stock = new String();

            if (resultSet.next()) {
                result_stock = resultSet.getString("stock");
            }

            if (result_stock.equals("0")) {
                frame_prod.unavailable.setText("Currently out of stock");
            } else {
                if (nrOfProducts[0] == 15) {
                    cartFrame.message.setText("You reached the maximum number of products for one order. If you want to place a larger order please contact us.");
                    frame_prod.size1.setEnabled(false);
                    frame_prod.size1.setFocusPainted(false);
                    frame_prod.size2.setEnabled(false);
                    frame_prod.size2.setFocusPainted(false);
                    frame_prod.size3.setEnabled(false);
                    frame_prod.size3.setFocusPainted(false);
                    frame_prod.size4.setEnabled(false);
                    frame_prod.size4.setFocusPainted(false);
                    frame_prod.size5.setEnabled(false);
                    frame_prod.size5.setFocusPainted(false);
                    frame_prod.size6.setEnabled(false);
                    frame_prod.size6.setFocusPainted(false);
                    frame_prod.size7.setEnabled(false);
                    frame_prod.size7.setFocusPainted(false);

                } else {

                    cartFrame.message.setText("");
                    cartFrame.confirm.setVisible(true);
                    frame_prod.buy.setEnabled(false);
                    frame_prod.buy.setFocusPainted(false);
                    if (productArray[i][j] == 0) {
                        panelArray[nrOfPanels[0]].setVisible(true);
                        nrOfPanels[0]++;


                        ImageIcon icon = new ImageIcon(url);
                        Image img = icon.getImage();
                        Image imageScale = img.getScaledInstance(60, 80, Image.SCALE_SMOOTH);
                        ImageIcon scaleIcon = new ImageIcon(imageScale);
                        photoArray[nrOfPhotos[0]].setIcon(scaleIcon);

                        frameArray[nrOfPhotos[0]] = frame_prod;

                        buttonArray[nrOfButtons[0]].setVisible(true);
                        buttonArray[nrOfButtons[0]].setFocusPainted(true);
                        nrOfButtons[0]++;

                        spinnerArray[nrOfPhotos[0]].setVisible(true);
                        spinnerArray[nrOfPhotos[0]].setValue(Integer.valueOf(1));
                        nrOfSpinners[0]++;
                        nrOfPhotos[0]++;

                        labelArray[nrOfLabels[0]].setText(frame_prod.name.getText());
                        nrOfLabels[0]++;

                        labelArray[nrOfLabels[0]].setText(size);
                        nrOfLabels[0]++;
                        int aux = productArray[i][j];
                        productArray[i][j]++;

                    } else {

                        int aux = productArray[i][j];

                        nrOfSpinners[0]--;

                        int indexi = 0;
                        if (i != 0) {
                            indexi = i + 1;
                        }

                        spinnerArray[nrOfSpinners[0] - 1].setValue(Integer.valueOf((productArray[i][j]) + 1));
                        productArray[i][j] = productArray[i][j] + 1;
                        nrOfSpinners[0]++;

                    }
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    void getOrder() {


        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "premianta");
            Statement st = con.createStatement();
            String sql = "SELECT customer_id FROM customer WHERE username=?";
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, usernameForOrder);
            Statement stmt = con.createStatement();
            ResultSet resultSet = preparedStatement.executeQuery();
            int customer_id = 1;
            if (resultSet.next()) {
                customer_id = resultSet.getInt("customer_id");
            }
            if (cartFrame.cash.isSelected()) {

                payment = 1;

            }

            if (cartFrame.card.isSelected()) {
                payment = 2;

            }
            int j = 0;
            int price = 0;

            for (int i = 0; i < 15; i++) {
                price = 0;
                if (panelArray[i].isVisible()) {

                    String sql2 = "SELECT product_id, price FROM clothes WHERE name=?";
                    String name = labelArray[j].getText();
                    j++;

                    PreparedStatement preparedStatement2 = con.prepareStatement(sql2);
                    preparedStatement2.setString(1, name);
                    Statement stmt2 = con.createStatement();
                    ResultSet resultSet2 = preparedStatement2.executeQuery();
                    int prodID = 0;
                    if (resultSet2.next()) {
                        prodID = resultSet2.getInt("product_id");
                        price = resultSet2.getInt("price");

                    }

                    String size = labelArray[j].getText();
                    j++;
                    String number = spinnerArray[i].getValue().toString();
                    int number2 = Integer.valueOf(number);
                    int priceFinal = price * number2;
                    String sql3 = "INSERT INTO order_products (customer_id, product_id, number, size, price, payment_id) VALUES (?,?,?,?,?,?)";
                    PreparedStatement preparedStatement3 = con.prepareStatement(sql3);
                    preparedStatement3.setInt(1, customer_id);
                    preparedStatement3.setInt(2, prodID);
                    preparedStatement3.setInt(3, number2);
                    preparedStatement3.setString(4, size);
                    preparedStatement3.setInt(5, priceFinal);
                    preparedStatement3.setInt(6, payment);
                    Statement stmt3 = con.createStatement();
                    int resultSet3 = preparedStatement3.executeUpdate();


                }


            }
            updateClient(customer_id, price, payment);


        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    void updateClient(int customer_id, int priceFirst, int payment_idFirst) {
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "premianta");
            Statement st = con.createStatement();
            String sql = "SELECT order_product_id FROM order_products WHERE customer_id=?";
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setInt(1, customer_id);
            Statement stmt = con.createStatement();
            ResultSet resultSet = preparedStatement.executeQuery();

            int order_id = 0;
            if (resultSet.next()) {
                order_id = resultSet.getInt("order_product_id");
            }

            String sql2 = "SELECT adress_id FROM customer WHERE customer_id=?";
            PreparedStatement preparedStatement2 = con.prepareStatement(sql2);
            preparedStatement2.setInt(1, customer_id);
            Statement stmt2 = con.createStatement();
            ResultSet resultSet2 = preparedStatement2.executeQuery();
            int address_id;
            address_id = 1;
            if (resultSet2.next()) {
                address_id = resultSet2.getInt("adress_id");
            }
            int priceTotal = 0;
            int paymentFinal = 1;

            String sqlcheck = "SELECT order_id FROM orders WHERE customer_id=?";
            PreparedStatement preparedStatementcheck = con.prepareStatement(sqlcheck);
            preparedStatementcheck.setInt(1, customer_id);
            Statement statementCheck = con.createStatement();
            ResultSet resultCheck = preparedStatementcheck.executeQuery();

            String sql4 = "SELECT price, payment_id FROM order_products WHERE customer_id=?";
            PreparedStatement preparedStatement4 = con.prepareStatement(sql4);
            preparedStatement4.setInt(1, customer_id);
            Statement stmt4 = con.createStatement();

            ResultSet resultSet4 = preparedStatement4.executeQuery();
            int price = 0;
            int payment = 1;

            while (resultSet4.next()) {
                price = resultSet4.getInt("price");
                priceTotal = priceTotal + price;
                payment = resultSet4.getInt("payment_id");
                paymentFinal = payment;
            }

            if (resultCheck.next()) {
                if (order_id != 0) {
                    while (resultSet.next()) {
                        String sql3 = "UPDATE orders SET total=?, payment_id=? WHERE customer_id=?";
                        PreparedStatement preparedStatement3 = con.prepareStatement(sql3);
                        preparedStatement3.setInt(1, priceTotal);
                        preparedStatement3.setInt(2, payment);
                        preparedStatement3.setInt(3, customer_id);
                        Statement stmt3 = con.createStatement();
                        int resultSet3 = preparedStatement3.executeUpdate();
//                    }
                    }
                }
            } else {
                String sql5 = "INSERT INTO orders (customer_id ,adress_id, total, payment_id) VALUES (?,?,?,?)";
                PreparedStatement preparedStatement5 = con.prepareStatement(sql5);
                preparedStatement5.setInt(1, customer_id);
                preparedStatement5.setInt(2, address_id);
                preparedStatement5.setInt(3, priceTotal);
                preparedStatement5.setInt(4, payment_idFirst);
                Statement stmt5 = con.createStatement();
                int resultSet5 = preparedStatement5.executeUpdate();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void myOrders(myAccount accountFrame) {

        try {

            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "premianta");
            Statement st = con.createStatement();
            accountFrame.username.setText(usernameForOrder);
            String sql = "SELECT first_name, last_name, email, adress_id, customer_id FROM customer WHERE username=?";
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, usernameForOrder);
            Statement stmt = con.createStatement();
            ResultSet resultSet = preparedStatement.executeQuery();
            int address_id = 1;
            String email = new String();
            int customer_id = 1;
            if (resultSet.next()) {
                String first_name = resultSet.getString("first_name");
                String last_name = resultSet.getString("last_name");
                email = resultSet.getString("email");
                address_id = resultSet.getInt("adress_id");
                accountFrame.name.setText(first_name);
                accountFrame.last_name.setText(last_name);
                customer_id = resultSet.getInt("customer_id");
            }
            accountFrame.email.setText(email);

            String sql2 = "SELECT state, city, street, street_number FROM address WHERE adress_id=?";
            PreparedStatement preparedStatement2 = con.prepareStatement(sql2);
            preparedStatement2.setInt(1, address_id);
            Statement stmt2 = con.createStatement();
            ResultSet resultSet2 = preparedStatement2.executeQuery();
            if (resultSet2.next()) {
                String state = resultSet2.getString("state");
                String city = resultSet2.getString("city");
                String street = resultSet2.getString("street");
                String street_number = resultSet2.getString("street_number");
                accountFrame.street.setText(street);
                accountFrame.street_number.setText(street_number);
                accountFrame.city.setText(city);
                accountFrame.country.setText(state);
            }

//
            String sql4 = "SELECT total, payment_id FROM orders WHERE customer_id=?";
            PreparedStatement preparedStatement4 = con.prepareStatement(sql4);
            preparedStatement4.setInt(1, customer_id);
            Statement stmt4 = con.createStatement();
            ResultSet resultSet4 = preparedStatement4.executeQuery();
            if (resultSet4.next()) {
                accountFrame.button2.setText("Current order");
                accountFrame.order1.setText("");
                do {


                    int price = resultSet4.getInt("total");
                    payment = resultSet4.getInt("payment_id");
                    String paymentString = new String();
                    if (payment == 1) paymentString = "cash";
                    else paymentString = "card";
                } while (resultSet4.next());
            } else {
                accountFrame.order1.setText("You did not place any order yet");
                accountFrame.order1.setVisible(true);
                accountFrame.button2.setText("No current order");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void allOrders(myAccount accountFrame) {
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "premianta");
            Statement st = con.createStatement();
            String sql = "SELECT customer_id FROM customer WHERE username=?";
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, usernameForOrder);
            Statement stmt = con.createStatement();
            ResultSet resultSet = preparedStatement.executeQuery();
            int customer_id = 1;
            if (resultSet.next()) {
                customer_id = resultSet.getInt("customer_id");
            }
            String sqlcheck = "Select price, product_id from order_products where customer_id=?";
            PreparedStatement preparedsqlcheck = con.prepareStatement(sqlcheck);
            preparedsqlcheck.setInt(1, customer_id);
            Statement stmtcheck = con.createStatement();
            ResultSet checkResult = preparedsqlcheck.executeQuery();

            int smth = 0;
            JLabel[] labelArr = new JLabel[6];
            labelArr[0] = accountFrame.order1;
            labelArr[1] = accountFrame.order2;
            labelArr[2] = accountFrame.order3;
            labelArr[3] = accountFrame.order4;
            labelArr[4] = accountFrame.order5;


            if (checkResult.next()) {
                do {

                    int sum = checkResult.getInt("price");
                    int prod_id = checkResult.getInt("product_id");
                    String sql3 = "SELECT name FROM clothes WHERE product_id=?";
                    PreparedStatement preparedStatement3 = con.prepareStatement(sql3);
                    preparedStatement3.setInt(1, prod_id);
                    Statement stmt3 = con.createStatement();
                    ResultSet resultSet3 = preparedStatement3.executeQuery();
                    String product = new String();
                    if (resultSet3.next()) {
                        product = resultSet3.getString("name");
                        smth++;
                    }

                    labelArr[smth].setText(product + " - " + sum + "$");
                    labelArr[smth].setVisible(true);

                } while (checkResult.next());
            } else {


//                    }
            }


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}



































