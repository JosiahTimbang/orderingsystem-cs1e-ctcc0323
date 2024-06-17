package MilkteaKiosk;
import javax.swing.*;
import java.awt.event.*;


public class LogIn extends JFrame {
    private static JLabel userName = new JLabel("Username: ");
    private static JTextField user = new JTextField(22);
    private static JLabel password = new JLabel("Password: ");
    private static JPasswordField pass = new JPasswordField(22);
    private  JButton b1 = new JButton("Log In");
    private JButton b2 = new JButton("Clear");
    private JButton b3 = new JButton("Exit");
    JButton b = new JButton(new ImageIcon("D:\\background.jpg"));
    JLabel background;


    public LogIn(){
        //call the super if the constructor overriding
        super ("Log In");
        setLayout(null);

        //set a bounds and calling a add method in the overriding constructor
        userName.setBounds(45,100,200,30);
        add(userName);
        user.setBounds(120,100,200,30);
        add(user);
        password.setBounds(45,150,200,30);
        add(password);
        pass.setBounds(120,150,200,30);
        add(pass);
        b1.setBounds(45,250,80,20);
        add(b1);
        b3.setBounds(141,250,80,20);
        add(b3);
        b2.setBounds(236,250,80,20);
        add(b2);

        background = new JLabel("", new ImageIcon("tsaalogo.png"), JLabel.CENTER);
        background.setBounds(0, 0, 400, 400);
        add(background);

        // button1 instance for login for authentication.
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = user.getText();
                String password = new String(pass.getPassword());

                if (username.equals("admin") && password.equals("Ilovemilktea")) {
                    setVisible(false);
                    new Menu();
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid username or password", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });


        // button2 instance for clear to make text instant clear
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                user.setText("");
                pass.setText("");
            }
        });

        // button3 instance for exit to exit the application
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                int choose = JOptionPane.showConfirmDialog(null, "You want to exit?", "Exit Confirmation", JOptionPane.YES_NO_OPTION);

                if (choose ==JOptionPane.YES_OPTION) {
                    System.exit(0);
                } else if (choose == JOptionPane.NO_OPTION) {
                    setVisible(true);
                }

            }
        });


        //the setup of the frame class
        setSize(400,430);
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame on screen
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);



    }



}
