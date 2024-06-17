package MilkteaKiosk;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Menu extends JFrame {
    private JLabel menu = new JLabel();
    private JTextField searchBar = new JTextField(20);
    private JButton product = new JButton("Products");
    private JButton history = new JButton("History");
    private JButton logout = new JButton("Logout");

    JLabel background;
    JLabel logo;


    public Menu(){
        //call the super if the constructor overriding
        super ("Menu Page");
        setLayout(null);
        setBackground(Color.GRAY);

        //set a bounds and calling a add method in the overriding constructor
        menu.setBounds(63,10,115,35);
        menu.setText("TSAA KIOSK");
        menu.setFont(new Font("Arial", Font.BOLD, 18));
        menu.setForeground(new Color(51,0,0));
        add(menu);

        product.setBounds(185,95,150,50);
        product.setForeground(new Color(51,0,0));
        add(product);

        logout.setBounds(385,243,80,18);
        logout.setForeground(new Color(51,0,0));
        add(logout);

        logo = new JLabel("", new ImageIcon("smullogo.png"), JLabel.CENTER);
        logo.setBounds(10, 10, 50, 50);
        add(logo);

        background = new JLabel("", new ImageIcon("menubg.png"), JLabel.CENTER);
        background.setBounds(0, 0, 500, 270);
        add(background);

        //instance for product button to access product page.
        product.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (true) {setVisible(false);
                    new Product(); //leads user and admin to product frame
                } else {
                    setVisible(true);
                }
            }
        });


        //Logout Button
        logout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                int choose = JOptionPane.showConfirmDialog(null, "You want to logout?", "Logout Confirmation", JOptionPane.YES_NO_OPTION);

                if (choose ==JOptionPane.YES_OPTION) {
                    System.exit(0);
                } else if (choose == JOptionPane.NO_OPTION) {
                    setVisible(true);
                }

            }
        });

        //the setup of the frame class
        setSize(500,306);
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame on screen
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
